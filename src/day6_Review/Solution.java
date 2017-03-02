
package day6_Review;

import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
		/*
		 * Enter your code here. Read input from STDIN. Print output to STDOUT.
		 * Your class should be named Solution.
		 */
		int numOfTestCases = 0;
		String evenIndices;
		String oddIndices;
		String inputString = "";
		Scanner scan = new Scanner(System.in);
		numOfTestCases = scan.nextInt();
		inputString = scan.nextLine();
		for (int i = 0; i < numOfTestCases; i++) {
			evenIndices = "";
			oddIndices = "";
			inputString = scan.nextLine();
			for (int j = 0; j < inputString.length(); j++) {
				if (j % 2 == 0) {
					evenIndices += inputString.charAt(j);
				} else {
					oddIndices += inputString.charAt(j);
				}
			}
			System.out.println(evenIndices + " " + oddIndices);
		}
		scan.close();
	}
}