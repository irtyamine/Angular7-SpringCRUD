package com.crud.lifecycle;

import org.junit.jupiter.api.*;

@TestInstance(TestInstance.Lifecycle.PER_METHOD)
public class LifeCycleHooksPerMethodTest {

    @BeforeAll // Note: static keyword is used here
    public static void beforeAll() {
        System.out.println("@BeforeAll got executed !!!");
    }

    public LifeCycleHooksPerMethodTest() {
        System.out.println("Constructor got executed !!! ====> It will create Test class instance for every test method");
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
