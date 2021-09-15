package ru.job4j.condition;

public class DivideBySix {

    public static String checkNumber(int number) {
        String rsl;
        if (number % 2 != 0) {
            if (number % 3 == 0) {
                rsl = "Исходное число делится на 3, но не является четным.";
            } else {
                rsl = "Исходное число не делится на 3 и не является четным.";
            }
        } else {
            if (number % 6 == 0) {
                rsl = "Исходное число делится на 6.";
            } else {
                rsl = "Исходное число не делится на 3, но является четным.";
            }
        }
        return rsl;
    }

    public static void main(String[] args) {

        System.out.println(DivideBySix.checkNumber(69)); // на три
        System.out.println(DivideBySix.checkNumber(66)); // на шесть
        System.out.println(DivideBySix.checkNumber(56)); // на два
        System.out.println(DivideBySix.checkNumber(47)); // не делится
    }
}
