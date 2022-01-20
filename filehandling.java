package first;
import java.io.File;
import java.io.FileWriter;
import java.io.BufferedWriter;
import java.io.IOException;
public class filehandling {
	

	   public static void main ( String[] args ) {

	      try {
	         String data = " hello world";
	         File f1 = new File("D:\\new file.txt");
	         if(!f1.exists()) {
	            f1.createNewFile();
	         }

	         FileWriter fileWritter = new FileWriter(f1.getName(),true);
	         BufferedWriter bw = new BufferedWriter(fileWritter);
	         bw.write(data);
	         bw.close();
	         System.out.println("file successfull created ");
	      } catch(IOException e){
	         e.printStackTrace();
	      }
	   }
	
	
	
	
	
	
	

}
