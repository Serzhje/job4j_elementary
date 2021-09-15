package ru.job4j.condition;

public class ChessBoard {

    public static int way(int x1, int y1, int x2, int y2) {

        if ((x1 < 0 || x1 > 7) || (y1 < 0 || y1 > 7) || (x2 < 0 || x2 > 7) || (y2 < 0 || y2 > 7)
                || (Math.abs(x1 - x2) != Math.abs(y1 - y2))) {
            return 0;
        }
        return Math.abs(x1 - x2);
    }

    public static void main(String[] args) {

        System.out.println(ChessBoard.way(4, 3, 1, 6));
        System.out.println(ChessBoard.way(1, 0, 7, 5));
        System.out.println(ChessBoard.way(-1, 0, 7, 6));
        System.out.println(ChessBoard.way(1, 0, 9, 6));
    }
}
