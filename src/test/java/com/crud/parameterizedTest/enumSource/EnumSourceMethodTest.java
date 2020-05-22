package com.crud.parameterizedTest.enumSource;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.EnumSource;
import org.junit.jupiter.params.provider.EnumSource.Mode;

import static org.junit.jupiter.api.Assertions.assertNotNull;

public class EnumSourceMethodTest {

    @ParameterizedTest
    @EnumSource(value = Animal.class)
    public void enumSourceDemoTest(Animal animal) {
        assertNotNull(animal);
    }

    @ParameterizedTest
    @EnumSource(value = Animal.class, names = {"DOG", "CAT"})
    public void enumSourceDemoWithNamesTest(Animal animal) {
        assertNotNull(animal);
    }

    @ParameterizedTest
    @EnumSource(value = Animal.class, mode = Mode.EXCLUDE, names = {"DOG", "CAT"})
    public void enumSourceDemoWithExcludeModeTest(Animal animal) {
        assertNotNull(animal);
    }

    @ParameterizedTest
    @EnumSource(value = Animal.class, mode = Mode.MATCH_ALL, names = "^(C|L).+$")
    public void enumSourceDemoWithMatchAllModeTest(Animal animal) {
        assertNotNull(animal);
    }
}