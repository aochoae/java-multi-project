package com.example.library;

import org.junit.jupiter.api.Test;

import com.example.library.Math;

import java.util.function.IntFunction;

import static org.junit.jupiter.api.Assertions.*;

class MathTest {

    /**
     * Sum of the first n natural numbers.
     */
	@Test
	void testSummation() {
		assertEquals(15, Math.summation(5));
	}

    /**
     * Sum of first odd natural numbers
     */
    @Test
    void testOdd() {
        assertEquals(9, Math.summation(3, n -> n * n));
    }
}
