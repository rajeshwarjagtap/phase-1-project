package com.assistedpractice;

public class ConstructorAndItsTypes {
	String name;
	int id;
		public ConstructorAndItsTypes(String name, int id) {
		super();
		System.out.println("Parametrized Contructor");
		this.name = name;
		this.id = id;
	}
	public ConstructorAndItsTypes() {
		super();
		System.out.println("Default Constructor");
			}

	public static void main(String[] args) {
		ConstructorAndItsTypes p=new ConstructorAndItsTypes();//default Constructor
		System.out.println(p.id);
		System.out.println(p.name);
		ConstructorAndItsTypes p1=new ConstructorAndItsTypes("Joe",01);//parameteerized constructor
		System.out.println(p1.name);
		System.out.println(p1.id);
		

	}

}

