package xi.test;
import xi.literals.*;
import xi.operations.*;
import xi.enums.*;
import xi.expinterface.*;
import xi.expandstatements.*;
import xi.parser.*;
import java.util.*;
import java.io.*;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CodePointCharStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.junit.*;
public class Main
{
   public xigParser parser(String filename) throws Exception
   {
      CommonTokenStream ts = new CommonTokenStream(new xigLexer(CharStreams.fromFileName(filename)));
      return new xigParser(ts);
   }
   @Before public void setup()
   {
      System.out.println("== Running another test ==");
   }
   
   /*
   @Test	public void testprime() throws Exception
	{
      Map<String, FunctionDef<?>> funcmap = parser("xi/test/gcd.xi").parse().val;
      System.out.println(funcmap.get("main").invoke(new LinkedList<>(), funcmap));
	}
   */
   
   
   @Test public void testfib() throws Exception
   {
      Map<String, FunctionDef<?>> funcmap = parser("xi/test/fibonacci.xi").parse().val;
      /*
      Object arr = funcmap.get("main").invoke(new LinkedList<>(), funcmap);
      Object[] newarr = (Object[])(arr);
      for(int i = 0; i < newarr.length; i++)
      {
         System.out.println((int)newarr[i]);
      }
      */
      System.out.println(funcmap.get("main").invoke(new LinkedList<>(), funcmap));
      //.getClass().getName())
   
   }
   
   
   
   @Test public void testbinsearch() throws Exception
   {
      Map<String, FunctionDef<?>> funcmap = parser("xi/test/binsearch.xi").parse().val;
      System.out.println(funcmap.get("main").invoke(new LinkedList<>(), funcmap));
   }
   
}