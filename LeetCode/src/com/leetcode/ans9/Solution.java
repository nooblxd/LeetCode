package com.leetcode.ans9;

import java.util.ArrayList;
import java.util.List;

public class Solution {
	public static boolean isPalindrome(int x) {
		if (x < 0) {
			return false;
		}
		List<Integer> list = new ArrayList<Integer>();

		while (x != 0) {
			int temp = x % 10;
			list.add(temp);
			x = x / 10;
		}

		for (int i = 0; i < list.size() / 2; i++) {
			if (list.get(i) != list.get(list.size() - i - 1)) {
				return false;
			}
		}
		return true;

	}

}
