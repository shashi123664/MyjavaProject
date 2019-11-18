package com.toString;

public class EmpDetails {
	public static void main(String[] args) {
		TestEngineer t1=new TestEngineer(1,"xyz",10.0,"selenium");
		TestEngineer t2=new TestEngineer(1,"xyz",10.0,"selenium");
		Developer d1=new Developer(2,"abc",12.0,"java");
		Developer d2=new Developer(2,"abc",12.0,"java");
		System.out.println(t1);
		System.out.println(t2);
		System.out.println(d1);
		System.out.println(d2);
		System.out.println(t1.equals(t2));
		System.out.println(d1.equals(d2));
		System.out.println(t1.hashCode());
		System.out.println(t2.hashCode());
        System.out.println(d1.hashCode());
        System.out.println(d2.hashCode());
		
		
	}

}
