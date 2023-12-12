package com.SubArrays;

import java.util.Scanner;

public class SubArray {
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
		subArray(arr);
		
	}
	
	static void subArray(int[] a) {
		for(int i=0;i<a.length;i++) {
			for(int j=i;j<a.length;j++) {
				for(int k=i;k<=j;k++) {
					System.out.print(a[k]+" ");
					
				}System.out.println();
				
			}
		}
	}

}
