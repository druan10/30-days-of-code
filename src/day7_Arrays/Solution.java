package day7_Arrays;

import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int i, n = in.nextInt();
		int[] arr = new int[n]; // Define array of size n
		for (i = 0; i < n; i++) {
			arr[i] = in.nextInt();
		}
		in.close();

		for (i = n - 1; i >= 0; i--) {
			System.out.print(arr[i] + " ");
		}
	}
}
