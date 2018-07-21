package ast;
import symboltable.*;

public class Rather {
	Expression e;
	StatementList s;

	public Rather(Expression e, StatementList s){
		this.e = e;
		this.s = s;
	}

	public void accept(VoidVisitor v){
		v.visit(this);
	}

	public Sym accept(Visitor v){
		return v.visit(this);
	}
}