package org.howard.edu.lsp.assignment2.combinations;
import java.util.ArrayList;
import java.util.Arrays;

/**
 * This class has a method for getting the combinations of elements in an array that adds up to a target sum
 *  getCombinations method
 * @author nwayoe
 *
 */

public class Combination {

	ArrayList<ArrayList<Integer>> outputArray = new ArrayList<ArrayList<Integer>>();
	int [] inputArray;

	/**
	 * A function that provides a point of access to the class for the user
	 * the function calls other private methods which generate subsets and update the outputArray
	 * @param targetSum this is the target sum to find subsets of array that add up to
	 * @param intArray  the array from which the subsets will be made from
	 * @return a string that shows the subsets that sum up to the targetSum or an error message
	 */

	public String getCombinations(int targetSum, int []intArray) {
		outputArray.removeAll(outputArray);
		inputArray = intArray;

		if (intArray.length == 0 ) {
			return "Invalid Input\n";
		}
		else {
			generateSubsets(0, targetSum, intArray, new ArrayList<Integer>());
		}
		if (outputArray.size()== 0) {
			return ("array: " + Arrays.toString(intArray) + " target: " + targetSum + " >>> " + "No combinataion\n");
		}
		else {
			return ("array: " + Arrays.toString(intArray) + " target: " + targetSum + " >>> " + outputArray + "\n");
		}
	}


	/**
	 * a recursive functions to find all the possible subsets of the given array
	 * the function then updates the outputArray with subsets that add up to the target sum
	 * @param start  the index to begin looping the arr from
	 * @param targetSum this is the target sum to find subsets of array that add up to
	 * @param arr the array from which the subsets will be made from
	 * @param current the current subset we have made from arr
	 */

	private void generateSubsets (int start,int targetSum, int []arr, ArrayList<Integer> current){
		if (calculateSum(current) == targetSum) {
			ArrayList<Integer> current_copy = new ArrayList<Integer> (current);
			outputArray.add(current_copy);
		}
		for (int i = start; i < arr.length; i++) {
			current.add(i);
			generateSubsets(i+1, targetSum, arr, current);
			current.remove(current.size() - 1);
		}		
	}

	/**
	 * this function receives and array of indexes and computes the sum of the values from inputArray
	 * @param arr an array of index of the subset generated from intArray
	 * @return the sum of elements in the subset passed into it
	 */

	private int calculateSum(ArrayList<Integer> arr) {
		int sum = 0;
		for (Integer num : arr) {
			sum += inputArray[num];
		}
		return sum;
	}
}
