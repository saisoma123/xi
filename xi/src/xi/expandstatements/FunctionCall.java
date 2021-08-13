package xi.expandstatements;
import xi.expinterface.Expression;
import xi.expinterface.FunctionDef;
import xi.expandstatements.Scope;
import java.util.*;
public class FunctionCall<T> implements Expression<T>
{
   String name;
   List<Expression<?>> args; 
   public FunctionCall(String name, List<Expression<?>> args)
   {
      this.name = name;
      this.args = args;
   }
   public T interpret(Scope varmap, Map<String, FunctionDef<?>> funcmap)
   {
      List<Object> argvals = new LinkedList<>();
      for(Expression<?> arg: args)
      {
         argvals.add(arg.interpret(varmap, funcmap));
      }
      return (T)(funcmap.get(name).invoke(argvals, funcmap));
      
   
   }
//Executes function's invoke method through interpret and T casts
}