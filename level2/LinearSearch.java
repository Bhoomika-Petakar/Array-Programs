package com.Array.level2;

import java.util.Scanner;

public class LinearSearch {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the lenght of array");
		int arr[]=new int[scan.nextInt()];
		System.out.println("Enter "+arr.length+" Elemrnts");
		for(int i=0;i<=arr.length-1;i++) {
			arr[i]=scan.nextInt();
			}
		System.out.println("Enter the key to search: ");
		int key=scan.nextInt();
		for(int i=0;i<=arr.length-1;i++) {
			if(key==arr[i]) {
			System.out.println("Key found at the index "+i);
			
			}
			else {
		}
		
		System.out.println("Key Not Found");}
		scan.close();
	}

}
