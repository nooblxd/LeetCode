package com.leetcode.ans26;


public class Solution {
	public static int removeDuplicates(int[] nums) {
		int length = nums.length;
		int start = 0;
		int end = 1;
		while (end < length) {
			if (nums[start] == nums[end]) {
				delete(nums, end, length);
				length = length - 1;
			} else {
				start = start + 1;
				end = end + 1;
			}
		}
		

		return length;

	}

	public static void delete(int[] nums, int index, int length) {
		for(int i = index;i < length - 1;i++) {
			nums[i] = nums[i + 1];
		}
		nums[length -1] = 0;			
	}

}
