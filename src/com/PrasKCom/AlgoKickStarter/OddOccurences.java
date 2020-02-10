/**
 * 
 */
package com.PrasKCom.AlgoKickStarter;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 * @author Prasad Kanvinde
 *
 */
public class OddOccurences {
	
	public int oddOccurences(int[] arr) {
		
		Set<Integer> mySet = new HashSet<>();
		
		for (int i : arr) {
			if (mySet.contains(i)) {
				mySet.remove(i);
			}else
				mySet.add(i);
		}
		
		if (mySet.size() > 0) {
			Iterator<Integer> it = mySet.iterator();
			return (int)it.next();
			
			
		}else
			return 0;
		
		
		
	}

}
