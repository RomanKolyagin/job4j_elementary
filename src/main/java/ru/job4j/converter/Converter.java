package ru.job4j.converter;

public class Converter {

    public static float rubleToEuro(float value) {
        return value / 70;
    }

    public static float rubleToDollar(float value) {
        return value / 60;
    }

    public static void main(String[] args) {
        float input = 140;
        float expected = 2;
        float output1 = Converter.rubleToEuro(input);
        boolean passed1 = expected == output1;
        System.out.println("140 rubles are 2 euro. Test result : " + passed1);

        input = 240;
        float expected2 = 4;
        float output2 = Converter.rubleToDollar(input);
        boolean passed2 = expected2 == output2;
        System.out.println("240 rubles are 4 dollars. Test result : " + passed2);
    }
}