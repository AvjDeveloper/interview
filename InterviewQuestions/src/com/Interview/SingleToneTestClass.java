package com.Interview;

import java.lang.reflect.Constructor;

public class SingleToneTestClass
{

	public static void main(String[] args)
	{
		EggerSingleToneExample instanceOne=EggerSingleToneExample.getInstance();
		
		
		EggerSingleToneExample instanceTwo=null;
		
		
		try
		{
			Constructor[] constructors=EggerSingleToneExample.class.getDeclaredConstructors();
			
			
			for(Constructor construcror:constructors)
			{
			  construcror.setAccessible(true);
			  
			  instanceTwo=(EggerSingleToneExample) construcror.newInstance();
			  
			  break;
			}
				
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		
		System.out.println(instanceOne.hashCode());
		System.out.println(instanceTwo.hashCode());
	}
}
