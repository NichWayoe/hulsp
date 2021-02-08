package org.howard.edu.lsp.assignment2;
public class Test {

	public static void main(String[] args) {

		Combination combination = new Combination();

		int [] arr1 =  {1, 2, 3, 4, 5, 6};

		System.out.println(combination.getCombinations(6, arr1));
		//[[0, 1, 2], [1, 3], [5],[0, 4]]

		int [] arr2 = {5, 5, 15, 10};
		System.out.println(combination.getCombinations(15, arr2));
		//[[0, 3], [2], [1,3]]


		int [] arr3 = {3, 4, 10, 5, 6};
		//[[1, 4], [2]]
		System.out.println(combination.getCombinations(10, arr3));


		int [] arr4 = {4, 2, 6, 2};
		System.out.println(combination.getCombinations(8, arr4));
		//[[0, 1, 3], [1,2], [2,3]}

		int [] arr5 = {3};
		System.out.println(combination.getCombinations(3, arr5));
		//[[0]]

		int [] arr6 = {};
		System.out.println(combination.getCombinations(6, arr6));
		//returns invalid input

		int [] arr7 = {1, 7, 5, 1, 6, 7, -2, 4, 3, 6, 10};
		System.out.println(combination.getCombinations(7, arr7));
		//[[0, 2, 3], [0, 2, 3, 6, 8], [0, 3, 6, 7, 8], [0, 4], [0, 9], [1], [2, 3, 6, 8], [2, 6, 7], [3, 4], [3, 9], [4, 6, 8], [5], [6, 8, 9], [7, 8]]

		int [] arr8 = {1, 2, 3, 5, 7, -2, 10, -5};
		System.out.println(combination.getCombinations(5, arr8));
		//

		int [] arr9 = {1, 2, 2, 2};
		System.out.println(combination.getCombinations(2, arr9));
		// [[1], [2], [3]]
				
		int [] arr10 = {1, 7, 0, 1, 6};
		System.out.println(combination.getCombinations(8, arr10));
		// [[0, 1], [0, 1, 2], [0, 2, 3, 4], [0, 3, 4], [1, 2, 3], [1, 3]]

	}
}