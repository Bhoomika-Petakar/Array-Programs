package com.Arrays;

import java.util.Scanner;

public class PairSubstraction {
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
		sum(arr);

	}

	static void sum(int[] arr) {
		
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]-arr[j]==2||arr[j]-arr[i]==2) {
					System.out.println(arr[i]+" "+arr[j]);

				}
				
				
			}
		}
		

	}


}
