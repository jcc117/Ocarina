package ast;
import symboltable.*;

public class MethodCall extends Expression{
	public Expression e;
	public IdChain i;
	public ParamList l;

	public MethodCall(Expression e, IdChain i, ParamList l){
		this.e = e;
		this.i = i;
		this.l = l;
	}

	public void accept(VoidVisitor v){
		v.visit(this);
	}

	public Sym accept(Visitor v){
		return v.visit(this);
	}
}