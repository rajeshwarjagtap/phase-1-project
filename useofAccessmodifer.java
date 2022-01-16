
     //"Write a program to demonstrate how and when access modifiers are used.

package first;
 class parent{
	 
	 public String name;
		protected int age;
		private String education;
		String skill;
		public String getEducation() {
			return education;
		}
		public void setEducation(String education) {
			this.education = education;
		}
		
		public void display() {
           System.out.println("name ="+name);
           System.out.println("age ="+age);
           System.out.println("Education = "+getEducation());
           System.out.println("Skill ="+skill);
           
	 
	  }

}
public class useofAccessmodifer {
	public static void main(String[]args) {
		
		
		parent s1=new parent();
		s1.name="Raj";
		s1.age=12;
		s1.skill="core java";
		s1.setEducation("BE");
		s1.display();
		
		
	
	}

}
