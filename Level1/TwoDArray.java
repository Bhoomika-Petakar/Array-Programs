package com.Array.Level1;
import java.util.*;
public class TwoDArray {
	public static void main(String[] args) {
		
	
	Scanner scan=new Scanner(System.in);
	float arr[][]=new float[4][3];
	for(int i=0;i<=arr.length-1;i++) {
		for(int j=0;i<=arr.length-1;j++) {
			System.out.println("Enter the height of "+i+"game "+j);
			arr[i][j]=scan.nextFloat();
		}
		
	}
 System.out.println("the contents are: ");	
 for(int i=0;i<=arr.length-1;i++) {
		for(int j=0;i<=arr.length-1;j++) {
			System.out.println(arr[i][j]);
		}
		
	}

}
}