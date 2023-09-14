package Lesson2;

import Lesson.Person;

public class Lesson2 {
    public static void main(String[] args) {
        PersonService personService = new PersonService();

        Person sarah = new Person("sarah ", 30);
        if (personService.isAdult((sarah))) {
            System.out.println("Иди в бар");
        } else {
            System.out.println("Иди в школу");
        }
        System.out.println(sarah);
        sarah.increaseAge(-30);
    }
}