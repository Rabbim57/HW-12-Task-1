import Library.Author;
import Library.Book;
public class Main {
    public static void main(String[] args) {
        Author author = new Author("Анатолием", "Рыбаковым");
        Author author1 = new Author("Иваном", "Тургеневым");
        Book book = new Book("Тяжелый песок", author, 1978);
        Book book1 = new Book("Отцы и дети", author1, 1950);

        book.setBookYear(1910);


        // toString
        System.out.println(book);

       //.equals
        if(book.equals(book1)){
            System.out.println("Книги одинаковые ");
        }else{
            System.out.println("Книги разные ");
        }

        //hashCode
        System.out.println(book.hashCode());
        System.out.println(author.hashCode());
    }
}