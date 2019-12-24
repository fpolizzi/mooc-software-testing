package com.fpolizzi.roman;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RomanNumeralTest {

    @Test
    void singleNumber() {
        RomanNumeral roman = new RomanNumeral();
        int result = roman.convert("I");

        Assertions.assertEquals(1,result);
    }

    @Test
    void numberWithManyDigits() {
        RomanNumeral roman = new RomanNumeral();
        int result = roman.convert("VIII");

        Assertions.assertEquals(8, result);
    }
}