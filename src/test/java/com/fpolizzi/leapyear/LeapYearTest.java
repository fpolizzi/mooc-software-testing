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

    @Test
    public void leapCenturialYears() {
        LeapYear ly = new LeapYear();
        Assertions.assertTrue(ly.isLeapYear(2000));
    }

    @Test
    public void nonLeapCenturialYears() {
        LeapYear ly = new LeapYear();
        Assertions.assertFalse(ly.isLeapYear(1500));
    }

}
