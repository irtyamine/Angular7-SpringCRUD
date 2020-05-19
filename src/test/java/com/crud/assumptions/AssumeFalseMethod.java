package com.crud.assumptions;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assumptions.assumeFalse;

public class AssumeFalseMethod {

    @Test
    public void assumeFalseWithNoMessage() {
        assumeFalse("DEV".equals("DEV"));
        System.out.println("Assumption passed !!!");
        assertEquals(3, 2 + 1);
    }

    @Test
    public void assumeFalseWithMessage() {
        assumeFalse("DEV".equals("ENV"), "Assumption Failed !!!");
        System.out.println("Assumption passed !!!");
        assertEquals(3, 2 + 1);
    }

    @Test
    public void assumeFalseWithMessageSupplier() {
        assumeFalse("DEV".equals("DEV"), () -> "Assumption Failed !!!");
        System.out.println("Assumption passed !!!");
        assertEquals(3, 2 + 1);
    }

    @Test
    public void assumeFalseWithBooleanSupplierAndNoMessage() {
        assumeFalse(() -> "DEV".equals("ENV"));
        System.out.println("Assumption passed !!!");
        assertEquals(3, 2 + 1);
    }

    @Test
    public void assumeFalseWithBooleanSupplierAndMessage() {
        assumeFalse(() -> "DEV".equals("ENV"), "Assumption Failed !!!");
        System.out.println("Assumption passed !!!");
        assertEquals(3, 2 + 1);
    }

    @Test
    public void assumeFalseWithBooleanSupplierAndMessageSupplier() {
        assumeFalse(() -> "DEV".equals("DEV"), () -> "Assumption Failed !!!");
        System.out.println("Assumption passed !!!");
        assertEquals(3, 2 + 1);
    }
}
