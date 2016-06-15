package com.selfie.demo.pattern.composite;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by sgtt003 on 6/2/2016.
 */
public class Employee {
    private String name;
    public enum DEPARTMENT {HEADMARKETING, HEADSALES, CEO, MARKETING, SALES}
    private String dept;
    private float salary;
    private List<Employee> subordinates;

    public Employee(String name, String dept, float salary) {
        this.name = name;
        this.dept = DEPARTMENT.valueOf(dept).name();
        this.salary = salary;
        subordinates = new ArrayList<>();
    }

    public void add(Employee employee){
        subordinates.add(employee);
    }
    public void remove(Employee employee){
        subordinates.remove(employee);
    }

    public List<Employee> getSubordinates() {
        return subordinates;
    }

    @Override
    public String toString() {
        return "Employee [" +
                "name='" + name + '\'' +
                ", dept='" + dept + '\'' +
                ", salary=" + salary +
                ']';
    }
}
