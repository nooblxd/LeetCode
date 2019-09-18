package com.leetcode.ans1;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arrays = {1, 2, 3, 4, 5};
		int target = 9;
		int[] res = Solution.twoSum(arrays, target);
		for (int i : res) {
			System.out.print(i + " ");
		}
	}

}
