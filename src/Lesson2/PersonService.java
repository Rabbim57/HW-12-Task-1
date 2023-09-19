package Lesson2;

import Lesson.Person;

public class PersonService {
    public boolean isAdult (Person person) {
        return person.getAge() > 18;
    }
}
