package com.leetcode.ans21;

public class Solution {
	/**
	 * Definition for singly-linked list. public class ListNode { int val; ListNode
	 * next; ListNode(int x) { val = x; } }
	 */

	public static ListNode mergeTwoLists(ListNode l1, ListNode l2) {
		ListNode res = new ListNode(0);
		ListNode cur = res;

		ListNode p1 = l1, p2 = l2;

		while (p1 != null && p2 != null) {
			if (p1.val < p2.val) {
				cur.next = new ListNode(p1.val);
				cur = cur.next;
				p1 = p1.next;
			} else {
				cur.next = new ListNode(p2.val);
				cur = cur.next;
				p2 = p2.next;
			}
		}

		if (p1 == null) {
			cur.next = p2;
		}
		if (p2 == null) {
			cur.next = p1;
		}

		return res.next;

	}
}
