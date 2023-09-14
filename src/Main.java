import Library.Author;
import Library.Book;
public class Main {
    public static void main(String[] args) {
        Author anatoly = new Author("Анатолием", "Рыбаковым");
        Author ivan = new Author("Иваном", "Тургеневым");
        Book heavySands  = new Book("Тяжелый песок", anatoly, 1978);
        Book fatherChildren = new Book("Отцы и дети", ivan, 1950);

        heavySands.setBookYear(1971);
        System.out.println(heavySands);
        System.out.println(fatherChildren);

        if(heavySands.equals(fatherChildren)){
            System.out.println( " Книги одинаковые");
        }else{
            System.out.println("Книги разные");
        }
        System.out.println(heavySands.hashCode());
        System.out.println(fatherChildren.hashCode());

    }
}