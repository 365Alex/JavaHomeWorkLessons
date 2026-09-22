package lesson5;

public class PartOne {
    public static void main(String[] args){
        System.out.println("Lesson 5, Part 1, Task 1");
        /*
        Представьте, что вы работаете в небольшой компании.
        Данные сотрудников хранятся в неструктурированном формате.
        Бухгалтерия попросила написать программу, в которой можно работать с ФИО сотрудников.
        Напишите четыре строки:
        С именем firstName — для хранения имени.
        С именем middleName — для хранения отчества.
        С именем lastName — для хранения фамилии.
        С именем fullName — для хранения ФИО сотрудника в формате «Фамилия Имя Отчество».
        Выведите в консоль фразу: «ФИО сотрудника — …».
        В качестве данных для задачи используйте Ivanov Ivan Ivanovich.
         */
        String firstName = "Ivan";
        String middleName = "Ivanovich";
        String lastName = "Ivanov";
        String fullName = lastName + " " + firstName + " " + middleName;
        System.out.println("ФИО сотрудника - " + fullName);
        System.out.println();
        System.out.println("Lesson 5, Part 1, Task 2");
        /*
        Для ежемесячного отчета и ведения документации бухгалтерии нужны ФИО сотрудников,
        полностью написанные заглавными буквами (верхним регистром).
        Напишите программу, которая изменит написание ФИО сотрудника с Ivanov Ivan Ivanovich на полностью
        заглавные буквы.
        В качестве строки с исходными данными используйте строку fullName.
        Результат программы выведите в консоль в формате:
        «Данные ФИО сотрудника для заполнения отчета — …».
         */
        System.out.println("Данные ФИО сотрудника для заполнения отчета — " + fullName.toUpperCase());
        System.out.println();
        System.out.println("Lesson 5, Part 1, Task 3");
        /*
        Система, в которой мы работаем, не принимает символ «ё».
        Напишите программу, которая заменяет символ «ё» на символ «е».
        В качестве исходных данных используйте строку fullName и данные в ней — «Иванов Семён Семёнович».
        Выведите результат программы в консоль в формате: «Данные ФИО сотрудника — ...».
         */
        firstName = "Семён";
        middleName = "Семёнович";
        lastName = "Иванов";
        fullName = lastName + " " + firstName + " " + middleName;
        fullName = fullName.replace("ё", "е");
        System.out.println("Данные ФИО сотрудника — " + fullName);
    }
}
