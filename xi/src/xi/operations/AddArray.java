package xi.operations;
import xi.expinterface.Expression;
import xi.expinterface.FunctionDef;
import xi.expandstatements.Scope;
import java.util.Map;
public class AddArray<T> implements Expression<T[]>
{
   Expression<T[]> left;
   Expression<T[]> right;
   
   public AddArray(Expression<T[]> left, Expression<T[]> right)
   {
      this.left = left;
      this.right = right;
   }
   public T[] interpret(Scope varmap, Map<String, FunctionDef<?>> funcmap)
   {
      T[] leftinter = left.interpret(varmap, funcmap);
      T[] rightinter = right.interpret(varmap, funcmap);
      T[] result = (T[])(new Object[leftinter.length + rightinter.length]);
      System.arraycopy(leftinter, 0, result, 0, leftinter.length);
      System.arraycopy(rightinter, 0, result, leftinter.length, rightinter.length);
      return result;
   }
}
//Operations uses Expression<T>, technically any can be used as operand, although the operator would result in error. ReadVar gets var and type and works.