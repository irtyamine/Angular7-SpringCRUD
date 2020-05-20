package com.crud.assertions;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class AssertArrayEqualsMethodTest {

	/* Array Equality means:--
	 *  1. Elements of array are equal
	 *  2. Order of elements should be equal
	 *  3. Number of elements should be same
	 * */

	@Test
	void assert_arrays_equal_with_Array_object() {
		String expected[] = {"Sachin", "Dravid", "Rahul", "Yuvraj", "Amit", "Bunty"};
		String actual1[] = {"Sachin", "Dravid", "Rahul", "Yuvraj", "Amit", "Bunty"};
		String actual2[] = {"Sachin", "Dravid", "Rahul", "Yuvraj"};
		String actual3[] = {"Amit", "Dravid", "Rahul", "Yuvraj", "Sachin", "Bunty"};
//		assertArrayEquals(expected, actual1);
//		assertArrayEquals(expected, actual2);
		assertArrayEquals(expected, actual3);
	}

}
