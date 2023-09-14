package Lesson;

public class Lesson1 {


    public static void main(String[] args) {

        String nameJohn = "John";
        int ageJohn = 13;

        String namesSarah = "Sarah";
        int ageSarah = 30;

        String[] names = {"Sarah" , "Sarah"};
        int[] ages = {13, 30};

        for (int i =0; i < names.length; i++) {
            System.out.println("Имя - " + names[i] + " Возраст - " + ages [i]);
        }
        Person sarah = new Person("Sarah", 30);
        System.out.println("sarah.name = " + sarah.getName());
        System.out.println("sarah.age = " + sarah.getAge());
        sarah.setAge(31);
        System.out.println("sarah.getAge() = " + sarah.getAge());
        Person jonh = new Person("jonh", 13);


    }
}

