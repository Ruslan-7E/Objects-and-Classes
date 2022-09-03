package ObjectsAndClasses;

import java.util.Objects;


public class Book {
    private String bookName;
    private Author author;
    private int pubYear;

    public Book(String bookName, Author author, int pubYear) {
        this.bookName = bookName;
        this.author = author;
        this.pubYear = pubYear;
    }

    public String getBookName() {
        return bookName;
    }

    public Author getAuthor() {
        return author;
    }

    public int getPubYear() {
        return pubYear;
    }

    public void setPubYear(int pubYear) {
        this.pubYear = pubYear;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return pubYear == book.pubYear && Objects.equals(bookName, book.bookName) && Objects.equals(author, book.author);
    }

    @Override
    public int hashCode() {
        return Objects.hash(bookName, author, pubYear);
    }

    @Override
    public String toString() {
        return "Book{" +
                "bookName='" + bookName + '\'' +
                ", author=" + author +
                ", pubYear=" + pubYear +
                '}';
    }
}
