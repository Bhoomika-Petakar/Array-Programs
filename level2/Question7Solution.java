package com.Array.level2;

import java.util.Scanner;

public class Question7Solution {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the lenght of array");
		int arr[] = new int[scan.nextInt()];
		System.out.println("Enter " + arr.length + " Elements for array1");
		for (int i = 0; i <= arr.length - 1; i++) {
			arr[i] = scan.nextInt();
		}
		System.out.println("The Array contents are: ");
		for (int i = 0; i <= arr.length - 1; i++) {
			if (arr[i] < 0) {
				arr[i] = 0;

			}
			System.out.print(arr[i]);

		}

		scan.close();
	}
}