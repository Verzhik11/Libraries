package org.example;

import org.apache.commons.lang3.StringUtils;

import java.util.Map;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        EmployeeBook employeeBook = new EmployeeBook();
        Map<String, Employee> emp = employeeBook.getEmployees();
        employeeBook.addEmployee(new Employee("wolf", "messing%"));
        employeeBook.addEmployee(new Employee("brad", "Pitt"));
        employeeBook.addEmployee(new Employee("alan", "Po"));
        //employeeBook.removeEmployee(new Employee("Brad", "Pitt"));
        employeeBook.showAll();
        System.out.println(StringUtils.upperCase(emp.values().toString()));
        String s = emp.entrySet().stream()
                .map(e -> e.getKey().toString()).collect(Collectors.joining("|"));
        System.out.println(s);
        for (Map.Entry<String, Employee> entry : emp.entrySet()) {
            String key = entry.getKey();
            Employee employee = entry.getValue();
            System.out.println(StringUtils.capitalize(employee.getName() + " " + StringUtils.capitalize(employee.getLastname())));
        }
        //System.out.println(StringUtils.capitalize(emp.values().toString()));
        //Employee emp1 = new Employee("Richad1", "Geer");
        //System.out.println(StringUtils.capitalize(emp1.getName()) + " " + StringUtils.capitalize(emp1.getLastname()));
        //System.out.println(StringUtils.isAlpha(emp1.getName()));
    }
}