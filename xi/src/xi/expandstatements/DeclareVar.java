package xi.expandstatements;
import xi.expinterface.Expression;
import xi.expinterface.FunctionDef;
import java.util.Map;
public class DeclareVar<T> implements Expression<Void>
{
   String name;
   Expression<T> value;
   public DeclareVar(String name)
   {
      this.name = name;
   
   }
   public DeclareVar(String name, Expression<T> value)
   {
      this.name = name;
      this.value = value;
   }
   public Void interpret(Scope varmap, Map<String, FunctionDef<?>> funcmap)
   {
      
      if(value != null)
      {
         varmap.putNew(name, value.interpret(varmap, funcmap));
      }  
      else
      {
         varmap.declare(name);
      }
      return null;
   }

//Either declares new variable with null value and put into varmap, or puts both name and interpreted value into varmap


}