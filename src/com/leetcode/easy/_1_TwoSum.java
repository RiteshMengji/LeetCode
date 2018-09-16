package com.leetcode.easy;

import java.util.HashMap;
import java.util.Map;

import com.leetcode.util.ArrayUtil;

/**
 * 1. Two Sum
 *
 * Given an array of integers, return indices of the two numbers such that they add up to a specific target.
 * You may assume that each input would have exactly one solution, and you may not use the same element twice.
 * Example:
 * Given nums = [2, 7, 11, 15], target = 9,
 * Because nums[0] + nums[1] = 2 + 7 = 9,
 * return [0, 1].
 */
public class _1_TwoSum {

	public static void main(String[] args) {
		int[] nums = {2, 7, 11, 15}; 
		int target = 18;
		
		int[] result = twoSum(nums, target);
		ArrayUtil.printArray(result);
	}
	
	public static int[] twoSum(int[] nums, int target){
		int[] solution = new int[2];
		Map<Integer, Integer> data = new HashMap<Integer, Integer>();
		for(int i=0; i<nums.length; i++){
			if(data.containsKey(target-nums[i])){
				solution[0] = data.get(target-nums[i]);
				solution[1] = i;
				break;
			}
			data.put(nums[i], i);
		}
		return solution;
	}
}
