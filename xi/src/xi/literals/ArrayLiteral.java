package xi.literals;
import xi.expinterface.Expression;
import xi.expinterface.FunctionDef;
import xi.expandstatements.Scope;
import java.util.Map;
public class ArrayLiteral<T> implements Expression<T[]>
{
   Expression<T>[] arr;
   //T[] newarr;
   public ArrayLiteral(Expression<T>[] arr)
   {
      this.arr = arr;
   
   }
   public T[] interpret(Scope varmap, Map<String, FunctionDef<?>> funcmap)
   {
      //return arr; 
      T[] newarr = (T[])(new Object[arr.length]);
      for(int i = 0; i < arr.length; i++)
      {
         newarr[i] = arr[i].interpret(varmap, funcmap);
      }
      return newarr;
   }


}
//Gets type signature and returns that type in interpret method