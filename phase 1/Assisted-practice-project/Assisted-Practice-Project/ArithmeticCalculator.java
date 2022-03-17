package com.assistedpractice;
import java.util.Scanner;
public class ArithmeticCalculator {
  public static void main(String[] args) {
		int a,b,ch;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the first number" );
		a=sc.nextInt();
		System.out.println("Enter the second number:+,-,*,/");
		b=sc.nextInt();
		System.out.println("Choose an operator");
		ch=sc.nextInt();
		if (ch==1) 
			System.out.println("Addition=" +(a+b));
		else if(ch==2)
			System.out.println("Substraction=" +(a-b));
		else if(ch==3)
			System.out.println("Multiplication=" +(a*b));
		else if(ch==4)
			System.out.println("Divide ="+ (double)a/(double)b);
		else if(ch==5)
			System.out.println(a%b);
			else
			System.out.println("Invalid Choice");
		
		}
}
