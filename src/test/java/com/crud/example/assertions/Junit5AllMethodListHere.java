package com.crud.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class Junit5AllMethodListHere {

    /*From JUnit5 you dont need visibility for test cases
     * i.e 1.class name do not start with public
     *     2.method name do not start with public*/


    /*   assertTrue()      Actual Value= True , Test Case will Pass
     *   assertFalse()     Actual Value= False , Test Case will Pass
     *   assertNull()      Actual Value= Null , Test Case will Pass
     *   assertNotNUll()   Actual Value= Not NULL , Test Case will Pass
     *   assertEquals()    Actual Value= Equals , Test Case will Pass
     *   assertNotEquals() Actual Value= Not Equals , Test Case will Pass
     * */

    @Test
    void test() {
        assertEquals(1, 1);
    }

    @Test
    public void assert_True_Method_overloading() {
        String password = "Asdf1234";
        assertTrue(password.equalsIgnoreCase("Asdf1234"), "Password is correct");
    }


}
