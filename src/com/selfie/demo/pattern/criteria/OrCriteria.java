package com.selfie.demo.pattern.criteria;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Created by sgtt003 on 6/2/2016.
 */
public class OrCriteria implements Criteria {
    private Criteria criteria;
    private Criteria otherCriteria;

    public OrCriteria(Criteria criteria, Criteria otherCriteria) {
        this.criteria = criteria;
        this.otherCriteria = otherCriteria;
    }

    @Override
    public List<Person> meetCriteria(List<Person> persons) {
        List<Person> firstMeetPersons = criteria.meetCriteria(persons);
        List<Person> otherMeetPersons = otherCriteria.meetCriteria(persons);

        for (Person person : otherMeetPersons) {
            if (!firstMeetPersons.contains(person)) {
                firstMeetPersons.add(person);
            }
        }

        return firstMeetPersons;
    }
}
