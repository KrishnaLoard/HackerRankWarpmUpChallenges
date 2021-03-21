package com.krishnas.CountingValleys;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CountingValleysProblem {

	public static void main(String[] args) throws IOException {
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		// BufferedWriter bufferedWriter = new BufferedWriter(new
		// FileWriter(System.getenv("OUTPUT_PATH")));

		int steps = Integer.parseInt(bufferedReader.readLine().trim());

		String path = bufferedReader.readLine();

		int result = new CountingValleysProblem().countingValleys(steps, path);
		System.out.println(result);

		// bufferedWriter.write(String.valueOf(result));
		// bufferedWriter.newLine();

		// bufferedReader.close();
		// bufferedWriter.close();

	}

	private int countingValleys(int steps, String path) {
		// TODO Auto-generated method stub
		int v = 0; // # of valleys
		int lvl = 0;

		for (char c : path.toCharArray()) {
			if (c == 'U') {
				++lvl;
			}
			if (c == 'D') {
				--lvl;
			}
			// if we just came UP to sea level
			if (lvl == 0 && c == 'U') {
				++v;
			}
		}
		// System.out.print(v);
		return v;
	}
}