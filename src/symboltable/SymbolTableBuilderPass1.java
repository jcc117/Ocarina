package symboltable;
import ast.*;
import java.util.Stack;
import java.util.ArrayList;

public class SymbolTableBuilderPass1 implements Visitor{
	//This builder will perform the initial pass of the ast to build the symbol table.
	//It will add all symbols to the table to build a table that is imcomplete.
	//A second pass will fill in gaps where symbols of the same scope are not yet seen, leaving null
	//refrences throughout some areas.
	//A third pass will be needed to resolve all var-type variables.

	private SymbolTable table;
	private StringBuilder path;
	private Stack<PathCounterStruct> counterStack;

	public SymbolTableBuilderPass1(SymbolTable table){
		this.table = table;
		this.path = new StringBuilder();
		this.counterStack = new Stack<PathCounterStruct>();
	}

	//Build the symboltable
	public void build(Sage sage){
		sage.visit(this);
	}

	public void visit(Sage s){
		String name = s.i.accept(this);
		boolean hasMainMethod = false;
		if(s.p != null){
			hasMainMethod = true;
		}
		SageSym root = new SageSym(name, hasMainMethod, null, name);
		table.setRoot(root);

		//If there is a main method, process it
		if(hasMainMethod){
			s.p.accept(this);
		}
		else{
			//Process everything else
			s.d.accept(this);
		}
	}

	public void visit(Using u){
		//Do nothing for now
	}

	public void visit(UsingList u){
		//Do nothing for now
	}

	public void visit(Program p){
		p.s.accept(this);
		p.d.accept(this);
	}

	public void visit(StatementList l){
		for(Statement s : l.l){
			s.accept(this);
		}
	}

	public void visit(DefList d){
		for(Def def : d.l){
			def.accept(this);
		}
	}

	public void visit(SimpleClassDef s){
		String name = s.i.accept(this);
		appendToPath(name);
		ClassSym symbol = new ClassSym(name, s.line, s.column, s.is_static, s.protection, table.getCurrentScope(), path.toString());
		table.addSymbol(symbol);
		table.sinkToClassScope(name); 
		s.d.accept(this);
		table.floatScope();
		trimLastAddedPath();
	}

	public void visit(ExtendsClassDef e){
		String name = e.i.accept(this);
		appendToPath(name);
		ClassSym symbol = new ClassSym(name, e.line, e.column, e.is_static, e.protection, table.getCurrentScope(), path, table.getSymbol(e.c.accept(this), true));
		table.addSymbol(symbol);
		table.sinkToClassScope(name);
		e.d.accept(this);
		table.floatScope();
		trimLastAddedPath();
	}

	public void visit(Constructor c){
		//Treated like a method
		//Need a naming convention for constructors
		String name = "?";
		TypeSym returnType = new TypeSym(TypeSym.TypeEnum.VOID);
		appendToPath(name);
		MethodSym constructor = new MethodSym(name, c.line, c.column, false, Sym.ProtectionLevel.PUBLIC, returnType , false, table.getCurrentScope(), path.toString());
		table.sinkToMethodScope(name);
		c.l.accept(this);
		table.floatScope();
		trimLastAddedPath();
	}

	public void visit(MethodDef m){
		String name = m.i.accept(this);
		TypeSym returnType = m.r.accept(this);
		String args = m.a.accept(this);	//NEEDS FIXED
		name = name + args;	//Creates the method signature
		appendToPath(name);
		MethodSym symbol = new MethodSym(name, m.line, m.column, m.is_static, m.protection, returnType, false, table.getCurrentScope(), path.toString());
		table.sinkToMethodScope(name);
		m.s.accept(this);
		table.floatScope();
		trimLastAddedPath();
	}

	public void visit(VarDecl v){
		String name = v.i.accept(this);
		TypeSym type = v.t.accept(this);
		appendToPath(name);
		VarSym symbol = new VarSym(name, v.line, v.column, v.is_static, v.protection, false, type, type.is_constant, table.getCurrentScope(), path.toString());
		table.addSymbol(symbol);
		trimLastAddedPath();
	}
	//NEEDS FIXED
	public String visit(ArgList a){
		a.p.accept(this);
		ArrayList<Param> list = a.chain.accept(this);
		for(Param p : list){
			p.accept(this);
		}
	}

	public ArrayList<Param> visit(ArgChain a){
		return a.l;
	}

	public void visit(Param p){
		TypeSym type = p.t.accept(this);
		String name = p.i.accept(this);
		appendToPath(name);
		VarSym symbol = new VarSym(name, p.line, p.column, false, Sym.ProtectionLevel.PRIVATE, type, false, table.getCurrentScope(), path.toString());
		table.addSymbol(symbol);
		trimLastAddedPath();
	}

	public TypeSym visit(ArrayType t){
		return new TypeSym(TypeSym.TypeEnum.ARRAY, t.t.accept(this));
	}

	public TypeSym visit(IdentifierType i){
		String firstPart = i.i.accept(this);
		ArrayList<String> chain = i.chain.accept(this);
		chain.add(0, firstPart);
		return new TypeSym(TypeSym.TypeEnum.IDENTIFIER, table.getSymbol(chain.toArray(), true));
	}

	public ArrayList<String> visit(IdChain i){
		ArrayList<String> retVal = new ArrayList<String>();
		for(Identifier id : i.chain){
			retVal.add(id.accept(this));
		}
		return retVal;
	}

	public TypeSym visit(IntType t){
		return new TypeSym(TypeSym.TypeEnum.INT, t.constant);
	}

	public TypeSym visit(FloatType t){
		return new TypeSym(TypeSym.TypeEnum.DECIMAL, t.constant);
	}

	public TypeSym visit(BooleanType t){
		return new TypeSym(TypeSym.TypeEnum.BOOLEAN, t.constant);
	}

	public TypeSym visit(StringType t){
		return new TypeSym(TypeSym.TypeEnum.STRING, t.constant);
	}

	public TypeSym visit(HashmapType t){
		return new TypeSym(TypeSym.TypeEnum.HASHMAP, t.t1.accept(this), t.t2.accept(this), t.constant);
	}

	public TypeSym visit(MethodType m){
		return new TypeSym(TypeSym.TypeEnum.FUNCTION, m.t.accept(this), m.constant);
	}

	public TypeSym visit(VoidType t){
		return new TypeSym(TypeSym.TypeEnum.VOID, t.constant);
	}

	public TypeSym visit(VarType v){
	 	return new TypeSym(TypeSym.TypeEnum.VAR, v.constant);
	}

	public MethodScope visit(Block b){
		String name = counterStack.peek().blockCounter++ + "block";
		MethodScope newScope = new MethodScope(path.toString(), null, name);
		table.addMethodScope(newScope);
		counterStack.push(new PathCounterStruct());
		table.sinkToInnerMethodScope(path.toString());
		for(Statement s : b.l.l){
			s.accept(this);
		}
		table.floatScope();
		counterStack.pop();
	}

	public MethodScope visit(If i);
	public MethodScope visit(RatherList l);
	public MethodScope visit(Rather r);
	public MethodScope visit(While w);
	public MethodScope visit(For f);
	public MethodScope visit(Foreach f);
	public MethodScope visit(DoWhile d);
	public MethodScope visit(Print p);
	public MethodScope visit(VarDecAssignment v);
	public MethodScope visit(Until u);
	public MethodScope visit(Unless u);
	public MethodScope visit(TryCatch t);
	public MethodScope visit(Catch c);

	public MethodScope visit(MethodCallStatement m){
		return null;
	}

	public MethodScope visit(Throw t){
		return null;
	}
	
	public MethodScope visit(Super s){
		return null;
	}

	public MethodScope visit(Assignment a){
		return null;
	}

	public MethodScope visit(HashmapAssignment h){
		return null;
	}

	public MethodScope visit(ArrayAssignment a){
		return null;
	}

	public MethodScope visit(Return r){
		return null;
	}

	public MethodScope visit(Assert a){
		return null;
	}

	public MethodScope visit(Exit e){
		return null;
	}

	public MethodScope visit(Break b){
		return null;
	}	

	public MethodScope visit(Continue c){
		return null;
	}

	public MethodScope visit(Increment i){
		return null;
	}

	public MethodScope visit(Decrement d){
		return null;
	}

	public TypeSym visit(And a){
		return null;
	}

	public TypeSym visit(Or o){
		return null;
	}

	public TypeSym visit(Nand n){
		return null;
	}

	public TypeSym visit(Nor n){
		return null;
	}

	public TypeSym visit(Equals e){
		return null;
	}

	public TypeSym visit(Plus p){
		return null;
	}

	public TypeSym visit(Minus m){
		return null;
	}

	public TypeSym visit(Multiply m){
		return null;
	}

	public TypeSym visit(Power p){
		return null;
	}

	public TypeSym visit(Divide d){
		return null;
	}

	public TypeSym visit(Modulo m){
		return null;
	}

	public TypeSym visit(GreaterThanEqualTo g){
		return null;
	}

	public TypeSym visit(LessThanEqualTo l){
		return null;
	}

	public TypeSym visit(GreaterThan g){
		return null;
	}

	public TypeSym visit(LessThan l){
		return null;
	}

	public TypeSym visit(HashmapExpr h){
		return null;
	}

	public TypeSym visit(ArrayExpr a){
		return null;
	}

	public TypeSym visit(ObjectVarAccess o){
		return null;
	}

	public TypeSym visit(MethodCall m){
		return null;
	}

	public TypeSym visit(ArrayLength l){
		return null;
	}

	public TypeSym visit(IntLiteral i){
		return null;
	}

	public TypeSym visit(FloatLiteral f){
		return null;
	}

	public TypeSym visit(True t){
		return null;
	}

	public TypeSym visit(False f){
		return null;
	}

	public TypeSym visit(Nil n){
		return null;
	}

	public TypeSym visit(ParentExpr p){
		return null;
	}

	public TypeSym visit(Not n){
		return null;
	}

	public TypeSym visit(IdentifierExpr i){
		return null;
	}

	public TypeSym visit(ObjectCreate o){
		return null;
	}

	public TypeSym visit(This t){
		return null;
	}

	public TypeSym visit(ArrayCreate a){
		return null;
	}

	public TypeSym visit(HashmapCreate h){
		return null;
	}

	public TypeSym visit(StringLiteral s){
		return null;
	}

	public TypeSym visit(ParamList p){
		return null;
	}

	public String visit(Identifier i){
		return i.i;
	}

	public TypeSym visit(UnaryMinus u){
		return null;
	}

	public MethodSym visit(MethodLiteral m){

	}

	public TypeSym visit(Typeof t){
		return null;
	}

	public TypeSym visit(Differs d){
		return null;
	}

	public TypeSym visit(PostIncrement p){
		return null;
	}

	public TypeSym visit(PreIncrement p){
		return null;
	}

	public TypeSym visit(PostDecrement p){
		return null;
	}

	public TypeSym visit(PreDecrement p){
		return null;
	}

	public TypeSym visit(ArrayLiteral a){
		return null;
	}

	public MethodScope visit(Statement s);
	public TypeSym visit(Type t);
	public TypeSym visit(Expression e);
	public void visit(ExprChain e);
	public void visit(CatchList c);

	private void trimLastAddedPath(){
		int slash = path.lastIndexOf("/");
		if(slash != 1){
			path.delete(slash, path.length() - 1);
		}
	}

	private void appendToPath(String name){
		path.append("/" + name);
	}

	private String[] getPathArray(){
		return path.toString().split("/");
	}
}