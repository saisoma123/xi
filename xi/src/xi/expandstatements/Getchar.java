package xi.expandstatements;
import xi.expinterface.Expression;
import xi.expinterface.FunctionDef;
import java.util.*;
import java.lang.reflect.*;

public class Getchar implements Expression<Character>
{

   public Getchar()
   {
   
   }
   
   public Character interpret(Scope varmap, Map<String, FunctionDef<?>> funcmap)
   {
      Scanner scanner = new Scanner(System.in);
      char ch = scanner.next().charAt(0);
      return ch;
      
   }


}
