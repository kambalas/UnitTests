package com.academy2024.task4;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;


class InputValidatorTest {

    @ParameterizedTest
    @ValueSource(ints = {1, 3, 5, -3, 15, Integer.MAX_VALUE})
    void isEven_ShouldReturnFalseForOddNumbers(int number) {
    }

    @ParameterizedTest
    @ValueSource(ints = {8, 146, Integer.MAX_VALUE - 1})
    void isEven_ShouldReturnTrueForEvenNumbers(int number) {
    }

    @ParameterizedTest
    @ValueSource(strings = {"a", "0"})
    void isBlank_ShouldReturnFalseForNonBlankStrings(String input) {
    }

    @ParameterizedTest
    @ValueSource(strings = {"", "  "})
    void isBlank_ShouldReturnTrueForEmptyOrBlankStrings(String input) {
    }

//    @ParameterizedTest
//    @MethodSource("emailAddressList")
//    public void isValidEmail_ShouldReturnTrueForValidStrings(String emailAddress) {
//    }
//
//    @ParameterizedTest
//    @MethodSource("phoneNumbersList")
//    public void isValidPhoneNumber_ShouldReturnTrueForValidPhoneNumbers(String phoneNumber) {
//    }
}