package ast;
import symboltable.*;

public class Nil extends Expression{
	public Nil(){
		
	}

	public void accept(VoidVisitor v){
		v.visit(this);
	}

	public Sym accept(Visitor v){
		return v.visit(this);
	}
}