package com.study.hackerrank.algorithms.arrays.twoarray;

public class Solution {

	public static void main(String[] args) {

	}

	static int hourglassSum(int[][] arr) {

		int maxHourglassSum = -63;

		for (int i = 0; i <= 3; i++) {
			for (int j = 0; j <= 3; j++) {
				int currentSum = 
						arr[i][j] + arr[i][j + 1] + arr[i][j + 2] + 
						arr[i + 1][j + 1] + 
						arr[i + 2][j] + arr[i + 2][j + 1] + arr[i + 2][j + 2];
				if (currentSum > maxHourglassSum) {
					maxHourglassSum = currentSum;
				}
			}
		}
		return maxHourglassSum;

	}

}
