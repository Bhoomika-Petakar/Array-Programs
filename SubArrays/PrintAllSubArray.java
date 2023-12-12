package com.SubArrays;

import java.util.Scanner;

public class PrintAllSubArray {
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
		PrintAllSubArray(arr);
		
	}
	
	static void PrintAllSubArray(int[] arr) {
		for(int size=1;size<arr.length;size++) {
			for(int i=0;i<=arr.length-size;i++) {
				for(int j=i;j<i+size;j++) {
					System.out.print(arr[j]+" ");
				}System.out.println();
			}
		}
	}

}
