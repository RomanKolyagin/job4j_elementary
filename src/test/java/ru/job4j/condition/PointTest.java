package ru.job4j.condition;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.*;

class PointTest {

    @Test
    void when00to20then2() {
        double expected  = 2;
        int x1 = 0;
        int y1 = 0;
        int x2 = 2;
        int y2 = 0;
        double result = Point.distance(x1, y1, x2, y2);
        assertThat(result).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    void when44to22then2dot82() {
        double expected  = 2.82;
        int x1 = 4;
        int y1 = 4;
        int x2 = 2;
        int y2 = 2;
        double result = Point.distance(x1, y1, x2, y2);
        assertThat(result).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    void whenMinus44to22then8dot48() {
        double expected  = 8.48;
        int x1 = -4;
        int y1 = -4;
        int x2 = 2;
        int y2 = 2;
        double result = Point.distance(x1, y1, x2, y2);
        assertThat(result).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    void when14to22then2dot23() {
        double expected  = 2.23;
        int x1 = 1;
        int y1 = 4;
        int x2 = 2;
        int y2 = 2;
        double result = Point.distance(x1, y1, x2, y2);
        assertThat(result).isEqualTo(expected, withPrecision(0.01));
    }
}