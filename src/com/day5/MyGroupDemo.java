package com.day5;

public class MyGroupDemo 
{
	public static void main(String args[])
	{
		char ch1='Z', ch2='1';
	    boolean b1, b2, b3, b4;
	    	    
	    //isDigit
	    b1 = Character.isDigit(ch1);
	    b2 = Character.isDigit(ch2);
	    
	    //isLetter
	    b3 = Character.isLetter(ch1);
	    b4 = Character.isLetter(ch2);
	    
	    //Print
	    System.out.println(ch1 + " is a digit: " + b1);
	    System.out.println(ch2 + " is a digit: " + b2);
	    System.out.println();
	    System.out.println(ch1 + " is a letter: " + b3);
	    System.out.println(ch2 + " is a letter: " + b4);
		
	}
}
