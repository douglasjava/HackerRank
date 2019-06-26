package com.study.hackerrank.algorithms.warmup.averybigsum;

public class Solution {

	public static void main(String[] args) {
		long[] ar = { 1000000001L, 1000000002L, 1000000003L, 1000000004L, 1000000005L };
		System.out.println(aVeryBigSum(ar));
	}

	public static long aVeryBigSum(long[] ar) {

		long sum = 0;

		for (int i = 0; i < ar.length; i++) {
			sum += ar[i];
		}

		return sum;
	}

}
