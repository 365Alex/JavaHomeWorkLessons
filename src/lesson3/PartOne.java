package lesson3;

public class PartOne {
    public static void main(String[] args){
        System.out.println("Lesson 3, Part 1, Task 1");
        /*
        С помощью цикла for выведите в консоль все целые числа от 1 до 10.
         */
        for (int i = 1; i <= 10; i++){
            System.out.print(i + " ");
        }
        System.out.println();
        System.out.println("Lesson 3, Part 1, Task 2");
        /*
        С помощью цикла for выведите в консоль все целые числа от 10 до 1
         */
        for (int i = 10; i > 0; i--) {
            System.out.print(i + " ");
        }
        System.out.println();
        System.out.println("Lesson 3, Part 1, Task 3");
        /*
        Выведите в консоль все четные числа от 0 до 17.
         */
        for (int i = 0; i < 17 ; i++) {
            if (i % 2 == 0){
                System.out.print(i + " ");
            }
        }
        System.out.println();
        //or
        for (int i = 0; i < 17; i+=2) {
            System.out.print(i + " ");
        }
        System.out.println();
        System.out.println("Lesson 3, Part 1, Task 4");
        /*
        Выведите в консоль все числа от 10 до −10 от бо́льшего числа к меньшему.
         */
        for (int i = 10; i >= -10 ; i--) {
            System.out.print(i + " ");
        }
        System.out.println();
        System.out.println("Lesson 3, Part 1, Task 5");
        /*
        Напишите программу, которая выводит в консоль все високосные года, начиная с 1904 года до 2096.
        В консоль результат должен выводиться в формате: «… год является високосным».
         */
        for (int i = 1904; i < 2096; i+=4) {
            System.out.println(i + " год является високосным");
        }
        System.out.println();
        System.out.println("Lesson 3, Part 1, Task 6");
        /*
        Напишите программу, которая выводит в консоль последовательность чисел:
        7 14 21 28 35 42 49 56 63 70 77 84 91 98
         */
        for (int i = 7; i < 100; i+=7) {
            System.out.print(i + " ");
        }
        System.out.println();
        System.out.println("Lesson 3, Part 1, Task 7");
        /*
        Напишите программу, которая выводит в консоль последовательность чисел:
        1 2 4 8 16 32 64 128 256 512
         */
        for (int i = 1; i < 520; i *= 2) {
            System.out.print(i + " ");
        }
        System.out.println();
        System.out.println("Lesson 3, Part 1, Task 8");
        /*
        Посчитайте с помощью цикла for сумму годовых накоплений,
        если каждый месяц вы будете откладывать по 29 000 рублей «в банку».
        Выведите сумму накоплений за каждый месяц в консоль в формате:
        «Месяц …, сумма накоплений равна … рублей».
         */
        int monthlyDeposit = 29000;
        double total = 0;
        for (int i = 1; i <=12 ; i++) {
            total += monthlyDeposit;
            System.out.println("Месяц " + i + ", сумма накоплений равна " + total + " рублей");
        }
        System.out.println();
        System.out.println("Lesson 3, Part 1, Task 9");
        /*
        Перепишите решение задачи выше при условии, что деньги вы откладывать будете не «в банку»,
        а в банк под проценты — 12% годовых. Выведите сумму накоплений за каждый месяц в консоль в формате:
        «Месяц …, сумма накоплений равна … рублей».
         */
        total = 0;
        for (int i = 1; i <=12; i++) {
            total += monthlyDeposit;
            total += total/100;
            System.out.println("Месяц " + i + ", сумма накоплений равна " + (int)total + " рублей");
        }
        System.out.println();
        System.out.println("Lesson 3, Part 1, Task 10");
         /*
         Напишите программу, которая выводит в консоль таблицу умножения на 2:
         2*1=2
         2*2=4
         2*3=6
         2*4=8
         ...
         */
        for (int i = 1; i <=10; i++) {
            System.out.println("2 * " + i + " = " + i*2);
        }
        System.out.println("таблица умножения для всех чисел от 2 до 9");
        for (int x = 2; x <=9 ; x++) {
            System.out.println("Таблица умножения на " + x + ":");
            for (int i = 1; i <=10; i++) {
                System.out.println(x + " * " + i + " = " + x * i);
            }
            System.out.println();
        }
    }
}
