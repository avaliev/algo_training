package ru.avaliev.home.algorithms.training.leetcode.easy;

public class SpinWords {


	public static void main(String[] args) {
		spinWords("Welcome code");
	}

	public static String spinWords(String sentence) {
		//TODO: Code stuff here
		String[] words = sentence.trim().split(" ");

		StringBuilder sb = new StringBuilder();


		for (int i = 0; i < words.length; i++) {
			if (words[i].length() >= 5) {
				sb.append(new StringBuilder(words[i]).reverse().toString());
			} else {
				sb.append(new StringBuilder(words[i]).toString());
			}

			sb.append(" ");
		}



		return sb.toString();
	}
}