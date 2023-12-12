package com.MergeArray;

import java.util.Scanner;

public class RepeatedElement {
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
		System.out.println("common elements are: ");
		PrintCommonElement(arr,arr2);
		
	}

	 static void PrintCommonElement(int[] arr, int[] arr2) {
		 
		 int i=0,j=0;
		 while(i<arr.length && j<arr2.length) {
			 if(arr[i]==arr2[j]) {
				 System.out.println(arr2[j]+" ");
				 i++;
				 j++;
			 }
			 else if (arr2[j]<arr[i]) {
				 j++;
				
			}else {
				i++;
			}
		 }
		 
		 
		 
		 
	}

}
