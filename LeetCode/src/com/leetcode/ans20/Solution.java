package com.leetcode.ans20;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Solution {
	public static boolean isValid(String s) {
		List<Character> stack = new ArrayList<Character>();
		Map<Character, Character> x = new HashMap<Character, Character>();
		x.put('(', ')' );
		x.put('{', '}' );          
		x.put('[', ']' );
		String left = "({[";
		for (int i = 0; i < s.length(); i++) {
			if(left.indexOf(s.charAt(i)) != -1) {
				stack.add(s.charAt(i));
			}else {
				if(stack.size() != 0 && s.charAt(i) == x.get(stack.get(stack.size() - 1))) {
					stack.remove(stack.size() - 1);
				}else {
					return false;
				}
			}
			
		}
		return stack.size() == 0;
		
	}
	
	

}
