package org.example;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello World!");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of l1:");
        double length1 = sc.nextDouble();
        sc.nextLine();
        System.out.println("Enter any unit of length l1:(km,m,cm,mm)");
        String unit1 = sc.nextLine();
        unit1 = unit1.toLowerCase();

        System.out.println("Enter the length of l2:");
        double length2 = sc.nextDouble();
        sc.nextLine();
        System.out.println("Enter any unit of length l1: (km,m,cm,mm)");
        String unit2 = sc.nextLine();
        unit2 = unit2.toLowerCase();

        convert len1 = new convert(length1, unit1);
        convert len2 = new convert(length2, unit2);

        if(unit2.equals("m")) {
            length1 = len1.convertToMeters();
            length2 = len2.convertToMeters();
        }
        else if(unit2.equals("cm")) {
//            convert len1 = new convert(length1, unit1);
//            convert len2 = new convert(length2, unit2);
            length1 = len1.convertToCm();
            length2 = len2.convertToCm();
        }
        else if(unit2.equals("mm")) {
//            convert len1 = new convert(length1, unit1);
//            convert len2 = new convert(length2, unit2);
            length1 = len1.convertTomm();
            length2 = len2.convertTomm();
        }
        else if(unit2.equals("km")) {
//            convert len1 = new convert(length1, unit1);
//            convert len2 = new convert(length2, unit2);
            length1 = len1.convertToKm();
            length2 = len2.convertToKm();
        }
        else {
            System.out.println("Invalid unit");
        }

        double comparevalue = Double.compare(length1, length2);
        System.out.println("Length1 is " + length1 + unit2);
        System.out.println("Length2 is " + length2 + unit2);
        System.out.println("compare is " + comparevalue);

        if(comparevalue == 0) {
            System.out.println("Length1 is equal to Length2");
        } else if (comparevalue > 0) {
            System.out.println("Length1 is greater than Length2");
        } else {
            System.out.println("Length2 is greater than Length1");
        }

    }
}