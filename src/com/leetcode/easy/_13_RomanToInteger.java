package com.leetcode.easy;

import java.util.HashMap;
import java.util.Map;

/**
 * 13. Roman to Integer
 *
 * Given a roman numeral, convert it to an integer.
 * Input is guaranteed to be within the range from 1 to 3999.
 * */
public class _13_RomanToInteger {
	
	private static Map<Character, Integer> data = new HashMap<Character, Integer>();
	public static void main(String[] args) {
		data.put('I', 1);
		data.put('V', 5);
		data.put('X', 10);
		data.put('L', 50);
		data.put('C', 100);
		data.put('D', 500);
		data.put('M', 1000);
		System.out.println(romanToInt("III"));
		System.out.println(romanToInt("IV"));
		
		System.out.println(romanToInteger("III"));
		System.out.println(romanToInteger("IV"));
	}
	
	public static int romanToInteger(String s){
		int result =0;
		for(int i=0;i<s.length()-1;i++){
			int curr = data.get(s.charAt(i));
			int next = data.get(s.charAt(i+1));
			if(curr >= next){
				result += curr;
			} else if(curr < next){
				result -= curr;
			}
		}
		result = result+data.get(s.charAt(s.length()-1));
		return result;
	}

	public static int romanToInt(String s) {
		int total=0, prev=1000;
		for(char c: s.toCharArray()){
			int temp = data.get(c); 
			if(temp>prev){
				temp = temp - (2*prev);
			}
			total+=temp;
			prev=temp;
		}
		return total;
	}
	
	

}
