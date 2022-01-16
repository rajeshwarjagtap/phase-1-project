

     //Write a program to demonstrate the uses of Map.

package first;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class useofMap {
      public static void main(String[]args) {
    	  
    	  Map<String,String> s=new HashMap<>();
    	  s.put("Apple", "Red");
    	  s.put("Mangoes", "yellow");
    	  s.put("Kiwifruit", "green");
    	  s.put("oranges", "Oranges");
    	 
    	       Set<String> p1=s.keySet();
    	  
    	  for(String key:p1) {
    		  System.out.println(key+"   "+s.get(key));
    		  
    	  }
    	 
    	  
      }


}
