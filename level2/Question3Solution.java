package com.Array.level2;

import java.util.Scanner;

public class Question3Solution {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the lenght of array");
		int arr[]=new int[scan.nextInt()];
		System.out.println("Enter "+arr.length+" Elements");
		for(int i=0;i<=arr.length-1;i++) {
			arr[i]=scan.nextInt();
			}
		System.out.println("Enter the lenght of new array");
		int arrr[]=new int[scan.nextInt()];
		for(int i=0;i<=arrr.length-1;i++) {
			arrr[i]=arr[i];
		}
		System.out.println("the  new array elemnts are: ");
		for(int i=0;i<=arrr.length-1;i++) {
			System.out.println(arrr[i]);
			}
		
		
	scan.close();	
	}

}
