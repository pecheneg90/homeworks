package hw9;

public class Main {
    public static void main(String[] args) {

        Book book1 = new Book("War and Peace", new Author("Lev", "Tolstoy"), 1869);
        book1.setYearPublication(1990);
        System.out.println("название книги 1: " + book1.getTitle() + ", автор: " + book1.getNameAuthor() + ", год издания: " + book1.getYearPublication());

        Book book2 = new Book("The Stand", new Author("Stephen", "King"), 1990);
        book2.setYearPublication(2020);
        System.out.println("название книги 2: " + book2.getTitle() + ", автор: " + book2.getNameAuthor() + ", год издания: " + book2.getYearPublication());

        Book book3 = new Book("War and Peace", new Author("Lev", "Tolstoy"), 1869);
        System.out.println("название книги 3: " + book3.getTitle() + ", автор: " + book3.getNameAuthor() + ", год издания: " + book3.getYearPublication());

        System.out.println();
        System.out.println("Сравнения книг:");

        System.out.println("Первая и вторая одинаковые? Ответ: " + book1.equals(book2));
        System.out.println("Хэшкоды двух сравниваемых книг " + book1.hashCode() + ", " + book2.hashCode());

        System.out.println("Первая и третья книги одинаковые? Ответ: " + book1.equals(book3));
        System.out.println("Хэшкоды двух сравниваемых книг " + book1.hashCode() + ", " + book3.hashCode());
    }
}
