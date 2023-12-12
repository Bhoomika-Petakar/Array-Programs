package com.Arrays;

import java.util.Scanner;

public class LargestUniqueElement {
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
		uniqueelemnent(arr);
		
	}
	static void uniqueelemnent(int[] arr) {
		int count=1;
		for(int i=arr.length-2;i>=1;i++) {
			if(arr[i]==arr[i+1]) {
				count++;
			}else
			{
				if(count==1) {
					System.out.println(arr[i]);
					return;
				}
				count=1;
			}
			
			
		}
		if(count==1) {
			System.out.println(arr[arr.length-1]);
		}
		
	}

}
