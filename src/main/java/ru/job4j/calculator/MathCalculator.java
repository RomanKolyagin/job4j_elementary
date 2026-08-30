package ru.job4j.calculator;

public class MathCalculator {

    public static double sumAndMultiply(double a, double b) {
        return ru.job4j.math.MathFunction.sum(a, b)
                + ru.job4j.math.MathFunction.multiply(a, b);
    }

    public static double subAndDivide(double a, double b) {
        return ru.job4j.math.MathFunction.subtract(a, b)
                + ru.job4j.math.MathFunction.divide(a, b);
    }

    public static double allOperation(double a, double b) {
        return ru.job4j.math.MathFunction.multiply(a, b)
                + ru.job4j.math.MathFunction.divide(a, b)
                + ru.job4j.math.MathFunction.sum(a, b)
                + ru.job4j.math.MathFunction.subtract(a, b);

    }

    public static void main(String[] args) {
        System.out.println("Результат расчета равен: " + sumAndMultiply(10, 20));
        System.out.println("Результат расчета равен: " + subAndDivide(10, 20));
        System.out.println("Результат расчета равен: " +  allOperation(10, 20));
    }
}
