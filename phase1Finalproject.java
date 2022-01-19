package Finalproject;
import java.util.Collection;
import java.util.Scanner;
import java.util.*;
public class phase1Finalproject {
	

	public static void main (String[]args) {
		
		System.out.println("-------------------------------------");
		System.out.println("  @ Wellcome To Company Portal @");
		System.out.println( " ----------------"  );
		System.out.println("    Main menu  ");
		System.out.println( " ---------------- "  );
		System.out.println("1] All Users Data");
		System.out.println("2] ADD User ");
		System.out.println("3] Search user");
		System.out.println("4] Delete user ");
		Scanner sc=new Scanner(System.in);
		System.out.println( "        "  );
		System.out.println("Enter the input from above >> ");
		int a=sc.nextInt();
		switch(a) {
		
		case (1):
		{
			System.out.println("-----All Users Data-------");
			System.out.println( "        "  );
			System.out.println("--User Name------UserId-----User Age--- User location-");
			System.out.println( "        "  );
			
			Scanner sc1=new Scanner(System.in);
			LinkedList key1 =new LinkedList<>();
			LinkedList key2 =new LinkedList<>();
			LinkedList key3 =new LinkedList<>();
			LinkedList key4 =new LinkedList<>();
			LinkedList key5 =new LinkedList<>();
			key1.add(" Rajeshwar Jagtap");
			key1.add(" A1111 ");
			key1.add(" 22  ");
			key1.add("  Mumbai ");
			
			System.out.println(key1);
		
			key2.add(" Gargi patil");
			key2.add("      A222   ");
			key2.add("22    ");
			key2.add("Mumbai ");
			System.out.println(key2);
			
			
			key3.add(" Rohit sharma ");
			key3.add("    A333 ");
			key3.add("  23  ");
			key3.add("  pune ");
			System.out.println(key3);
			
			
			key4.add(" ketki isai ");
			key4.add("      A444  ");
			key4.add(" 25 ");
			key4.add("   Delhi ");
			System.out.println(key4);
			
			key5.add(" Ramesh singh");
			key5.add("     A555 ");
			key5.add("  22 ");
			key5.add("   pune ");
			System.out.println(key5);
			
			
			
			
			
			
			
			
			
			
			
			
			
			break;
		}
			
		case (2):
		{
			System.out.println("-----ADD Users-------");
			System.out.println( "        "  );
		
			LinkedList list3 =new LinkedList<>();
			System.out.println("Enter the first name");

			String A1=sc.next();
			System.out.println("Enter the last name");
			String A1a=sc.next();
			System.out.println("Enter the user Id (Eg.. A666) ");
			String A2=sc.next();
			System.out.println("Enter the user age");
			String A3=sc.next();
			System.out.println("Enter the user location");
			String A4=sc.next();
		
			LinkedList key1 =new LinkedList<>();
			LinkedList key2 =new LinkedList<>();
			LinkedList key3 =new LinkedList<>();
			LinkedList key4 =new LinkedList<>();
			LinkedList key5 =new LinkedList<>();
			System.out.println(" ---New User successfully Add-- ");
			System.out.println( "        "  );
			System.out.println("--User Name------UserId-----User Age--- User location-");
			System.out.println( "        "  );
			key1.add(" Rajeshwar Jagtap");
			key1.add(" A111 ");
			key1.add(" 22  ");
			key1.add("  Mumbai ");
			
			System.out.println(key1);
		
			key2.add(" Gargi patil");
			key2.add("      A222   ");
			key2.add("22    ");
			key2.add("Mumbai ");
			System.out.println(key2);
			
			
			key3.add(" Rohit sharma ");
			key3.add("    A333 ");
			key3.add("  23  ");
			key3.add("  pune ");
			System.out.println(key3);
			
			
			key4.add(" ketki isai ");
			key4.add("      A444  ");
			key4.add(" 25 ");
			key4.add("   Delhi ");
			System.out.println(key4);
			
			key5.add(" Ramesh singh");
			key5.add("     A555 ");
			key5.add("  22 ");
			key5.add("   pune ");
			System.out.println(key5);
			
			
			
			list3.add(" "+A1+" "+A1a);
			list3.add("       "+A2);
			list3.add("    "+A3);
			list3.add("     "+A4);
			System.out.println(list3);
		   
			
			
			
			
			
			break;
		}
			
		case (3):
		{
			System.out.println("-----Search User Data-------");
			System.out.println( "        "  );
			
			
			Scanner sc1=new Scanner(System.in);
			System.out.println("Enter the emp id");
			String p=sc1.next();
			System.out.println("--User Name------UserId-----User Age--- User location-");
			System.out.println( "        "  );
			LinkedList key1 =new LinkedList<>();
			LinkedList key2 =new LinkedList<>();
			LinkedList key3 =new LinkedList<>();
			LinkedList key4 =new LinkedList<>();
			LinkedList key5 =new LinkedList<>();
			key1.add("Rajeshwar Jagtap");
			key1.add("A111");
			key1.add(" 22  ");
			key1.add("  Mumbai ");
			
			key2.add(" Gargi patil");
			key2.add("A222");
			key2.add("22    ");
			key2.add("Mumbai ");
			
			
			
			key3.add(" Rohit sharma ");
			key3.add("A333");
			key3.add("  23  ");
			key3.add("  pune ");
			
			
			
			key4.add(" ketki isai ");
			key4.add("A444");
			key4.add(" 25 ");
			key4.add("   Delhi ");
			
			
			key5.add(" Ramesh singh");
			key5.add("A555");
			key5.add("  22 ");
			key5.add("   pune ");
		
			
	
			if(key1.get(1).equals(p)) {
				System.out.println(key1);
			}
			else if(key2.get(1).equals(p)) {
				System.out.println(key2);
			}
			else if(key3.get(1).equals(p)) {
				System.out.println(key3);
			}
            else if(key4.get(1).equals(p)) {
            	System.out.println(key4);
			}
             else if(key5.get(1).equals(p)) {
            	 System.out.println(key5);
			}
             else
             {
            	 System.out.println("user not found");
             }
            	
			
			break;

		}
			
		case (4):
		{
			

			System.out.println("-----Delete User Data-------");
			System.out.println( "        "  );
			
			
			
			
		    Scanner sc1=new Scanner(System.in);
			System.out.println("Enter the User id  (eg..A111)");
			String p=sc1.next();
			
			
			
			
			LinkedList key1 =new LinkedList<>();
			LinkedList key2 =new LinkedList<>();
			LinkedList key3 =new LinkedList<>();
			LinkedList key4 =new LinkedList<>();
			LinkedList key5 =new LinkedList<>();
			
			
			key1.add("Rajeshwar Jagtap");
			key1.add("A111");
			key1.add(" 22  ");
			key1.add("  Mumbai ");
			
			key2.add(" Gargi patil");
			key2.add("A222");
			key2.add("22    ");
			key2.add("Mumbai ");
			
			
			
			key3.add(" Rohit sharma ");
			key3.add("A333");
			key3.add("  23  ");
			key3.add("  pune ");
			
			
			
			key4.add(" ketki isai ");
			key4.add("A444");
			key4.add(" 25 ");
			key4.add("   Delhi ");
			
			
			key5.add(" Ramesh singh");
			key5.add("A555");
			key5.add("  22 ");
			key5.add("   pune ");
			
			

			if(key1.get(1).equals(p)) {
				
				key1.remove();
				
				
				System.out.println("User { Rajeshwar jagtap } is successfull deleted");
				System.out.println( "        "  );
				System.out.println("--User Name------UserId-----User Age--- User location-");
				System.out.println( "        "  );

				System.out.println(key2);
				System.out.println(key3);
				System.out.println(key4);
				System.out.println(key5);
				
				
				
			}
			else if(key2.get(1).equals(p)) {
				key2.remove();
				
				System.out.println("User { Gargi patil } is successfull deleted");
				System.out.println( "        "  );
				System.out.println("--User Name------UserId-----User Age--- User location-");
				System.out.println( "        "  );

				System.out.println(key1);
				System.out.println(key3);
				System.out.println(key4);
				System.out.println(key5);
				
			}
			else if(key3.get(1).equals(p)) {
				key3.remove();
				
				System.out.println("User { Rohit sharma } is successfull deleted");
				System.out.println( "        "  );
				System.out.println("--User Name------UserId-----User Age--- User location-");
				System.out.println( "        "  );

				System.out.println(key1);
				System.out.println(key2);
				System.out.println(key4);
				System.out.println(key5);
				
			}
            else if(key4.get(1).equals(p)) {
            	key4.remove();
            	
				System.out.println("User { ketki isai } is successfull deleted");
				System.out.println( "        "  );
				System.out.println("--User Name------UserId-----User Age--- User location-");
				System.out.println( "        "  );

				System.out.println(key1);
				System.out.println(key2);
				System.out.println(key3);
				System.out.println(key5);
				
			}
             else if(key5.get(1).equals(p)) {
            		key5.remove();
            		
    				System.out.println("User { Ramesh singh } is successfull deleted");
    				System.out.println( "        "  );
    				System.out.println("--User Name------UserId-----User Age--- User location-");
    				System.out.println( "        "  );

    				System.out.println(key1);
    				System.out.println(key2);
    				System.out.println(key3);
    				System.out.println(key4);
    				
			}
             else
             {
            	 System.out.println("user not found");
             }
			
			
			
		break;
			
			

		}
		
		
		}
		
		
		
     }
	

}
