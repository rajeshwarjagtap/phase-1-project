package com.assistedpractice;
public class Array {
	public static void main(String[] args) {
		//single-dimensional array
		int a[]= {1,2,3,4,5};
		for(int i=0;i<5;i++) {
		System.out.println("Elements of array a: "+a[i]);
		}
		//multidimensional array
		int[][] b = {
		            {2, 4, 6, 8}, 
		            {3, 6, 9} };		      
		      System.out.println("Length of row 1: " + b[0].length);
		      }
}
