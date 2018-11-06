package com.leetcode.medium;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

import com.leetcode.util.TreeNode;

/** 
 * Given a binary tree, return the inorder traversal of its nodes' values.
	Example:

		Input: [1,null,2,3]
   			1
    		 \
     		  2
    		 /
   			3

		Output: [1,3,2] L-Root-R
		Follow up: Recursive solution is trivial, could you do it iteratively?
 * */
public class _94_InOrderTraversal {

	public static void main(String[] args) {

	}
	
	public static List<Integer> inorderTraversal(TreeNode root) {
		List<Integer> result = new ArrayList<Integer>();
		if(root == null ) return result;
		
		Stack<TreeNode> stack = new Stack<TreeNode>();
		TreeNode curr = root;
		while(curr!=null || !stack.isEmpty()){
			while(curr!=null){
				stack.push(curr);
				curr = curr.left;
			}
			curr = stack.pop();
			result.add(curr.val);
			curr = curr.right;
		}
		//      1
		//   2    3
		// 4  5  6  7
		return result;
    }

}
