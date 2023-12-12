package com.Arrays;

import java.util.Scanner;

public class SecondLargestElement {
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
	int res=secondLargest(arr);
	System.out.println(res);
	
}
	public static int secondLargest(int[] arr) {
		int max1=0,max2=0;
		if(arr[0]>arr[1]) {
			max1=arr[0];
			max2=arr[1];
		}else {
			max1=arr[1];
			max2=arr[0];
			}
		for(int i=2;i<=arr.length-1;i++) {
			if(arr[i]>max1) {
				max2=max1;
				max1=arr[i];
			}
			else if(arr[i]>max2) {
				max2=arr[i];
			}
		}
		return max2;
	}


}
