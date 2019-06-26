package com.study.hackerrank.algorithms.warmup.simplearraysum;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.FileSystems;
import java.nio.file.Path;
import java.util.Scanner;

public class Solution {

	private static final Scanner scanner = new Scanner(System.in);

	static int simpleArraySum(int[] ar) {
		Integer valor = 0;
		for (int i = 0; i < ar.length; i++) {
			valor += ar[i];
		}
		return valor;
	}

	public static void main(String[] args) throws IOException {

		Path path = FileSystems.getDefault().getPath(System.getenv("HOMEDRIVE"), "/hackerrank");
		BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(new File(path.getFileName().toString())));

		int arCount = Integer.parseInt(scanner.nextLine().trim());

		int[] ar = new int[arCount];

		String[] arItems = scanner.nextLine().split(" ");

		for (int arItr = 0; arItr < arCount; arItr++) {
			int arItem = Integer.parseInt(arItems[arItr].trim());
			ar[arItr] = arItem;
		}

		int result = simpleArraySum(ar);

		bufferedWriter.write(String.valueOf(result));
		bufferedWriter.newLine();

		bufferedWriter.close();
	}

}
