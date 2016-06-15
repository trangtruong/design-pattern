package com.selfie.demo.pattern.criteria;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by sgtt003 on 6/2/2016.
 */
public class CriteriaFemale implements Criteria {
    @Override
    public List<Person> meetCriteria(List<Person> persons) {
        List<Person> femalePersons = new ArrayList<>();
        for (Person person : persons) {
            if (person.getGender().equalsIgnoreCase("FeMale")) {
                femalePersons.add(person);
            }
        }
        return femalePersons;

    }
}
