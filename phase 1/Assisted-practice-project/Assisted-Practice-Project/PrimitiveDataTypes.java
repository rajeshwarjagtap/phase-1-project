package com.assistedpractice;
import java.util.Scanner;
public class PrimitiveDataTypes {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value");
		String s=sc.nextLine();
		int i=Integer.parseInt(s);
		System.out.println("Integer "+s+" "+i);
		double d=Double.parseDouble(s);
		System.out.println(" Double "+d);
		float  f=Float.parseFloat(s);
		System.out.println(" Float "+f);
		Scanner sca=new Scanner(System.in);
		boolean b=Boolean.parseBoolean(s);
		System.out.println(" Boolean "+b);
	}

}
