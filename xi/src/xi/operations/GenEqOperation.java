package xi.operations;
import xi.expinterface.Expression;
import xi.expinterface.FunctionDef;
import xi.enums.EqualityOp;
import xi.expandstatements.Scope;
import java.util.Map;
public class GenEqOperation<T> implements Expression<Boolean>
{
   EqualityOp op;
   Expression<T> a;
   Expression<T> b;
   
   public GenEqOperation(EqualityOp op, Expression<T> a, Expression<T> b)
   {
      this.op = op;
      this.a = a;
      this.b = b;
   
   }

   public Boolean interpret(Scope varmap, Map<String, FunctionDef<?>> funcmap)
   {
      Boolean ret = true;
      switch(op)
      {
         case EQUAL:
            ret = a.interpret(varmap, funcmap) == b.interpret(varmap, funcmap);
            break;
         case NOTEQUAL:
            ret = a.interpret(varmap, funcmap) != b.interpret(varmap, funcmap);
            break;
      }
      return ret;
   
   }

}