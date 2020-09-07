package com.study.hackerrank.algorithms.warmup.countingvalleys;

public class Solution {

	public static void main(String[] args) {
		System.out.println(countingValleys(10, "UDUUUDUDDD"));
	}

	public static long countingValleys(int n, String s) {
		int altitude = 0;
		int numValues = 0;

		for (int i = 0; i < n; i++) {
			if (s.charAt(i) == 'U') {
				if (altitude == -1) {
					numValues++;
				}
				altitude++;
			}
			if (s.charAt(i) == 'D') {
				altitude--;
			}
		}

		return numValues;

	}

}
