package com.Interview;

public class SubClass extends SupperClass
{
  
	public SubClass()
	{
		super();
		System.out.println("subclass");
	}
	
	public static void main(String[] args)
	{
		SubClass obj=new SubClass();
	}
}
