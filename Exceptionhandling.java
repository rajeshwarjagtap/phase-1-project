package first1A;


	
	
	class MyException extends Exception{ 
		String str1;
		MyException(String str2) {
	

	str1=str2;

	}

	public String toString(){

	return ("MyException Occurred: "+str1);

	}
	}
public class Exceptionhandling{

	public static void main(String args[] ){

	try{

	System.out.println("Starting of try block");

	}

	catch(Exception exp){

	System.out.println("Catch Block");

	System.out.println(exp);
	}
	}
	

}
