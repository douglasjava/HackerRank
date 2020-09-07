package com.study.hackerrank.algorithms.warmup.repeatedstring;

public class Solution {

	public static void main(String[] args) {
		System.out.println(repeatedString("aba", 10L));
	}

	public static long repeatedString(String s, long n) {

		long length = n / s.length();
		long count1 = count(s, 'a');
		long count2 = count(s.substring(0, (int) (n % s.length())), 'a');
		long total = length * count1 + count2;

		return total;

	}

	static int count(String s, char target) {
		return (int) s.chars().filter(c -> c == target).count();
	}

}
