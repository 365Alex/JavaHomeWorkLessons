package library;

public class Main {
    public static void main(String[] args){
        Author authorOne = new Author("Лев", "Толстой");
        Author authorTwo = new Author("Виктор", "Гюго");
        Author authorThree = new Author("Александр", "Пушкин");

        Book bookOne = new Book(authorOne, "Война и мир", 2012);
        Book bookTwo = new Book(authorTwo, "Отверженные", 2014);
        Book bookThree = new Book(authorThree, "Спящая красавица", 2016);
        System.out.println(bookOne);
        System.out.println(bookThree);
        System.out.println(bookTwo);
        bookOne.setYear(2018);
        System.out.println(bookOne);
        System.out.println(authorOne.hashCode());
        System.out.println(authorOne.equals(authorTwo));


    }
}
