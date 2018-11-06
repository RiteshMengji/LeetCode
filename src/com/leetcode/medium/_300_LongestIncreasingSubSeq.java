package com.leetcode.medium;

import java.util.HashMap;

/** 
 * Given an unsorted array of integers, find the length of longest increasing subsequence.
	Example:
		Input: [10,9,2,5,3,7,101,18]		
		Output: 4 
		Explanation: The longest increasing subsequence is [2,3,7,101], therefore the length is 4. 
	
	Note: There may be more than one LIS combination, it is only necessary for you to return the length.
		Your algorithm should run in O(n2) complexity.
		Follow up: Could you improve it to O(n log n) time complexity?
 * */
public class _300_LongestIncreasingSubSeq {

	public static void main(String[] args) {
		int[] nums ={10,9,2,5,3,7,101,18};
		System.out.println(lengthOfLISHM(nums));
	}
	
	public int lengthOfLIS(int[] nums) {
        int[] res = new int[nums.length];
        int size = 0;
        for (int i : nums) {
            int pos = bSearch(res, size, i);
            //System.out.println(pos);
            res[pos] = i;
            if (pos == size) {
                size++;
            }
            //System.out.println(size);
        }
        return size;
    }
    
    private int bSearch(int[] arr, int size, int target) {
        int left = 0, right = size - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (arr[mid] >= target) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return left;
    }
    
    public int lengthOfLISDP(int[] nums) {
        int[] dp = new int[nums.length+1];
        int len=0;
        dp[0] = Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++) {
            if(len==0) {
                dp[1] = nums[i];
                len++;
            }
            else {
                int j;
                for(j=len;j>=0;j--)
                {
                    if(dp[j]<nums[i]) break;
                }
                dp[j+1] = nums[i];
                if(j+1>len) len++;
            }
        }
        return len;
    }
	
	public static int lengthOfLISHM(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        int len = nums.length;
        for(int i = 0 ; i < len ; i++) {
            if(!map.containsKey(nums[i])) {
                map.put(nums[i],1);
            }

            for(int key : map.keySet()) {
                if(nums[i]>key) {
                    map.put(nums[i], Math.max(map.get(nums[i]), map.get(key)+1));
                }
            }
            
        }
        int max = 0;
        for(int key : map.keySet()) {
            max = Math.max(max, map.get(key));
        }
        return max;
    }

}
