package com.primitivetypecasting;

import java.util.Scanner;
public class Demo6 {
	public static void main(String [] args)
	{
		Scanner kb=new Scanner (System.in);
		System.out.println("Enter the starting number");
		int n=kb.nextInt();
		System.out.println("Enter the array size");
		int size=kb.nextInt();
		int [] array=new int[size];
		for(int i=0; i<array.length;n++)
		{
			if(isPrime(n)) {
				array[i]=n;
				i++;
			}
		}
			for (int i=0;i<array.length;i++)
			{
				System.out.println(array[i]);
			}
	}
			public static boolean isPrime(int n)
			{
				int count=2;
				for(int j=2;j<=n/2;j++)
				{
				
					if(n%j==0)
					{
						count++;
					}
				}
				if(count==2) {
				return true;}
				else {
				return false;
				}
			
			}
			}
			
			
				
			

