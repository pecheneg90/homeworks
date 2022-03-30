package hw8;

public class Main {
    public static void main(String[] args) {
        Book book1 = new Book("War and Peace", new Author("Lev", "Tolstoy"), 1869);
        book1.setYearPublication(2021);
        System.out.println("название книги: " + book1.getTitle() + ", автор: " + book1.getNameAuthor() + ", год издания: " + book1.getYearPublication());

        Book book2 = new Book("The Stand", new Author("Stephen", "King"), 1990);
        book2.setYearPublication(2012);
        System.out.println("название книги: " + book2.getTitle() + ", автор: " + book2.getNameAuthor() + ", год издания: " + book2.getYearPublication());
    }
}
