package ru.job4j.array;

public class LengthArrayArrays {
    public static void main(String[] args) {
        int[][] numbers = {{34}, {45, 21}, {90, 5, 22}, {9, 91, 50, 1}};
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Размер вложенного массива равен: "
                    + numbers[i].length);
        }
    }
}
