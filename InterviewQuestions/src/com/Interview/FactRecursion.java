package com.Interview;

import java.util.Scanner;

public class FactRecursion
{
	  static int factorial(int n)
		{
			if(n==0 || n==1)
			{
			  return 1;
			}
			else
				return factorial(n-1)+factorial(n-2);
		}
	
	
	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter a value:");
		int num=s.nextInt();
		for(int i=0;i<=num;i++)
		{
			System.out.print(factorial(i)+" ");
		}
	}
}
