package library;

import java.util.Objects;

public class Book {
    private final Author author;
    private final String name;
    private int year;

    public Book(Author author, String name, int year) {
        this.name = name;
        this.author = author;
        this.year = year;
    }

    public Author getAuthor() {
        return author;
    }

    public int getYear() {
        return year;
    }

    public String getName() {
        return name;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return year == book.year && Objects.equals(author, book.author) && Objects.equals(name, book.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(author, name, year);
    }

    @Override
    public String toString() {
        return "Книга: " +
                "Автор: " + getAuthor() +
                ", название: " + getName() + '\'' +
                ", год " + getYear();
    }
}
