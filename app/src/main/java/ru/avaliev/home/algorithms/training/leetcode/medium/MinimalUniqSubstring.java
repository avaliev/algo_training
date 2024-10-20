package ru.avaliev.home.algorithms.training.leetcode.medium;

import java.util.HashSet;
import java.util.Set;

public class MinimalUniqSubstring {



	public static void main(String... args)    {
		var s1 = "pwwkew";
		var s2 = "aabcd";
		var s3 = "ab2bcd";
		var s4="  a bcdaz";

//		print(lengthOfLongestSubstring(s1));
//		print(lengthOfLongestSubstring(s2));
		print(lengthOfLongestSubstring(s3));
//		print(lengthOfLongestSubstring(s4));
	}
	public static int lengthOfLongestSubstring(String s) {
		int length = s.length();
		Set<Character> chars = new HashSet<>();
		int maxLength = 0;
		int left = 0;
		for (int r = 0; r < length; r++) {
			if (!chars.contains(s.charAt(r))) {
				chars.add(s.charAt(r));
				maxLength = Math.max(maxLength, r - left + 1);
			} else {
				while (left < length && s.charAt(left) != s.charAt(r)) {
					chars.remove(s.charAt(left));
					left++;
				}
				left++;
			}
		}
		return maxLength;
	}

	public static void print(Object o) {
		System.out.println(o);
	}
}
