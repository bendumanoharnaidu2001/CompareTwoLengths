package org.example;

import java.util.Locale;

public class convert {
    double length;
    String unit;

    public convert(double length, String unit) {
        this.length = length;
        this.unit = unit;

    }
    public double convertToMeters() {
        switch (unit) {
            case "km":
                length = length * 1000;
                break;
            case "cm":
                length = length / 100;
                break;
            case "mm":
                length = length / 1000;
                break;
            default:
                break;
        }
        return length;
    }
    public double convertToCm() {
        switch (unit) {
            case "km":
                length = length * 100000;
                break;
            case "m":
                length = length * 100;
                break;
            case "mm":
                length = length / 10;
                break;
            default:
                break;
        }
        return length;
    }
    public double convertTomm() {
        switch (unit) {
            case "km":
                length = length * 1000000;
                break;
            case "m":
                length = length * 1000;
                break;
            case "cm":
                length = length * 10;
                break;
            default:
                break;
        }
        return length;
    }
    public double convertToKm() {
        switch (unit) {
            case "m":
                length = length / 1000;
                break;
            case "cm":
                length = length / 100000;
                break;
            case "mm":
                length = length / 1000000;
                break;
            default:
                break;
        }
        return length;
    }
}
