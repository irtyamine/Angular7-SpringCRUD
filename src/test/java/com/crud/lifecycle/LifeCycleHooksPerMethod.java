package com.crud.lifecycle;

import org.junit.jupiter.api.*;

@TestInstance(TestInstance.Lifecycle.PER_METHOD)
public class LifeCycleHooksPerMethod {

    @BeforeAll // Note: static keyword is used here
    public static void beforeAll() {
        System.out.println("@BeforeAll got executed !!!");
    }

    public LifeCycleHooksPerMethod() {
        System.out.println("Constructor got executed !!!");
    }

    @BeforeEach
    public void beforeEach() {
        System.out.println("@BeforeEach got executed !!!");
    }

    @Test
    public void testOne() {
        System.out.println("testOne() got executed !!!");
    }

    @Test
    public void testTwo() {
        System.out.println("testTwo() got executed !!!");
    }

    @AfterEach
    public void afterEach() {
        System.out.println("@AfterEach got executed !!!");
    }

    @AfterAll // Note: static keyword is used here
    public static void afterAll() {
        System.out.println("@AfterAll got executed !!!");
    }
}
