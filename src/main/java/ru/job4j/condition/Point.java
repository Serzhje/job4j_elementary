package ru.job4j.condition;

//import static java.lang.Math.pow;

public class Point {
    public static double distance(int x1, int y1, int x2, int y2) {
        double rsl = Math.sqrt((Math.pow(x2 - x1, 2)) + (Math.pow(y2 - y1, 2)));
        return rsl;
    }

    public static void main(String[] args) {
        double result = Point.distance(0, 0, 2, 0);
        System.out.println("result (0, 0) to (2, 0)  " + result);

        result = Point.distance(2, 2, 5, 1);
        System.out.println("result (2, 2) to (5, 1)  " + result);

        result = Point.distance(1, 6, 3, 4);
        System.out.println("result (1, 6) to (3, 4)  " + result);
    }
}
