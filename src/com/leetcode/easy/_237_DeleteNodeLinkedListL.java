package com.leetcode.easy;

import com.leetcode.util.ListNode;

/**
 * 237. Delete Node in a Linked List 
 * 
 * Write a function to delete a node (except the tail) in a singly linked list, given only access to that node.
 * Given linked list -- head = [4,5,1,9], which looks like following:
 		4 -> 5 -> 1 -> 9
 * Example 1:
		Input: head = [4,5,1,9], node = 5
		Output: [4,1,9]
		Explanation: You are given the second node with value 5, the linked list
                     should become 4 -> 1 -> 9 after calling your function.
 * Example 2:
		Input: head = [4,5,1,9], node = 1
		Output: [4,5,9]
		Explanation: You are given the third node with value 1, the linked list
             		  should become 4 -> 5 -> 9 after calling your function.
 */
public class _237_DeleteNodeLinkedListL {

	private static ListNode head = new ListNode(4);

	public static void main(String[] args) {

		ListNode n1 = new ListNode(5);
		head.next = n1;
		ListNode n2 = new ListNode(1);
		n1.next = n2;
		ListNode n3 = new ListNode(9);
		n2.next = n3;
		n3.next = null;
		deleteNode(new ListNode(1));
		while (head != null) {
			System.out.println(head.val);
			head = head.next;
		}
	}

	public static void deleteNode(ListNode node) {
		ListNode replaceNode = node.next;
		node.val = replaceNode.val;
		node.next = replaceNode.next;
	}

}
