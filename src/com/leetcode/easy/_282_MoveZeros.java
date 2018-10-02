package com.leetcode.easy;

/**
 * 283. Move Zeroes
 *
 * Given an array nums, write a function to move all 0's to the end of it while maintaining the relative order of the non-zero elements.
 *
 * For example, given nums = [0, 1, 0, 3, 12], after calling your function, nums should be [1, 3, 12, 0, 0].
 *
 * Note:
 * You must do this in-place without making a copy of the array.
*/
public class _282_MoveZeros {
	public static void main(String[] args) {
		int[] nums = {0,1,0,3,12};
		moveZeroes(nums);
	}
	
	public static void moveZeroes(int[] nums) {
		int nonZeroIndex=0;
        for(int i=0;i<nums.length;i++){
        	if(nums[i] != 0){
        		nums[nonZeroIndex++] = nums[i];
        	}
        }
        for (int i = nonZeroIndex; i < nums.length; i++) {
            nums[i] = 0;
        }
    }
}
