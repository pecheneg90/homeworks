package hw9;

import java.util.Objects;

public class Book {
    private final String title;
    private final Author nameAuthor;
    private int yearPublication;

    public Book(String bookTitle, Author nameAuthor, int yearPublication) {
        this.title = bookTitle;
        this.nameAuthor = nameAuthor;
        this.yearPublication = yearPublication;
    }

    public String getTitle() {
        return title;
    }

    public Author getNameAuthor() {
        return nameAuthor;
    }

    public int getYearPublication() {
        return yearPublication;
    }

    public void setYearPublication(int yearPublication) {
        if (yearPublication < 1457 || yearPublication > 2022) {
            throw new IllegalArgumentException("Книга не издавалась в этот год");
        }
        this.yearPublication = yearPublication;
    }

    @Override
    public String toString() {
        return getTitle() + nameAuthor.toString() + getYearPublication();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return title.equals(book.title) && nameAuthor.equals(book.nameAuthor);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, nameAuthor);
    }
}

