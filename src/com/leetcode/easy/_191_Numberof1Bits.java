package com.leetcode.easy;

/**
 * 191. Number of 1 Bits
 *
 * Write a function that takes an unsigned integer and returns the number of ’1' bits it has (also known as the Hamming weight).
 * For example, the 32-bit integer ’11' has binary representation 00000000000000000000000000001011, so the function should return 3.
 * */

public class _191_Numberof1Bits {

	public static void main(String[] args) {
		System.out.println(hammingWeight(11));
		System.out.println(hammingWeight(128));
		
		System.out.println(hammingWeightBitWise(11));
		System.out.println(hammingWeightBitWise(128));
	}

	public static int hammingWeight(int n) {
		String binary = Integer.toBinaryString(n);
		char[] bA = binary.toCharArray();
		int count = 0;
		for (int i = 0; i < bA.length; i++) {
			if (bA[i] == '1') {
				count++;
			}
		}
		return count;
	}
	
	/**
	 * Doing bitwise AND operation between n and n-1 will always flip the least significant 1 bit in n to zero
	 * example run for the above editorial solution: input 5, n will be 5&4 and becomes 4,
	 * then in the next run, n will become 4&3 which is 0, thus exit the while loop.*/
   public static int hammingWeightBitWise(int n) {
       int bits = 0;
       while (n != 0) {
           bits++;
           n &= (n - 1);
       }
       return bits;
   }
}
