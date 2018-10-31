package com.leetcode.easy;

import com.leetcode.util.ListNode;

/** 
 * 
 * Reverse a singly linked list.
	Example:
		Input: 1->2->3->4->5->NULL
		Output: 5->4->3->2->1->NULL
	Follow up:
		A linked list can be reversed either iteratively or recursively. Could you implement both?
 * 
 * */
public class _206_reverseLinkedList {

	public static void main(String[] args) {

	}

	public ListNode reverseList(ListNode head) {
		if(head == null || head.next == null) return head;
		
		ListNode curr = head;
		ListNode prev =  null;
		while(curr!=null){
			ListNode temp = curr.next;
			curr.next = prev;
			prev=curr;
			curr = temp;
		}
        return prev;
    }
}
