package com.leetcode.medium;

import com.leetcode.util.ListNode;

/**
 * 2. Add Two Numbers You are given two linked lists representing two
 * non-negative numbers. The digits are stored in reverse order and each of
 * their nodes contain a single digit. Add the two numbers and return it as a
 * linked list Input: (2 -> 4 -> 3) + (5 -> 6 -> 4) Output: 7 -> 0 -> 8
 */
public class _2_AddTwoNumbers {

	public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode result = new ListNode(0);
        ListNode a = l1, b=l2, currentNode=result;
        int carryForward=0;
        while(a!=null || b!=null){
        	int x = (a!=null)? a.val:0;
        	int y = (b!=null)? b.val:0;
        	
        	int sum = carryForward+x+y;
        	carryForward = sum/10;
        	currentNode.next = new ListNode(sum%10);
        	currentNode=currentNode.next;
        	
        	if (a != null)
				a = a.next;
			if (b != null)
				b = b.next;
        }
        
        if (carryForward > 0) {
			currentNode.next = new ListNode(carryForward);
		}
        return result.next;
    }
}
