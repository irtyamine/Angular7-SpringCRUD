package com.crud.disabled;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

//@Disabled("skipped until #95 issue has been fixed") //-----------to skip class for testing
public class DisabledMethodTest {

    @Test
    @Disabled("skipped until #95 issue has been fixed") //-----------to skip method for testing
    public void displayNameDemoTest() {
        assertEquals(3, 2 + 1);
    }

    @Test
    public void displayNameDemoWithSpaces() {
        assertEquals(3, 2 + 1);
    }

    @Test
    public void displayNameDemoWithSpecialCharacters() {
        assertEquals(3, 2 + 1);
    }

    @Test
    public void displayNameDemoWithEmojis() {
        assertEquals(3, 2 + 1);
    }
}
