package com.leetcode.ans1;

import java.util.HashMap;
import java.util.Map;

class Solution {
	public static int[] twoSum(int[] nums, int target) {
	Map<Integer, Integer> tempMap = new HashMap<Integer, Integer>();
	for (int i = 0; i < nums.length; i++) {
		int temp = target - nums[i];
		if (tempMap.containsKey(temp)) {
			return new int[] {tempMap.get(temp), i};
		} else
			tempMap.put(nums[i], i);
	}
	return new int[] {-1, -1};
}
}