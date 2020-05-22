package com.crud.conditional;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.condition.DisabledOnJre;
import org.junit.jupiter.api.condition.EnabledOnJre;
import org.junit.jupiter.api.condition.JRE;

public class JREConditionalTest {

    @Test
    @EnabledOnJre(value = {JRE.JAVA_8, JRE.JAVA_10})
    public void enableOnJava8AndJava10() {
        System.out.println("Only execute on Windows and Mac !!  ");
    }

    @Test
    @DisabledOnJre(value = {JRE.JAVA_8})
    public void disbleOnJava8() {
        System.out.println("Only disabled on Windows  !!  ");
    }
}
