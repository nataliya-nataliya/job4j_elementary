package ru.job4j.loop;

public class Mortgage {
    public static int year(double amount, double salary, double percent) {
        int year = 0;
        percent = percent * 0.01;
        double a = 1;
        while (a > 0) {
             a =  (amount * percent + amount) - salary;
            amount = a;
            year++;
        }
        return year;
    }

}
