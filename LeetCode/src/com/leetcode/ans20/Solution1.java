package com.leetcode.ans20;

public class Solution1 {
	public static boolean isValid(String s) {
		
		while ((s != deleteStr(s, "()")) || (s != deleteStr(s, "[]")) || (s != deleteStr(s, "{}"))) {
			s = deleteStr(s, "()");
			s = deleteStr(s, "{}");
			s = deleteStr(s, "[]");
		}

		if (s.length() == 0) {
			return true;
		} else {
			return false;
		}

	}

	public static String deleteStr(String s, String del) {
		int i = s.indexOf(del);
		String res = s;
		if (i == -1) {
			return res;
		} else {
			String str = s.substring(0, s.indexOf(del)) + "" + s.substring(s.indexOf(del) + 2);
			res = deleteStr(str, del);
		}
		return res;

	}
}
