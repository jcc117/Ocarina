package symboltable;
import ast.*;
import java.util.Hashtable;

public class SageSym extends Sym{
	public Hashtable<String, SageSym> usingTable;
	public Hashtable<String, VarSym> varTable;
	public Hashtable<String, ClassSym> classTable;
	public Hashtable<String, MethodSym> methodTable;
	public boolean hasMainMethod;
	public Hashtable<String, VarSym> mainMethodVarTable;

	public SageSym(String name, boolean hasMainMethod){
		this.name = name;
		this.line = 0;
		this.column = 0;
		this.is_static = false;
		this.is_initialized = true;
		this.hasMainMethod = hasMainMethod;
		this.protection = ProtectionLevel.PUBLIC;
		this.usingTable = new Hashtable<String, SageSym>();
		this.varTable = new Hashtable<String, VarSym>();
		this.classTable = new Hashtable<String, ClassSym>();
		this.methodTable = new Hashtable<String, MethodSym>();
		if(this.hasMainMethod){
			this.mainMethodVarTable = new Hashtable<String, VarSym>();
		}
		else{
			this.mainMethodVarTable = null;
		}
	}

	public void addSage(String name, SageSym sage){
		usingTable.put(name, sage);
	}

	public void addVar(String name, VarSym symbol){
		varTable.put(name, symbol);
	}

	public void addMethod(String name, MethodSym symbol){
		methodTable.put(name, symbol);
	}

	public void addClass(String name, ClassSym symbol){
		classTable.put(name, symbol);
	}

	public void addMainMethodVar(String name, VarSym var){
		if(mainMethodVarTable != null)
			mainMethodVarTable.put(name, var);
	}

	public SageSym getSage(String name){
		return usingTable.get(name);
	}

	public VarSym getVar(String name){
		return varTable.get(name);
	}

	public MethodSym getMethod(String name){
		return methodTable.get(name);
	}

	public ClassSym getClass(String name){
		return classTable.get(name);
	}

	public VarSym getMainMethodVar(String name){
		if(mainMethodVarTable == null)
			return null;
		return mainMethodVarTable.get(name);
	}
}