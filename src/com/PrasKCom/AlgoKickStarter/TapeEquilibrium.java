/**
Minimize the value |(A[0] + ... + A[P-1]) - (A[P] + ... + A[N-1])|.
 */
package com.PrasKCom.AlgoKickStarter;

/**
 * @author pkanvin
 *
 */
public class TapeEquilibrium {
	
	/*Option 1 :
	 * Compute for one element at a time
	 * Then just run the loop by increasing on one side and reducing on other by the value of the element
	 * Then compute the absolute value of difference
	 */
	public int minTape(int[] A) {

	    int size = A.length;

	    int sum1 = A[0];
	    int sum2 = 0;
	    int P = 1;
	    for (int i = P; i < size; i++) {
	        sum2 += A[i];
	    }
	    int diff = Math.abs(sum1 - sum2);

	    for (; P < size-1; P++) {
	        sum1 += A[P];
	        sum2 -= A[P];

	        int newDiff = Math.abs(sum1 - sum2);
	        if (newDiff < diff) {
	            diff = newDiff;
	        }
	    }
	    return diff;
	}
	
	
	/*Option 2 :
	 * Run two for loops
	 */
	public int minTapeOpt2(int[] arr) {
		
		
		int min = 100000000;
		int size = arr.length;
		int sumFirstPart = 0;
		int sumSecondPart = 0;
		
		
		for(int i = 0; i< size; i++) {
			sumFirstPart += arr[i]; 
			
			for (int j = i+1; j < size; j++ ) {
				sumSecondPart += arr[j];
			}
			min = Math.min(min,Math.abs(sumFirstPart - sumSecondPart));
			sumSecondPart = 0;
			
			
		}
		return min;
		
		
	}

}
