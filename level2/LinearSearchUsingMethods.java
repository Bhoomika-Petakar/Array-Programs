package com.Array.level2;

import java.util.Scanner;

public class LinearSearchUsingMethods {
	public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	System.out.println("Enter the lenght of array");
	int arr[]=new int[scan.nextInt()];
	System.out.println("Enter "+arr.length+" Elements");
	for(int i=0;i<=arr.length-1;i++) {
		arr[i]=scan.nextInt();
		}
	System.out.println("Enter the key to search: ");
	int key=scan.nextInt();
	LinearSearchApp ls=new LinearSearchApp();
	int res=ls.LinearSearchOp(arr, key);
	if(res>=0) {
		System.out.println("Key fount at index "+res);
		}else {
	System.out.println("Key not found");}
	
	
	scan.close();
	
	}
}
