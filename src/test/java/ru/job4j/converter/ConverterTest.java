package ru.job4j.converter;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.*;

class ConverterTest {

    @Test
    void whenConvert200RblThen2dot8571Euro() {
        float input = 200;
        float output = Converter.rubleToEuro(input);
        float expected = 2.8571F;
        float value = 0.0001f;
        assertThat(output).isEqualTo(expected, withPrecision(value));
    }

    @Test
    void whenConvert180RblThen3Dollar() {
        float input = 180;
        float output = Converter.rubleToDollar(input);
        float expected = 3;
        float value = 0.0001f;
        assertThat(output).isEqualTo(expected, withPrecision(value));
    }
}