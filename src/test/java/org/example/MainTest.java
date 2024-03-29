package org.example;

import org.junit.Test;

import static org.junit.Assert.*;

public class MainTest {

    @org.junit.Test
    public void main() {
        convert len1 = new convert(1, "km");
        convert len2 = new convert(1000, "m");
        double length1 = len1.convertToMeters();
        double length2 = len2.convertToMeters();
        assertEquals(length1, length2, 0.001);
    }
    @Test
    public void main1() {
        convert len1 = new convert(1, "km");
        convert len2 = new convert(100, "m");
        double length1 = len1.convertToMeters();
        double length2 = len2.convertToMeters();
        assertNotEquals(length1, length2, 0.001);
    }
    @Test
    public void main2() {
        convert len1 = new convert(1, "km");
        convert len2 = new convert(100000, "cm");
        double length1 = len1.convertToCm();
        double length2 = len2.convertToCm();
        assertEquals(length1, length2, 0.001);
    }
}