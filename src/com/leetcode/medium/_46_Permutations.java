package com.leetcode.medium;

import java.util.ArrayList;
import java.util.List;

/** 
 * Given a collection of distinct integers, return all possible permutations.
	Example:
		Input: [1,2,3]
		Output:
			[
  				[1,2,3],
  				[1,3,2],
  				[2,1,3],
  				[2,3,1],
  				[3,1,2],
  				[3,2,1]
			]
 * */
public class _46_Permutations {
	//REFER: https://leetcode.com/problems/permutations/discuss/18239/A-general-approach-to-backtracking-questions-in-Java-(Subsets-Permutations-Combination-Sum-Palindrome-Partioning)
	public static void main(String[] args) {
		int[] nums = {1,2,3};
		permute(nums);
	}
	
	public static List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
		backtrack(result, new ArrayList<>(), nums);
		return result;
    }

	private static void backtrack(List<List<Integer>> result, List<Integer> tempList, int[] nums) {
		if(tempList.size() == nums.length){
			result.add(new ArrayList<>(tempList));
		} else{
			for(int i=0;i<nums.length;i++){
				if(tempList.contains(nums[i])) continue;
				tempList.add(nums[i]);
				backtrack(result, tempList, nums);
				tempList.remove(tempList.size()-1);
			}
		}
	}

}
