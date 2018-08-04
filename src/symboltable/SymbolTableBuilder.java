package symboltable;

import ast.*;

public class SymbolTableBuilder implements Visitor{
	private SymbolTable symboltable;

	public SymbolTableBuilder(){
		symboltable = null;
	}

	//Set force to true to force a new rebuild if the table is already built 
	public SymbolTable build(Sage s, boolean force){
		if(symboltable == null || force){
			symboltable = new SymbolTable((SageSym)s.accept(this));
		}
	}

	public Sym visit(Sage s){
		
	}

	public Sym visit(Using u){

	}

	public Sym visit(UsingList u){

	}

	public Sym visit(Program p){

	}

	public Sym visit(StatementList l){

	}

	public Sym visit(DefList d){

	}

	public Sym visit(SimpleClassDef s){

	}

	public Sym visit(ExtendsClassDef e){

	}

	public Sym visit(ConstructorList c){

	}

	public Sym visit(Constructor c){

	}

	public Sym visit(MethodDef m){

	}

	public Sym visit(VarDeclList l){

	}

	public Sym visit(VarDecl v){

	}

	public Sym visit(ArgList a){

	}

	public Sym visit(Param p){

	}

	public Sym visit(ArrayType t){

	}

	public Sym visit(IntType t){

	}

	public Sym visit(FloatType t){

	}

	public Sym visit(BooleanType t){

	}

	public Sym visit(StringType t){

	}

	public Sym visit(HashmapType t){

	}

	public Sym visit(VoidType t){

	}

	public Sym visit(VarType v){

	}

	public Sym visit(Block b){

	}

	public Sym visit(If i){

	}

	public Sym visit(While w){

	}

	public Sym visit(For f){

	}

	public Sym visit(DoWhile d){

	}

	public Sym visit(Print p){

	}

	public Sym visit(VarDecAssignment v){

	}

	public Sym visit(Assignment a){

	}

	public Sym visit(HashmapAssignment h){

	}

	public Sym visit(ArrayAssignment a){

	}

	public Sym visit(Return r){

	}

	public Sym visit(Assert a){

	}

	public Sym visit(Exit e){

	}

	public Sym visit(Break b){

	}	

	public Sym visit(Continue c){

	}

	public Sym visit(Increment i){

	}

	public Sym visit(Decrement d){

	}

	public Sym visit(RatherList l){

	}

	public Sym visit(Rather r){

	}

	public Sym visit(And a){

	}

	public Sym visit(Or o){

	}

	public Sym visit(Nand n){

	}

	public Sym visit(Nor n){

	}

	public Sym visit(Equals e){

	}

	public Sym visit(Plus p){

	}

	public Sym visit(Minus m){

	}

	public Sym visit(Multiply m){

	}

	public Sym visit(Power p){

	}

	public Sym visit(Divide d){

	}

	public Sym visit(Modulo m){

	}

	public Sym visit(GreaterThanEqualTo g){

	}

	public Sym visit(LessThanEqualTo l){

	}

	public Sym visit(GreaterThan g){

	}

	public Sym visit(LessThan l){

	}

	public Sym visit(HashmapExpr h){

	}

	public Sym visit(ArrayExpr a){

	}

	public Sym visit(ObjectVarAccess o){

	}

	public Sym visit(MethodCall m){

	}

	public Sym visit(ArrayLength l){

	}

	public Sym visit(IntLiteral i){

	}

	public Sym visit(FloatLiteral f){

	}

	public Sym visit(True t){

	}

	public Sym visit(False f){

	}

	public Sym visit(Nil n){

	}

	public Sym visit(ParentExpr p){

	}

	public Sym visit(Not n){

	}

	public Sym visit(IdentifierExpr i){

	}

	public Sym visit(ObjectCreate o){

	}

	public Sym visit(This t){

	}

	public Sym visit(GetInt g){

	}

	public Sym visit(GetFloat f){

	}

	public Sym visit(GetBoolean t){

	}

	public Sym visit(GetString s){

	}

	public Sym visit(ArrayCreate a){

	}

	public Sym visit(HashmapCreate h){

	}

	public Sym visit(StringLiteral s){

	}

	public Sym visit(ParamList p){

	}

	public Sym visit(Identifier i){

	}

	public Sym visit(IdentifierType i){

	}
	
	public Sym visit(Statement s){

	}
	
	public Sym visit(Type t){

	}
	
	public Sym visit(Expression e){

	}
	
	public Sym visit(ArrayLiteral a){

	}
	
	public Sym visit(IdChain i){

	}
	
	public Sym visit(MethodCallStatement m){

	}
	
	public Sym visit(UnaryMinus u){

	}
	
	public Sym visit(Super s){

	}
	
	public Sym visit(Until u){

	}
	
	public Sym visit(Unless u){

	}
	
	public Sym visit(Typeof t){

	}
	
	public Sym visit(Differs d){

	}
	
	public Sym visit(MethodType m){

	}
	
	public Sym visit(MethodLiteral m){

	}
	
	public Sym visit(ArgChain a){

	}
	
	public Sym visit(ExprChain e){

	}
	
	public Sym visit(Throw t){

	}
	
	public Sym visit(TryCatch t){

	}
	
	public Sym visit(Catch c){

	}
	
	public Sym visit(CatchList c){

	}
	
	public Sym visit(ExceptionDef e){

	}
	
}