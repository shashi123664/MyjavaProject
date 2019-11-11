package com.staticmembers;

class Demo8 {
	static void m1()
	{
		System.out.println("from static method m1 of demo 7");
	}

	public static void main(String[] args) {
		m1();
		Demo8.m1();
	}
		

}
