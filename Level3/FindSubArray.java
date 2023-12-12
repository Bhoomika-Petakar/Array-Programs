package com.Array.Level3;

import java.util.Scanner;

public class FindSubArray {
public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	System.out.println("Enter the length of the string:");
	int[] arr=new int[scan.nextInt()];
	
	System.out.println("Enter  Elements");
	for(int i=0;i<=arr.length-1;i++) {
		arr[i]=scan.nextInt();
		}
	SubArray(arr);
}
static void SubArray(int[] arr) {
	for(int i=0;i<arr.length;i++) {
		for(int j=i;j<arr.length;j++) {
			for(int k=i;k<=j;k++) {
				System.out.print(arr[k]+" ");
				
			}
			System.out.println();
		}
	}
}

}
