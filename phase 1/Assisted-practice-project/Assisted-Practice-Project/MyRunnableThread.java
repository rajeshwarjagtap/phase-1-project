package com.assistedpractice;

public class MyRunnableThread implements Runnable{
	public static int myCount=0;
	public MyRunnableThread() {
		
	}
	public void run() {
		while (MyRunnableThread.myCount<=10) {
			try {
				System.out.println("Expl Thread:"+(++MyRunnableThread.myCount));
				Thread.sleep(100);
			} catch (InterruptedException e) {
				System.out.println("exception in thread:"+ e.getMessage());
			}
			
		}
	}
	 
    public static void main(String[] args) {
		System.out.println("Starting Main thread");
		MyRunnableThread mt=new MyRunnableThread();
		Thread t=new Thread();
		t.start();
		while (MyRunnableThread.myCount<=9) {
			try {
				System.out.println("Main Thread:"+(++MyRunnableThread.myCount));
				Thread.sleep(100);
				
			} catch (InterruptedException e) {
				System.out.println("Exception in Main thread:"+e.getMessage());
				
				
			}
		}
		System.out.println("End Of Main Thread");
		
	}
}

