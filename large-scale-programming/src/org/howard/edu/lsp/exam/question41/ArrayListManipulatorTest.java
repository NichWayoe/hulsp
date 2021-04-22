package org.howard.edu.lsp.exam.question41;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class ArrayListManipulatorTest {
	ArrayListManipulator arrayListManipulator;
	
	@BeforeEach
	void setUp() {
		arrayListManipulator = new ArrayListManipulator();
	}
	@Test
	@DisplayName ("Test the removeZero method")
	void test() {
		ArrayList<Integer> arr = new ArrayList<>();
				arr.add(0);
				arr.add(1);
				arr.add(1);
				arr.add(0);
				arr.add(4);
				arr.add(5);
		assertEquals(arrayListManipulator.removeZeroes(arr).toString(), "[1, 1, 4, 5]");
		
		ArrayList<Integer> arr1 = new ArrayList<>();
			arr1.add(1);
			arr1.add(4);
			arr1.add(5);
			assertEquals(arrayListManipulator.removeZeroes(arr1).toString(), "[1, 4, 5]");
	}

}
