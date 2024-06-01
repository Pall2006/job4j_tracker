package ru.job4j.ex;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class FactorialTest {

     @Test
    public void whenException() {
        IllegalArgumentException exception = assertThrows(
                IllegalArgumentException.class,
                () -> {
                    Factorial factorial = new Factorial();
                    factorial.calc(-5);
                });
        assertThat(exception.getMessage()).isEqualTo("Number could not be less than 0");
    }

    @Test
    public void whenFactorialEquals72() {
    int number = 4;
    int expected = 24;
    Factorial factorial = new Factorial();
    int result = factorial.calc(number);
    assertThat(result).isEqualTo(expected);
    }
}
