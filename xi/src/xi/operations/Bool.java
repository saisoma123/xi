package xi.operations;
import xi.expinterface.Expression;
import xi.expinterface.FunctionDef;
import xi.enums.BoolOp;
import xi.expandstatements.Scope;
import java.util.Map;
public class Bool implements Expression<Boolean>
{
   BoolOp op;
   Expression<Boolean> a, b;
   
   public Bool(BoolOp op, Expression<Boolean> a, Expression<Boolean> b)
   {
      this.op = op;
      this.a = a;
      this.b = b;
   }
   public Expression<Boolean> getA()
   {
      return a;
   }
   public Expression<Boolean> getB()
   {
      return b;
   }
   public Boolean interpret(Scope varmap, Map<String, FunctionDef<?>> funcmap) //Switch case based on BoolOp argument
   {
      Boolean result = true;
      switch(op)
      {
         case AND:
            result = a.interpret(varmap, funcmap) & b.interpret(varmap, funcmap);
            break;
         case OR:
            result = a.interpret(varmap, funcmap) | b.interpret(varmap, funcmap);
            break;
      }
      return result;
      
   }
   
}