package com.leetcode.ans35;

public class Solution {
	  public int searchInsert(int[] nums, int target) {
	        int length = nums.length;
//	        if (nums[length - 1] > target) {
//				return 1;
//			}
	        
	        int left = 0;
	        int right = length - 1;
	        
	        while (left <= right) {
				int mid = (left + right) >>> 1;
				if (nums[mid] == target) {
					return mid;
				}else if(nums[mid] > target) {
					right = mid - 1;
				}else {
					left = mid + 1;
				}
				
			}
	        return left;
	        
	    }
}
