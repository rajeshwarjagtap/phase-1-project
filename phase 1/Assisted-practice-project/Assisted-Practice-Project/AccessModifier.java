package com.assistedpractice;
 public class AccessModifier {			
	 public int flag; //public scope
			public static void main(String[] args) { //public scope
				
				}
			protected void func() {// protected scope
				System.out.println("Protected Access Specifier");
			}
			void met() {// package scope
				System.out.println("Package Access Specifier ");
			}
			private void show() {//Can only be accesses within this class
				System.out.println("Private Access Specifier");
			}
		}
		class Other{
				void func() {
					AccessModifier p2 = new AccessModifier();
					p2.flag = 15;//Works
					System.out.println(p2.flag);
					p2.met();//Works
					p2.func();//Works
//					p2.show;//Error: private
				}	
	}
