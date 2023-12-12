package com.Array.level2;

import java.util.Scanner;

public class Question5Solution {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the lenght of array");
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
		int length=arr1.length+arr2.length;
		int arr3[]=new int[length];
		for(int i=0;i<=arr1.length-1;i++) {
			arr3[i]=arr1[i];
			}
		for(int i=arr1.length;i<=length-1;i++) {
			arr3[i]=arr2[i];
			}
		for(int i=0;i<=length;i++) {
			System.out.println(arr3[i]);
			}
		scan.close();
		}
		

}
