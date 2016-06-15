package com.selfie.demo.pattern.composite;

/**
 * Created by sgtt003 on 6/2/2016.
 */
public class CompositePatternDemo {
    public static void main(String[] args) {
        Employee CEO = new Employee("John", Employee.DEPARTMENT.CEO.name(), 4500);
        Employee headSales= new Employee("Robert", Employee.DEPARTMENT.HEADSALES.name(), 4500);
        Employee headMarketing = new Employee("Machel", Employee.DEPARTMENT.HEADMARKETING.name(), 4500);

        Employee clerk1 = new Employee("Claura", Employee.DEPARTMENT.MARKETING.name(), 4500);
        Employee clerk2 = new Employee("Bob", Employee.DEPARTMENT.MARKETING.name(), 4500);

        Employee salesExcutive1 = new Employee("Richard", Employee.DEPARTMENT.SALES.name(), 4500);
        Employee salesExcutive2 = new Employee("Rob", Employee.DEPARTMENT.SALES.name(), 4500);

        CEO.add(headMarketing);
        CEO.add(headSales);

        headMarketing.add(clerk1);
        headMarketing.add(clerk2);

        headSales.add(salesExcutive1);
        headSales.add(salesExcutive2);

        printAllEmployee(CEO);
    }

    private static void printAllEmployee(Employee employee) {
        System.out.println(employee.toString());
        if (!employee.getSubordinates().isEmpty()) {
            for (Employee emp : employee.getSubordinates()) {
                printAllEmployee(emp);
            }
        }
    }
}
