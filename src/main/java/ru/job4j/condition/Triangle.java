package ru.job4j.condition;

public class Triangle {
    public static boolean exist(double ab, double ac, double bc) {
        return ab + ac > bc && ab + bc > ac && ac + bc > ab;
    }

    public static void main(String[] args) {
        System.out.println(Triangle.exist(12, 11, 10));
        System.out.println(Triangle.exist(34, 11, 10));
    }
}
