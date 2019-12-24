package com.fpolizzi.roman;

public class RomanNumeralTest {
    RomanNumeral roman = new RomanNumeral();

    public static void main(String[] args) {
        RomanNumeral roman = new RomanNumeral();

        int test = roman.convert("VII");
        System.out.println(test);
    }
}
