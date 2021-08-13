package xi.expandstatements;
import xi.expinterface.Expression;
import xi.expinterface.FunctionDef;
import xi.expinterface.Location;
import java.util.Map;

public class SetLocation<T> implements Expression<Void>
{
   Location<T> x;
   Expression<T> t;
   public SetLocation(Location<T> x, Expression<T> t)
   {
      this.x = x;
      this.t = t;
   }
   /*
   public Void interpret(Map<String, Object> varmap, Map<String, FunctionDef<?>> funcmap)
   {
      return null;    
   }
   */
   public Void interpret(Scope varmap, Map<String, FunctionDef<?>> funcmap)
   {
      return x.set(varmap, funcmap, t);
      
   }
}
//Allows for setting vars and array indexes