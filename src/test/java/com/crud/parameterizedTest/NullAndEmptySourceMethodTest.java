package com.crud.parameterizedTest;

import com.crud.common.StringHelper;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.EmptySource;
import org.junit.jupiter.params.provider.NullAndEmptySource;
import org.junit.jupiter.params.provider.NullSource;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

public class NullAndEmptySourceMethodTest {

    @ParameterizedTest
    @NullSource // This annotation will null value in this method
    public void testReverseWithNullSource(String input) {
        StringHelper stringHelper = new StringHelper();
        assertEquals(null, stringHelper.reverse(input));
        assertNull(stringHelper.reverse(input));
    }

    @ParameterizedTest
    @EmptySource
    public void testReverseWithEmptySource(String input) {
        StringHelper stringHelper = new StringHelper();
        assertEquals("", stringHelper.reverse(input));
    }

    @ParameterizedTest
    @NullAndEmptySource
    public void testReverseWithNullAndEmptySource(String input) {
        StringHelper stringHelper = new StringHelper();
        assertEquals(input, stringHelper.reverse(input));
    }

    @ParameterizedTest
    @NullSource
    @EmptySource
    public void testReverseWithNullAndEmptySourceCombined(String input) {
        StringHelper stringHelper = new StringHelper();
        assertEquals(input, stringHelper.reverse(input));
    }
}
