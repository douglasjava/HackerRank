package com.study.hackerrank.algorithms.warmup.timeconversion;

import java.text.ParseException;

public class Solution {

	public static void main(String[] args) throws ParseException {

		String s = "04:59:59AM";

		int hour = Integer.valueOf(s.substring(0, 2));
		int minute = Integer.valueOf(s.substring(3, 5));
		int second = Integer.valueOf(s.substring(6, 8));
		String meridiem = s.substring(8, 10);

		hour += ((meridiem.equals("PM") && hour != 12) ? 12 : 0);
        hour -= ((meridiem.equals("AM") && hour == 12) ? 12 : 0);
        
        System.out.println(String.format("%02d", hour)    + ":" + 
        				   String.format("%02d", minute)  + ":" + 
        				   String.format("%02d", second));

	}

}
