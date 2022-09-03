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

    // object methods base task below
//    public String toString() {
//        return "Book name is: " + this.bookName + " and publishing year is: " + this.pubYear;
//    }

    public int hashCode() {
        return java.util.Objects.hash(this.bookName);
    }

    public boolean equals(Object obj) {
        if (this.getClass() != obj.getClass()) {
            return false;
        }
        Book book1 = (Book) obj;
        return super.equals(obj);
    }

}
