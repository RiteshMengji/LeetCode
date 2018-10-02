package com.leetcode.easy;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
/**
 * 242. Valid Anagram
 * Given two strings s and t, write a function to determine if t is an anagram of s.
 
 	For example,
 		s = "anagram", t = "nagaram", return true.
 		s = "rat", t = "car", return false.
 	Note:
 		You may assume the string contains only lowercase alphabets.
 	Follow up:
 		What if the inputs contain unicode characters? How would you adapt your solution to such case?
 */
public class _242_ValidAnagram {

	public static void main(String[] args) {
		System.out.println(isAnagram("cinema", "iceman"));
		System.out.println(isAnagram("cinema", "icemen"));
		System.out.println(isAnagramHashMap("cinema", "icemaa"));
		System.out.println(isAnagramHashMap("cinema", "iceman"));
	}
	
	public static boolean isAnagram(String a, String b){
		if(a.length() != b.length()) return false;
		
		char[] ac = a.toCharArray();
		char[] bc = b.toCharArray();
		
		Arrays.sort(ac);
		Arrays.sort(bc);
		if(Arrays.equals(ac, bc )) return true;
		
		return false;
	}
	
	public static boolean isAnagramHashMap(String a, String b){
		if(a.length() != b.length()) return false;
		
		char[] ac = a.toCharArray();
		char[] bc = b.toCharArray();
		
		Map<Character, Integer> table = new HashMap<Character, Integer>();
		for(char c : ac){
			table.put(c, table.getOrDefault(c, 0)+1);
		}
		for(char d : bc){
			int count = table.getOrDefault(d, 0);
			if(count == 0) return false;
			else{
				table.put(d, count-1);
			}
		}
		return true;
	}
	
	//Java 8 Charsequence.codepoints(): Returns a stream of code point values
	public boolean isAnagramUniCodeSurrogate(String s, String t) {
        if (s==null && t==null) return true;
        else if (s==null || t==null) return false;
        else if (s.length() != t.length()) return false;

        final Map<Integer, Integer> dict = new HashMap<>();
        s.codePoints().forEach(code -> dict.put(code, dict.getOrDefault(code, 0) + 1));
        t.codePoints().forEach(code -> dict.put(code, dict.getOrDefault(code, 0) - 1));
        
        for(int count : dict.values()) {
            if (count<0) return false;
        }

        return true;
    }

}
