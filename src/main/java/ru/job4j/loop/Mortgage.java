package ru.job4j.loop;

public class Mortgage {

    public static int year(double amount, double salary, double percent) {
        int month = 0;
        while (amount > 0) {
            amount = amount + amount * percent / 100 - salary;
            month++;
        }
        return month;
    }
}
