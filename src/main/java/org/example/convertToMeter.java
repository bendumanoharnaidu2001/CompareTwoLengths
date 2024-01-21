package org.example;

public class convertToMeter {
    double length;
    String unit;

    public convertToMeter(double length, String unit) {
        this.length = length;
        this.unit = unit;
    }
    public double convert() {
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
}
