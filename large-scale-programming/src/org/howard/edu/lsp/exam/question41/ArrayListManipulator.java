package org.howard.edu.lsp.exam.question41;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListManipulator {
	/**
	 * Removes all the instance of Zero from a list of integers
	 * @param inputList
	 * @return List of Integers
	 */
	public ArrayList<Integer> removeZeroes( ArrayList<Integer> inputList) {
		List <Integer> list = Arrays.asList(0);
		inputList.removeAll(list);
		return inputList;
	}
}
