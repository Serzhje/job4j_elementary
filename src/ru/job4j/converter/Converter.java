package ru.job4j.converter;

public class Converter {

    public static float rubleToEuro(float value) {
        float rsl = value / 70;
        return rsl;
    }

    public static float rubleToDollar(float value) {
        float rsl = value / 60;
        return rsl;
    }

    public static void main(String[] args) {
        float in = 140;
        float expected = 2;
        float out = Converter.rubleToEuro(140);
        boolean passed = expected == out;
        System.out.println("140 rubles are 2. Test result : " + passed);

        expected = 5;
        out = Converter.rubleToDollar(300);
        passed = expected == out;
        System.out.println("300 rubles are 5. Test result : " + passed);
    }
}
