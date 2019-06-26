package com.study.hackerrank.algorithms.warmup.plusminus;

public class Solution {

	public static void main(String[] args) {

		int arr[] = { 1, -2, -7, 9, 1, -8, -5  };
		int size = arr.length;
		
		double countZero = 0;
		double countPositive = 0;
		double countNegative = 0;

		for (int i = 0; i < size; i++) {
			int number = arr[i];

			countZero += number == 0 ? 1 : 0;
			countPositive += number > 0 ? 1 : 0;
			countNegative += number < 0 ? 1 : 0;

		}

		System.out.print("Números Pares: " + String.format("%.6g%n", countPositive / size));
		System.out.print("Números Negativos: " + String.format("%.6g%n", countNegative / size));
		System.out.print("Zero (0): " + String.format("%.6g%n", countZero / size));
	}

}
