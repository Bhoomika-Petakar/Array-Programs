package com.SubArrays;

import java.util.Scanner;

public class SubArraysOfSize3 {
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
			System.out.print(i+" ");
			
		}
		System.out.println();
		System.out.println("Enter the size of subarray: ");
		int size=scan.nextInt();
		System.out.println();
		PrintSubArray(arr,size);
		
	}

	 static void PrintSubArray(int[] arr,int n) {
		 for(int i=0;i<=arr.length-n;i++) {
			 for(int j=i;j<n+i;j++) {
				 System.out.print(arr[j]+" ");
			 }
			 System.out.println();
		 }
		 
		 
		
	}

}
