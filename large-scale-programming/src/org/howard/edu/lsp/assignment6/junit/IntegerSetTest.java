package org.howard.edu.lsp.assignment6.junit;

import static org.junit.jupiter.api.Assertions.*;
import org.howard.edu.lsp.assignment4.IntegerSetException.IntegerSetException;
import org.howard.edu.lsp.assignment6.integerset.IntegerSet;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class IntegerSetTest {

	private IntegerSet integerSet1;
	private IntegerSet integerSet2;

	@BeforeEach
	void setup() {
		integerSet1 = new IntegerSet();
		integerSet2 = new IntegerSet();

	}

	@Test
	@DisplayName("Test cases for Clear")
	void TestClear() {
		int [] arr1 =  {1, 2, 3, 4, 5, 6};
		for (int num : arr1) {
			integerSet1.add(num);
		}
		integerSet1.clear();
		assertNotEquals(integerSet1.toString(), "[1,2,3,4,5,6]");
		assertEquals(integerSet1.toString(), "[]");
	}


	@Test
	@DisplayName("Test cases for smallest")
	void TestSmallest() throws IntegerSetException {
		int [] arr1 =  {1, 2, 3, 4, 5, 6};
		for (int num : arr1) {
			integerSet1.add(num);
		}
		assertEquals(integerSet1.smallest(), 1);
		assertNotEquals(integerSet1.smallest(), 2);
	}

	@DisplayName("Test cases for smallest when all number are the same ")
	void TestSmallest2() throws IntegerSetException {
		int [] arr1 =  {1, 1,1, 1};
		for (int num : arr1) {
			integerSet1.add(num);
		}
		assertEquals(integerSet1.smallest(), 1);
		assertNotEquals(integerSet1.smallest(), 0);
	}

	@DisplayName("Test cases for smallest when set is empty")
	void TestSmallest3() {
		assertThrows(IntegerSetException.class, () -> {
			integerSet1.smallest();
		});
	}


	@Test
	@DisplayName("Test cases for Largest")
	void TestLargest1() throws IntegerSetException {
		int [] arr1 =  {1, 5, 20, 1, 1};
		for (int num : arr1) {
			integerSet1.add(num);
		}
		assertEquals(integerSet1.largest(), 20);
		assertNotEquals(integerSet1.largest(), 5);
	}


	@Test
	@DisplayName("Test cases for Largest in an empty set")
	void TestLargest2() {
		assertThrows(IntegerSetException.class, () -> {
			integerSet1.largest();
		});
	}


	@Test
	@DisplayName("Test cases for length")
	void TestLength() {
		assertEquals(integerSet1.length(), 0);
		int [] arr1 =  {1, 5, 20};
		for (int num : arr1) {
			integerSet1.add(num);
		}
		assertNotEquals(integerSet1.length(), 2);
		assertEquals(integerSet1.length(), 3);
	}

	@Test
	@DisplayName("Test cases for Intersection")
	void TestIntersection() {
		int [] arr1 =  {1, 5, 20, 1, 1};
		for (int num : arr1) {
			integerSet1.add(num);
		}
		int [] arr2 =  {1, 20, 1, 2};
		for (int num : arr2) {
			integerSet2.add(num);
		}
		integerSet1.intersect(integerSet2);
		assertEquals(integerSet1.toString(), "[1, 20]");
		assertNotEquals(integerSet1.toString(), "[1, 20, 1");
	}

	@Test
	@DisplayName("Test cases for union")
	void TestUnion() {
		int [] arr1 =  {1, 5, 20, 1, 1};
		for (int num : arr1) {
			integerSet1.add(num);
		}
		int [] arr2 =  {10, 11, 2};
		for (int num : arr2) {
			integerSet2.add(num);
		}
		integerSet1.union(integerSet2);
		assertNotEquals(integerSet1.toString(), "[1, 5, 20, 1, 1, 10, 11, 2]");
		assertEquals(integerSet1.toString(), "[1, 5, 20, 10, 11, 2]");

	}

	@Test
	@DisplayName("Test cases for Contains")
	void TestContains() {
		int [] arr1 =  {1, 5, 20, 1, 1};
		for (int num : arr1) {
			integerSet1.add(num);
		}
		assertEquals(integerSet1.contains(0), false);
		assertEquals(integerSet1.contains(5), true);
	}

	@Test
	@DisplayName("Test cases for isEmpty")
	void TestisEmpty() {
		assertEquals(integerSet1.isEmpty(), true);
		int [] arr1 =  {1};
		for (int num : arr1) {
			integerSet1.add(num);
		}
		assertEquals(integerSet1.isEmpty(), false);
	}

	@Test
	@DisplayName("Test cases for remove")
	void TestRemove() {
		int [] arr1 =  {1, 4, 8, 9};
		for (int num : arr1) {
			integerSet1.add(num); 
		}
		integerSet1.remove(8);
		assertEquals(integerSet1.toString(), "[1, 4, 9]");
		integerSet1.remove(0);
		assertEquals(integerSet1.toString(), "[1, 4, 9]");
	}

	@Test
	@DisplayName("Test cases for Difference")
	void TestDifference() {
		int [] arr1 =  {10, 12, 14, 15};
		for (int num : arr1) {
			integerSet1.add(num);
		}
		int [] arr2 =  {12, 14};
		for (int num : arr2) {
			integerSet2.add(num);
		}
		integerSet1.diff(integerSet2);
		assertEquals(integerSet1.toString(), "[10, 15]");
		integerSet1.clear();

		for (int num : arr1) {
			integerSet1.add(num);
		}
		integerSet2.diff(integerSet1);
		assertEquals(integerSet2.toString(), "[]");
	}

	@Test
	@DisplayName("Test cases for add")
	void TestAdd() {
		int [] arr1 =  {1, 5, 20, 1, 1};
		for (int num : arr1) {
			integerSet1.add(num);
		}
		assertEquals(integerSet1.toString(), "[1, 5, 20]");
		assertNotEquals(integerSet1.toString(), "[1, 5, 20, 1, 1]");

	}

	@Test
	@DisplayName("Test cases for toString")
	void TesttoString() {
		int [] arr1 =  {1, 5, 20};
		for (int num : arr1) {
			integerSet1.add(num);
		}
		assertEquals(integerSet1.toString(), "[1, 5, 20]");

	}

	@AfterEach
	void tearDown() {
		integerSet1 = null;
		integerSet2 = null;
	}




}
