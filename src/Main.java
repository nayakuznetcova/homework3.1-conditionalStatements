public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
    }

    public static void task1() {
        System.out.println("Задача 1");
        int age1 = 50;
        if (age1 >= 18) {
            System.out.println("Если человеку " + age1 + " ,то он совершеннолетний");
        }

        if (age1 < 18) {
            System.out.println("Если человеку " + age1 + " ,то он несовершеннолетний");
        }

        int age2 = 17;
        if (age2 >= 18) {
            System.out.println("Если человеку " + age2 + " ,то он совершеннолетний");
        }

        if (age2 < 18) {
            System.out.println("Если человеку " + age2 + " ,то он несовершеннолетний");
        }
    }

    public static void task2() {
        System.out.println("Задача 2");
        int temperatureHot = 15;
        if (temperatureHot >= 5) {
            System.out.println("Температура " + temperatureHot + " можно идти без шапки");
        }

        if (temperatureHot < 5) {
            System.out.println("Температура " + temperatureHot + " нужно надеть шапку");
        }

        int temperatureCold = 2;
        if (temperatureCold >= 5) {
            System.out.println("Температура " + temperatureCold + " можно идти без шапки");
        }

        if (temperatureCold < 5) {
            System.out.println("Температура " + temperatureCold + " нужно надеть шапку");
        }
    }

    public static void task3() {
        System.out.println("Задача 3");
        int speed1 = 86;
        if (speed1 >= 60) {
            System.out.println("Если скорость " + speed1 + " придется заплатить штраф");
        }

        if (speed1 < 60) {
            System.out.println("Если скорость " + speed1 + " можно ездить спокойно");
        }

        int speed2 = 52;
        if (speed2 >= 60) {
            System.out.println("Если скорость " + speed2 + " придется заплатить штраф");
        }

        if (speed2 < 60) {
            System.out.println("Если скорость " + speed2 + " можно ездить спокойно");
        }
    }

    public static void task4() {
        System.out.println("Задача 4");
        int age1 = 5;
        if (age1 >= 2 && age1 <= 6) {
            System.out.println("Если возвраст человека равен " + age1 + " то ему нужно ходить в детский сад");
        } else if (age1 >= 7 && age1 <= 18) {
            System.out.println("Если возвраст человека равен " + age1 + " то ему нужно ходить в школу");
        } else if (age1 >= 18 && age1 <= 24) {
            System.out.println("Если возвраст человека равен " + age1 + " то ему нужно ходить в университет");
        } else {
            System.out.println("Если человеку " + age1 + " то он должен ходить на работу");
        }

        int age2 = 11;
        if (age2 >= 2 && age2 <= 6) {
            System.out.println("Если возвраст человека равен " + age2 + " то ему нужно ходить в детский сад");
        } else if (age2 >= 7 && age2 <= 18) {
            System.out.println("Если возвраст человека равен " + age2 + " то ему нужно ходить в школу");
        } else if (age2 >= 18 && age2 <= 24) {
            System.out.println("Если возвраст человека равен " + age2 + " то ему нужно ходить в университет");
        } else {
            System.out.println("Если человеку " + age2 + " то он должен ходить на работу");
        }

        int age3 = 19;
        if (age3 >= 2 && age3 <= 6) {
            System.out.println("Если возвраст человека равен " + age3 + " то ему нужно ходить в детский сад");
        } else if (age3 >= 7 && age3 <= 18) {
            System.out.println("Если возвраст человека равен " + age3 + " то ему нужно ходить в школу");
        } else if (age3 >= 18 && age3 <= 24) {
            System.out.println("Если возвраст человека равен " + age3 + " то ему нужно ходить в университет");
        } else {
            System.out.println("Если человеку " + age3 + " то он должен ходить на работу");
        }

        int age4 = 33;
        if (age4 >= 2 && age4 <= 6) {
            System.out.println("Если возвраст человека равен " + age4 + " то ему нужно ходить в детский сад");
        } else if (age4 >= 7 && age4 <= 18) {
            System.out.println("Если возвраст человека равен " + age4 + " то ему нужно ходить в школу");
        } else if (age4 >= 18 && age4 <= 24) {
            System.out.println("Если возвраст человека равен " + age4 + " то ему нужно ходить в университет");
        } else {
            System.out.println("Если человеку " + age4 + " то он должен ходить на работу");
        }
    }

    public static void task5() {
        System.out.println("Задача 5");
        int ageChild = 4;
        if (ageChild < 5) {
            System.out.println("Нельзя кататься на аттракционе");
        } else if (ageChild >= 5 && ageChild <= 14) {
            System.out.println("Можно кататься на аттракционе в сопровождении взрослого");
        } else {
            System.out.println("Можно кататься на атракционе");
        }

        int ageChild2 = 7;
        if (ageChild2 < 5) {
            System.out.println("Нельзя кататься на аттракционе");
        } else if (ageChild2 >= 5 && ageChild2 <= 14) {
            System.out.println("Можно кататься на аттракционе в сопровождении взрослого");
        } else {
            System.out.println("Можно кататься на атракционе");
        }

        int ageChild3 = 15;
        if (ageChild3 < 5) {
            System.out.println("Нельзя кататься на аттракционе");
        } else if (ageChild3 >= 5 && ageChild3 <= 14) {
            System.out.println("Можно кататься на аттракционе в сопровождении взрослого");
        } else {
            System.out.println("Можно кататься на атракционе");
        }
    }

    public static void task6() {
        System.out.println("Задача 6");
        int sumPassengers = 5;
        if (sumPassengers <= 60) {
            System.out.println("В вагоне есть сидячие места");
        } else if (sumPassengers > 60 && sumPassengers <= 102) {
            System.out.println("В вагоне есть стоячие места");
        } else {
            System.out.println("Вагон заполнен полностью");
        }

        int sumPassengers2 = 63;
        if (sumPassengers2 <= 60) {
            System.out.println("В вагоне есть сидячие места");
        } else if (sumPassengers2 > 60 && sumPassengers2 <= 102) {
            System.out.println("В вагоне есть стоячие места");
        } else {
            System.out.println("Вагон заполнен полностью");
        }

        int sumPassengers3 = 103;
        if (sumPassengers3 <= 60) {
            System.out.println("В вагоне есть сидячие места");
        } else if (sumPassengers3 > 60 && sumPassengers3 <= 102) {
            System.out.println("В вагоне есть стоячие места");
        } else {
            System.out.println("Вагон заполнен полностью");
        }
    }

    public static void task7() {
        System.out.println("Задача 7");
        int one = 100;
        int two = 100;
        int three = 100;

        if (one > two) {
            if (one >= three) {
                System.out.println("Максимальное число " + one);
            } else {
                System.out.println("Максимальное число " + three);
            }

        } else if (two > one) {
            if (two >= three) {
                System.out.println("Максимальное число " + two);
            } else {
                System.out.println("Максимальное число " + three);
            }

        } else {
            if (one > three) {
                System.out.println("Максимальное число " + one);
            } else if (three > one) {
                System.out.println("Максимальное число " + three);
            } else {
                System.out.println("Все 3 числа равны");
            }
        }
    }
}