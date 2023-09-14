import Library.Author;
import Library.Book;
public class Main {
    public static void main(String[] args) {
        Author anatoly = new Author("Анатолием", "Рыбаковым");
        Author ivan = new Author("Иваном", "Тургеневым");
        Book swordLords = new Book("Тяжелый песок", anatoly, 1978);
        Book frigatDrivers = new Book("Отцы и дети", ivan, 1950);

        swordLords.setBookYear(1971);
        System.out.println(swordLords);
        System.out.println(frigatDrivers);
    }
}