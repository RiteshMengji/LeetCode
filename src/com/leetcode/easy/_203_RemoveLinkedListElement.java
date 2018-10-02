package com.leetcode.easy;

import com.leetcode.util.ListNode;

/**
 * 203. Remove Linked List Elements
 *
 * Remove all elements from a linked list of integers that have value val.
 *
 * Example
 * Given: 1 --> 2 --> 6 --> 3 --> 4 --> 5 --> 6, val = 6
 * Return: 1 --> 2 --> 3 --> 4 --> 5
 */
public class _203_RemoveLinkedListElement {

	public static void main(String[] args) {
		ListNode head = new ListNode(1);
		ListNode n1 = new ListNode(2);
		head.next = n1;
		ListNode n2 = new ListNode(6);
		n1.next = n2;
		ListNode n3 = new ListNode(3);
		n2.next = n3;
		ListNode n4 = new ListNode(4);
		n3.next = n4;
		ListNode n5 = new ListNode(5);
		n4.next = n5;
		ListNode n6 = new ListNode(6);
		n5.next = n6;
		n6.next=null;
		
		removeElements(head,6); 
	}
	
	public static ListNode removeElements(ListNode head, int val) {
		ListNode fakeNode = new ListNode(-1);
		fakeNode.next = head;
        ListNode current = head, prev = fakeNode;
        while(current!=null){
        	if(current.val == val){
        		prev.next = current.next;
        	} else {
        		prev = prev.next;
        	}
        	current = current.next;
        }
		return fakeNode.next;
    }

}
