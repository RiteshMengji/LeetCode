package com.leetcode.easy;

/**
 * Given a string, you need to reverse the order of characters in each word
 * within a sentence while still preserving whitespace and initial word order.
 * 
 * Example 1: 
 * Input: "Let's take LeetCode contest" 
 * Output: "s'teL ekat edoCteeL tsetnoc" 
 * 
 * Note: In the string, each word is separated by single space and there will not be any extra space in the string.
 * 
 */
public class _557_ReverseWordsString {

	public static void main(String[] args) {
		System.out.println(reverseWords("Let's take LeetCode contest"));
	}
	
	public static String reverseWords(String s) {
        StringBuilder reversed = new StringBuilder();
        for(String str : s.split(" ")){
        	reversed.append(reverseString(str)).append(" ");
        }
        return reversed.toString().trim();
    }
	
	private static String reverseString(String s){
		char[] word = s.toCharArray();
        int i = 0;
        int j = s.length() - 1;
        while (i < j) {
            char temp = word[i];
            word[i] = word[j];
            word[j] = temp;
            i++;
            j--;
        }
        return new String(word);
	}

}
