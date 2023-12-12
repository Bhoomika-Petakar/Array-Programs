package com.SubArrays;

import java.util.Scanner;

public class SumOfSubArrayEqualtoK {
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
		System.out.println("Enter the size of subarray: ");
		int size=scan.nextInt();
		System.out.println();
		System.out.println("Enter the k value:  ");
		int k=scan.nextInt();
		System.out.println();
		
		
		sumOfArray(arr,size,k);
		
	}

	 static void sumOfArray(int[] arr,int size,int k) {

		 for(int i=0;i<=arr.length-size;i++) {
			 int sum=0;
		 
			 for(int j=i;j<size+i;j++) {
				 sum=sum+arr[j];			
				 
			 }
			 if(sum==k) {
				 for(int j=i;j<i+size;j++) {
					 System.out.println(arr[j]+" ");
				 }
				 System.out.println();
			 }
		 
		 
		 
		 
	}

}}
