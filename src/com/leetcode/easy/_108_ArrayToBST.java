package com.leetcode.easy;

import com.leetcode.util.TreeNode;

/** 
 * Given an array where elements are sorted in ascending order, convert it to a height balanced BST.
	For this problem, a height-balanced binary tree is defined as a binary tree in which the depth of 
	the two subtrees of every node never differ by more than 1.

	Example:
		Given the sorted array: [-10,-3,0,5,9],

		One possible answer is: [0,-3,9,-10,null,5], which represents the following height balanced BST:

      	0
       / \
   	 -3   9
   	 /   /
   -10  5
 * */
public class _108_ArrayToBST {

	public static void main(String[] args) {
		int nums[] = {-10,-3,0,5,9};
		sortedArrayToBST(nums);
	}
	
	public static TreeNode sortedArrayToBST(int[] nums) {
		if(nums.length ==0 ) return null;
		if(nums.length == 1) return new TreeNode(nums[0]);
		
		return convertToBST(nums,0,nums.length-1);
    }
	
	private static TreeNode convertToBST(int[] nums, int low, int high){
		if(low>high) return null;
		
		int mid = (low+high)/2;
		TreeNode root = new TreeNode(nums[mid]);
		root.left = convertToBST(nums, low, mid-1);
		root.right = convertToBST(nums, mid+1, high);
		
		return root;
	}

}
