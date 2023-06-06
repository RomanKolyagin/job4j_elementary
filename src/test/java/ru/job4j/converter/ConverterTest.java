package ru.job4j.converter;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;

public class ConverterTest {

    @Test
    public void whenConvert240RubleThen4Dollar() {
        float in = 240;
        float expected = 4;
        float out = Converter.rubleToDollar(in);
        float eps = 0.0001f;
        Assertions.assertEquals(expected, out, eps);
    }

    @Test
    public void whenConvert140RubleThen2Euro() {
        float in = 140;
        float expected = 2;
        float out = Converter.rubleToEuro(in);
        float eps = 0.0001f;
        Assertions.assertEquals(expected, out, eps);
    }
}