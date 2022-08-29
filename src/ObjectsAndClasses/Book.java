package ObjectsAndClasses;

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

    // после разбора с наставником

}
