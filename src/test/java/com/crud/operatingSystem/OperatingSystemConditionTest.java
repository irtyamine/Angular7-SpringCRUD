package com.crud.operatingSystem;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.condition.DisabledOnOs;
import org.junit.jupiter.api.condition.EnabledOnOs;
import org.junit.jupiter.api.condition.OS;

public class OperatingSystemConditionTest {

    @Test
    @EnabledOnOs(value = {OS.WINDOWS, OS.MAC})
    public void enableOnWindowsAndMac() {
        System.out.println("Only execute on Windows and Mac !!  ");
    }

    @Test
    @DisabledOnOs(value = {OS.WINDOWS})
    public void disbleOnWindowsAndMac() {
        System.out.println("Only disabled on Windows  !!  ");
    }
}
