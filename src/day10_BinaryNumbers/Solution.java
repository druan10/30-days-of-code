package day10_BinaryNumbers;

import java.util.*;

public class Solution {

	public static void main(String[] args) {
		int n = 0;
		String numInBinary;
		Scanner scan = new Scanner(System.in);
		n = scan.nextInt();
		scan.close();
		numInBinary = intToBinaryString(n);
		System.out.println(countConsecutiveChars(numInBinary, '1'));

	}

	public static String intToBinaryString(int n) {
		String binaryString = "";
		int remainder;
		Stack<Integer> st = new Stack<Integer>();
		while (n > 0) {
			remainder = (n % 2);
			st.push(remainder);
			n = n / 2;
		}

		while (!st.isEmpty()) {
			binaryString += (char) (st.pop() + '0');
		}
		return binaryString;
	}

	public static int countConsecutiveChars(String str, char target) {
		int max = 0, count = 0;
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == target) {
				count++;
				if (count > max) {
					max = count;
				}
			} else {
				count = 0;
			}
		}
		return max;
	}

}
