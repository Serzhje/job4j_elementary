package ru.job4j.condition;

public class SwitchWeek {
    public static String nameOfDay(int day) {
        String name;
        switch (day) {
            case 1:
                name = "понедельник";
                break;
            case 2:
                name = "вторник";
                break;
            case 3:
                name = "среда";
                break;
            case 4:
                name = "четверг";
                break;
            case 5:
                name = "пятница";
                break;
            case 6:
                name = "суббота";
                break;
            case 7:
                name = "воскресение";
                break;
            default:
                name = "Ошибка";
                break;
        }
        return name;
    }

    public static void main(String[] args) {
        System.out.println(SwitchWeek.nameOfDay(1));
        System.out.println(SwitchWeek.nameOfDay(2));
        System.out.println(SwitchWeek.nameOfDay(3));
        System.out.println(SwitchWeek.nameOfDay(4));
        System.out.println(SwitchWeek.nameOfDay(5));
        System.out.println(SwitchWeek.nameOfDay(6));
        System.out.println(SwitchWeek.nameOfDay(7));
        System.out.println(SwitchWeek.nameOfDay(9));
    }
}
