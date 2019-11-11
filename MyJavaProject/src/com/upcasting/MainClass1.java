package com.upcasting;

class MainClass1 {

	public static void main(String[] args) {
		 A ob1=new B();
		 System.out.println(ob1.i);
		 //System.out.println(ob1.j);// CTE
		 
		 B ob2= new B();
		 System.out.println(ob2.i);
		 System.out.println(ob2.j);
		 A ob3=ob2;
		 System.out.println(ob2.i);
		 System.out.println(ob2.j);
		// System.out.println(ob3.j);// CTE
		 


	}

}
