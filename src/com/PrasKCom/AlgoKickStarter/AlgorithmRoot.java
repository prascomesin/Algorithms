/**
 * This package will be the root for playing around with different algorithms in Java
 */
package com.PrasKCom.AlgoKickStarter;

import java.util.Arrays;

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
		//Perform Cyclic rotation
		CyclicRotationR cr = new CyclicRotationR();
		int[] Rot = {1,2,3,4};
		cr.CyclicRotationR(Rot, 0);
		System.out.println(Arrays.toString(Rot));
		//Find the element with odd occurence of count
		int[] oddArr = {9,3,9,3,9,9,100};
		OddOccurences od = new OddOccurences();
		System.out.println(od.oddOccurences(oddArr));
		//Find the missing integer in the consecutive set
		int[] marr = {2,5,8,3,1,6,7};
		PermMissingElement miss = new PermMissingElement();
		System.out.println(miss.MissingElement(marr));
		//Tape Equilibrium
		int[] tarr = {3,1,2,4,3};
		TapeEquilibrium te = new TapeEquilibrium();
		System.out.println(te.minTape(tarr));
		//Frog jumping on other side of the river
		//Find the earliest time when a frog can jump to the other side of a river.
		int[] farr = {1,3,1,4,2,5,5,4};
		FrogRiverOne fr =  new FrogRiverOne();
		System.out.println(fr.FrogRiverOne(5, farr));
		int[] parr = {4,1,3,2,5};
		ArrPermuation ap = new ArrPermuation();
		System.out.println(ap.isPermutation(parr));
		int[] missarr = {-2, -23, -3 , 1, 2 ,0 , -5, 3, 5};
		MissingInteger mar = new MissingInteger();
		System.out.println(mar.MissingIntegerNoSort(missarr));
		
		
		
		
		}
	}
	
	


