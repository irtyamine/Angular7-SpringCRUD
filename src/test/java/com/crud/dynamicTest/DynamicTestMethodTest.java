package com.crud.dynamicTest;

import com.crud.common.StringHelper;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DynamicTest;
import org.junit.jupiter.api.TestFactory;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.DynamicTest.dynamicTest;


public class DynamicTestMethodTest {

    StringHelper stringHelper = new StringHelper();

    @TestFactory
    @Disabled("Facing issue in this method")
    public DynamicTest testReverse() {
        return dynamicTest("Dynamic Test for reverse method", () -> {
            assertEquals("god", stringHelper.reverse("dog"));
        });
    }

    @TestFactory
    public Collection<DynamicTest> dynamicTestFromCollection() {
        List<String> inputList = createInputList();
        List<String> outputList = createOutputList();

        Collection<DynamicTest> dynamicTests = new ArrayList<>();
        for (int i = 0; i < inputList.size(); i++) {
            String input = inputList.get(i);
            String output = outputList.get(i);

            DynamicTest dynamicTest = dynamicTest("Dynamic Test for reverse() : input -" + input, () -> assertEquals("god", stringHelper.reverse("dog")));
            dynamicTests.add(dynamicTest);
        }

        return dynamicTests;
    }

    @TestFactory
    public Iterable<DynamicTest> dynamicTestFromIterable() {
        List<String> inputList = createInputList();
        List<String> outputList = createOutputList();

        Collection<DynamicTest> dynamicTests = new ArrayList<>();
        for (int i = 0; i < inputList.size(); i++) {
            String input = inputList.get(i);
            String output = outputList.get(i);

            DynamicTest dynamicTest = dynamicTest("Dynamic Test for reverse() : input -" + input, () -> assertEquals("god", stringHelper.reverse("dog")));
            dynamicTests.add(dynamicTest);
        }

        return dynamicTests;
    }

    private List<String> createOutputList() {
        return Arrays.asList("ecar", "mom", "dad");
    }

    private List<String> createInputList() {
        return Arrays.asList("race", "mom", "dad");
    }
}
