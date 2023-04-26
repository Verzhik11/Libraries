package org.example;

import org.apache.commons.lang3.StringUtils;

import java.util.Map;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        EmployeeBook employeeBook = new EmployeeBook();
        Map<String, Employee> emp = employeeBook.getEmployees();
        employeeBook.addEmployee(new Employee("wolf", "messing"));
        employeeBook.addEmployee(new Employee("brad", "Pitt"));
        employeeBook.addEmployee(new Employee("alan", "Po"));
        //employeeBook.removeEmployee(new Employee("Brad", "Pitt"));
        employeeBook.showAll();
        System.out.println(StringUtils.upperCase(emp.values().toString()));
        String a = "aaaaa ";
        System.out.println(StringUtils.capitalize(a));
        System.out.println(StringUtils.capitalize(emp.values().toString()));
        Employee emp1 = new Employee("richard", "geer");
        System.out.println(StringUtils.capitalize(emp1.getName()) + " " + StringUtils.capitalize(emp1.getLastname()));

    }

}