package com.study.hackerrank.algorithms.warmup.minimaxsum;

public class Solution {

	/***
	 * Resultado esperado 10 14
	 * 
	 * @param args
	 */
	public static void main(String[] args) {

		int arr[] = { 396285104, 573261094, 759641832, 819230764, 364801279 };
		long max = 0;
		long min = Long.MAX_VALUE;
		long sum = 0;

		for (int i = 0; i < arr.length; i++) {

			for (int y = 0; y < arr.length; y++) {

				if (y != i) {
					sum += arr[y];
				}
			}

			if (sum > max) {
				max = sum;
			}

			if (sum < min) {
				min = sum;
			}

			sum = 0;
		}

		System.out.println(min + " " + max);

	}

}
