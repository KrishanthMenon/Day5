package com.day5;

public class MyStringBuffer 
{
	public static void main(String args[])
	{
		StringBuffer sb=new StringBuffer("Hello");
		
		//append
		sb.append(" java");
		System.out.println(sb);
		
		//delete
		sb.delete(1,3);
		System.out.println(sb);
		
		//length
		System.out.println(sb.length());
		
		//substring
		System.out.println(sb.substring(2,3));
		
		//reverse
		System.out.println(sb.reverse());
		
		//indexOf
		System.out.println(sb.indexOf("j"));
	}

}
