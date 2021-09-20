package ru.job4j.array;

public class ArrayDefinition {
    public static void main(String[] args) {
        short[] ages = new short[10];
        String[] surnames = new String[100500];
        float[] prices = new float[40];
        System.out.println("Размер массива ages: " + ages.length);
        System.out.println("Размер массива surnames: " + surnames.length);
        System.out.println("Размер массива prices: " + prices.length);

        String[] names = new String[4];
        names[0] = "Sergey Ivanov";
        names[1] = "Екатерина Петрова";
        names[2] = "Alexander Novikov";
        names[3] = "Julia Jackson";
        System.out.println("names[0]: " + names[0]);
        System.out.println("names[1]: " + names[1]);
        System.out.println("names[2]: " + names[2]);
        System.out.println("names[3]: " + names[3]);

    }
}
