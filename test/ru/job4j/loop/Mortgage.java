package ru.job4j.loop;

public class Mortgage {
    public static int year(double amount, double salary, double percent) {
        int year = 1;
        percent = percent * 0.01;
        while ((amount * percent + amount) - salary > 0) {
            amount = (amount * percent + amount) - salary;
            year++;
        }
        return year;
    }

}
