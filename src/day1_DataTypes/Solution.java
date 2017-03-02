package day1_DataTypes;

import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
		int i = 4;
		double d = 4.0;
		String s = "Sup ";

		Scanner scan = new Scanner(System.in);
		/* Declare second integer, double, and String variables. */
		int inputInteger = scan.nextInt();
		/* Read and save an integer, double, and String to your variables. */
		double inputDouble = scan.nextDouble();
		String inputString = (String) scan.nextLine();
		inputString = (String) scan.nextLine();
		/* Print the sum of both integer variables on a new line. */
		System.out.println(i + (int) inputInteger);
		/* Print the sum of the double variables on a new line. */
		System.out.println((double) d + inputDouble);
		/*
		 * Concatenate and print the String variables on a new line; the 's'
		 * variable above should be printed first.
		 */
		System.out.println(s + inputString);
		scan.close();
	}

}
