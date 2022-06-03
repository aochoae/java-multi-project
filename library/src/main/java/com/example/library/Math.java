package com.example.library;

import java.util.function.IntFunction;

/**
 * Math API
 */
public class Math {

    /**
     * Sum of the first n natural numbers.
     *
     * @param number
     * @return
     */
    public static int summation(int number) {
        return number * (number + 1) / 2;
    }

    /**
     * Sum of the simplest arithmetic progression.
     *
     * @param number
     * @param function
     * @return
     */
    public static int summation(int number, IntFunction<Integer> function) {
        return function.apply(number);
    }
}
