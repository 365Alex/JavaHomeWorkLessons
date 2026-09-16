package lesson1;

public class Lesson1 {
    public static void main(String[] args) {
        System.out.println("Task 1");
        /*
        В программе IDEA в новом созданном вами проекте присвойте:
        переменной dog значение 8.0;
переменной cat значение 3.6;
переменной paper значение 763789.
Выведите значения каждой переменной в консоль.
         */
        double dog = 8.0;
        double cat = 3.6;
        int paper = 763789;

        System.out.println("dog = " + dog + "\n" +
                "cat = " + cat + "\n" + "paper = " + paper);
        System.out.println();
        System.out.println("Task 2");

        /*
        Увеличьте значение каждой перечисленной в прошлой задаче переменной на 4.
        Для решения этой задачи используйте тип переменной var.
        Выведите в консоль новые значения переменных.
         */
        dog = dog + 4;
        cat = cat + 4;
        paper = paper + 4;
        System.out.println("dog = " + dog + "\n" +
                "cat = " + cat + "\n" + "paper = " + paper);
        System.out.println();
        System.out.println("Task 3");

        /*
        Теперь нужно уменьшить значение каждой переменной:
 dog уменьшить на 3.5;
 cat уменьшить на 1.6;
 paper уменьшить на 7639.
Выведите в консоль новые значения переменных.
Для решения этой задачи используйте тип переменной var.
         */
        dog = dog - 3.5;
        cat = cat - 1.6;
        paper = paper - 7639;
        System.out.println("dog = " + dog + "\n" +
                "cat = " + cat + "\n" + "paper = " + paper);

        System.out.println();
        System.out.println("Task 4");
    /*
    Инициализируйте (присвойте значение) переменную friend значением 19.
Увеличьте значение переменной на 2, после чего поделите значение на 7.
После каждой операции выводите значение переменной в консоль.
В итоге у вас должно быть выведено 3 значения одной переменной.
Для решения этой задачи используйте тип переменной var.
     */
        int friend = 19;
        System.out.println("friend = " + friend);
        friend = friend + 2;
        System.out.println("friend = " + friend);
        friend = friend / 7;
        System.out.println("friend = " + friend);

        System.out.println();
        System.out.println("Task 5");

        /*
        Инициализируйте переменную frog значением 3.5.
Увеличьте переменную в 10 раз и поделите на 3.5. Добавьте к последнему значению переменной 4.
После каждой операции выводите значение переменной в консоль.
 В итоге у вас должно быть выведено 4 значения одной переменной.
Для решения этой задачи используйте тип переменной var.
         */
        double frog = 3.5;
        System.out.println("frog = " + frog);
        frog = frog *10;
        System.out.println("frog = " + frog);
        frog = frog / 3.5;
        System.out.println("frog = " + frog);
        frog = frog + 4;
        System.out.println("frog = " + frog);

        System.out.println();
        System.out.println("Task 6");

        /*
        В боксе перед каждым боем спортсменов взвешивают. Это делают для того, чтобы убедиться,
        что боксеры соответствуют своей весовой категории и бой будет честным.
Масса одного боксера — 78.2 кг.
Масса второго боксера — 82.7 кг.
Подсчитайте и выведите в консоль общую массу двух бойцов.
Подсчитайте и выведите в консоль разницу между массами бойцов.
Для решения этой задачи используйте тип переменной var.
         */

        double one = 78.2;
        double two = 82.7;
        double oneTwo = one + two;
        System.out.println("Общая масса двух бойцов равна " + oneTwo);
        double oneToTwo = two - one;
        System.out.println("Разница массы между бойцами равна = " + oneToTwo);

        System.out.println();
        System.out.println("Task 7");

        /*
        Найдите остаток от деления между двумя весами.
        Для решения этой задачи используйте тип переменной var.
         */

        double modulusOneTwo = two % one;
        System.out.println("Остаток от деления между двумя весами равен " + modulusOneTwo);
        System.out.println();
        System.out.println("Task 8");
        /*
        Решите задачу с помощью арифметических функций.
 640 часов работы поделено между сотрудниками. Если каждый сотрудник посвящает работе 8 часов,
 то сколько всего работников в компании? Выведите результат задачи в консоль в формате:
 «Всего работников в компании — … человек».
 Посчитайте, сколько часов работы должно быть поделено между сотрудниками, если в компании
 работает на 94 человека больше. Выведите результат задачи в консоль в формате:
 «Если в компании работает … человек, то всего … часов работы может быть поделено между сотрудниками».
Для решения этой задачи используйте тип переменной var.
         */

        var total = 640;
        var clock = 8;
        var totalEmployees = total / clock;
        System.out.println("Всего работников в компании — " + totalEmployees + " человек");
        var moreEmployees = totalEmployees + 94;
        totalEmployees = moreEmployees * clock;
        System.out.println("Если в компании работает " + moreEmployees + " человек, то всего " + totalEmployees + " часа работы может быть поделено между сотрудниками");

        System.out.println();
        System.out.println("Part 2, Lesson 1, Task 1");
        /*
        Объявите переменные типа int, byte, short, long, float, double.
Название переменных может быть любым, но если состоит из двух слов и более, должно соответствовать правилу camelCase.
Выведите в консоль значение каждой переменной в формате «Значение переменной … с типом … равно …».
         */

        int a = 789456;
        byte b = 97;
        short c = 7894;
        long d = 78946123789456L;
        float e = 789456123F;
        double f = 65.3;
        System.out.println("Значение переменной 'a' с типом int равно " + a);
        System.out.println("Значение переменной 'b' с типом byte равно " + b);
        System.out.println("Значение переменной 'c' с типом short равно " + c);
        System.out.println("Значение переменной 'd' с типом long равно " + d);
        System.out.println("Значение переменной 'e' с типом float равно " + e);
        System.out.println("Значение переменной 'f' с типом double равно " + f);

        System.out.println();
        System.out.println("Part 2, Lesson 1, Task 2");
        /*
        Ниже дан список различных значений. Инициализируйте переменные, используйте изученные ранее типы переменных.
Значения:
27.12
987 678 965 549
2,786
569
-159
27897
67
         */
        double z = 27.12;
        long y = 987_678_965_549L;
        double x = 2.786;
        short p = 569;
        short r = -159;
        int s = 27897;
        byte q = 67;

        System.out.println("z = " + z
        + "\n" + "y = " + y + "\n" + "x = " + x + "\n" + "p = " + p
        + "\n" + "r = " + r + "\n" + "s = " + s + "\n" + "q = " + q);

        System.out.println();
        System.out.println("Part 2, Lesson 1, Task 3");
        /*
        Три школьных учителя, Людмила Павловна, Анна Сергеевна и Екатерина Андреевна, ведут три класса.
У Людмилы Павловны — 23 ученика, у Анны Сергеевны — 27 учеников, у Екатерины Андреевны — 30 учеников.
Три учительницы закупили все вместе 480 листов бумаги на все три класса.
Посчитайте, сколько достанется листов каждому ученику.
Результат задачи выведите в консоль в формате: «На каждого ученика рассчитано … листов бумаги».
Для объявления переменных не используйте тип var.
         */
        int lp = 23;
        int as = 27;
        int ea = 30;
        int totalPaper = 480;
        int totalPupils = lp + as + ea;
        System.out.println("Всего в трёх классах " + totalPupils + " учеников");
        totalPaper = totalPaper / totalPupils;
        System.out.println("На каждого ученика рассчитано " + totalPaper + " листов бумаги");

        System.out.println();
        System.out.println("Part 2, Lesson 1, Task 4");
        /*
        Производительность машины для изготовления бутылок — 16 бутылок за 2 минуты.
        Какая производительность машины будет:
за 20 минут,
в сутки,
за 3 дня,
за 1 месяц?
Рассчитывайте производительность работы машины в том случае,
если она работает без перерыва заданный промежуток времени.
Результаты подсчетов выведите в консоль в формате: «За … машина произвела … штук бутылок».
Для объявления переменных не используйте тип var.
         */
        int oneBottleInMinutes = 16/2;
        int twentyMinutes = oneBottleInMinutes * 20;
        int day = oneBottleInMinutes * (60 * 24);
        int threeDays = day * 3;
        int month = day * 30;
        System.out.println("В минуту машина производит " + oneBottleInMinutes + " штук бутылок");
        System.out.println("За 20 минут машина произвела " + twentyMinutes + " штук бутылок");
        System.out.println("За сутки машина произвела " + day + " штук бутылок");
        System.out.println("За 3 дня машина произвела " + threeDays + " штук бутылок");
        System.out.println("За месяц машина произвела " + month + " штук бутылок");
        System.out.println();
        System.out.println("Part 2, Lesson 1, Task 5");
        /*
        На ремонт школы нужно 120 банок краски двух цветов: белой и коричневой.
        На один класс уходит 2 банки белой и 4 банки коричневой краски.
        Сколько банок каждой краски было куплено?
        Выведите результат задачи в консоль в формате:
        «В школе, где … классов, нужно … банок белой краски и … банок коричневой краски».
         */

        int totalPaint = 120;
        int white = 2;
        int brown = 4;
        int classes = totalPaint / (white + brown);
        int totalWhite = classes * white;
        int totalBrown = classes * brown;
        System.out.println("В  школе, где " + classes +" классов, нужно " + totalWhite + " банок белой краски и "
                + totalBrown + " банок коричневой краски");

    }
}
