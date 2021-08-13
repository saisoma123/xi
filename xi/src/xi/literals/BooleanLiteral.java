package xi.literals;
import xi.expinterface.Expression;
import xi.expinterface.FunctionDef;
import xi.expandstatements.Scope;
import java.util.Map;
public class BooleanLiteral implements Expression<Boolean>
{
	Boolean a;
	public BooleanLiteral(Boolean a1) //Used for boolean operators NOT, AND, OR
	{
		a = a1;
	}
	public Boolean interpret(Scope varmap, Map<String, FunctionDef<?>> funcmap)
	{
		return a;
	}

}