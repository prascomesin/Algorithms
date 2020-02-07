/**
 * Given a fixed Token eg: "HELLO" and a random String , count the number of occurrences of token in the String
 */
package com.PrasKCom.AlgoKickStarter;

import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * @author pkanvin
 *
 */
public class FindOccurCount {
	
	public int getOccurCount(String myStr) {
		
		int count = 0;
		//Convert the received string to all upperCase character
		String upString = myStr.toUpperCase();
		
		//Create a set of the characters in the token 
		//Set ensures that there are no duplicates for repeated characters
		Set<Character> mySet = new HashSet<Character>();
		for(Character i: upString.toCharArray()) {
			mySet.add(i);
		}
		
		//Create a hash Map to store the count of occurrences of letters within the String
		Map<Character, Integer> myMap = new HashMap<Character, Integer>();
		for(Character m: upString.toCharArray()) {
			if(mySet.contains(m)) {
				myMap.compute(m, (k,v)-> v == null ? 1 : v+1);
			}
		}
		
		//Take care of repetitions in the token
		myMap.computeIfPresent('L', (k,v) -> v/2);
		
		//Compare the sizes
		if (mySet.size() > myMap.size()) return 0;
		
		//Get and return the character with minimum count
		return Collections.min(myMap.values());
		
	}

}
