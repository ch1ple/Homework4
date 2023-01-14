public class Main {
    public static void main(String[] args) {
        task1 ();
        task2 ();
        task3 ();
        task4 ();
        task5 ();
        task6 ();
        task7 ();
    }
    public static void task1 () {
        System.out.println("Задача 1");
        int age = 12;
        if (age >= 18) {
            System.out.println("Если возраст человека равен " + age + ", он совершеннолетний");
        }

        if (age < 18) {
            System.out.println("Если возраст человека равен " + age + ", он не достиг совершеннолетия, нужно немного подождать");
        }
    }
    public static void task2 () {
        System.out.println("Задача 2");
        int tempDegrees = -10;
        if (tempDegrees >= 5) {
            System.out.println("На улице " + tempDegrees + " градусов. Можно идти без шапки");
        } else {
            System.out.println("На улице " + tempDegrees + " градусов. Нужно надеть шапку");
        }
    }
    public static void task3 () {
        System.out.println("Задача 3");
        int speed = 120;
        if (speed <= 60) {
            System.out.println("Если скорость " + speed + " км/ч, то можно ездить спокойно");
        } else {
            System.out.println("Если скорость " + speed + " км/ч, то придется заплатить штраф");
        }
    }
    public static void task4 () {
        System.out.println("Задача 4");
        int age = 40;
        if (age >= 2 && age <= 6) {
            System.out.println("Если возраст человека равен " + age + ", то ему нужно ходить в детский сад");
        } else if (age >= 7 && age <= 18) {
                System.out.println("Если возраст человека равен " + age + ", то ему нужно ходить в школу");
        } else if (age > 18 && age < 24) {
                System.out.println("Если возраст человека равен " + age + ", то его место в университете");
            } else {
                System.out.println("Если возраст человека " + age + ", то ему следует ходить на работу");
        }
    }
    public static void task5 () {
        System.out.println("Задача 5");
        int age = 14;
        if (age < 5) {
            System.out.println("Если возраст ребенка равен " + age + ", то ему нельзя кататься на аттракционе");
        } else if (age >= 5 && age < 14) {
                System.out.println("Если возраст ребенка равен " + age + ", то ему можно кататься на аттракционе в сопровождении взрослого");
            } else if (age >= 14) {
                    System.out.println("Если возраст ребенка равен " + age + ", то ему можно кататься на аттракционе без сопровождения взрослого");
                }
    }
    public static void task6 () {
        System.out.println("Задача 6");
        int capacity = 102;
        int seatingPlaces = 60;
        int standingPlaces = capacity - seatingPlaces;
        int peopleInTrain = 102;
        if (peopleInTrain < capacity && peopleInTrain < seatingPlaces) {
            System.out.println("В вагоне есть сидячие и стоячие места");
        } else if (peopleInTrain < capacity && peopleInTrain >= seatingPlaces) {
                System.out.println("В вагоне есть стоячие места");
            } else {
            System.out.println("Вагон уже полностью забит");
        }
    }
    public static void task7 () {
        System.out.println("Задача 7");
        int one = -10;
        int two = 2;
        int three = 17;
        if (one > two && one > three) {
            System.out.println("Из данных трех чисел большее будет " + one);
        } else if (two > one && two > three) {
            System.out.println("Из данных трех чисел большее будет " + two);
        } else if (three > one && three > two) {
            System.out.println("Из данных трех чисел большее будет " + three);
        }
    }
}