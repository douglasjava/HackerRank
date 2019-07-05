package com.study.hackerrank.algorithms.string.javastringreverse;

import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String A = sc.next();

		String aReverse = new StringBuilder(A).reverse().toString();

		System.out.println(A.equals(aReverse) ? "Yes" : "NO");

		sc.close();

	}

}
