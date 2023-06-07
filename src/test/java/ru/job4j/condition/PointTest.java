package ru.job4j.condition;


import org.junit.Test;
import org.junit.Assert;
import static ru.job4j.condition.Point.*;

public class PointTest {
    @Test
    public void when00to20then2() {
        double expected = 2;
        int x1 = 0;
        int y1 = 0;
        int x2 = 2;
        int y2 = 0;
        double out = distance(x1, y1, x2, y2);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void  when00to22then2dot82() {
        double expected = 2.82;
        int x1 = 0;
        int y1 = 0;
        int x2 = 2;
        int y2 = 2;
        double out = distance(x1, y1, x2, y2);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void  when22to22then0() {
        double expected = 0;
        int x1 = 2;
        int y1 = 2;
        int x2 = 2;
        int y2 = 2;
        double out = distance(x1, y1, x2, y2);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void  when64to22then4dot47() {
        double expected = 4.47;
        int x1 = 6;
        int y1 = 4;
        int x2 = 2;
        int y2 = 2;
        double out = distance(x1, y1, x2, y2);
        Assert.assertEquals(expected, out, 0.01);
    }
}