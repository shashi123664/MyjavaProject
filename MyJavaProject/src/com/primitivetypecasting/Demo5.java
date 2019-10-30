package com.primitivetypecasting;

public class Demo5 {
	public static void main(String[] args) {
		Product(10,20);
		Product(10,20,30);
		Product(10.0,20.0);
		
	}
	public static void Product(int a,int b)
	{
	System.out.println(a*b);
	}
	public static void Product(int a,int b,int c)
	{
		System.out.println(a*b*c);
	}
	public static void Product(double a,double b)
	{
		System.out.println(a*b);
	}
		
	}
