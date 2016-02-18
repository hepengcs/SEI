package com.nttdata.sei;

import java.util.Arrays;
import java.util.HashSet;

public class DeDup {

	public static int[] randomIntegers = { 1, 2, 34, 34, 25, 1, 45, 3, 26, 85, 4, 34, 86, 25, 43, 2, 1, 10000, 11, 16,
			19, 1, 18, 4, 9, 3, 20, 17, 8, 15, 6, 2, 5, 10, 14, 12, 13, 7, 8, 9, 1, 2, 15, 12, 18, 10, 14, 20, 17, 16,
			3, 6, 19, 13, 5, 11, 4, 7, 19, 16, 5, 9, 12, 3, 20, 7, 15, 17, 10, 6, 1, 8, 18, 4, 14, 13, 2, 11 };

	/**
	 * Remove the duplicate elements from Array
	 * 
	 * Implementation note: The algorithm manipulates original array, 
	 * offers O(nlog(n)) performance
	 * 
	 * @param arr:array to be processed
	 * 
	 * @return the length of array with unique elements
	 */
	public int removeDuplicates1(int[] arr) {

		if (arr == null || arr.length == 0) {
			return 0;
		}

		int size = 0;
		Arrays.sort(arr);
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] != arr[size]) {
				size++;
				arr[size] = arr[i];
			}
		}
		return size + 1;

	}

	/**
	 * Remove the duplicate elements from Array
	 * 
	 * Implementation note: The algorithm manipulates original array, 
	 * offers O(n) performance. The algorithm retains the original order
	 * 
	 * @param arr:array to be processed
	 * 
	 * @return the length of array with unique elements
	 */
	public int removeDuplicates2(int[] arr) {
		if (arr == null || arr.length == 0) {
			return 0;
		}

		HashSet<Integer> set = new HashSet<Integer>();
		int size = 0;
		for (int i = 0; i < arr.length; i++) {
			if (set.contains(arr[i])) {
				continue;
			}
			arr[size] = arr[i];
			set.add(arr[i]);
			size++;
		}
		return size;

	}

	/**
	 * Remove the duplicate elements from Array
	 * 
	 * Implementation note: The algorithm creates an array with all unique
	 * elements, offers O(n) performance.
	 * 
	 * @param arr:array to be processed
	 * 
	 * @return a new array with all unique elements
	 */
	public int[] removeDuplicates3(int[] arr) {
		if (arr == null || arr.length == 0) {
			return null;
		}

		HashSet<Integer> set = new HashSet<Integer>();
		for (int i = 0; i < arr.length; i++) {
			set.add(arr[i]);
		}

		int size = 0;
		int[] result = new int[set.size()];
		for (Integer val : set) {
			result[size++] = val;
		}

		return result;

	}

	public static void main(String[] args) {
		
		


	}

}
