/**
 * Check if a given array is permutation or not
 */
package com.PrasKCom.AlgoKickStarter;

/**
 * @author pkanvin
 *
 */
public class ArrPermuation {
	
	/*
	 * The sum of numbers in a permutation will be N(N+1)/2
	 * Compute the sum and compare with the sum of the elements of the array
	 * If there is a match the array is permutated
	 */
	public boolean isPermutationMath(int[] arr) {
		
		int size = arr.length;
		int expectedSum = (size * (size + 1))/2;
		int receivedSum = 0;
		
		for(int i : arr) {
			receivedSum += i;
		}
		
		return (expectedSum == receivedSum);
	}
	
	/*
	 * Create a boolean array which tracks if all the given elements are received in the array
	 * 
	 */
	public boolean isPermutation(int[] A) {
		
			int count = A.length;
			
			boolean[] PermChecker = new boolean[A.length + 1];
			
			for(int i=0; i< A.length; i++) {
				if(A[i] > A.length)
					return false;
				if(!PermChecker[A[i]]) {
					PermChecker[A[i]] = true;
					count --;
				}
				else 
					return false;
				
			}
			if (count != 0) return false;
				
			return true;
		
		
	}

}
