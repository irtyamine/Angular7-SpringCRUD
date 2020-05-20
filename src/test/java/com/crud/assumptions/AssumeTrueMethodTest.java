package com.crud.assumptions;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assumptions.assumeTrue;

public class AssumeTrueMethodTest {

    @Test
    public void assumeTrueWithNoMessage() {
        assumeTrue("DEV".equals("DEV"));
        System.out.println("Assumption passed !!!");
        assertEquals(3, 2 + 1);
    }

    @Test
    public void assumeTrueWithMessage() {
        assumeTrue("DEV".equals("ENV"), "Assumption Failed !!!");
        System.out.println("Assumption passed !!!");
        assertEquals(3, 2 + 1);
    }

    @Test
    public void assumeTrueWithMessageSupplier() {
        assumeTrue("DEV".equals("ENV"), () -> "Assumption Failed !!!");
        System.out.println("Assumption passed !!!");
        assertEquals(3, 2 + 1);
    }

    @Test
    public void assumeTrueWithBooleanSupplierAndNoMessage() {
        assumeTrue(() -> "DEV".equals("ENV"));
        System.out.println("Assumption passed !!!");
        assertEquals(3, 2 + 1);
    }

    @Test
    public void assumeTrueWithBooleanSupplierAndMessage() {
        assumeTrue(() -> "DEV".equals("ENV"), "Assumption Failed !!!");
        System.out.println("Assumption passed !!!");
        assertEquals(3, 2 + 1);
    }

    @Test
    public void assumeTrueWithBooleanSupplierAndMessageSupplier() {
        assumeTrue(() -> "DEV".equals("DEV"), () -> "Assumption Failed !!!");
        System.out.println("Assumption passed !!!");
        assertEquals(3, 2 + 1);
    }
}
