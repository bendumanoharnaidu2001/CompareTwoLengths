package org.example;

import org.junit.Test;

import static org.junit.Assert.*;

public class convertToMeterTest {

    @org.junit.Test
    public void convert1() {
        convertToMeter len1 = new convertToMeter(1, "km");
        convertToMeter len2 = new convertToMeter(1000, "m");
        double length1 = len1.convert();
        double length2 = len2.convert();
        assertEquals(length1, length2, 0.001);
    }
    @Test
    public void convert2() {
        convertToMeter len1 = new convertToMeter(1, "km");
        convertToMeter len2 = new convertToMeter(100, "m");
        double length1 = len1.convert();
        double length2 = len2.convert();
        assertNotEquals(length1, length2, 0.001);
    }
    @Test
    public void convert3() {
        convertToMeter len1 = new convertToMeter(1, "km");
        convertToMeter len2 = new convertToMeter(100000, "cm");
        double length1 = len1.convert();
        double length2 = len2.convert();
        assertEquals(length1, length2, 0.001);
    }
}