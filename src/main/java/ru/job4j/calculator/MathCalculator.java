package ru.job4j.calculator;

import static ru.job4j.math.MathFunction.*;

public class MathCalculator {

    public static double sumAndMultiply(double first, double second) {
        return sum(first, second)
                + multiply(first, second);
    }

    public static double residualAndDivine(double first, double second) {
        return residual(first, second)
                + divine(first, second);
    }

    public static double sumAndResidualAndMultiplyAndDivine(double first, double second) {
        return sum(first, second)
                + residual(first, second)
                + multiply(first, second)
                + divine(first, second);

    }

    public static void main(String[] args) {
        System.out.println("Результат расчета равен: " + sumAndMultiply(10, 20));
        System.out.println("Результат расчета равен: " + residualAndDivine(10, 20));
        System.out.println("Результат расчета равен: " + sumAndResidualAndMultiplyAndDivine(10, 20));
    }
}
