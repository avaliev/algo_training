package ru.avaliev.home.algorithms.training.leetcode.easy;

public class LongestCommonPrefix {

	public static void main(String[] args) {


		System.out.println(longestCommonPrefix(new String[]{"flower", "flow", "flight"}));
	}

	public static String longestCommonPrefix(String[] strs) {

		boolean equals = true;
		int minStrLength = strs[0].length();
		for (String str1 : strs) {
			minStrLength = Math.min(minStrLength, str1.length());
		}
		int i = 0;
		while (equals && i < minStrLength) {
			char aChar = strs[0].charAt(i);
			for (int j = 1; j < strs.length; j++) {
				equals = equals && aChar == strs[j].charAt(i);
			}
			if (equals) i++;
		}

		return strs[0].substring(0, i);

	}
}
