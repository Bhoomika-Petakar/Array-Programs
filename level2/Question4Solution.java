package com.Array.level2;

import java.util.Scanner;

public class Question4Solution {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the lenght of array");
		int arr[]=new int[scan.nextInt()];
		System.out.println("Enter "+arr.length+" Elements");
		for(int i=0;i<=arr.length-1;i++) {
			arr[i]=scan.nextInt();
			}
		System.out.println("The sum of All the Array contents is: ");
		int sum=0;
		for(int i=0;i<=arr.length-1;i++) {
			sum=arr[i]+sum;
			}
		System.out.println(sum);
		
		
		scan.close();
		
	}

	

}
