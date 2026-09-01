package ru.job4j.condition;

import org.junit.Test;
import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

public class LogicNotTest {

    @Test
    public void whenIsEvenTrue() {
        int num = 2;
        boolean result = LogicNot.isEven(num);
        assertThat(result).isTrue();
    }

    @Test
    public void whenIsEvenFalse() {
        int num = 3;
        boolean result = LogicNot.isEven(num);
        assertThat(result).isFalse();
    }

    @Test
    public void whenIsPositiveTrue() {
        int num = 2;
        boolean result = LogicNot.isPositive(num);
        assertThat(result).isTrue();
    }

    @Test
    public void whenIsPositiveFalse() {
        int num = -2;
        boolean result = LogicNot.isPositive(num);
        assertThat(result).isFalse();
    }

    @Test
    public void whenNumIs0IsPositiveFalse() {
        int num = 0;
        boolean result = LogicNot.isPositive(num);
        assertThat(result).isFalse();
    }

    @Test
    public void whenNotEvenFalse() {
        int num = 2;
        boolean result = LogicNot.notEven(num);
        assertThat(result).isFalse();
    }

    @Test
    public void whenNotEvenTrue() {
        int num = 3;
        boolean result = LogicNot.notEven(num);
        assertThat(result).isTrue();
    }

    @Test
    public void whenNegativeTrue() {
        int num = -2;
        boolean result = LogicNot.isNegative(num);
        assertThat(result).isTrue();
    }

    @Test
    public void whenNegativeFalse() {
        int num = 2;
        boolean result = LogicNot.isNegative(num);
        assertThat(result).isFalse();
    }

    @Test
    public void whenNumIs0NegativeFalse() {
        int num = 0;
        boolean result = LogicNot.isNegative(num);
        assertThat(result).isFalse();
    }

    @Test
    public void whenNotEvenAndPositiveIsTrue() {
        int num = 3;
        boolean result = LogicNot.notEvenAndPositive(num);
        assertThat(result).isTrue();
    }

    @Test
    public void whenNotEvenFalseIsAllFalse() {
        int num = 2;
        boolean result = LogicNot.notEvenAndPositive(num);
        assertThat(result).isFalse();
    }

    @Test
    public void whenPositiveFalseIsAllFalse() {
        int num = -3;
        boolean result = LogicNot.notEvenAndPositive(num);
        assertThat(result).isFalse();
    }

    @Test
    public void whenNotEvenAndPositiveIsFalse() {
        int num = 0;
        boolean result = LogicNot.notEvenAndPositive(num);
        assertThat(result).isFalse();
    }

    @Test
    public void whenEvenOrNegativeIsTrue() {
        int num = -2;
        boolean result = LogicNot.evenOrNegative(num);
        assertThat(result).isTrue();
    }

    @Test
    public void whenEvenIsTrueThenAllIsTrue() {
        int num = 2;
        boolean result = LogicNot.evenOrNegative(num);
        assertThat(result).isTrue();
    }

    @Test
    public void whenNegativeIsTrueThenAllIsTrue() {
        int num = -3;
        boolean result = LogicNot.evenOrNegative(num);
        assertThat(result).isTrue();
    }

    @Test
    public void whenEvenOrNegativeIsFalse() {
        int num = 3;
        boolean result = LogicNot.evenOrNegative(num);
        assertThat(result).isFalse();
    }
}