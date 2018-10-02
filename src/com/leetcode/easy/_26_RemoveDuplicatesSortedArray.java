package com.leetcode.easy;

/**
 * 26. Remove Duplicates from Sorted Array
 *
 * Given a sorted array, remove the duplicates
 * in place such that each element appear only once and return the new length.
 * Do not allocate extra space for another array, you must do this in place with constant memory.
 *
 * For example,
 * Given input array A = [1,1,2],
 * Your function should return length = 2, and A is now [1,2].
 * */
public class _26_RemoveDuplicatesSortedArray {

	public static void main(String[] args) {
		int[] arr = {1,1,2};
		int[] arr1 = {0,0,1,1,1,2,2,3,3,4};
		int[] arr2 ={0,0,1,1,1,1,2,3,3};
		System.out.println(removeDuplicates(arr));
		System.out.println(removeDuplicates(arr1));
		System.out.println(removeDuplicates(arr2));
		
	}

	public static int removeDuplicates(int[] nums) {
        int i=0;
        for(int j=0;j<nums.length;j++){
        	if(nums[i] != nums[j]) {
        		i++;
        		nums[i] = nums[j];
        	}
        }	
        return i+1;
    }
}
