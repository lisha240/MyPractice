package com.margearray;

import java.util.Arrays;
import java.util.Scanner;

public class MergeTwoSortedArray {
	public static int[] marge(int[] array1,int[] array2) {

	
		int s1 = array1.length;
		int s2 = array2.length;

//nt[] array3 = new int[s1 + s2];
int[] array3 = new int[s1+s2];
		int i = 0;
		int j = 0;
		int k = 0;

		while (i < s1 && j < s2) {
			if (array1[i] > array2[j]) {
				array3[k]= array1[i];
				i++;
				k++;
			} else {
				array3[k] = array2[j];
				j++;
				k++;
			}
		}
		
		while(j<s2) {
			array3[k++]=array2[j++];}
		
while(i<s1) {
	array3[k++]=array1[i++];}
return array3;





}
	
	public static void main(String[] args) {
		int[] array1 = { 100, 85, 75, 45, 2, 0 }; 
		int[] array2 = { 99, 84, 74, 60,55, 35, 1, 0 };
	         
int[] array3=marge(array1,array2);
				 
		System.out.println(Arrays.toString(array1));
		System.out.println(Arrays.toString(array2));
		System.out.println(Arrays.toString(array3));
		
		

	
	}
}