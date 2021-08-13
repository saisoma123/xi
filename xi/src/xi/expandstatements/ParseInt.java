package xi.expandstatements;
import xi.expinterface.Expression;
import xi.expinterface.FunctionDef;
import java.util.*;
import java.lang.reflect.*;

public class ParseInt<T> implements Expression<Integer>
{
   Expression<T[]> ret;

   public ParseInt(Expression<T[]> ret)
   {
      this.ret = ret;
   }
   
   public Integer interpret(Scope varmap, Map<String, FunctionDef<?>> funcmap)   
   {
      T[] val = ret.interpret(varmap, funcmap);
      String str = "";
      int[] newval = new int[val.length];
      char[] newnewval = new char[newval.length];
      for(int i = 0; i < val.length; i++)
      {
         newval[i] = (int) val[i];

      }
      for(int i = 0; i < newnewval.length; i++)
      {
         newnewval[i] = (char) newval[i];
         str += newnewval[i];
      }
      return Integer.parseInt(str);
      
   }


}
