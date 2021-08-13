package xi.expandstatements;
import xi.expinterface.Expression;
import xi.expinterface.FunctionDef;
import xi.expinterface.Location;
import xi.expandstatements.Scope;
import java.util.Map;
public class ReadVariable<T> implements Expression<T>, Location<T>
{
   String var;
   public ReadVariable(String var)
   {
      this.var = var;
   
   }
   public T interpret(Scope varmap, Map<String, FunctionDef<?>> funcmap)
   {
      return (T)(varmap.get(var));
     
   
   }
   
   public Void set(Scope varmap, Map<String, FunctionDef<?>> funcmap, Expression<T> value)
   {
      varmap.put(var, value.interpret(varmap, funcmap));
      return null;
   }
//Gets var from varmap or puts var and val into scope




}