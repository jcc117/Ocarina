package ast;

public class VarDecl implements Statement{
	public Type t;
	public Identifier i;

	public VarDecl(Type t, Identifier i){
		this.t = t;
		this.i = i;
	}
}