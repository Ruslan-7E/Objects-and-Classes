package ObjectsAndClasses;

public class App {
    public static void main(String[] args) {
        // после разбора с наставником
        Author author1 = new Author("Daniel", "Defoe");
        Author author2 = new Author("Daniel", "Kiz");

        Book book1 = new Book("Robinson Cruzo", author1, 1869);
        Book book2 = new Book("Цветы для Элджернона", author2, 1969);


        System.out.println("book1.getPubYear() = " + book1.getPubYear());
        book1.setPubYear(1879);
        System.out.println("book1.getPubYear() = " + book1.getPubYear());
        System.out.println("Название книги: " + book1.getBookName() + " год издания: " + book1.getPubYear() + " автор: " + book1.getAuthor().getName() + " " + book1.getAuthor().getSurname());
        System.out.println("Название книги: " + book2.getBookName() + " год издания: " + book2.getPubYear() + " автор: " + book2.getAuthor().getName() + " " + book2.getAuthor().getSurname());

        // object methods base task below

        // toString() realization
        System.out.println(book1);
        System.out.println(author2);

        // hashCode() realization
        System.out.println(book1);
        System.out.println(book1);

        // equals() realization
        System.out.println(author1.equals(author2));
        System.out.println(book1.equals(book2));
    }
}
