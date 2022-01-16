
//As a developer, write a program to create an arithmetic calculator.

package first;

import java.util.Scanner;

public class arithmeticcalculator {

	public static void main(String[] args) {

		System.out.println("Enter the first value ");
		Scanner sc=new Scanner(System.in);
		double a=sc.nextDouble();
		System.out.println("Enter the second value");
		double b=sc.nextDouble();
		System.out.println("1) Addition");
		System.out.println("2) Subtraction");
		System.out.println("3) Mulltiplication");
		System.out.println("4) Division");
		System.out.println("Enter the above opration on Number");
		int d=sc.nextInt();
		
		switch(d)
		{
			case 1:
			   double e=add(a,b);
			   System.out.println("Result "+ e);
			   
			   break;
			case 2:
			    double f= sub(a,b);
			    System.out.println("Result "+ f);
			    break;
			case 3:
			   double g=  mul(a,b);
			   System.out.println("Result "+ g);
			    break;
			      
			case 4:
			   double h= div(a,b);
			   System.out.println("Result "+ h);
			   break;
		     default:
		    	 System.out.println("Enter valid input");			
			
		}
		
		
		}
	
	
	public static double add(double a,double b)
	{
	    double c=a+b;
	    return c;
	}
	public static double sub(double a,double b)
	{
		 double c=a-b;
		    return c;
	}
	public static double mul(double a,double b)
	{
		 double c=a*b;
		    return c;
	}
	public static double div(double a,double b)
	{
		 double c=a/b;
		    return c;
	}
	
}
