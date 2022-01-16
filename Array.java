
//Write a program to create single-dimensional and multidimensional arrays.

package first;
import java.util.Scanner;
public class Array {
	public static void main (String []args)
	{
		Scanner s=new Scanner(System.in);
	         int a[]=new int[3];
	         int b[][]=new int[2][2];
	         System.out.println("Enter the number");
	         for(int i=0;i<a.length;i++)
	         {
	            a[i]=s.nextInt();
	           }
	         System.out.println("Single dimension Array");
	         for(int i=0;i<a.length;i++)
	         {
	          System.out.println(a[i]);
	          
	           }
	         
	         System.out.println("two dimension Array");
	         
	         for(int i=0;i<b.length;i++)
	         {
	           for(int j=0;j<b[i].length;j++)
	           {
	        	   
	        	   b[i][j]=s.nextInt();
	        	   
	           }
	         }
	           for(int i=0;i<b.length;i++)
		         {
		           for(int j=0;j<b[i].length;j++)
		           {
		        	   
		        	 System.out.print( b[i][j]+"");
		        	   
		           }
	         
		           System.out.println();
	         
	             }
	}}

