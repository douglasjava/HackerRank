package com.study.hackerrank.algorithms.arrays.newyearchaos;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.stream.Collectors;

public class Solution {

	public static void main(String[] args) {
		int[] ints = { -9, 14, 37, 102, 50, 52, 9, -99 };
		//System.out.println(minimumBribes(ints));
	}

	// Complete the minimumBribes function below.
	static void minimumBribes(int[] a) {

		if(!isValid(a)) {
			System.out.println("Too chaotic");
		}
		
		int swapNum = 0;
		LinkedList<Integer> target = new LinkedList<>(Arrays.stream(a).sorted().boxed().collect(Collectors.toList()));
		for(int number : a) {
			int index = target.indexOf(number);
			if(index >= 3) {
				System.out.println("Too chaotic");
			}
			swapNum += index;
			target.remove(index);
		}
		if(swapNum == -1) {
			System.out.println("Too chaotic");
		}else {
			System.out.println(swapNum);			
		}
	}
	
	static boolean isValid(int[] a) {
		return Arrays.stream(a).min().getAsInt() == 1 &&
			   Arrays.stream(a).max().getAsInt() == a.length &&
			   Arrays.stream(a).distinct().count() == a.length;
	}

}
