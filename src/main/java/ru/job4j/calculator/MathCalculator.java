package ru.job4j.calculator;

import static ru.job4j.math.MathFunction.*;
public class MathCalculator {
    public static double sumAndMultiply(double first, double second) {
        return sum(first, second) + multiply(first, second);
    }

    public static double sumOperationDivideAndDifference(double first, double second) {
        return difference(first, second) + divide(first, second);
    }

    public static double sumOperationAll(double first, double second) {
        return sum(first, second) + multiply(first, second) + difference(first, second) + divide(first, second);
    }

    public static void main(String[] args) {
        System.out.println("Результат расчета равен: " + sumAndMultiply(10, 20));
        System.out.println("Результат расчета равен: " + sumOperationDivideAndDifference(10, 20));
        System.out.println("Результат расчета равен: " + sumOperationAll(10, 20));
     }
}
