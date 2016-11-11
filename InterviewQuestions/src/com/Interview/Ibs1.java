package com.Interview;

import java.util.HashMap;

public class Ibs1
{
  public static void main(String[] args)
{
	HashMap hm1=new HashMap();
	hm1.put("a", "100");
	HashMap hm2=hm1;
	hm1.put("a", "200");
	System.out.println(hm1.get("a"));
	System.out.println(hm2.get("a"));
}
}
