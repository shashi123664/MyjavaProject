package com.sort;

import java.util.Scanner;
public class BubbleSort {
	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		System.out.println("Enter the size of array");
		int size=sc.nextInt();
		int [] a=new int [size];
		int swap;
		for(int i=0;i<a.length;i++)
		{
			System.out.println("Enter the numbers "+ i);
			a[i]=sc.nextInt();
			
		}
		for(int i=0;i<a.length-1;i++)
		{
			for(int j=0;j<a.length-1-i;j++)
			{
				if(a[j]>a[j+1])
				{
					swap=a[j];
					a[j]=a[j+1];
					a[j+1]=swap;
				}
					
				}
		}
		System.out.println("Sorted list of numbers");
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}
	}

		}

