package ast;
import symboltable.*;

public class IdentifierType extends Type{
	public Identifier i;
	public IdChain chain;
	public boolean constant;

	public IdentifierType(Identifier i, IdChain chain, boolean constant){
		this.i = i;
		this.chain = chain;
		this.constant = constant;
	}

	public void accept(VoidVisitor v){
		v.visit(this);
	}

	public Sym accept(Visitor v){
		return v.visit(this);
	}
}