package com.week2;

import java.util.Scanner;

public class ReverseString {
 

	public static void main(String[] args)
	{
		String inStr;
		int inStrlen;
		
		Scanner in = new Scanner(System.in);
		System.out.println("Enter a String:" );
		
		
		inStr=in.next();
		inStrlen = inStr.length();
		
			for (int i = inStrlen - 1; i>=0; --i)
			{
				
				System.out.print(inStr.charAt(i));
			}	
		
	}	
	
}
