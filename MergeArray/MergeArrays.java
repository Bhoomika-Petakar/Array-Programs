package com.MergeArray;

import java.util.Scanner;

public class MergeArrays {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the length of Array: ");
		int n = scan.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = scan.nextInt();
		}
		
		System.out.println("Enter the length of Second  Array: ");
		int n2 = scan.nextInt();
		int[] arr2 = new int[n2];
		for (int i = 0; i < arr2.length; i++) {
			arr2[i] = scan.nextInt();
		}
		
		System.out.println("Enter the length of Third  Array: ");
		int n3 = scan.nextInt();
		int[] arr3 = new int[n2];
		for (int i = 0; i < arr3.length; i++) {
			arr3[i] = scan.nextInt();
		}
		
		System.out.println("The First array elements are:");
		for (int i : arr) {
			System.out.print(i+" ");
		}
		System.out.println();
		System.out.println("The Second array elements are:");
		for (int i : arr2) {
			System.out.print(i+" ");
		}
		System.out.println();
		System.out.println("The Third array elements are:");
		for (int i : arr3) {
			System.out.print(i+" ");
		}
		
		
		
		System.out.println();
		System.out.println("Merged Array: ");
		int[] res=mergeArray(arr,arr2,arr3);
		for (int i : res) {
			System.out.print(i+" ");
		}
	}

	 static int[] mergeArray(int[] arr, int[] arr2,int[] arr3) {
		 
		 
		 int[] res=new int[arr.length+arr2.length+arr3.length];
		 int i=0,k=0;
		 while(k<res.length) {
			 if(i<arr.length) {
				 res[k]=arr[i];
				 k++;
			 }
			 if(i<arr2.length) {
				 res[k]=arr2[i];
				 k++;
			 }
			 if(i<arr3.length) {
				 res[k]=arr3[i];
				 k++;
			 }
			 i++;
		 }
		 
		 
		return res;
	}
	
	
	
	

}
