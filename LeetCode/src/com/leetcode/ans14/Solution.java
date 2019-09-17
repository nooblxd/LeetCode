package com.leetcode.ans14;

import java.util.HashSet;
import java.util.Set;

class Solution {
	public static String longestCommonPrefix(String[] strs) {
		if (strs.length == 0) {
			return "";
		}
		Set<String> strSet = new HashSet<String>();
		String res = "";
		int minLength = strs[0].length();
		for (String string : strs) {
			minLength = (minLength > string.length() ? string.length() : minLength);
		}

		for (int i = 0; i < minLength; i++) {
			strSet.add(strs[0].substring(0, i + 1));
			for (String string : strs) {
				if (strSet.add((string.substring(0, i + 1)))) {
					res = string.substring(0, i);
					return string.substring(0, i);

				}
				res = strs[0].substring(0, i + 1);
			}
		}
		return res;
	}
}