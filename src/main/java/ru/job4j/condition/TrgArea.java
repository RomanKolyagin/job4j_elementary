package ru.job4j.condition;

import static java.lang.Math.sqrt;

public class TrgArea {

    public static double area(double a, double b, double c) {
        double p = (a + b + c) / 2;
        return sqrt(p * (p * a) * (p - b) * (p - c));
    }

    public static void main(String[] args) {
        double rsl = area(2, 2, 2);
        System.out.println("area (2, 2, 2) = " + rsl);
    }
}