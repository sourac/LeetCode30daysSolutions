/**
 * 
 */
package com.leetcode.week1;

import java.util.HashMap;

/**
 * @author Atul Sharma
 *
 * https://github.com/sourac
 */
public class SingleNumber1 {
	
	public static void main(String[] args) {
		int [] A= {4,1,2,1,2};
		int val=singleNumber(A);
		System.out.println("val with only one frequencey : " + val);
		
	}
	
	
	 public static int singleNumber(int[] a) {
	        HashMap<Integer, Integer> hmap = new HashMap<Integer, Integer>();

			for (int i = 0; i < a.length; i++) {
				if (!hmap.containsKey(a[i])) {
					hmap.put(a[i], 1);
				} else {
					hmap.put(a[i], hmap.get(a[i]) + 1);
				}
			}

			for (java.util.Map.Entry<Integer, Integer> entry : hmap.entrySet()) {
				if (entry.getValue() == 1) {
					return entry.getKey();
				}
			}

			return 0;
	        
	    }

}
