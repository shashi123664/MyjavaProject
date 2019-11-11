package com.isarelationship;

 class B extends A{
	static int i=100;
	int j=200;
	static
	{
		System.out.println("from sib of B");
	}
	{
		System.out.println("from iib of b");
	}
	B()
	{
	System.out.println("from B()");	
	}

}
