package ru.job4j.condition;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

class MaxTest {

    @Test
    void leftMax() {
        int left = 10;
        int right = 12;
        int result = Max.max(left, right);
        int expected = 12;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void rightMax() {
        int left = 12;
        int right = 10;
        int result = Max.max(left, right);
        int expected = 12;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void leftExactlyRight() {
        int left = 12;
        int right = 12;
        int result = Max.max(left, right);
        int expected = 12;
        assertThat(result).isEqualTo(expected);
    }
}