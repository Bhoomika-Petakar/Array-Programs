package com.Array.level2;

import java.util.Scanner;

public class Question6Solution {
	public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	System.out.println("Enter the lenght of array1");
	int arr1[]=new int[scan.nextInt()];
	System.out.println("Enter "+arr1.length+" Elements for array1");
	for(int i=0;i<=arr1.length-1;i++) {
		arr1[i]=scan.nextInt();
		}
	int arr2[]=new int[arr1.length];
	System.out.println("Enter "+arr2.length+" Elements for array2");
	for(int i=0;i<=arr2.length-1;i++) {
		arr2[i]=scan.nextInt();
		}
	SumOfCorrespondingArrayApp sa=new SumOfCorrespondingArrayApp();
	int res[]=sa.SumOfArray(arr1, arr2);
	System.out.print("Array 1 elements are: ");
	for(int x:arr1) {
		System.out.print(x+" ");
	}
	System.out.println();
	System.out.print("Array 2 elements are: ");
	for(int x:arr2) {
		System.out.print(x+" ");
	}
	System.out.println();
	System.out.println("The sum of corresponding elements of both the array is: ");
	for(int i=0;i<=res.length-1;i++) {
		System.out.print(res[i]+" ");
		}
	scan.close();
	
	}
}
