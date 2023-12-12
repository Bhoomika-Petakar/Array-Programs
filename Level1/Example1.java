package com.Array.Level1;


import java.util.Scanner;

public class Example1 {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		double arr[]=new double[7];
		System.out.println("Enter the array elements");
		for(int i=0;i<=arr.length-1;i++)
		{
			System.out.println("height of player "+ i);
			arr[i]=scan.nextDouble();			}
		
	
	System.out.println("array elements are");
	for(int i=0;i<=arr.length-1;i++)
	{
		System.out.println(arr[i]+" ");			}
	}

}
