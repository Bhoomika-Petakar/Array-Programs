package com.Array.Level1;
import java.util.*;
public class JaggedArray {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);

		String arr[][]=new String[6][];
		arr[0]=new String[2];
		arr[1]=new String[7];
		arr[2]=new String[3];
		arr[3]=new String[2];
		arr[4]=new String[4];
		arr[5]=new String[5];
		for(int i=0;i<=arr.length-1;i++)
		{
		for(int j=0;j<=arr[i].length-1;j++)
		{
		System.out.println("Enter number of Bank "+i+" costomer "+j);
		arr[i][j]=scan.next();
		}
		}
		System.out.println("Array Contents Are.....");
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
