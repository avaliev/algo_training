package ru.avaliev.home.algorithms.training.leetcode.easy;

import java.util.Map;

public class RomantoInteger {

	public static void main(String[] args) {
//		romanToInt("III");
//		romanToInt("MCMXCIV");
		System.out.println(sumOfMultiples(10));
	}


	public static int romanToInt(String s) {
		Map<Character, Integer> romNums = Map.of(
				'M', 1000,
				'D', 500,
				'C', 100,
				'L', 50,
				'X', 10,
				'V', 5,
				'I', 1);

		int result = 0;
		Character prevChar = null;
		for (int i = s.length() - 1; i >= 0; i--) {
			var currentChar = s.charAt(i);
			if (prevChar == null) {
				result = romNums.get(currentChar);
			} else {
				if (romNums.get(currentChar) < romNums.get(prevChar)) {
					result = result - romNums.get(currentChar);
				} else {
					result = result + romNums.get(currentChar);
				}
			}

			prevChar = currentChar;
		}
		return result;
	}

	public static int sumOfMultiples(int number) {
		//TODO: Code stuff here
		int sum = 0;
		if (number < 3) return 0;
		for (int i = 3; i<number ; i++) {
			if (i % 3 == 0 | i % 5 == 0 ) {
				sum+=i;
			}
		}

		return sum;
	}
}
