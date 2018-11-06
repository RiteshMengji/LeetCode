package com.leetcode.medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/** 
 * Given an array of strings, group anagrams together.
	Example:
		Input: ["eat", "tea", "tan", "ate", "nat", "bat"],
		Output:
			[
  				["ate","eat","tea"],
  				["nat","tan"],
  				["bat"]
			]
	Note:
		All inputs will be in lowercase.
		The order of your output does not matter.
 * 
 * */
public class _49_GroupAnagrams {

	public static void main(String[] args) {
		String[] strs = {"eat", "tea", "tan", "ate", "nat", "bat"};
		groupAnagrams(strs);
	}
	
	public static List<List<String>> groupAnagrams(String[] strs) {
		List<List<String>> result = new ArrayList<List<String>>();
        if(strs ==null || strs.length == 0) return result;

		Map<String, List<String>> data = new HashMap<String, List<String>>();
		for(String str : strs){
			char[] c = str.toCharArray();
			Arrays.sort(c);
			String key = String.valueOf(c);
			if(!data.containsKey(key)) data.put(key, new ArrayList<>());
			
			data.get(key).add(str);
		}
        result.addAll(data.values());
		return result;
    }

}
