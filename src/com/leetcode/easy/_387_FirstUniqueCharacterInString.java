package com.leetcode.easy;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
/**
 * 387. First Unique Character in a String
 * Given a string, find the first non-repeating character in it and return it's index. If it doesn't exist, return -1.
 	Examples:
 		s = "leetcode"
 			return 0.
 		s = "loveleetcode",
 			return 2.
 	Note: You may assume the string contain only lowercase letters.
 */
public class _387_FirstUniqueCharacterInString {

	public static void main(String[] args) {
		System.out.println(firstUniqChar("leetcode"));
		System.out.println(firstUniqChar("loveleetcode"));
	}

	public static int firstUniqChar(String s) {
        if(s.isEmpty()) return -1;
        char[] characters = s.toCharArray();
		Set<Character> repeating = new HashSet<>();
		List<Character> nonrepeating = new ArrayList<Character>();
		
		for(char c :characters){
			if(repeating.contains(c))
				continue;
			if(nonrepeating.contains(c)){
				nonrepeating.remove((Character)c);
				repeating.add(c);
			} else{
				nonrepeating.add(c);
			}
		}
        if(nonrepeating.size()>0)
		    return s.indexOf(nonrepeating.get(0));
        else
            return -1;
    }
}
