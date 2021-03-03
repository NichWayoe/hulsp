package org.howard.edu.lsp.assignment4.implementation;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.howard.edu.lsp.assignment4.IntegerSetException.IntegerSetException;
/**
 * 
 * @author nicholas Wayoe
 * an implementation of the abstraction of the ArrayList class
 */
public class IntegerSet {
	private List<Integer> set = new ArrayList<Integer>();
	
	/**
	 * removes all elements from the set
	 */
	public void clear() {
		set.clear();
	}

	/**
	 * a method for getting the length of the set
	 * @return the length of the set
	 */
	public int length() {
		return set.size();
	}
	
	/**
	 * a getter for the set
	 * @return the set
	 */
	public List<Integer> getSet() {
		return set;
	}

	/**
	 * checks whether the a particular set is equal to the set of the class.
	 * equal >> the same number of elements
	 * @param b the set to compare with the 
	 * @return True if the sets are equal and False otherwise
	 */
	public boolean equals(IntegerSet b) {
		int bSize = b.length();
		List<Integer> bSet = b.getSet();
		if (this.length() != bSize) {
			return false;
		}
		else {
			for (int i = 0; i < bSize; i++) {
				if (!this.contains(bSet.get(i))) {
					return false;
				}
			}
			return true;
		}
	}

	/**
	 * checks if a value is in the set
	 * @param value the element to be checked
	 * @return True if the set contains the value and False otherwise
	 */
	public boolean contains(int value) {
		for (int j = 0; j < this.length(); j++) {
			if (set.get(j) == value ) {
				return true;
			}
		}
		return false;
	}

	/**
	 * returns the largest element in the set
	 * @return the largest element in the set
	 * @throws IntegerSetException if the set is empty
	 */
	public int largest() throws IntegerSetException {
		if (this.isEmpty()) {
			throw new IntegerSetException("The set is empty");
		}
		else {
			return Collections.max(set);
		}
	}

	/**
	 * returns the smallest element in the set
	 * @return the smallest element in the set
	 * @throws IntegerSetException if the set is empty
	 */
	
	public int smallest() throws IntegerSetException {
		if (this.isEmpty()) {
			throw new IntegerSetException("The set is empty");
		}
		else {
			return Collections.min(set);
		}
	}

	/**
	 * adds an element to the set of the class
	 * @param item the item to be added
	 */
	
	public void add(int item) {
		if (!this.contains(item)) {
			set.add(item);
		}
	}

	/**
	 * deletes an element from the set if present
	 * @param item the element to be deleted
	 */
	public void remove(int item) {
		if (this.contains(item)) {
			set.remove(Integer.valueOf(item));
		}
	}

	/**
	 * updates the set of the class by adding the elements of the set passed into it
	 * @param intSetb the set to be added to the set of the class
	 */
	public void union(IntegerSet intSetb) {
		 List<Integer> setB = intSetb.getSet();
		for (int j = 0; j < intSetb.length(); j++) {
			if (!this.contains(setB.get(j))) {
				set.add(setB.get(j));
			}
		}
	}

	/**
	 * updates the set of the class with the intersection between two sets
	 * @param intSetb the set to be compared with the set of our class
	 */
	public void intersect(IntegerSet intSetb) {
		set.retainAll(intSetb.getSet());
	}

	/**
	 * updates the set of our class with after subtracting the elements of the passed set from our set
	 * @param inSetb the set to be subtracted from our class set
	 */
	public void diff(IntegerSet inSetb) {
		set.removeAll(inSetb.getSet());
	}


	/**
	 * returns whether the set is empty or not
	 * @return True if the set is empty and false otherwise
	 */
	boolean isEmpty() {
		return set.isEmpty();
	}

	/**
	 * changes the set to a string
	 */
	public String toString() {
		return set.toString();

	}
}
