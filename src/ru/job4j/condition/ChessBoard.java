package ru.job4j.condition;

public class ChessBoard {
    public static int way(int x1, int y1, int x2, int y2) {
        int x = Math.abs(x2 - x1);
        int y = Math.abs(y2 - y1);
        return x == y ? x : 0;
    }
}

