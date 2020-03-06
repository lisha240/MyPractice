package com.week2;

import java.awt.image.IndexColorModel;
import java.util.Scanner;

public class GradesAverage {

	public static void main(String[] args) {
        int numinput=0;
		int numstudent = 0;
	
		
		Scanner in= new Scanner(System.in);
		System.out.println("Enter Number of Student:" );
		
		
	
	    numstudent=Integer.parseInt(in.next());
	    int[] arrstudent = new int[numstudent];

		do {
			System.out.println("Enter the Grade of student:" + (numinput + 1) + " :");
			int grade = Integer.parseInt(in.next());
			
	    
		
		   if(grade >=0 && grade<=100) {
			arrstudent[numinput] = grade;}
		else {
			System.out.println("invalid");
			continue;
		}
		
		numinput++;
	
		}while(numinput < numstudent);
	   
         int sumup=0;
	
		 for (int index = 0; index < arrstudent.length; index++) {
		 sumup=sumup+arrstudent[index];
		
		 }
	int average= sumup / (numinput);
	System.out.println("Average is :" + average);
}
}
