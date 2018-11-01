package com.leetcode.easy;

/**
 * 14. Longest Common Prefix
 *
 * Write a function to find the longest common prefix string amongst an array of strings.
 * If there is no common prefix, return an empty string "".
 * 
 * Example 1:
		Input: ["flower","flow","flight"]
		Output: "fl"
 * Example 2:
		Input: ["dog","racecar","car"]
		Output: ""
		Explanation: There is no common prefix among the input strings.
 */
public class _14_LongestCommonPrefix {

	public static void main(String[] args) {
		String[] s1 = {"flower","flow","flight"};
		String[] s2 = {"dog","racecar","car"};
		
		System.out.println(longestCommonPrefix(s1));
		System.out.println(longestCommonPrefix(s2));
	}

	public static String longestCommonPrefix(String[] strs) {
		if(strs.length == 0) return "";
		
		int rows = strs.length;
		int columns =  strs[0].length();
		
		for(int i=0;i<columns;i++){
			char row1_char = strs[0].charAt(i);
			
			for(int j=1;j<rows;j++){
				
				if(i==strs[j].length() || strs[j].charAt(i)!=row1_char){
					return strs[0].substring(0, i);
				}
			}
		}
		
		return strs[0];
	}
}
