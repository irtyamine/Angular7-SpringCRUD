package com.crud.assumptions;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assumptions.assumingThat;

public class AssumingThatMethod {

    @Test
    public void assumingThatWithBooleanCondition() {
        //assumingThat() If true then it will run else it will skip and continue to run assertEquals()
        assumingThat("DEV".equals("DEV"), () -> {
            System.out.println("Dev environment !!!");
            assertEquals(5, 3 + 2);
        });
        // below code gets executed in every environment
        System.out.println("Executed in every environment !!!");
        assertEquals(3, 2 + 1);
    }

    @Test
    public void assumingThatWithBooleanSupplier() {
        //assumingThat() If true then it will run else it will skip and continue to run assertEquals()
        assumingThat(() -> "DEV".equals("DEV"), () -> {
            System.out.println("Dev environment !!!");
            assertEquals(5, 3 + 2);
        });
        // below code gets executed in every environment
        System.out.println("Executed in every environment !!!");
        assertEquals(3, 2 + 1);
    }
}
