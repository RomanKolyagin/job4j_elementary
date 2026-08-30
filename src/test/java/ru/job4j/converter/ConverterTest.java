package ru.job4j.converter;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.assertj.core.api.BDDAssertions.withPrecision;
import static org.junit.jupiter.api.Assertions.*;

class ConverterTest {

    @Test
    void whenConvert180RblThen3Dollar() {
        float in = 180;
        float expected = 3;
        float output = Converter.rubleToDollar(in);
        float value = 0.0001f;
        assertThat(output).isEqualTo(expected, withPrecision(value));
    }

    @Test
    void whenConvert210RblThen3Euro() {
        float in = 210;
        float expected = 3;
        float output = Converter.rubleToEuro(in);
        float value = 0.0001f;
        assertThat(output).isEqualTo(expected, withPrecision(value));
    }
}