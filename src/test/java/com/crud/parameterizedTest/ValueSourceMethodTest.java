package com.crud.parameterizedTest;

import com.crud.common.Calculator;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class ValueSourceMethodTest {

    @Test
    public void testEvenValues() {
        Calculator calculator = new Calculator();
        assertTrue(calculator.isEvenNumber(2));
        assertTrue(calculator.isEvenNumber(4));
        assertTrue(calculator.isEvenNumber(6));
        assertTrue(calculator.isEvenNumber(20));
        assertTrue(calculator.isEvenNumber(8));
        assertTrue(calculator.isEvenNumber(12));
    }

    @ParameterizedTest
    @ValueSource(ints = {2, 4, 6, 8, 12, 10})
    public void testEvenValuesUsingParamaterizedTest(int number) {
        Calculator calculator = new Calculator();
        assertTrue(calculator.isEvenNumber(number));
    }
}
