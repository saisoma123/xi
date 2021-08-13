package xi.expinterface;
import xi.expandstatements.Scope;
import java.util.Map;
public interface Location<T>
{
   Void set(Scope varmap,  Map<String, FunctionDef<?>> funcmap, Expression<T> value);
   //Expression<T> toExpression();
   
}
//Type and interface used for setting variables and array indexes