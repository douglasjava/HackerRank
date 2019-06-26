package com.study.hackerrank.algorithms.warmup.diagonakdifference;

import java.util.ArrayList;
import java.util.List;

public class Solution {

	public static void main(String[] args) {

		List<List<Integer>> arr = new ArrayList<>();

		List<Integer> v1 = new ArrayList<>();
		v1.add(11);
		v1.add(2);
		v1.add(4);

		List<Integer> v2 = new ArrayList<>();
		v2.add(4);
		v2.add(5);
		v2.add(6);

		List<Integer> v3 = new ArrayList<>();
		v3.add(10);
		v3.add(8);
		v3.add(-12);

		arr.add(0, v1);
		arr.add(1, v2);
		arr.add(2, v3);

		System.out.println(getSumDiagonalDifference(arr));
	}

	private static Integer getSumDiagonalDifference(List<List<Integer>> arr) {

		int sumOne = 0;
		int sumtwo = 0;
		int size = arr.size();

		for (int i = 0; i < size; i++) {
			sumOne += arr.get(i).get(i);
			sumtwo += arr.get(i).get(size - i - 1);
		}

		return Math.abs(sumOne - sumtwo);

	}
}
