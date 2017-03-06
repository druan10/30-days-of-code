package day9_Recursion;

import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
		int n = 0;
		Scanner scan = new Scanner(System.in);
		n = scan.nextInt();
		scan.close();

		System.out.println(factorial(n));

	}

	public static int factorial(int n) {
		if (n <= 1) {
			return 1;
		} else {
			return (n * factorial(n - 1));
		}
	}
}