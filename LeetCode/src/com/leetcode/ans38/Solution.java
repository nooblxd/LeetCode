package com.leetcode.ans38;

public class Solution {
	public static String countAndSay(int n) {
		String res = "1"; 
		for (int i = 1; i < n; i++) {
			res = getNextString(res);
		}
		return res;
	}
	
	

	public static String getNextString(String x) {
		StringBuilder sb = new StringBuilder();
		int count = 0;
		char cur = x.charAt(0);
		for(int i = 0; i < x.length(); i++) {
			if (cur == x.charAt(i)) {
				count = count + 1;				
			}	
			if(cur != x.charAt(i)) {
				sb.append(count).append(cur);
				count = 1;
				cur = x.charAt(i);
			}	
			if (i == x.length() - 1) {
				sb.append(count).append(cur);
			}
		
		}
		return sb.toString();
	}
}
