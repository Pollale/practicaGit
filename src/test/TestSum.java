package test;

import static org.junit.Assert.*;

import org.junit.Test;

import main.Sum;

public class TestSum {

	@Test
	public void testSum2() {
		assertEquals(4, Sum.sum(2, 2));
	}
	
	@Test
	public void testSum3() {
		assertEquals(4, Sum.sum(1,1, 2));
	}
	
	@Test
	public void testSumNumWithZero() {
		assertEquals(3, Sum.sum(3, 0));
		assertEquals(3, Sum.sum(0, 3));
	}

}
