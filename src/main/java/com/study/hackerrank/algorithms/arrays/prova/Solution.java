package com.study.hackerrank.algorithms.arrays.prova;

import java.util.Arrays;

public class Solution {

	public static void main(String[] args) {
		String[] a = { "f", "o", "o", "bar" };
		System.out.println(2 >>1);
	}

	static boolean contains(int[] ints, int k) {
		return (Arrays.binarySearch(ints, k) > -1);
	}
	
	static String concat(String[] strings) {
		String nova = "";
		for (String s : strings) {
			nova = nova.concat(s);
		}
		
		return nova;
		
	}
	
}
