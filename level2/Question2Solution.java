package com.Array.level2;

import java.util.Scanner;
public class Question2Solution {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the lenght of array: ");
		int arr[]=new int[scan.nextInt()];
		System.out.println("Enter "+arr.length+" Elements");
		for(int i=0;i<=arr.length-1;i++) {
			arr[i]=scan.nextInt();
			}
		System.out.println("Enter the target to search: ");
		int target=scan.nextInt();
		Search ls=new Search();
		boolean res=ls.isPresent(arr, target);
		if(res==true) {
			System.out.println("target is present in the array");
				
			}
		else {
		System.out.println("target is not present in the array.");}
		scan.close();
	}

}
