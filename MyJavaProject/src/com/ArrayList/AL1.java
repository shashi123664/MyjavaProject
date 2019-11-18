package com.ArrayList;
import java.util.ArrayList;

public class AL1 {
	public static void main(String[] args) {
		ArrayList a1=new ArrayList();
		System.out.println(a1.size());
		System.out.println(a1.isEmpty());
		a1.add(10);
		a1.add(20);
		a1.add("tejha");
		System.out.println(a1);
		a1.add(1,"Sudarshan");
		System.out.println(a1);
		a1.add("Hitesh");
		a1.add("aditya");
		System.out.println(a1.isEmpty());
		System.out.println(a1.size());
		Object ob=a1.set(5, "harshit");
		System.out.println(ob);
		System.out.println(a1);
		System.out.println(a1.contains("asmita"));
		System.out.println(a1.add(20));
		System.out.println(a1);
		System.out.println(a1.indexOf(20));
		System.out.println(a1.lastIndexOf(20));
		System.out.println(a1.indexOf("Tejhaa"));
		System.out.println(a1.size());
		a1.clear();
		System.out.println(a1.isEmpty());
		System.out.println(a1.size());
	}

}
