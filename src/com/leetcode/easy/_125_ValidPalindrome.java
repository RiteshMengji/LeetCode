package com.leetcode.easy;
/** 
 * Given a string, determine if it is a palindrome, considering only alphanumeric characters and ignoring cases.
	Note: For the purpose of this problem, we define empty string as valid palindrome.

	Example 1:
		Input: "A man, a plan, a canal: Panama"
		Output: true

	Example 2:
		Input: "race a car"
		Output: false
 * */
public class _125_ValidPalindrome {
	
	public static void main(String[] args) {
		System.out.println(isPalindrome("A man, a plan, a canal: Panama"));
		System.out.println(isPalindrome("0P"));
	}
	
    public static boolean isPalindrome(String s) {
        if(s == null || s.isEmpty()) return true;
        int left = 0;
        int right = s.length()-1;
        String sl = s.toLowerCase();
        while(left<=right){
            if(!Character.isLetterOrDigit(sl.charAt(left))) {
            	left++;
            } else if(!Character.isLetterOrDigit(sl.charAt(right))) {
            	right--;
            } else if(sl.charAt(left)!=sl.charAt(right)) {
            	return false;
            } else {
            	left++;
            	right--;
            }
        }
        return true;
    }
}
