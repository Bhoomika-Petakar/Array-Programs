package com.Arrays;

import java.util.Iterator;
import java.util.Scanner;

public class CheckArraySortedOrNot {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the length of Array: ");
		int n = scan.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = scan.nextInt();
		}
		System.out.println("The array elemrnts are:");
		for (int i : arr) {
			System.out.print(i);
			
		}
		System.out.println();
		boolean res=isSorted(arr);
		System.out.println(res);
	}
	
	static boolean isSorted(int[] arr) {
		for(int i=1;i<arr.length;i++) {
			if(arr[i]<arr[i-1]) {
				return false;
				
			}
		
}
		return true;
}
}
