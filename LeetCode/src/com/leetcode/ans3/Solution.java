package com.leetcode.ans3;

import java.util.HashSet;
import java.util.Set;

public class Solution {
	public static int lengthOfLongestSubstring(String s) {
		int start = 0;
		int end = 0;
		
		Set<String> set = new HashSet<String>();
	    //Set<String> strs = new HashSet<String>();
		while (end < s.length()) {
			if(set.add(String.valueOf(s.charAt(end)))) {
				end = end + 1;			
			}else {
				set.remove(s.charAt(end));
				start = start + 1;
				end = end + 1;
			}
		}
		return end - start;
		
	}
	
	public static String setToString(Set<String> strs) {
		StringBuilder sb = new StringBuilder();
		for (String string : strs) {
			sb.append(string);
		}
		
		return sb.toString();
		
		
	}
	

}
