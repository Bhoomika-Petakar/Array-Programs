package com.Arrays;

import java.util.Iterator;
import java.util.Scanner;

public class PrintMaxRepeatedElement {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the length of Array: ");
		int n = scan.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = scan.nextInt();
		}
		System.out.println("The array elemrnts are:");
		for (int i : arr) {
			System.out.print(i);

		}
		System.out.println();
		MaxRepeated(arr);

	}

	static void MaxRepeated(int[] arr) {
		int count = 1, max = 0, ele = 0;

		for (int i = 0; i <arr.length-1; i++) {
			if (arr[i] == arr[i + 1]) {
				count++;
			} else {
				if (count > max) {
					max = count;
					ele = arr[i];
				}
				count = 1;
			}
		}

		if (count > max) {
			max = count;
			ele = arr[arr.length - 1];

		}
		System.out.println(ele);

	}

}
