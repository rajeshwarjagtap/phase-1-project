package first1A;


	 interface interface1

	{

	default void show()

	{

	System.out.println("Default First");
	}
	}

	interface interface2
	{
	

	default void show()

	{
		
	

	System.out.println("Default Second");

	}

	}

	public class diamondeProblem implements interface1, interface2
	 {

	public void show()

	{

	interface1.super.show(); 
	interface2.super.show();

	}
	 
	public static void main(String args[])

	{

	diamondeProblem ob = new diamondeProblem();
	ob.show();

	}
	
	 }	 
