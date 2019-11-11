package com.staticmembers;

class Demo12 {
	static int i;
	static
	{
		System.out.println("from sib of demo12");
	}
	public static void main(String[] args) {
		System.out.println("from main of Demo12");
		System.out.println(demo13.j);
	}
}
	

