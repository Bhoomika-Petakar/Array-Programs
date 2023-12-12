package com.Arrays;

import java.util.*;

public class ReverseArray {
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
		reverse(arr);
	}
	
	static void reverse(int arr[]) {
		int i=0,j=arr.length-1;
		while(i<j) {
			int t=arr[i];
			arr[i]=arr[j];
			arr[j]=t;
			i++;
			j--;
			
		
		
	}
		for (int x : arr) {
			System.out.print(x);
	}
	}
}
	

