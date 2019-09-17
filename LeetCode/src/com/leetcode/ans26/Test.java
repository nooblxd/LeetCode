package com.leetcode.ans26;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] test = {0,1,1,2,3,5,6,6};
		int length = Solution.removeDuplicates(test);
		for (int i = 0; i < length; i++) {
			System.out.print(test[i]);
		}
		System.out.println("\n" + length);

	}

}
