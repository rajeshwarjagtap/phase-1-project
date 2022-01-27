package first;
import java.util.Scanner;
public class searchEmailid {
	public static void main(String[]args) {
		
		Scanner s=new Scanner(System.in);
	  String a[]= {"raj1@","raj2@","raj3@"};
	  
	  for(int j=0;j<a.length;j++) 
	  {
		  System.out.println(a[j]);
	  }
	  
          System.out.println();
	  System.out.println("Enter the email.id from above ");
	  String s1=s.nextLine();
	  String p1=s1+"";
	 int j=0;
	  for(int i=0;i<a.length;i++) {
		String p2=a[i]+"";
		
	    if(p2.equals(p1))
		  {
			System.out.println("yes it present --->> " +p1);
			break;
		}
		
	  j++;
	  }
	 
	  if(j==(a.length)) {
		  System.out.println("email id not found");
	  }
	  
	}

}
