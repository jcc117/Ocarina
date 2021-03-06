package ast;
import symboltable.*;

public class Constructor extends Node implements Def{
	public StatementList l;
	public ArgList a;

	public Constructor(ArgList a, StatementList l, int line, int column){
		this.l = l;
		this.a = a;
		this.line = line;
		this.column = column;
	}

	public void accept(VoidVisitor v){
		v.visit(this);
	}
	
	public void accept(Visitor v){
		v.visit(this);
	}
}