package ru.job4j.condition;

public class Max {
    public static int max(int left, int right) {
        return left > right ? left : right;
    }

    public static int max(int left, int right, int third) {
        return max(left, max(right, third));
    }

    public static int max(int left, int right, int third, int forth) {
        return max(left, max(right, third, forth));
    }

    public static void main(String[] args) {
    int a = Max.max(5, 1);
        System.out.println(a);
    }
}
