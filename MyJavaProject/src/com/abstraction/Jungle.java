package com.abstraction;

class Jungle {

	public static void main(String[] args) {
		Animal a;
		a=new Dog(12,22);//upcasting
		a=new Lion(34,100);//upcasting
		System.out.println(a.height+ " "+ a.weight);
		a.talk();//polymorphism
		System.out.println(a.height+ "  " + a.weight);
		a.talk();//polymorphism
		
		

	}

}
