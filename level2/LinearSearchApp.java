package com.Array.level2;

public class LinearSearchApp {
	public int LinearSearchOp(int arr[], int key) {

		for (int i = 0; i <= arr.length - 1; i++) {
			if (key == arr[i]) {
return i;
			}
}
		return -1;
	}
}
