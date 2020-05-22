package com.crud.parameterizedTest;

import com.crud.common.StringHelper;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class CsvSourceMethodTest {

    @ParameterizedTest
    @CsvSource({
            "car, rac",
            "test, tset"
    })
    public void csvSourceDemoTest(String input, String expect) {
        StringHelper stringHelper = new StringHelper();
        assertEquals(expect, stringHelper.reverse(input));
    }

    @ParameterizedTest
    @CsvSource({
            "car, 'my, car'",
            "car, ''",
//            "book, "      // Note: First args=book and second args=null
    })
    public void csvSourceDemoWithSingleQuotes(String first, String second) {
        assertNotNull(first);
        assertNotNull(second);
    }

    @ParameterizedTest
    @CsvSource({
            "One, 3"
    })
    public void csvSourceDemoWithIntegers(String first, Integer second) {
        assertNotNull(first);
        assertNotNull(second);
    }
}
