package com.upcasting;

class MainClass2 {

	public static void main(String[] args) {
		 B1 ob1= new C1();
		 System.out.println(ob1.i);
		 System.out.println(ob1.j);
		  
		 
		 A1 ob2= new C1();
		 System.out.println(ob2.i);
		 
		 A1 ob3= ob1;
		 System.out.println(ob3.i);
		 
		 
		 

	}

}
