package ru.job4j.condition;

public class LeapYear {
    public static boolean checkYear(int year) {
        if (year % 100 == 0) {
            return false;
        }
        if (year % 400 == 0 || year % 4 == 0) {
            return true;
        }
        else {
            return false;
        }
    }
}
