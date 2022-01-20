package first1A;


public class encapsulexampleAtm {
	
		private String name="BoB";
		private String branch="Dahanu";
		private double bal=100.2;
		private long Acc=1234546;
		public String getName() {
			return name;
		}
		
		public String getBranch() {
			return branch;
		}
		
		public double getbal() {
			return bal;
		}
		public void setbal(double bal) {
			this.bal = bal;
		}
		public long getAcc() {
			return Acc;
		}
		public void setAcc(long acc) {
			Acc = acc;
		}
		
		

	
	public static void main(String[] args) {
		encapsulexampleAtm a1=new encapsulexampleAtm();
			a1.setbal(200.20);
			System.out.println (a1.getbal());
			System.out.println (a1.getName());
			System.out.println (a1.getAcc());
			
			
			
			
			
			
			
			// TODO Auto-generated method stub

		}


}
