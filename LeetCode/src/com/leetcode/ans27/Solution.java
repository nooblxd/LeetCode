package com.leetcode.ans27;

public class Solution {
	 public static int removeElement(int[] nums, int val) {
	        int ans = 0;
	        for(int num: nums) {
	            if(num != val) {
	                nums[ans] = num;
	                ans++;
	            }
	        }
	        return ans;
	    }
}
