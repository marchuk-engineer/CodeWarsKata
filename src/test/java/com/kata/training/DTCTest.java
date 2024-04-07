package com.kata.training;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class DTCTest {

    @Test
    @DisplayName("All methods tested")
    void testAllMethods() {
        assertEquals(0.02, DTC.toIndustrial(1));
        assertEquals(0.03, DTC.toIndustrial(2));
        assertEquals(1.75, DTC.toIndustrial(105));
        assertEquals(0.05, DTC.toIndustrial("0:03"));
        assertEquals(0.07, DTC.toIndustrial("0:04"));
        assertEquals(1.75, DTC.toIndustrial("1:45"));
        assertEquals("1:45", DTC.toNormal(1.75));
        assertEquals("0:20", DTC.toNormal(0.33));
        assertEquals("70:00", DTC.toNormal(69.99373876));
    }
}
