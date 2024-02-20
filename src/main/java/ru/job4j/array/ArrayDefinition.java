package ru.job4j.array;

import java.util.Arrays;

public class ArrayDefinition {

    public static void main(String[] args) {
        short[] ages = new short[10];
        System.out.println("Размер массива равен: " + ages.length);
        String[] surnames = new String[100500];
        System.out.println("Размер массива равен: " + surnames.length);
        float[] prices = new float[40];
        System.out.println("Размер массива равен: " + prices.length);

        String[] names = new String[3];
        names[0] = "Petr Arsentev";
        names[1] = "Roman Kolyagin";
        names[2] = "Bogdan Ark";
        System.out.println(Arrays.toString(names));
    }
}
