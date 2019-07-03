package com.study.hackerrank.algorithms.introduction.javadateandtime;

import static java.time.LocalDate.of;

import java.io.IOException;
import java.time.LocalDate;

public class Solution {

	static class Result {

		public static String findDay(int month, int day, int year) {
			LocalDate date = of(Integer.valueOf(year), Integer.valueOf(month), Integer.valueOf(day));
			return date.getDayOfWeek().toString();
		}

	}

	public static void main(String[] args) throws IOException {

		int month = 6;

		int day = 24;

		int year = 2015;

		String res = Result.findDay(month, day, year);

		System.out.println(res);

	}

}
