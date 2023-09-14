package Library;

public class Author {
    private String authorName;
    private String authorSurname;

    public Author(String name, String surname) {
        this.authorName = name;
        this.authorSurname = surname;
    }

    public String getAuthorName() {
        return this.authorName;
    }

    public String getAuthorSurname() {
        return this.authorSurname;
    }

    public String toString() {
        return this.authorName + " " + this.authorSurname;
    }

    public boolean equals(Author author) {
        return this.authorName.equals(author.authorName) && this.authorSurname.equals(author.authorSurname);

    }
}
