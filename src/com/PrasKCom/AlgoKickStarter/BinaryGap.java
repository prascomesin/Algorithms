/**
 * Find longest sequence of 0s in a binary representation of an integer
 */
package com.PrasKCom.AlgoKickStarter;

/**
 * @author pkanvin
 *
 */
public class BinaryGap {
	
	//Option 1 - Use And operators and shift operators
	public int longestSequence1(int binary) {
		int maxCount = 0;
		int count = 0;
		
		while(binary !=0) {
			if((binary & 1) == 0) {
				count++;
			}else {
				maxCount = Math.max(count, maxCount);
				count=0;
			}
			binary >>= 1;
		}
		
		return Math.max(count, maxCount);
		
		
	}
	
	
	//Option 2  
	public int longestSequence2(String binary) {
		int maxCount = 0;
		int count = 0;
		
		for( int i = 0 ; i < binary.length(); i ++ ) {
			if (binary.charAt(i) == '0') {
				count ++;
			}else {
				maxCount = maxCount < count ? count : maxCount;
				count=0;
			}
		}
		
		maxCount = maxCount < count ? count : maxCount;
		return maxCount;
	}

}
