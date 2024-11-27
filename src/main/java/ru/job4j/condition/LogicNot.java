package ru.job4j.condition;

public class LogicNot {

    public static boolean isEven(int num) {
        return num % 2 == 0;
    }

    public static boolean isPositive(int num) {
        return num > 0;
    }

    public static boolean notEven(int num) {
        return !isEven(num);
    }

    public static boolean isNegative(int num) {
        return num < 0;
    }

    public static boolean notEvenAndPositive(int num) {
        return isPositive(num) && !isEven(num);
    }

    public static boolean evenOrNegative(int num) {
        return isNegative(num) || isEven(num);
    }
}