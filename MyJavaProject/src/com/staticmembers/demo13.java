package com.staticmembers;

class demo13 {
	static boolean j;
	static 
	{
		System.out.println("from sib of demo13");
	}
	public static void main(String[] args) {
		System.out.println("from main of demo12");
		System.out.println(Demo12.i);
	}
}
