package com.Arrays;

import java.util.Scanner;

public class FindDuplicate {
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
		duplicate(arr);
	}
	static void duplicate(int[] arr) {
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;i<arr.length;j++)
			
			if(arr[i]==arr[j]) {
				System.out.println("Duplicate: "+arr[i]);
			}
		}
		
	}

}
