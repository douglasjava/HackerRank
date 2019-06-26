package com.study.hackerrank.algorithms.warmup.birthdaycakecandles;

public class Solution {

	public static void main(String[] args) {

		int[] arr = { 3, 2, 1, 3 };

		int maxHeight = 0;
		int frequency = 0;

		for (int i = 0; i < arr.length; i++) {
			int valor = arr[i];

			if (valor > maxHeight) {
				maxHeight = valor;
				frequency = 1;

			} else if (valor == maxHeight) {
				frequency++;
			}

		}

		System.out.println(maxHeight);
		System.out.println(frequency);
	}
}
