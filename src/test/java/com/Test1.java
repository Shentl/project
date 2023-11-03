package com;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class MainTest {

	@Test
	void test() {
		Main main = new Main();
		int result1 = main.add(3, 5);
		int result2 = main.add(2, 6);
		assertEquals(result1, result2);
	}

}
