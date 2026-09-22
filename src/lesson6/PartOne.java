package lesson6;

import java.time.LocalDate;

public class PartOne {
    public static void main(String[] args){
        System.out.println("Lesson 6, Part 1, Task 1");
        checkingForALeapYear(2025);
        System.out.println("Lesson 6, Part 1, Task 2");
        detectTheApplicationVersion(0,2016);
        System.out.println("Lesson 6, Part 1, Task 3");
        System.out.println( shippingCalculation(3));
    }
    /*
    Task1
    Реализуйте метод, который получает в качестве параметра год, проверяет, является ли он високосным,
    и выводит результат в консоль
    Эту проверку вы уже реализовывали в задании по условным операторам.
    Теперь проверку оберните в метод и используйте год, который приходит в виде параметра.
    Результат программы выведите в консоль. Если год високосный, то напечатайте сообщение:
    «... год — високосный год». Если год невисокосный, то: «... год — невисокосный год».
     */
    public static void checkingForALeapYear(int year){
            if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0){
                System.out.println(year + " год — високосный год");
            }else {
                System.out.println(year + " год — невисокосный год");
            }
    }
    /*
    Task2
    Вспомните задание 2 из урока «Условные операторы», где вы предлагали пользователю
    облегченную версию приложения.
    Напишите метод, куда подаются два параметра: тип операционной системы (0 — iOS, 1 — Android)
    и год выпуска устройства.
    Если устройство старше текущего года, предложите ему установить облегченную версию.
    Текущий год можно получить таким способом:
    int currentYear = LocalDate.now().getYear();
    Или самим задать значение вручную — ввести в переменную числовое значение.
    В результате программа должна выводить в консоль сообщение, какую версию приложения
    (обычную или облегченную) и для какой ОС (Android или iOS) установить пользователю.
     */
    public static void detectTheApplicationVersion(int clientOS, int yearDevice){
        int currentYear = LocalDate.now().getYear();
        if (clientOS < 0 || clientOS > 1){
            System.out.println("Значение ОС должно быть 0 или 1");
        } else if (clientOS == 0 && yearDevice < currentYear) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        } else if (clientOS == 1 && yearDevice < currentYear) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        } else if (clientOS == 0) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else {
            System.out.println("Установите версию приложения для Android по ссылке");
        }
    }
    /*
    Task 3
    Возвращаемся к задаче на расчет дней доставки банковской карты.
    Ваша задача — доработать код, а именно написать метод, который на вход принимает дистанцию
    и возвращает итоговое количество дней доставки.
     */
    public static String shippingCalculation(int deliveryDistance){
        int day = 1;
        String result;
        if (deliveryDistance < 0){
            result = "Расстояние не может быть отрицательным";
        } else if (deliveryDistance <= 20) {
            result = "Потребуется дней: " + day;
        } else if (deliveryDistance <= 60) {
            day++;
            result = "Потребуется дней: " + day;
        } else if (deliveryDistance <=100) {
            day = day +2;
            result = "Потребуется дней: " + day;
        }else {
            result = "Свыше 100 км доставки нет";
        }
        return result;
    }
}
