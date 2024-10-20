package ru.avaliev.home.algorithms.training.leetcode.easy;

import java.util.Arrays;

public class NumberAsArray {


	public static void main(String[] args) {
		int[] arr = {9, 9, 9};
		int[] arr2 = {1, 2, 3};
		int[] arr3 = {1, 2, 9};

//		System.out.println(Arrays.toString(plusOne(arr2)));
//		System.out.println(Arrays.toString(plusOne(arr3)));
		System.out.println(Arrays.toString(plusOne(arr)));

	}


	public static int[] plusOne(int[] number) {

		int i = number.length - 1;
		int remOne = (++number[i] / 10);
		number[i] = remOne == 0 ? number[i] : 0;
		i--;
		for (; i >= 0 && remOne > 0; i--) {
			remOne = (++number[i]) / 10;
			number[i] = remOne == 0 ? number[i] : 0;
		}
		if (i == -1 && remOne > 0) {
			number[0] = 0;
			int[] newNumber = new int[number.length + 1];
			System.arraycopy(number, 0, newNumber, 1, number.length);
			newNumber[0] = 1;
			return newNumber;
		} else {
			return number;
		}
	}
}
