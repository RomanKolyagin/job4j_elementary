package ru.job4j.calculator;

import static ru.job4j.math.MathFunction.*;

public class MathCalculator {

    public static double sumAndMultiply(double first, double second) {
        return sum(first, second)
                + multiply(first, second);
    }

    public static double minusAndDivision(double first, double second) {
        return minus(first, second)
                + division(first, second);
    }

    public static double sumAndMultiplyAndMinusAndDivision(double first, double second) {
        return sum(first, second)
                + multiply(first, second)
                + minus(first, second)
                + division(first, second);
    }

    public static void main(String[] args) {
        System.out.println("Результат расчет равн: " + sumAndMultiply(10, 20));
        System.out.println("Результат расчет равн: " + minusAndDivision(10, 20));
        System.out.println("Результат расчет равн: " + sumAndMultiplyAndMinusAndDivision(10, 20));
    }
}
