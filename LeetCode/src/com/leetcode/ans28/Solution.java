package com.leetcode.ans28;

public class Solution {
	public static int strStr(String haystack, String needle) {
		int len1 = haystack.length();
		int len2 = needle.length();
		int len3 = len1 - len2 + 1;
		for (int j = 0; j < len3; j++) {
			if (needle.equals(mySubString(haystack, j, j + len2))) {
				return j;
			}
		}	
		return -1;
	}
	
	public static String mySubString(String str,int beginindex,int endindex) {
		char[] chars = str.toCharArray();
		StringBuilder sb = new StringBuilder();
		for(int i = beginindex; i < endindex; i++) {
			sb.append(chars[i]);
		}
		String res = sb.toString();
		return res;
		
	}
}
