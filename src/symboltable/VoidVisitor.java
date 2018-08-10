package symboltable;

import ast.*;

public interface VoidVisitor{
	public void visit(Sage s);
	public void visit(Using u);
	public void visit(UsingList u);
	public void visit(Program p);
	public void visit(StatementList l);
	public void visit(DefList d);
	public void visit(SimpleClassDef s);
	public void visit(ExtendsClassDef e);
	public void visit(ConstructorList c);
	public void visit(Constructor c);
	public void visit(MethodDef m);
	public void visit(VarDeclList l);
	public void visit(VarDecl v);
	public void visit(ArgList a);
	public void visit(Param p);
	public void visit(ArrayType t);
	public void visit(IntType t);
	public void visit(FloatType t);
	public void visit(BooleanType t);
	public void visit(StringType t);
	public void visit(HashmapType t);
	public void visit(VoidType t);
	public void visit(VarType v);
	public void visit(Block b);
	public void visit(If i);
	public void visit(While w);
	public void visit(For f);
	public void visit(DoWhile d);
	public void visit(Print p);
	public void visit(VarDecAssignment v);
	public void visit(Assignment a);
	public void visit(HashmapAssignment h);
	public void visit(ArrayAssignment a);
	public void visit(Return r);
	public void visit(Assert a);
	public void visit(Exit e);
	public void visit(Break b);	
	public void visit(Continue c);
	public void visit(Increment i);
	public void visit(Decrement d);
	public void visit(RatherList l);
	public void visit(Rather r);
	public void visit(And a);
	public void visit(Or o);
	public void visit(Nand n);
	public void visit(Nor n);
	public void visit(Equals e);
	public void visit(Plus p);
	public void visit(Minus m);
	public void visit(Multiply m);
	public void visit(Power p);
	public void visit(Divide d);
	public void visit(Modulo m);
	public void visit(GreaterThanEqualTo g);
	public void visit(LessThanEqualTo l);
	public void visit(GreaterThan g);
	public void visit(LessThan l);
	public void visit(HashmapExpr h);
	public void visit(ArrayExpr a);
	public void visit(ObjectVarAccess o);
	public void visit(MethodCall m);
	public void visit(ArrayLength l);
	public void visit(IntLiteral i);
	public void visit(FloatLiteral f);
	public void visit(True t);
	public void visit(False f);
	public void visit(Nil n);
	public void visit(ParentExpr p);
	public void visit(Not n);
	public void visit(IdentifierExpr i);
	public void visit(ObjectCreate o);
	public void visit(This t);
	public void visit(ArrayCreate a);
	public void visit(HashmapCreate h);
	public void visit(StringLiteral s);
	public void visit(ParamList p);
	public void visit(Identifier i);
	public void visit(IdentifierType i);
	public void visit(Statement s);
	public void visit(Type t);
	public void visit(Expression e);
	public void visit(ArrayLiteral a);
	public void visit(IdChain i);
	public void visit(MethodCallStatement m);
	public void visit(UnaryMinus u);
	public void visit(Super s);
	public void visit(Until u);
	public void visit(Unless u);
	public void visit(Typeof t);
	public void visit(Differs d);
	public void visit(MethodType m);
	public void visit(MethodLiteral m);
	public void visit(ArgChain a);
	public void visit(ExprChain e);
	public void visit(Throw t);
	public void visit(TryCatch t);
	public void visit(Catch c);
	public void visit(CatchList c);
	public void visit(ExceptionDef e);
}