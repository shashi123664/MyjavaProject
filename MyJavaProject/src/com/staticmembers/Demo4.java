package com.staticmembers;

public class Demo4 {
	static int i=10;
	public static void main(String[] args) {
		System.out.println(Demo4.i);
		Demo4.i=20;
		System.out.println(Demo4.i);
	}

}
