package ru.job4j.loop;

public class Counter {
    public static int sum(int start, int finish) {
        int sum = 0;
        for (int a = start; start <= finish; start++) {
            sum = sum + start;
        }
        return sum;
    }

    public static int sumByEven(int start, int finish) {
        int sum = 0;
        for (int a = start; start <= finish; start++) {
            if (start % 2 == 0) {
                sum = sum + start ;
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(sum(0, 10));
        System.out.println(sum(3, 8));
        System.out.println(sum(1, 1));

        System.out.println(sumByEven(0, 10));
        System.out.println(sumByEven(3, 8));
        System.out.println(sumByEven(1, 1));
    }
}
//В этом задании нужно написать программу, которая будет подсчитывать сумму чисел от start до finish.

//Например, start = 0, finish = 5. Нужно сложить числа: 0, 1, 2, 3, 4, 5. Ответ будет 15.