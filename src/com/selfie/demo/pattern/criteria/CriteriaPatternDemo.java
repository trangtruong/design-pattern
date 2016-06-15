package com.selfie.demo.pattern.criteria;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by sgtt003 on 6/2/2016.
 */
public class CriteriaPatternDemo {
    public static void main(String[] args) {
        List<Person> persons = new ArrayList<>();
        persons = Arrays.asList(new Person("Robert", "Male", "Single"),
                                new Person("John", "Male", "Maried"),
                                new Person("Laura", "Female", "Married"),
                                new Person("Diana", "Female", "Single"),
                                new Person("Bobby", "Male", "Single"),
                                new Person("Mike", "Male", "Single"));

        Criteria male = new CriteriaMale();
        Criteria female = new CriteriaFemale();
        Criteria single = new CriteriaSingle();
        Criteria singleMale = new AndCriteria(single, male);
        Criteria singleOrFemale = new OrCriteria(single, female);

        System.out.println("Males: ");
        printPersons(male.meetCriteria(persons));
        System.out.println("\nFemales: ");
        printPersons(female.meetCriteria(persons));
        System.out.println("\nSingle Males: ");
        printPersons(singleMale.meetCriteria(persons));
        System.out.println("\nSingle Or Females: ");
        printPersons(singleOrFemale.meetCriteria(persons));
    }

    private static void printPersons(List<Person> persons) {
        for (Person person : persons) {
            System.out.println(person.toString());
        }
    }
}
