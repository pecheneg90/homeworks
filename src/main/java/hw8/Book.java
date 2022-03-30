package hw8;

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
            System.out.println("Книга: " + getTitle() + " не издавалась в " + yearPublication + " году");
        } else {
            this.yearPublication = yearPublication;
        }
    }
}

