package xi.operations;
import xi.expinterface.Expression;
import xi.expinterface.FunctionDef;
import xi.enums.BoolOp;
import xi.expandstatements.Scope;
import java.util.Map;
public class NotOp implements Expression<Boolean>
{
   BoolOp op;
   Expression<Boolean> a;
   
   public NotOp(BoolOp op, Expression<Boolean> a) //Not operator needs separate class since it only takes one argument
   {
      this.op = op;
      this.a = a;
   }
   public Boolean interpret(Scope varmap, Map<String, FunctionDef<?>> funcmap)
   {
      return !a.interpret(varmap, funcmap);
      
   }


}