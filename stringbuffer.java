
       //  // convert of String to StringBuffer

package first;
import java.lang.*;
public class stringbuffer {

	public static void main(String[]args) {
		String abc[]={"Hello world","Hello java"};
		
		StringBuffer xyz=new StringBuffer();
	        xyz.append(abc[0]);
	        xyz.append(" "+abc[1]);
	       
	        System.out.println("String to String buffer as show below");
	        System.out.println(xyz.toString());
	      
	}	
	}
	
	
