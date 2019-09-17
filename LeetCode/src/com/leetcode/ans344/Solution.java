package com.leetcode.ans344;

public class Solution {
	public static void reverseString(char[] s) {
		String str = String.valueOf(s);
		StringBuilder sb = new StringBuilder(str);
		String res = sb.reverse().toString();
		char[] ress = res.toCharArray();
		for (int i = 0; i < ress.length; i++) {
			s[i] = ress[i];
		}

	}
}
