package org.example;

import org.junit.Test;

import static org.junit.Assert.*;

public class convertTest {
    @Test
    public void convert() {
        convert len1 = new convert(1, "KM");
        convert len2 = new convert(100, "M");
        double length1 = len1.convertToMeters();
        double length2 = len2.convertToMeters();
        assertNotEquals(length1, length2, 0.001);
    }

    @org.junit.Test
    public void convert1() {
        convert len1 = new convert(1, "km");
        convert len2 = new convert(1000, "m");
        double length1 = len1.convertToMeters();
        double length2 = len2.convertToMeters();
        assertEquals(length1, length2, 0.001);
    }
    @Test
    public void convert2() {
        convert len1 = new convert(1, "km");
        convert len2 = new convert(100, "m");
        double length1 = len1.convertToMeters();
        double length2 = len2.convertToMeters();
        assertNotEquals(length1, length2, 0.001);
    }
    @Test
    public void convert3() {
        convert len1 = new convert(1, "km");
        convert len2 = new convert(100000, "cm");
        double length1 = len1.convertToCm();
        double length2 = len2.convertToCm();
        assertEquals(length1, length2, 0.001);
    }
    @Test
    public void convert4() {
        convert len1 = new convert(1, "km");
        convert len2 = new convert(1000, "mm");
        double length1 = len1.convertTomm();
        double length2 = len2.convertTomm();
        assertNotEquals(length1, length2, 0.001);
    }
}