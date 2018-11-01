package com.leetcode.hard;

import java.util.Comparator;
import java.util.PriorityQueue;

import com.leetcode.util.ListNode;

/**
 * Merge k sorted linked lists and return it as one sorted list. Analyze and
 * describe its complexity. Example:
 * 
 * Input: [ 1->4->5, 1->3->4, 2->6 ]
 * 
 * Output: 1->1->2->3->4->4->5->6
 */
public class _23_MergeKSortedList {

	public static void main(String[] args) {

	}

	public ListNode mergeKLists(ListNode[] lists) {
		return divide(lists, 0, lists.length-1);
	}
	
	private static ListNode divide(ListNode[] lists, int start, int end){
		if(start==end) return lists[start];
		
		if(start<end){
			int mid = start + (end-start)/2;
			ListNode l1 = divide(lists, start, mid);
			ListNode l2 = divide(lists, mid+1, end);
			return merge(l1,l2);
		}
		
		return null;
	}
	
	private static ListNode merge(ListNode l1, ListNode l2){
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
	
	public ListNode mergeKListsPriorityQueue(ListNode[] lists) {
		if (lists==null||lists.length==0) return null;
        
        PriorityQueue<ListNode> queue= new PriorityQueue<ListNode>(lists.length,new Comparator<ListNode>(){
            @Override
            public int compare(ListNode o1,ListNode o2){
                if (o1.val<o2.val)
                    return -1;
                else if (o1.val==o2.val)
                    return 0;
                else 
                    return 1;
            }
        });
        
        ListNode dummy = new ListNode(0);
        ListNode tail=dummy;
        
        for (ListNode node:lists)
            if (node!=null)
                queue.add(node);
            
        while (!queue.isEmpty()){
            tail.next=queue.poll();
            tail=tail.next;
            
            if (tail.next!=null)
                queue.add(tail.next);
        }
        return dummy.next;
	}
	

}
