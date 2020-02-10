/**
 * An array A consisting of N different integers is given. The array contains integers in the range [1..(N + 1)], which means that exactly one element is missing.

Your goal is to find that missing element.

Write a function:

class Solution { public int solution(int[] A); }

that, given an array A, returns the value of the missing element.

For example, given array A such that:

  A[0] = 2
  A[1] = 3
  A[2] = 1
  A[3] = 5
the function should return 4, as it is the missing element.
 */
package com.PrasKCom.AlgoKickStarter;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Prasad Kanvinde
 *
 */
public class PermMissingElement {

	public int MissingElement(int[] arr) {
		
		//As the numbers are consecutive , calculate their sum via n(n+1)/2 
		if (arr.length == 0 ) return 0;
		
		int size = arr.length + 1;
		int expectedSum = (size * (size + 1))/2;
		int receivedSum = 0;
		
		//find sum of the given array elements
		for(int i : arr) {
			receivedSum += i;
		}
		
		return (expectedSum - receivedSum);
		
	}
}
