package ru.avaliev.home.algorithms.training.leetcode.medium;

public class LongestPalindromSubstring {

  public static void main(String[] args) {

    String res1 = longestPalindrome("ac");
    String res2 = longestPalindrome("cbdd");
    System.out.println(res1);
    System.out.println(res2);
  }

  public static String longestPalindrome(String s) {
    char[] str = s.toCharArray();

    int len = str.length;
    int lastInd = len - 1;
    // chek palindromes from len to 1 size

    while (len >= 1) {
      int p1 = 0, p2 = len - 1;
      while (p2 <= lastInd) {
        boolean isPalindrome = checkPalindrome(str, p1, p2);
        if (isPalindrome) {
          return s.substring(p1, p2 + 1);
        }
        p1++;
        p2++;
      }
      len = len - 1;
    }
    return s;
  }

  static boolean checkPalindrome(char[] val, int i, int j) {
    if (val == null) return false;
    if (val.length == 1) return true;
    boolean palindrome = true;
    while (i < j && palindrome) {
      palindrome = val[i] == val[j];
      i++;
      j--;
    }
    return palindrome;
  }
}
