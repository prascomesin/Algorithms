/**
 * Find the smallest positive integer that does not occur in a given sequence.
 */
package com.PrasKCom.AlgoKickStarter;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * @author pkanvin
 *
 */
public class MissingInteger {
	
	
	//Using Arrays sorted , easy to pick missing Integer
	public int MissingInteger(int[] arr) {
		int missingInteger = 1;
		
		Arrays.sort(arr);
		
		for(int i : arr) {
			if(i <= 0 ) continue;
			if(i == missingInteger) missingInteger++;
			else return missingInteger;
		}
		return missingInteger;
	}
	
	public int MissingIntegerNoSort(int[] arr) {
		int missingInteger = 1;
		Set<Integer> store = new HashSet<>();
		
		
		for(int i : arr) {
			if(i <= 0 ) continue;
			store.add(i);
			if(store.contains(missingInteger)) {
				missingInteger++;
			}
			
		}
		return missingInteger;
	}

}
