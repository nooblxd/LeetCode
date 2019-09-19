package com.leetcode.ans2;

public class ListNode {

	int val;
	ListNode next;

	ListNode(int x){
    		this.val = x;
    	}

	@Override
	public String toString() {
		if (this.next == null) {
			return this.val +  " -> " + "end";
		}else {
			return this.val + " -> " + next.toString();
		}
	}
	public static ListNode buildListNode(int[] arrays) {
		ListNode head = new ListNode(0);
		ListNode p = new ListNode(1);
		head.next = p;
		for (int i : arrays) {
			ListNode temp = new ListNode(i);
			p.next = temp;
			p = temp;
		}
		
		return head.next.next;
	}
}
