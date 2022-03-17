package com.assistedpractice;

public class StringBufferAndStringBuilder {

	public static void main(String[] args) {
		//StringBuffer
		StringBuffer sb=new StringBuffer("String Buffer");
		System.out.println(sb);
		sb.append(" Hello World");
		System.out.println(sb);
		sb.append(55);
		System.out.println("-------------");
		//StringBuilder
		StringBuilder sb1=new StringBuilder("String Builder ");
		sb1.append(" My NAme IS Khan");
		sb1.append(" Shahrukh Khan");
		System.out.println(sb1);

	}

}
