package com.MergeArray;

import java.util.Scanner;

public class MergeTwoArrays {
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
		int[] res=mergeArray(arr,arr2);
		for (int i : res) {
			System.out.print(i+" ");
		}
	}
	
	static int[] mergeArray(int[] arr1,int[] arr2) {
		
		int[] res=new int[arr1.length+arr2.length];
		int i=0,j=0,k=0;
		
		for(;i<arr1.length && j<arr2.length;) {
			if(arr1[i]<arr2[j]) {
				res[k]=arr1[i];
				k++;
				i++;
			}else {
				res[k]=arr2[j];
				k++;
				j++;
			}
			
		}
		
		for(;i<arr1.length;) {
			res[k++]=arr1[i++];
		}
		
		for(;j<arr2.length;) {
			res[k++]=arr2[j++];
		}
		return res;
		
		
		
		
		
		
	}

}
