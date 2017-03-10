package day10_BinaryNumbers;

import static org.junit.Assert.*;

import org.junit.Test;

public class SolutionTest {

	@Test
	public void testIntToBinaryString() {
		assertEquals("101", Solution.intToBinaryString(5));
		assertEquals("1010", Solution.intToBinaryString(10));
		assertEquals("1011", Solution.intToBinaryString(11));
	}
	
	@Test
	public void testCountConsecutiveChars() {
		assertEquals(0, Solution.countConsecutiveChars("", 'a'));
		assertEquals(2, Solution.countConsecutiveChars("pepperoni", 'p'));
	}
	
}
