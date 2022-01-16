
//Write a program which will take a string as input and will convert it into other primitive data types.

package first;
import java.util.Scanner;
public class typecasting {
	public static void main(String[]args) {
		System.out.println("Enter the String ");
   Scanner s= new Scanner(System.in);
	String a=s.nextLine();
	System.out.println("Narrowing Result of String below");
	System.out.println("String converted into integer");
    int c=Integer.parseInt(a);
	System.out.println(c);
	System.out.println("String converted into char");
	char b=a.charAt(0);
	System.out.println(b);
	System.out.println("String converted into Double");
	double d=Double.parseDouble(a);
	System.out.println(d);
	

}
	}
