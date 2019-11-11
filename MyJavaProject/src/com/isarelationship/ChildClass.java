package com.isarelationship;

class ChildClass extends ParentClass{
	static  boolean j;
	 static
	 {
		 System.out.println("from IIB 2");
	 }
	

	public static void main(String[] args) {
		System.out.println(ChildClass.i);
		System.out.println(ChildClass.b);
		System.out.println(ChildClass.j);
		
		
	}

}
