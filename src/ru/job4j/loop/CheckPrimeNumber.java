package ru.job4j.loop;

public class CheckPrimeNumber {
    public static boolean check(int number) {
        boolean prime = number > 1;
        for (int d = 2; d < number; d++) {
            if (number % d == 0) {
                prime = false;
                break;
            }
        }
        return prime;
    }
}
