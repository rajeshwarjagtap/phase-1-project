package com.assistedpracticeproject;

import java.io.FileWriter;

public class WriteFile {
	public static void main(String args[]){    
        try{    
          FileWriter fw=new FileWriter("F:\\testout.txt");    
          fw.write("Welcome to java.");    
          fw.close();    
         }catch(Exception e){System.out.println(e);}    
         System.out.println("Success...");    
    }    

}
