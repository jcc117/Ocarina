package ast;
import symboltable.*;

public class ExtendsClassDef extends Node implements ClassDef{
	public Identifier i;
	public Identifier c;
	public DefList d;
	public int protection;
	public boolean singleton;

	public ExtendsClassDef(Identifier i, Identifier c, DefList d, int protection, boolean singleton, int line, int column){
		this.i = i;
		this.c = c;
		this.d = d;
		this.protection = protection;
		this.singleton = singleton;
		this.line = line;
		this.column = column;
	}

	public void accept(VoidVisitor v){
		v.visit(this);
	}

	public Sym accept(Visitor v){
		return v.visit(this);
	}
}