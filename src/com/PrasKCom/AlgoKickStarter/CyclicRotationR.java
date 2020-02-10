/**
 * 
 */
package com.PrasKCom.AlgoKickStarter;

/**
 * @author pkanvin
 *
 */
public class CyclicRotationR {
	
	public int[] CyclicRotationR(int[] arr , int steps) {
		
		int temp;
		
		int size = arr.length;
		
		
		
		for(int i= 0; i < steps ; i++ ) {
			temp = arr[size - 1];
			arr = rotateRightByOne(arr);
			arr[0]= temp;
			
		}
		
		
		
		
		return arr;
		
	}
	
	public int[] rotateRightByOne(int[] arr) {
		
		for(int i = arr.length - 1 ; i > 0 ; i--) {
			arr[i] = arr[i -1];
			
		}
		
		return arr;
		
	}
	
   

}

