package com.study.hackerrank.algorithms.warmup.jumpingontheclouds;

public class Solution {

	public static void main(String[] args) {
		int[] c = { 0, 0, 0, 0, 1, 0 };
		System.out.println(jumpingOnClouds(c));
	}

	public static int jumpingOnClouds(int[] c) {

		int numJumps = 0;
		int i = 0;

		while (i < c.length - 1) {
			if (i + 2 == c.length || c[i + 2] == 1) {
				i++;
				numJumps++;
			} else {
				i += 2;
				numJumps++;
			}
		}

		return numJumps;

	}

}
