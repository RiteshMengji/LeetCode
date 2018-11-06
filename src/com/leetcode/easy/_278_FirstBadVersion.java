package com.leetcode.easy;
/** 
 * 
 * You are a product manager and currently leading a team to develop a new product. 
 * Unfortunately, the latest version of your product fails the quality check. 
 * Since each version is developed based on the previous version, all the versions after a bad version are also bad.
 * Suppose you have n versions [1, 2, ..., n] and you want to find out the first bad one, 
 * which causes all the following ones to be bad.
 *	You are given an API bool isBadVersion(version) which will return whether version is bad. Implement a function to find the first bad version. You should minimize the number of calls to the API.
	Example:
		Given n = 5, and version = 4 is the first bad version.
			call isBadVersion(3) -> false
			call isBadVersion(5) -> true
			call isBadVersion(4) -> true
		Then 4 is the first bad version. 
 * 
 * */
public class _278_FirstBadVersion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* The isBadVersion API is defined in the parent class VersionControl.
	      boolean isBadVersion(int version); */
	}
	
	public static int firstBadVersion(int n) {
        int start=1, end=n;
        int result=-1;
        while(start<=end){
            int pivot = start + (end-start)/2;
            if(isBadVersion(pivot)){
                if(result==-1 || pivot<result) {
                    result=pivot;   
                }
                end = pivot-1;
            } else {
                start = pivot+1;
            }   
        }
        return result;    
    }
	
	private static boolean isBadVersion(int m){
		return false;
	}

}
