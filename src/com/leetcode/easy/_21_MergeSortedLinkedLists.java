package com.leetcode.easy;

import com.leetcode.util.ListNode;

/** 
 * Merge two sorted linked lists and return it as a new list. 
 * The new list should be made by splicing together the nodes of the first two lists.
 * Example:
 * 		Input: 1->2->4, 1->3->4
 * 		Output: 1->1->2->3->4->4
 * */
public class _21_MergeSortedLinkedLists {

	public static void main(String[] args) {

	}
	
	public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
		if(l1 == null) return l2;
		if(l2 == null) return l1;
		
		ListNode currHead;
		
		if(l1.val < l2.val){
			currHead = l1;
			currHead.next = mergeTwoLists(l1.next, l2);
		} else {
			currHead = l2;
			currHead.next = mergeTwoLists(l1, l2.next);
		}
		
		return currHead;
    }
	
	public ListNode mergeTwoListsIterative(ListNode l1, ListNode l2) {
		if(l1 == null) return l2;
		if(l2 == null) return l1;
		
		ListNode head = new ListNode(0);
		ListNode curr = head;
		
		while(l1!=null && l2!=null){
			if(l1.val<l2.val){
				curr.next = new ListNode(l1.val);
				l1 = l1.next;
			} else {
				curr.next = new ListNode(l2.val);
				l2 = l2.next;
			}
			curr = curr.next;
		}
		
		if(l1==null) l1=l2;
		
		curr.next = l1;
		return head.next;
	}

}
