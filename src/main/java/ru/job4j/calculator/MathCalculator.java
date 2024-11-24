package ru.job4j.calculator;

import static ru.job4j.math.MathFunction.*;

public class MathCalculator {

    public static double sumAndMultiply(double first, double second) {
        return sum(first, second)
                + multiply(first, second);
    }

    public static double minusAndDivided(double first, double second) {
        return minus(first, second)
                + divided(first, second);
    }

    public static double minusAndPlusAndMultiplyAndDivided(double first, double second) {
        return minus(first, second) + divided(first, second)
                + multiply(first, second) + divided(second, first);
    }

    public static void main(String[] args) {
        System.out.println("Результат расчета равен: " + sumAndMultiply(10, 20));
        System.out.println("Результат расчета равен: " + minusAndDivided(10, 20));
        System.out.println("Результат расчета равен: " + minusAndPlusAndMultiplyAndDivided(10, 20));
    }
}