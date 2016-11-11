package com.Interview;


class Vechile
{
	void run()
	{
	System.out.println("Vechile is running");
	}
	}

public class Bike2 extends Vechile
{
	void run()
	{
		System.out.println("Bike is running");
	}
public static void main(String[] args)
{
	Bike2 b=new Bike2();
	Vechile v=new Vechile();
	//Bike2 b1=new Vechile();
	
	b.run();
	v.run();
}
}
