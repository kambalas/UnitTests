package com.academy2024.task2;

import java.util.List;

public class LettersCounter {
    public long countLettersInString(char letter, String str) {
        return str.chars()
                .filter(ch -> ch == letter)
                .count();
    }

    public long countLettersInStrings(char letter, List<String> list) {
        return list.stream()
                .mapToLong(str -> countLettersInString(letter, str))
                .sum();
    }
}
