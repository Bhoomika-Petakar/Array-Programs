package com.Array.Level1;
import java.util.*;
public class Example3 {
	
		public static void main(String[] args) {
			Scanner scan=new Scanner(System.in);
			System.out.println("Enter the number of people");
			int n=scan.nextInt();
			boolean arr[]=new boolean[n];
			
			for(int i=0;i<=arr.length-1;i++)
			{
				System.out.println("Is person "+ i+ " is Married?");
				arr[i]=scan.nextBoolean();			}
			
		
		System.out.println("array elements are");
		for(int i=0;i<=arr.length-1;i++)
		{
			System.out.println(arr[i]+" ");			}
		}

	}



