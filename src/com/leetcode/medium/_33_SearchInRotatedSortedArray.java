package com.leetcode.medium;

/** 
 * Suppose an array sorted in ascending order is rotated at some pivot unknown to you beforehand.
	(i.e., [0,1,2,4,5,6,7] might become [4,5,6,7,0,1,2]).
	You are given a target value to search. If found in the array return its index, otherwise return -1.
	You may assume no duplicate exists in the array.
	Your algorithm's runtime complexity must be in the order of O(log n).
	
	Example 1:
		Input: nums = [4,5,6,7,0,1,2], target = 0
		Output: 4

	Example 2:
		Input: nums = [4,5,6,7,0,1,2], target = 3
		Output: -1
 * 
 * */
public class _33_SearchInRotatedSortedArray {

	public static void main(String[] args) {
		int nums[] = {3,1};
		System.out.println(search(nums, 1));
	}
	
	//The idea is to compare the middle element with the left element to decide which part is in order.
	public static int search(int[] nums, int target) {
		if (nums == null || nums.length == 0) return -1;
		int left = 0, right = nums.length-1;
		
		while(left<right){
			int mid = left + (right-left)/2;
			if(nums[mid] == target) return mid;
			if(nums[left] == target) return left;
			if(nums[right] == target) return right;
			if(nums[mid] > nums[left]){
				if(nums[mid] > target && nums[left] < target) right = mid;
				else left = mid+1;
			} else {
				if(nums[mid] < target && nums[right] > target) left = mid+1;
				else right = mid;
			}
		}
		return nums[left] == target ? left : -1;
    }
}
