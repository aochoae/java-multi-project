package com.example.application;

import com.example.library.Math;

public class Application {

	public static void main(String[] args) {

        int n = 5;

		System.out.format("The sum of first %d natural numbers is %d.%n", n, Math.summation(n));
        System.out.format("The sum of first %d even natural numbers is %d.%n", n, Math.summation(n, v -> v * (v + 1)));
	}
}
