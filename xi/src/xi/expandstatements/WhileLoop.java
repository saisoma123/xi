package xi.expandstatements;
import xi.expinterface.Expression;
import xi.expinterface.FunctionDef;
import xi.expandstatements.Block;
import xi.expandstatements.Scope;
import java.util.*;
public class WhileLoop implements Expression<Void>
{
   Expression<Boolean> guard;
   Expression<Void> body;
   public WhileLoop(Expression<Boolean> guard, Expression<Void> body)
   {
      this.guard = guard;
      this.body = body;
   }
   public Void interpret(Scope varmap, Map<String, FunctionDef<?>> funcmap)
   {
      while(guard.interpret(varmap, funcmap))
      {
          body.interpret(varmap, funcmap);
      }
      return null;
   }
}
//Keeps executing until guard is false