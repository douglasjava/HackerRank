package com.study.hackerrank.algorithms.warmup.sockmerchant;

import java.util.Arrays;

public class Solution {

	public static void main(String[] args) {
		int[] ar = { 10, 20, 20, 10, 10, 30, 50, 10, 20 };
		int n = 9;

		System.out.println(sockMerchant(n, ar));

	}

	public static int sockMerchant(int n, int[] ar) {

		int pairs = 0;
		Arrays.sort(ar);
		for (int i = 0; i < n - 1; i++) {
			if (ar[i] == ar[i + 1]) {
				pairs++;
				i = i + 1;
			}
		}
		return pairs;
	}
}
