package ru.job4j.condition;

public class ChessBoard {
    public static int way(int x1, int y1, int x2, int y2) {
        int rsl = 0;
        if (isValid(x1) && isValid(y1) && isValid(x2) && isValid(y2)) {
            if (Math.abs(x2 - x1) == Math.abs(y2 - y1)) {
                rsl = Math.abs(x2 - x1);
            }
        }
        return rsl;
    }

    public static boolean isValid(int coordinate) {
        return coordinate >= 0 && coordinate <= 7;
    }

    public static void main(String[] args) {
        System.out.println(way(0, 0, 5, 5));
        System.out.println(way(5, 3, 2, 0));
        System.out.println(way(9, 9, 0, 0));
        System.out.println(way(0, 1, 0, 0));
    }
}
