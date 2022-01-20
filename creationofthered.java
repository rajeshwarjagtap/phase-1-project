package first1A;

public class creationofthered extends Thread

	{

	public void run()

	{

	System.out.println("concurrent thread started running..");

	}

	

	public static void main( String args[]) {

		creationofthered mt= new creationofthered();
		mt.start();

	}
	
	
	}
