package com.leetcode.ans2;

public class Test {

	public static void main(String[] args) throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		ListNode dummyhead = new ListNode(0);
		int[] arrays1 = {1, 2, 3, 4};
		int[] arrays2 = {1, 2, 3, 4, 5};
		ListNode l1 = ListNode.buildListNode(arrays1);
		ListNode l2 = ListNode.buildListNode(arrays2);
		
		ListNode test = Solution.addTwoNumbers(l1, l2);
		
		
		
		System.out.println(test.toString());
		
	}

}
