package first1A;



public class inhertancexample {

	public static void main (String[]args) {
		activa s1=(activa) new bike();
		
		s1.dispbike();//down casting 
		
		
		}
	
	
}
 class bike {
			String eng;
			String colour;
			String type;
			
			public bike(){
				
			}
			 bike(String eng,String colour,String type) {
		         this.eng=eng;
		         this.colour=colour;
		         this.type=type;
			}
			public void dispbike() {
			  System.out.println(eng);
			  System.out.println(colour);
			  System.out.println(type);
			  
			}
 }	
  class activa extends bike{
		double price;
		
		 activa(){
			
		}
		 activa (String eng,String colour,String type,double price){
			  this.eng=eng;
		         this.colour=colour;
		         this.type=type;
		         this.price=price;
		 }
		 public void disbike() {
			  System.out.println(eng);
			  System.out.println(colour);
			  System.out.println(type);
			  System.out.println(price);
			  
			}
  }	