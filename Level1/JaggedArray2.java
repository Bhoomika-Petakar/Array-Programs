package com.Array.Level1;
import java.util.*;
public class JaggedArray2 {
	public static void main(String[] args) {
			Scanner scan=new Scanner(System.in);
			int arr[][]=new int[scan.nextInt()][];
			
			for(int i=0;i<=arr.length-1;i++) {
				System.out.println("Enter 2D length for 1d array");
				arr[i]=new int[scan.nextInt()];
				
				
			}
			scan.nextLine();
			
				
			for(int i=0;i<=arr.length-1;i++)
			{
			for(int j=0;j<=arr[i].length-1;j++)
			{
			System.out.println("Enter Score of game "+i+" player "+j);
			arr[i][j]=scan.nextInt();
			scan.next();
			}
			}
			System.out.println("The Score are.........");
			for(int i=0;i<=arr.length-1;i++)
			{
			for(int j=0;j<=arr[i].length-1;j++)
			{
			System.out.print(arr[i][j]+" ");
			}
			System.out.println();
			}


	}
	}



