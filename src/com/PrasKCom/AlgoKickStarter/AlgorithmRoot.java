/**
 * This package will be the root for playing around with different algorithms in Java
 */
package com.PrasKCom.AlgoKickStarter;

/**
 * @author Prasad Kanvinde
 *
 */
public class AlgorithmRoot {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		
		// TODO Auto-generated method stub
		//Find occurences within a string
		FindOccurCount myOccurCount = new FindOccurCount();
		System.out.println(myOccurCount.getOccurCount("Hello"));
		//Find binary gap
		BinaryGap bG = new BinaryGap();
		System.out.println(bG.longestSequence1(14));
	
	}
	
	

}
