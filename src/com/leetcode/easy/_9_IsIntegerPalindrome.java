package com.leetcode.easy;

/**
 * 9. Palindrome Number
 * Determine whether an integer is a palindrome. Do this without extra space.
 * Some hints:
 * Could negative integers be palindromes? (ie, -1)
 *
 * If you are thinking of converting the integer to string, note the restriction
 * of using extra space.
 *
 * You could also try reversing an integer. However, if you have solved the
 * problem "Reverse Integer", you know that the reversed integer might overflow.
 * How would you handle such case?
 *
 * There is a more generic way of solving this problem.
 */
public class _9_IsIntegerPalindrome {

	public static void main(String[] args) {
		System.out.println(isPalindrome(121));
		System.out.println(isPalindrome(12121));
		System.out.println(isPalindrome(121212));
		System.out.println(isPalindromeCheckHalf(121));
		System.out.println(isPalindromeCheckHalf(12121));
		System.out.println(isPalindromeCheckHalf(121212));
	}

	public static boolean isPalindromeCheckHalf(int x) {
		if (x < 0)
			return false;
		if (x == 0) 
            return true;
		if(x % 10 == 0)
			return false;
		int reversed=0, temp=x;
		
		while(temp>reversed){
			reversed = (reversed*10) + (temp%10);
			temp = temp/10;
		}
		if(temp==reversed || temp==reversed/10) return true;
		return false;
	}
	public static boolean isPalindrome(int x) {
		if (x < 0)
			return false;
		if(x%10 == 0)
			return false;
		
		int reversed = 0;
		int temp=x;
		while(temp!=0){
			reversed = (reversed*10) + (temp%10);
			temp = temp/10;
		}
		if (reversed == x)
			return true;

		return false;
	}
}
