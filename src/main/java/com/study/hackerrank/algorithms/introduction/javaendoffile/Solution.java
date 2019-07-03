package com.study.hackerrank.algorithms.introduction.javaendoffile;

import java.util.Scanner;

public class Solution {

	private static final Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {

		int index = 1;

		while (scanner.hasNextLine()) {
			System.out.println(index + " " + scanner.nextLine());
			index++;
		}

	}

}
