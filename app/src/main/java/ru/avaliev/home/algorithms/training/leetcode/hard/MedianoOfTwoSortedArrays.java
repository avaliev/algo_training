package ru.avaliev.home.algorithms.training.leetcode.hard;

public class MedianoOfTwoSortedArrays {


	public static void main(String[] args) {

		double m1 = getMedian(new int[]{1, 3}, new int[]{2});
	}


	public static double getMedian(int[] nums1, int[] nums2) {

		int i = 0, j = 0, k = 0;
		int sizeMerged = nums1.length + nums2.length;
		int[] c = new int[sizeMerged];
		while (i < nums1.length && j < nums2.length) {
			if (nums1[i] <= nums2[j]) {
				c[k++] = nums1[i++];
			} else {
				c[k++] = nums2[j++];
			}
		}

		while (j < nums2.length) {
			c[k++] = nums2[j++];
		}
		while (i < nums1.length) {
			c[k++] = nums1[i++];
		}

		double mediana = 0;
		int midIndex = sizeMerged / 2;
		if (sizeMerged % 2 == 1) {
			// если нечетно то ровно середина будет медианой
			mediana = c[midIndex];
		} else {
			mediana = (c[midIndex - 1] + c[midIndex]) / 2.0;
		}

		return mediana;

	}
}
