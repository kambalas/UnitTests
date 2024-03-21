package com.academy2024.task1;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class CalculatorTest {

    @InjectMocks
    private Calculator calculator;
    //addNumber
    @Test
    public void addNumber_shouldReturnCorrectSum_withPositiveNumbers() {
        assertThat(4).isEqualTo(calculator.addNumber(2, 2));
    }

    @Test
    public void addNumber_shouldReturnCorrectSum_withNegativeNumbers() {
        assertThat(-4).isEqualTo(calculator.addNumber(-2, -2));
    }

    @Test
    public void addNumber_shouldReturnCorrectSum_withZeroAndNegativeNumbers() {
        assertThat(-2).isEqualTo(calculator.addNumber(0, -2));
    }

    //subtractNumber
    @Test
    public void subtractNumbers_shouldReturnCorrectValue_withPositiveNumbers() {
        assertThat(0).isEqualTo(calculator.subtractNumber(2, 2));
    }

    @Test
    public void subtractNumbers_shouldReturnCorrectValue_withNegativeNumbers() {
        assertThat(0).isEqualTo(calculator.subtractNumber(-2, -2));
    }

    @Test
    public void subtractNumbers_shouldReturnCorrectValue_withZeroAndNegativeNumbers() {
        assertThat(2).isEqualTo(calculator.subtractNumber(0, -2));
    }

    //multiplyNumber
    @Test
    public void multiplyNumbers_shouldReturnCorrectValue_withZeroAndNegativeNumbers() {
        assertThat(0).isEqualTo(calculator.multiplyNumber(0, -2));
    }

    @Test
    public void multiplyNumbers_shouldReturnCorrectNumber_withPositiveNumbers() {
        assertThat(4).isEqualTo(calculator.multiplyNumber(2, 2));
    }

    @Test
    public void multiplyNumbers_shouldReturnCorrectValue_withNegativeNumbers() {
        assertThat(4).isEqualTo(calculator.multiplyNumber(-2, -2));
    }

    //divideNumber
    @Test
    public void divideNumbers_shouldReturnCorrectNumber_withPositiveNumbers() {
        assertThat(1).isEqualTo(calculator.divideNumber(2, 2));
    }

    @Test
    public void divideNumbers_shouldReturnCorrectValue_withNegativeNumbers() {
        assertThat(1).isEqualTo(calculator.divideNumber(-2, -2));
    }

    @Test
    public void divideNumbers_shouldReturnCorrectValue_withZeroNumber() {
        assertThat(0).isEqualTo(calculator.divideNumber(0, -2));
    }

    //bonus
    @Test
    public void divideNumbers_shouldReturnException_whenDividingByZero() {
       assertThrows(ArithmeticException.class, () -> {
            calculator.divideNumber(2, 0);
       });
    }

    //findRemainder
    @Test
    public void findRemainder_shouldReturnCorrectNumber_withPositiveNumbers() {
        assertThat(0).isEqualTo(calculator.findRemainder(2, 2));
    }

    @Test
    public void findRemainder_shouldReturnCorrectValue_withNegativeNumbers() {
        assertThat(0).isEqualTo(calculator.findRemainder(-2, -2));
    }

    @Test
    public void findRemainder_shouldReturnCorrectValue_withZeroNumber() {
        assertThat(0).isEqualTo(calculator.findRemainder(0, -2));
    }

    @Test
    public void findRemainder_shouldReturnException_whenDividingByZero() {
        assertThrows(ArithmeticException.class, () -> {
            calculator.findRemainder(2, 0);
        });
    }
}
