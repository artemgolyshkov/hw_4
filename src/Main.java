public class Main {
    public static void main(String[] args) {
        System.out.println("Задача 1");
        int age = 18;
        if (age >= 18) {
            System.out.println("Если возраст человека равен, " + age + " то он совершеннолетний!");
        } else {
            System.out.println("Если возраст человека равен, " + age + "  то он не достиг совершеннолетия, нужно немного подождать");
        }
        System.out.println("Задача 2");
        int temperature = 3;
        if (temperature < 5) {
            System.out.println("На улице " + temperature + " градусов, нужно надеть шапку!");
        } else {
            System.out.println("На улице " + temperature + " градусов, можно идти без шапки!");
        }
        System.out.println("Задача 3");
        int speed = 61;
        if (speed > 60) {
            System.out.println("Если скорость " + speed + " то, придется заплатить штраф!");
        } else {
            System.out.println("Если скорость " + speed + "  то, можно ездить спокойно!");
        }
        System.out.println("Задача 4");
        int age1 = 16;
        if (age1 >= 2 && age1 <= 6) {
            System.out.println("Если возраст человека равен " + age1 + " , то ему нужно ходить в детский сад!");
        }
        if (age1 >= 7 && age1 <= 18) {
            System.out.println("Если возраст человека равен " + age1 + " , то ему нужно ходить в школу!");
        }
        if (age1 > 18 && age1 <= 24) {
            System.out.println("Если возраст человека равен " + age1 + " , то ему нужно ходить в университет!");
        }
        if (age1 > 24) {
            System.out.println("Если возраст человека равен " + age1 + " , то ему нужно ходить на работу");
        }
        System.out.println("Задача 5");
        int age2 = 4;
        if (age2 < 5) {
            System.out.println("Если возраст ребенка равен " + age2 + " , то ему нельзя кататься на аттракционе!");
        }
        if (age2 >= 5 && age2 <= 14) {
            System.out.println("Если возраст ребенка равен " + age2 + " , то ему можно кататься на аттракционе в сопровождении!");
        }
        if (age2 > 14) {
            System.out.println("Если возраст ребенка равен " + age2 + " , то ему можно кататься на аттракционе!");
        }
        System.out.println("Задача 6");
        int place = 102;

        if (place < 60 || place >= 60 && place < 102) {
            System.out.println("Если мест в вагоне занято " + place + " , то имеются свободные стоячие или сидячие места!");
        } else {
            System.out.println("Мест нет!");
        }

        System.out.println("Задача 7");
        int one = 1;
        int two = 5;
        int three = 3;
        int foor;
        if (one < two) {
            foor = two;
        } else {
            foor = one;
        }
        if (foor < three) {
            System.out.println("Наибольшее число " + three);
        } else {
            System.out.println("Наибольшее число " + foor);
        }
    }
}