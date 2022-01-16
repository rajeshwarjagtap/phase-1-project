package first;
import java.util.Scanner;
public class searchString {
	public static void main(String[]args) {
		Scanner p=new Scanner(System.in);
		System.out.println("Enter the Number of Element in Array ");
		int r=p.nextInt();
		String s[]=new String[r+1];
		
		System.out.println("Enter the " +r+ " element below");
		for(int i=0;i<s.length;i++) {
			
		        s[i]= p.nextLine();
		    		
		   }
		
		System.out.println("Show the " +r+ " element below");
		for(int j=0;j<s.length;j++) {
			   
		System.out.println(s[j]);
		
		}
		
		
		
	}}
