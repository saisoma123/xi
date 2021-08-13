package xi.expandstatements;
import java.util.HashMap;
public class Scope extends HashMap<String, Object>
{
   Scope parent;
   public Scope(Scope parent)
   {
      this.parent = parent;
   }
   public Object putNew(String key, Object value)
   {
       return super.put(key, value);
   }
   public Object declare(String key)
   {
       return putNew(key, null);
   }
   public Object put(String key, Object value)
   {
      return containsKey(key) ? super.put(key, value) : parent.put(key,value);
   }
   public Object get(String key)
   {
      return containsKey(key) ? super.get(key) : parent.get(key);
   }

}
//List of HashMaps that all point to each other, going right to left is parents, left to right is children. Kind of like LinkedLists.