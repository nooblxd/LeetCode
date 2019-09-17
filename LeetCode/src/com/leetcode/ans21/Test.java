package com.leetcode.ans21;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ListNode a = new ListNode(1);
		ListNode p1 = a;
		a.next = new ListNode(2);
		a = a.next;
		a.next = new ListNode(4);
		ListNode b = new ListNode(1);
		ListNode p2 = b;
		b.next = new ListNode(3);
		b = b.next;
		b.next = new ListNode(4);
		
		ListNode res = Solution.mergeTwoLists(p1, p2);
		
		while (res != null) {
			System.out.println(res.val);
			res = res.next;
		}
		
		
		
		
		
		

	}

}
