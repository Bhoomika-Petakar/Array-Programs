

// FIND THE DUPLICATE ELEMENT IN THE ARRAY

package com.Array.Level3;
import java.util.*;
public class FindDuplicate {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the length of the string:");
		int[] arr=new int[scan.nextInt()];
		System.out.println("Enter  Elements");
		for(int i=0;i<=arr.length-1;i++) {
			arr[i]=scan.nextInt();
			}
		for(int i=0;i<=arr.length-1;i++) {
			System.out.print(arr[i]);
			}
		System.out.println();
		FindDuplicate(arr);
		}
	static void FindDuplicate(int[] arr) {
		for(int i=0;i<=arr.length-1;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]==arr[j]){
					System.out.print(arr[i]);
					
				}
			}
		}
		
	}

}
