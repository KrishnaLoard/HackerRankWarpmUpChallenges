package com.krishnas.CountingValleys;

import java.io.IOException;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.util.Iterator;
import java.util.Scanner;

public class RepatedStringProblem {

	private static final Scanner scanner = new Scanner(System.in);

	static long repeatedString(String s, long n) {
		try {
			long numOfS = n / s.length();
			long rest = n % s.length();

			if (!s.contains("a")) {
				return 0;
			}
			return s.length() > n ? aCounter(s, rest) : numOfS * aCounter(s, s.length()) + aCounter(s, rest);

		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return 0;
	}

	private static long aCounter(String s, long end) {
		int a = 0;
		for (int i = 0; i < end; i++) {
			if (s.charAt(i) == 'a')
				a++;
		}
		return a;

	}

	public static void main(String[] args) throws IOException {
		 //BufferedWriter bufferedWriter = new BufferedWriter(new
		 //FileWriter(System.getenv("OUTPUT_PATH")));
		 //String s = scanner.nextLine();
		 //long n = scanner.nextLong();
		//scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

		long result = repeatedString("ab", 10);
		System.out.println(result);

		//bufferedWriter.write(String.valueOf(result));
		//bufferedWriter.newLine();
		//bufferedWriter.close();

		scanner.close();
	}

}
