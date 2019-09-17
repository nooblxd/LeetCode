package com.leetcode.ans1;

import java.util.HashMap;
import java.util.Map;

class Solution {
	public int[] twoSum(int[] nums, int target) {
	Map<Integer, Integer> xxMap = new HashMap<Integer, Integer>();
	for (int i = 0; i < nums.length; i++) {
		int temp = target - nums[i];
		if (xxMap.containsKey(temp)) {
			return new int[] {xxMap.get(temp), i};
		} else
			xxMap.put(nums[i], i);
	}
	return null;
}
}