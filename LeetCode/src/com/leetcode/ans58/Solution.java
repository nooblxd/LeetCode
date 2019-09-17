package com.leetcode.ans58;

public class Solution {
	public static int lengthOfLastWord(String s) {
		//先判断是否为空串
		int count = 0;
		if (s.equals("")) {
			return 0;
		}
		//去掉末尾空格，如果整个字符串只有空格，则只留一个。
		while (s.charAt(s.length() - 1) == ' ' && s.length() > 1) {
			s = s.substring(0, s.length() - 1);
		}
		//倒序遍历，遇到空格跳出
		for (int i = s.length() - 1; i >= 0; i--) {
			if (s.charAt(i) != ' ') {
				count = count + 1;				
			}else {
				break;
			}
		}
		
		return count;

	}
}
