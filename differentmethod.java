
//Write a program to demonstrate different methods of different return types.

package first;
public class differentmethod
{
	public static void main(String[]args)
	{
		System.out.println("Out put of different method shown below");
		System.out.println("output of method having return type is float "+floatreturn());
		System.out.println("output of method having return type is double "+doublereturn());
		System.out.println("output of method having return type is char "+charrturn());
		System.out.println("output of method having return type is String "+stringreturn());
		
	}
		
		
	   public static float floatreturn() {
			
					float b=123f;
					return b;
		    }
		public static double doublereturn() {
			double c=133.45;
			return c;
			}
		public static char charrturn() {
			char d='R';
			return d;
		   }
		public static String stringreturn() {
			String e="Rajeshwar";
			return e;
		   }
		
	}

