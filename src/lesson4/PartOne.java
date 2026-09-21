package lesson4;

public class PartOne {
    public static void main(String[] args) {
        System.out.println("Lesson 3, Part 1, Task 1");
        /*
        Объявите три массива:
        1. Целочисленный массив, заполненный тремя цифрами — 1, 2 и 3 — с помощью ключевого слова
        new.
        2. Массив, в котором можно хранить три дробных числа — 1.57, 7.654, 9.986.
        Массив сразу заполните значениями.
        3. Произвольный массив. Тип и количество данных определите сами. Самостоятельно выберите способ создания массива:
        с помощью ключевого слова или сразу заполненный элементами.
         */
        int[] a = new int[3];
        a[0] = 1;
        a[1] = 2;
        a[2] = 3;
        double[] d = {1.57, 7.654, 9.986};
        int[] i = {87, 52, 10};
        System.out.println("Lesson 3, Part 1, Task 2");
        /*
        Распечатайте на отдельной строчке элементы каждого массива по порядку через запятую.
        В конце строки запятую ставить не надо.
         */
        for (int j = 0; j < a.length; j++) {
            System.out.print(a[j]);
            if (j <a.length-1){
                System.out.print(", ");
            }
        }
        System.out.println();
        for (int j = 0; j < d.length; j++) {
            System.out.print(d[j]);
            if (j <d.length-1){
                System.out.print(", ");
            }
        }
        System.out.println();
        for (int j = 0; j < i.length; j++) {
            System.out.print(i[j]);
            if (j <i.length-1){
                System.out.print(", ");
            }
        }
        System.out.println();
        System.out.println("Lesson 3, Part 1, Task 3");
        /*
        Распечатайте на отдельной строчке элементы каждого массива в обратном порядке через запятую.
        В конце строки запятую ставить не надо.
        Если в задаче 2 в консоль у вас вывелся результат:
        1, 2, 3
        1.57, 7.654, 9.986
        Произвольные элементы третьего массива
        то, в этой задаче результат должен быть таким:
        3, 2, 1
        9.986, 7.654, 1.57
        Произвольные элементы третьего массива в обратном порядке
         */
        for (int j = a.length-1; j >= 0; j--) {
            System.out.print(a[j]);
            if (j > 0){
                System.out.print(", ");
            }
        }
        System.out.println();
        for (int j = d.length-1; j >= 0; j--) {
            System.out.print(d[j]);
            if (j > 0){
                System.out.print(", ");
            }
        }
        System.out.println();
        for (int j = i.length-1; j >= 0; j--) {
            System.out.print(i[j]);
            if (j > 0){
                System.out.print(", ");
            }
        }
        System.out.println();
        System.out.println("Lesson 3, Part 1, Task 4");
        /*
        Пройдитесь по первому целочисленному массиву
        и все нечетные числа в нем сделайте четными (нужно прибавить 1).
        Код должен работать с любым целочисленным массивом, поэтому для решения задания используйте циклы.
        Распечатайте результат преобразования в консоль.
         */
        for (int j = 0; j < a.length; j++) {
            if (a[j] % 2 != 0){
               a[j] = a[j] + 1;
            }
            System.out.print(a[j]);
            if (j < a.length-1){
                System.out.print(", ");
            }
        }
    }
}
