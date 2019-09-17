package com.leetcode.ans53;

public class Solution {
	public static int maxSubArray(int[] nums) {
		if (nums.length > 50) {
			return maxSubArray2(nums);
		}
		
		return maxInArray(nums, 0, nums.length - 1);

	}
	
	public static int[] removeNegative(int[] nums) {
		int[] res = {0, nums.length - 1};
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] <= 0) {
				res[0] = i + 1;
			}else {
				break;
			}
		}
		
		for (int i = nums.length - 1; i > 0; i--) {
			if (nums[i] <= 0) {
				res[1] = i - 1;
			}
		}
		
		return res;
	}

	public static int maxInArray(int nums[], int start, int end){
		int res = sum(nums, start, end);
		if(start == end) {
			return nums[start];
		}
		if(end - start >= 2) {
			return  Max(maxInArray(nums, start+1, end),
					 maxInArray(nums, start, end - 1),
					 maxInArray(nums, start + 1, end - 1),
					 								res);
		} 
		if (end - start == 1){
			return Max(maxInArray(nums, start+1, end),
					 maxInArray(nums, start, end - 1),
					 res);
		}
		return Max(maxInArray(nums, start+1, end),
				 maxInArray(nums, start, end - 1),
				 maxInArray(nums, start + 1, end - 1),
				 								res);
	}

	public static int sum(int[] nums, int start, int end) {
		int sum = 0;
		for (int i = start; i <= end; i++) {
			sum = sum + nums[i];
		}
		return sum;
	}

	public static int Max(int a, int b) {
		return a > b ? a : b;
	}

	public static int Max(int a, int b, int c) {
		return Max(a, b) > c ? Max(a, b) : c;
	}
	
	public static int Max(int a, int b, int c, int d) {
		return Max(a, b, c) > d ? Max(a, b, c) : d;
	
	}
	
	 public static int maxSubArray2(int[] nums) {
	        int res = nums[0];
	        int sum = 0;
	        for (int num : nums) {
	            if (sum > 0)
	                sum += num;
	            else
	                sum = num;
	            res = Math.max(res, sum);
	        }
	        return res;
	    }
	
	

}
