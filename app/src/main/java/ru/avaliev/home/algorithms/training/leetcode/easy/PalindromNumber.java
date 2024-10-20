package ru.avaliev.home.algorithms.training.leetcode.easy;

public class PalindromNumber {


	public static void main(String[] args) {

		System.out.println(isPalindrome(1221));
		System.out.println(121);
		System.out.println(1.12 % 1);
	}


	public static boolean isPalindrome(int x) {
		int xO = x, xN = 0;

		while (x > 0) {
			int R = x % 10;
			xN = xN * 10 + R;
			x = x / 10;
		}

		if (xO == xN) return true;
		return false;
	}
}
