package com.Interview;

public class EggerSingleToneExample
{
  
	private static final EggerSingleToneExample instance=new EggerSingleToneExample();

     private EggerSingleToneExample()
     {

	   System.out.println("Deafault constructor");
      }
	
       public static EggerSingleToneExample getInstance()
        {  
	       return instance;
        }
	
  }
