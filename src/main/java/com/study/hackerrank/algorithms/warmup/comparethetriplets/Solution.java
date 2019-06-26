package com.study.hackerrank.algorithms.warmup.comparethetriplets;

import static java.util.stream.Collectors.joining;

import java.util.Arrays;
import java.util.List;

public class Solution {

	public static void main(String[] args) {
		List<Integer> result = compareTriplets(Arrays.asList(17, 28, 30), Arrays.asList(99, 16, 8));
		System.out.println(result.stream().map(Object::toString).collect(joining(",")));
	}

	public static List<Integer> compareTriplets(List<Integer> a, List<Integer> b) {

		int aScore = 0;
		int bScore = 0;

		for (int i = 0; i < a.size(); i++) {
			if (a.get(i) > b.get(i)) {
				aScore++;
			} else if (a.get(i) < b.get(i)) {
				bScore++;
			}
		}
		return Arrays.asList(aScore, bScore);

	}

}
