package first1A;

public class useofTryandcatch {

	public static void main (String[]args)
	{
		
		int a=10;
		int b=0;
		int s=96;
		try {
			int div=a/b;
		}
		catch(ArithmeticException Ex){
			System.out.println("Exception successfull handel");
		}
		
		System.out.println("s="+s);
	}
	
	
	
	
	
}
