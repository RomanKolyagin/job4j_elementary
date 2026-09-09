package ru.job4j.loop;

public class Factorial {
    public static int calculated(int number) {
        int result = 1;
        for (int index = 1; index <= number; index++) {
            result = result * index;
        }
        return result;
    }
}