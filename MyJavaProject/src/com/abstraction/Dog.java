package com.abstraction;

public class Dog  extends Animal{
	Dog()
	{
		
	}
	Dog(double height,double weight){
		super(height,weight);
	}
	void talk()
	{
		System.out.println("dog bark");
	}

}
