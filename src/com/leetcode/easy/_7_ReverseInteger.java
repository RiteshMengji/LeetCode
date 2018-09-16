package com.leetcode.easy;

/**
 * 7. Reverse Integer
 *
 * Reverse digits of an integer. 
 * Example1: x = 123, return 321 
 * Example2: x = -123, return -321
 */
public class _7_ReverseInteger {

	public static void main(String[] args) {
		System.out.println(reverse(1534236469));
		System.out.println(reverse(-321));
	}

	public static int reverse(int x) {
		// MUST: reverse should be long to hold value greater max int value
		long reversed = 0;
		while (x != 0) {
			reversed = (reversed * 10) + (x % 10);
			x = x / 10;
			if (reversed > Integer.MAX_VALUE || reversed < Integer.MIN_VALUE) {
	            return 0;
			}
		}
		
		return (int) reversed;
	}

}
