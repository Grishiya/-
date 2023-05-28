import java.util.Scanner;

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



        public static void task1 () {
        System.out.println("Задача 1.");
        int ageOld = 25;
        if (ageOld >= 18) {
            System.out.println("Если возраст человека равен " + ageOld + ", то он совершеннолетний");
        }
        int ageChild = 17;
        if (ageChild >= 18)
            System.out.println("Вы совершеннолетний");
        else
            System.out.println("Если возраст человека равен " + ageChild + ", то он не достиг совршеннолетияБнужно подождать");
    }

        public static void task2 () {
        System.out.println("Задача 2.");
        Scanner input = new Scanner(System.in);//Так удобнее под условия задач работать.
        int temp = input.nextInt();
        if (temp < 5)
            System.out.println("На улице холодно нужно надеть шапку.");
        else
            System.out.println("Сегодня тепло можно идти без шапки.");
    }

        public static void task3 () {
        System.out.println("Задача 3.");
Scanner input=new Scanner(System.in);
int speedAuto=input.nextInt();
if (speedAuto>60)
    System.out.println("Если скорость "+speedAuto+", то придется заплатить штраф");
else
    System.out.println("Если скорость "+speedAuto+", то можно ездить спокойно");
            //Как оказалось не совсем удобно,после каждого запуска вводить данные.
    }

        public static void task4 () {
        System.out.println("Задача 4.");
    }

        public static void task5 () {
        System.out.println("Задача 5.");
    }

        public static void task6 () {
        System.out.println("Задача 6.");
    }

        public static void task7 () {
        System.out.println("Задача 7.");
    }
    }
