package ru.avaliev.home.algorithms.training.leetcode.easy;

public class Fibbonachi {


	record Point(int x, int y) { }

	public static void main(String[] args) {

		System.out.println(fib(10));


		var p = new Point(1, 1);
	}


	public static long fib(int n) {
		long[] result = new long[n + 1];
		result[0] = 1;
		result[1] = 1;


		for (int i = 2; i <= n; i++) {
			result[i] = result[i - 1] + result[i - 2];
		}
		return result[n];
	}
}
