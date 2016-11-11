package com.Interview;

import java.util.LinkedList;
import java.util.ListIterator;

public class ListIteratorDemo
{
	
	public static void main(String[] args)
	{
		LinkedList l=new LinkedList();
		   
		   l.add("vijay");
		   l.add("vikassh");
		   l.add("lara");
		   l.add("durga");
		   
		   ListIterator ltr=l.listIterator();
		   
		   while(ltr.hasNext())
		   {
			   String s=(String) ltr.next();
			   
			   
		   }
		   System.out.println(l);
	}
   
	
	
}
