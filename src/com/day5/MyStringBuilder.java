package com.day5;

public class MyStringBuilder 
{
	public static void main(String args[])
	{
		StringBuilder sbb=new StringBuilder("Peter");
		StringBuilder sbb2=new StringBuilder("Froude");
		
		//append
		sbb.append(" java");
		System.out.println(sbb);
		
		//delete
		sbb.delete(1,3);
		System.out.println(sbb);
		
		//length
		System.out.println(sbb.length());
		
		//substring
		System.out.println(sbb.substring(2,3));
		
		//reverse
		System.out.println(sbb.reverse());
		
		//indexOf
		System.out.println(sbb.indexOf("j"));
		
		//equals
		System.out.println(sbb.equals(sbb2));
	}
}
