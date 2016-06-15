package com.selfie.demo.pattern.criteria;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by sgtt003 on 6/2/2016.
 */
public class CriteriaMale implements Criteria {
    @Override
    public List<Person> meetCriteria(List<Person> persons) {
        List<Person> malePersons = new ArrayList<>();
        for (Person person : persons) {
            if (person.getGender().equalsIgnoreCase("Male")) {
                malePersons.add(person);
            }
        }
        return malePersons;
    }
}
