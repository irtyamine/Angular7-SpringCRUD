package com.crud.example;

import org.assertj.core.util.Arrays;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertIterableEquals;

class AssertIterableEqualsMethod {

    /* Iterable Equality means:--
     *  1. Elements of Iterable are equal
     *  2. Order of elements should be match
     *  3. Number of elements should match
     * */

    @Test
    void assert_Iterable_Equals_without_Message() {
        String cricketer[] = {"Sachin", "Dravid", "Rahul", "Yuvraj", "Amit", "Bunty"};
        List<Object> arrayToList = Arrays.asList(cricketer);
        assertIterableEquals(arrayToList, arrayToList);
    }

    @Test
    void assert_Iterable_Equals_with_Message() {
        String cricketer[] = {"Sachin", "Dravid", "Rahul", "Yuvraj", "Amit", "Bunty"};
        List<Object> expected = Arrays.asList(cricketer);
        String cricketer1[] = {"Sachin", "Dravid", "Rahul", "Yuvraj", "Amit"};
        List<Object> actual = Arrays.asList(cricketer1);
        assertIterableEquals(expected, actual, () -> "Both are Not same");
    }

}
