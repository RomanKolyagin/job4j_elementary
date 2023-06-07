package ru.job4j.calculator;

import org.junit.Test;
import org.junit.Assert;
import static ru.job4j.calculator.Fit.*;

public class FitTest {

    @Test
    public void whenMan180Then92() {
        short in = 180;
        double expected = 92;
        double out = manWeight(in);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void whenWoman155Then51dot74() {
        short in = 155;
        double expected = 51.74;
        double out = womanWeight(in);
        Assert.assertEquals(expected, out, 0.01);
    }
}