package com.Arrays;

import java.util.Scanner;

public class CeilOfNumber {
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
		System.out.println("Enter a number to check the ceil of number in array: ");
		int key=scan.nextInt();
		int res=ceil(arr,key);
		System.out.println(res);
	}
	public static int ceil(int[] arr,int key) {
		
		int l=0,h=arr.length-1,mid=0;
		while(l<h) {
			mid=(l+h)/2;
			if(key==arr[mid]) {
				return arr[mid];
				
			}else if(key<arr[mid]) {
				h=mid-1;
			}else {
				l=mid+1;
			}
		}
		if(h>=0) {
			return arr[h];
		}else {
			return 1;
		}
		
		
		
		
		
	}

}
