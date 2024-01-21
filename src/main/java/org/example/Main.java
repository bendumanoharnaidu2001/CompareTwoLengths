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

        System.out.println("Enter the length of l2:");
        double length2 = sc.nextDouble();
        sc.nextLine();
        System.out.println("Enter any unit of length l1: (km,m,cm,mm)");
        String unit2 = sc.nextLine();

        convertToMeter len1 = new convertToMeter(length1, unit1);
        convertToMeter len2 = new convertToMeter(length2, unit2);
        length1 = len1.convert();
        length2 = len2.convert();
        double comparevalue = Double.compare(length1, length2);
        System.out.println("Length1 is " + length1 + "m");
        System.out.println("Length2 is " + length2 + "m");
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