
// FIND THE LENGTH OF CONSECUTIVE 1'S IN THE BINARY REPREAENTATION

package com.Array.Level3;

import java.util.Scanner;

public class LengthOfConsecutiveOnes {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		System.out.println(countConsecutive(n));
	}
	static int countConsecutive(int n) {
		int count=0;
		while(n>0) {
			n=(n&(n<<1));
			count++;
		}
		return count;
	}

}
