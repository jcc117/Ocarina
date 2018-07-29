package symboltable;
import ast.*;
import java.util.HashMap;

public class ClassSym extends Sym{
	public String name;
	public int protection;
	public int line;
	public HashMap<String, Sym> children;
	public boolean singleton;

	public ClassSym(int line, String name, int protection, boolean singleton){
		this.line = line;
		this.name = name;
		this.protection = protection;
		this.singleton = singleton;
		children = new HashMap<String, Sym>();
	}

	public void put(String s, Sym symbol){
		children.put(s, symbol);
	}

	public Sym get(String s){
		return children.get(s);
	}
}