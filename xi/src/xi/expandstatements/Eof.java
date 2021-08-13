package xi.expandstatements;
import xi.expinterface.Expression;
import xi.expinterface.FunctionDef;
import java.util.*;
import java.lang.reflect.*;

public class Eof implements Expression<Boolean>
{

   public Eof()
   {
   
   }
   
   public Boolean interpret(Scope varmap, Map<String, FunctionDef<?>> funcmap)
   {
      Scanner scan = new Scanner(System.in);
      if(scan.hasNextLine())
      {
         return false;
      }
      else
      {
         return true;
      }      
   }


}