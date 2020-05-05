package dev.luisalberto.application;

import org.junit.jupiter.api.Test;

import com.example.application.library.Math;

import static org.junit.jupiter.api.Assertions.*;

class MathTest {

	@Test
	public void testSummation() {

		int result = Math.summation(5);

		assertEquals(15, result);
	}
}
