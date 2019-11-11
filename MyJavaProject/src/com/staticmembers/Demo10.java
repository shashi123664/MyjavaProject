package com.staticmembers;

class Demo10 {
	static
	{
		System.out.println("from sib-2");
	}

	public static void main(String[] args) {
		System.out.println("from main");
		

	}
	static 
	{
		System.out.println("from sib-2");
	}

}
