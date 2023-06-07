package ru.job4j.condition;

import org.junit.Test;
import org.junit.Assert;
import static ru.job4j.condition.SqArea.*;

public class SqAreaTest {

    @Test
    public void whenP6K2Square2() {
        int expected = 2;
        int p = 6;
        double k = 2;
        double out = square(p, k);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void whenP4K1Square1() {
        int expected = 1;
        int p = 4;
        double k = 1;
        double out = square(p, k);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void whenP12K20Square1dot63() {
        double expected = 1.63;
        int p = 12;
        double k = 20;
        double out = square(p, k);
        Assert.assertEquals(expected, out, 0.01);
    }
}