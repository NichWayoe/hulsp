package org.howard.edu.lsp.assignment4.test;

import org.howard.edu.lsp.assignment4.IntegerSetException.IntegerSetException;
import org.howard.edu.lsp.assignment4.implementation.IntegerSet;
/**
 * 
 * @author nwayoe
 * A class for testing the contents ans operation of the IntegerSet class
 */
public class Driver {
	/**
	 * 
	 * @param args
	 * @throws IntegerSetException
	 */
	
	public static void main(String[] args) throws IntegerSetException {
		// TODO Auto-generated method stub
		IntegerSet set = new IntegerSet();
		IntegerSet set2 = new IntegerSet();

		int [] arr1 =  {1, 2, 3, 4, 5, 6};
		for (int num : arr1) {
			set.add(num);
		}

		System.out.println("Set1 = " + set.toString()+ "\n");

		int [] arr2 = {1, 2, 3, 4, 5, 6};
		for (int num : arr2) {
			set2.add(num);
		}
		System.out.println("Set2 = " + set.toString()+ "\n");
		System.out.println("is Set1 and Set2 equal?  " + set.equals(set2)+ "\n");

		set.add(7);
		System.out.println("Added 7 to set1 = " + set.toString()+ "\n");

		set.remove(3);
		System.out.println("removed 3 from set1 = " + set.toString()+ "\n");

		System.out.println("The length of set1 is " + set.length()+ "\n");


		System.out.println("set2 contains 6: " + set2.contains(6)+ "\n");

		System.out.println("set2 contains 90: " + set2.contains(90)+ "\n");

		;

		System.out.println("the largest element in set1 is "+ set.largest() + "\n"); 

		System.out.println("the smallest element in set2 is "+ set2.smallest() + "\n"); 

		set2.union(set);
		System.out.println("the union of set2 and set1 = " + set2.toString() +"\n");

		set2.intersect(set);
		System.out.println("the intersect of set2 and set1 = " + set2.toString() +"\n");

		set2.diff(set);
		System.out.println("set2 - set1 = " + set.toString() +"\n");

		set.clear();
		System.out.println("clear the elements in set1 = " + set.toString() +"\n");

		System.out.println("the largest element in set1 is "+ set.largest() + "\n"); 

		System.out.println("the smallest element in set1 is "+ set.smallest() + "\n"); 

	}
}
