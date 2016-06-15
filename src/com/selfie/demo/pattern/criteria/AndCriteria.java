package com.selfie.demo.pattern.criteria;

import java.util.List;

/**
 * Created by sgtt003 on 6/2/2016.
 */
public class AndCriteria implements Criteria {
    private Criteria criteria;
    private Criteria otherCriteria;

    public AndCriteria(Criteria criteria, Criteria otherCriteria) {
        this.criteria = criteria;
        this.otherCriteria = otherCriteria;
    }

    @Override
    public List<Person> meetCriteria(List<Person> persons) {
        List<Person> firstMeetPersons = criteria.meetCriteria(persons);
        return otherCriteria.meetCriteria(firstMeetPersons);
    }
}
