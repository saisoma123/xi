package xi.literals;
import xi.expinterface.Expression;
import xi.expinterface.FunctionDef;
import xi.expandstatements.Scope;
import java.util.Map;
public class IntegerLiteral implements Expression<Integer>
{
	Integer a;
	public IntegerLiteral(Integer a1)
	{
		a = a1;
	}
	public Integer interpret(Scope varmap, Map<String, FunctionDef<?>> funcmap)
	{
		return a;
	}

}