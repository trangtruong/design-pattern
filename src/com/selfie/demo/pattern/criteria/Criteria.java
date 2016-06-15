package com.selfie.demo.pattern.criteria;

import java.util.List;

/**
 * Created by sgtt003 on 6/2/2016.
 */
public interface Criteria {
    public List<Person> meetCriteria(List<Person> persons);
}
