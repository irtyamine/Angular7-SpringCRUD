package com.crud.displayName;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

@DisplayName("@DisplayName annotation demo")
public class DisplayNameMethod {

    @Test
    @DisplayName("@DisplayName demo test")
    public void displayNameDemoTest() {
        assertEquals(3, 2 + 1);
    }

    @Test
    @DisplayName("@DisplayName demo with spaces")
    public void displayNameDemoWithSpaces() {
        assertEquals(3, 2 + 1);
    }

    @Test
    @DisplayName("@DisplayName demo with ╯°□°）╯ @!~ special characters")
    public void displayNameDemoWithSpecialCharacters() {
        assertEquals(3, 2 + 1);
    }

    @Test
    @DisplayName("@DisplayName demo with emojis - 😱")
    public void displayNameDemoWithEmojis() {
        assertEquals(3, 2 + 1);
    }
}
