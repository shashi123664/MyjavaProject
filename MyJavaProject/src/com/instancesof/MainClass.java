package com.instancesof;

class MainClass {

	public static void main(String[] args) {
		A ob1=new B();
		System.out.println(ob1 instanceof A);
		System.out.println(ob1 instanceof B);
		
		B ob2=new B();
		System.out.println(ob2 instanceof A);
		System.out.println(ob2 instanceof B);
		
		A ob3 = new A();
		System.out.println(ob3 instanceof A);
		System.out.println(ob3 instanceof B);
		
		
		

	}

}
