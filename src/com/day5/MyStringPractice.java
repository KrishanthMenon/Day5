package com.day5;

public class MyStringPractice 
{
	public static void main(String args[])
	{
		String str="Peter Griffin";
		String str2="Peter";
		String str3=" Hello world!";
		
		
		System.out.println(str);
		
		//length
		System.out.println(str.length());
		
		//charAt
		System.out.println(str.charAt(1));
		
		//codePointAt
		System.out.println(str.codePointAt(1));
		
		//equals
		System.out.println(str.equals(str2));
		
		//compareTo
		String s1="A";
		String s2="B";
		System.out.println(s1.compareTo(s2));
		
		//startsWith
		System.out.println(str.startsWith("P"));
		
		//substring
		System.out.println(str.substring(6));
		
		//concat
		System.out.println(str.concat(str2));
		
		//contains
		System.out.println(str.contains("h"));
		
		//toLowerCase
		System.out.println(str.toLowerCase());
		
		//toUpperCase
		System.out.println(str.toUpperCase());
		
		//trim
		System.out.println(str3.trim());
		
		//hashcode
		System.out.println(str.hashCode());
		System.out.println(str2.hashCode());
	}

}
