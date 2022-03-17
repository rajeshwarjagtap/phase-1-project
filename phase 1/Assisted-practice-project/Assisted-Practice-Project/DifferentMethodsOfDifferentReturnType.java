package com.assistedpractice;
class DifferentMethodsOfDifferentReturnType {
	  public static int square(int num) {
	    return num * num;
	  }
	  public static int Add(int a,int b) {
		  return a+b;
	  }
	  public static int Substration(int a,int b) {
	  return a-b;
	  }
	  public static void main(String[] args) {
	    int result;
	    result = square(10);
	    System.out.println("Squared value of 10 is: " + result);
	    int sum;
	    sum=Add(5,5);
	    System.out.println("Addition value of is: "+ sum);
	    int sub;
	    sub=Substration(2, 1);
	    System.out.println("Substraction value of is:" + sub);
	  }
	}
	

