package ru.avaliev.home.algorithms.training.leetcode.easy;

import java.util.Arrays;

public class MergeTwoSortedArrays {

  public static void main(String[] args) {

    var nums1 = new int[] {1, 2, 3, 0, 0, 0};
    var nums2 = new int[] {2, 5, 6};
    int m = 3, n = 3;

    merge(nums1, m, nums2, n);

    System.out.print(Arrays.toString(nums1));

    //
  }

  public static void merge(int[] nums1, int m, int[] nums2, int n) {
    int l = m + n;
    int[] result = new int[l];
    int i = 0, j = 0, k = 0;
    while (i < m && j < n) {
      if (nums1[i] <= nums2[j]) {
        result[k++] = nums1[i++];
      } else {
        result[k++] = nums2[j++];
      }
    }
    while (i < m) {
      result[k++] = nums1[i++];
    }
    while (j < n) {
      result[k++] = nums2[j++];
    }

    System.arraycopy(result, 0, nums1, 0, n + m);
  }
}
