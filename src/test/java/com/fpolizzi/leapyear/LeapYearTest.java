package com.fpolizzi.leapyear;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import tudelft.leapyear.LeapYear;

public class LeapYearTest {
    @Test
    public void leapYearsThatAreNonCenturialYears() {
        tudelft.leapyear.LeapYear ly = new LeapYear();
        boolean result = ly.isLeapYear(2016);
        Assertions.assertTrue(result);
    }
}
