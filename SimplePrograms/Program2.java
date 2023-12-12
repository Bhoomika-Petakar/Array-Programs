package com.SimplePrograms;

import java.util.Scanner;

public class Program2 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int arr[]=new int[5];
		
		System.out.println("Enter the array contents: ");
		for(int i=0;i<=arr.length-1;i++) {
			arr[i]=scan.nextInt();
		}
		
		System.out.println("The array contents before swapping: ");
		for(int i=0;i<=arr.length-1;i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		
		int help=arr[1];
		arr[1]=arr[2];
		arr[2]=help;
		
		System.out.println("The array contents After swapping: ");
		for(int i=0;i<=arr.length-1;i++) {
			System.out.print(arr[i]+" ");
		}
		scan.close();
}
}