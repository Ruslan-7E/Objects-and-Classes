package ObjectsAndClasses;

import java.util.Objects;


public class Author {
    private String name;
    private String surname;

    public Author(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    // object methods base task below
//    public String toString() {
//        return "The author of this book is: " + this.name + " " + this.surname;
//    }
    public int hashCode() {
        return java.util.Objects.hash(this.surname);
    }

    @Override
    public boolean equals(Object obj) {
        if (this.getClass() != obj.getClass()) {
            return false;
        }
        Author author1 = (Author) obj;
        return super.equals(obj);
    }
}
