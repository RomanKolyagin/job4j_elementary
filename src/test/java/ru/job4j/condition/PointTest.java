package ru.job4j.condition;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.withPrecision;
import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class PointTest {

    @Test
    void when00to20then2() {
        int x1 = 0;
        int y1 = 0;
        int x2 = 2;
        int y2 = 0;
        double expected = 2;
        double output = Point.distance(x1, y1, x2, y2);
        assertThat(expected).isEqualTo(output, withPrecision(0.1));
    }

    @Test
    void when44to20then2Dot4() {
        int x1 = 4;
        int y1 = 4;
        int x2 = 2;
        int y2 = 0;
        double expected = 4.4;
        double output = Point.distance(x1, y1, x2, y2);
        assertThat(expected).isEqualTo(output, withPrecision(0.1));
    }

    @Test
    void whenMinus12to20then3Dot6() {
        int x1 = -1;
        int y1 = -2;
        int x2 = 2;
        int y2 = 0;
        double expected = 3.6;
        double output = Point.distance(x1, y1, x2, y2);
        assertThat(expected).isEqualTo(output, withPrecision(0.1));
    }
}