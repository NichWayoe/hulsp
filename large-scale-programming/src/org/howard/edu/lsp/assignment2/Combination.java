package org.howard.edu.lsp.assignment2;
import java.util.ArrayList;
import java.util.Arrays;

/**
 * This class has a method for getting the combinations of elements in an array that adds up to a target sum
 *  getCombinations method
 * @author nwayoe
 *
 */

public class Combination {
	/**
	 * this function returns the different elements in an array that add up to a particular target sum.
	 * @param target
	 * @param intArray
	 * @return
	 */
	public String getCombinations(int target, int []intArray) {

		ArrayList<ArrayList<Integer>> outputArray = new ArrayList<ArrayList<Integer>>(); //arraylist to store the combinations

		for (int i = 0; i < intArray.length; i++) {

			ArrayList<Integer> workingList = new ArrayList<Integer>();

			//check if current element is greater than the target sum
			if (intArray[i] < target) {

				workingList.add(i);
				int sum = intArray[i];
				int benchmarkIndex = i;

				for (int j = i + 1; j < intArray.length; j++) {
					sum += intArray[j];

					if (sum < target) {
						workingList.add(j);
					}

					else if (sum > target) {
						sum -= intArray[j];	
					}

					else if (sum == target) {
						// when there is a combination that meets the target, add to the arrayList
						sum -= intArray[j];
						workingList.add(j);
						if (!outputArray.contains(workingList)) {
							ArrayList<Integer> workingList_copy = new ArrayList<Integer>(workingList);
							outputArray.add(workingList_copy);
						}
					}

					if (j == intArray.length - 1) {
						// update the inner loop for different combinations
						if (j != benchmarkIndex) {
							benchmarkIndex++;
							j = benchmarkIndex;
							sum = intArray[i];
							workingList.removeAll(workingList);
							workingList.add(i);
						}

					}

				}

			}

			else if (intArray[i] == target) {
				//if the target is equal to an element in array, it just add the index to the outputArray
				workingList.add(i);
				ArrayList<Integer> workingList_copy = new ArrayList<Integer>(workingList);
				outputArray.add(workingList_copy);
				workingList.removeAll(workingList);
			}

		}

		return ("An input of " + Arrays.toString(intArray) + " with target sum  " +target + " has the combinations " + outputArray + "\n");
	}

}
