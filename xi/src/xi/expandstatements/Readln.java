package xi.expandstatements;
import xi.expinterface.Expression;
import xi.expinterface.FunctionDef;
import java.util.*;
import java.lang.reflect.*;

public class Readln<T> implements Expression<String>
{

   public Readln()
   {
   
   }
   
   public String interpret(Scope varmap, Map<String, FunctionDef<?>> funcmap)
   {
      Scanner in = new Scanner(System.in);
      return in.nextLine();
      
      
   }


}
