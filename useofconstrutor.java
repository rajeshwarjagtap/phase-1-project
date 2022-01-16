
//Write a program to demonstrate the uses of constructors and its types.

package first;
class construtor {
	String employename;
	int age;
	String birthdaydate;
	String employeno;
	construtor(){
}
	construtor(String  employename,int age,String birthdaydate,String employeno){
		
		
		this.employename=employename;
		this .age=age;
		this .birthdaydate=birthdaydate;
		this.employeno=employeno;
		
		
	}
	
	public void display() {
		System.out.println("Employee name "+employename );
		System.out.println("Employee age "+age);
		System.out.println("Employee birthday date "+birthdaydate );
		System.out.println("Employee  number "+employeno );
}
}
public class useofconstrutor{
	public static void main (String[]args) {
		
	construtor s1=new construtor("Rajeshwar", 22, "2/04/1999", "123");
	     s1.display();
	}	
}