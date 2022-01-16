
    //"Write a program to demonstrate the working of inner classes.


package first;

class laptop
{
	String brandlaptop;
   	String size;
	String price;
	 laptop(){
		
	}
	laptop(String brandlaptop,String size,String price){
		this. brandlaptop=brandlaptop;
		this. size=size;
		this.price=price;
	}
	public void displaylaptop() {
		System.out.println("brand of laptop "+brandlaptop);
		System.out.println("laptop size "+size);
		System.out.println("laptop price  "+ price);
	}

	
	class microprosser
	{
		 String micsize;
		 String core;
		microprosser(){
			
		}
		 microprosser(String micsize,String core) {
		    this.core=core;
			this.micsize = micsize;
		}
		public void displaymicroprosser()
		{
			System.out.println("microprosser size "+micsize);
			System.out.println("microprosser core "+ core);
		}
	}
	
	
	
}
public class innerclass {
     public static void main(String[]args) {
    	 laptop s1= new laptop("HP", "15.6inch", "71000 Rs");
    	laptop.microprosser s2=s1. new microprosser("64bit","intel");
    	s1.displaylaptop();
    	 s2.displaymicroprosser();
    	 
     }
}
