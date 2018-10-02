package com.leetcode.easy;

import java.util.HashSet;
import java.util.Set;
/**136. Single Number
 * Given an array of integers, every element appears twice except for one. Find that single one.
   Note:
	 Your algorithm should have a linear runtime complexity. Could you implement it without using extra memory?
*/
public class _136_SingleNumber {

	public static void main(String[] args) {
		int[] nums = {1,2,1,3,2,5};
		System.out.println(singleNumber(nums));
	}
	
	/**
	 * Concept

		If we take XOR of zero and some bit, it will return that bit
		a XOR 0 = a
		If we take XOR of two same bits, it will return 0
		a XOR a = 0
		a XOR b XOR a = (a XOR a) XOR b = 0 XOR b = b
		So we can XOR all bits together to find the unique number.
	 */
	public static int singleNumber(int[] nums) {
		 int singleNumber = 0;
		 for(int i = 0; i < nums.length; i++){
			 singleNumber = singleNumber ^ nums[i];
		 }
		 return singleNumber;
	 }
	
	public static int[] singleNumber_2(int[] nums) {
        Set<Integer> s = new HashSet<Integer>();
        for(int num : nums){
        	if(!s.add(num)){
        		s.remove(num);
        	}
        }
        return s.stream().mapToInt(Integer::intValue).toArray();
    }
	
	

}
