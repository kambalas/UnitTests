package com.academy2024.task2;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
@ExtendWith(MockitoExtension.class)
class LettersCounterTest {
    @InjectMocks
    private LettersCounter lettersCounter;

    @Test
    public void countLettersInString_shouldReturnCorrectNumber_withOneOccurrence() {
        assertThat(1).isEqualTo(lettersCounter.countLettersInString('a', "labs"));

    }

    @Test
    public void countLettersInString_shouldReturnCorrectNumber_withMultipleOccurrences() {
        assertThat(2).isEqualTo(lettersCounter.countLettersInString('a', "labas"));
    }

    @Test
    public void countLettersInString_shouldReturnZero_withNoOccurrences() {
        assertThat(0).isEqualTo(lettersCounter.countLettersInString('a', "Ugnius"));
    }

    @Test
    public void countLettersInString_shouldReturnZero_withStringIsEmpty() {
        assertThat(0).isEqualTo(lettersCounter.countLettersInString('a', ""));
    }

    @Test
    public void countLettersInStrings_shouldReturnZero_withStringIsEmpty() {
        assertThat(0).isEqualTo(lettersCounter.countLettersInStrings('a', List.of("", "", "")));
    }

}