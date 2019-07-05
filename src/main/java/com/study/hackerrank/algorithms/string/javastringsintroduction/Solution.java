package com.study.hackerrank.algorithms.string.javastringsintroduction;

import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String A = sc.next();
		String B = sc.next();

		Integer sum = A.length() + B.length();
		String firstWord = A.substring(0, 1).toUpperCase() + A.substring(1);
		String secondWord = B.substring(0, 1).toUpperCase() + B.substring(1);
		String alphabeticallyLexicographically = "";

		alphabeticallyLexicographically = A.compareTo(B) > 0 ? "Yes" : "No";

		System.out.println(sum);
		System.out.println(alphabeticallyLexicographically);
		System.out.println(firstWord + " " + secondWord);

		sc.close();

	}

}
