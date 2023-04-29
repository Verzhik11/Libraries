package org.example;

import org.apache.commons.lang3.StringUtils;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class EmployeeBook {
    Map<String, Employee> employees;

    public EmployeeBook() {
        this.employees = new HashMap<>();

    }

    public Employee addEmployee(Employee employee) {
        boolean a;
        boolean b;
        a = checkLetters(employee);
        b = checkSymbols(employee);
        if (a == false || b == false) {
            System.out.println("400 Bad Request");
        } else if (employees.containsValue(employee)) {
            throw new RuntimeException("Такой сотрудник уже есть");
        } else {
            employees.put(employee.getFullName(), employee);
        }
        return employee;
    }

    public void showAll() {
        for (Map.Entry<String, Employee> entry : employees.entrySet() ) {
            String key = entry.getKey();
            Employee employee = entry.getValue();
            System.out.println(key +": "+ employee);
        }
    }

    public Map<String, Employee> getEmployees() {
        return Collections.unmodifiableMap(employees);
    }

    public void removeEmployee(Employee employee) {
        if (employees.containsKey(employee.getFullName())) {
            employees.remove(employee.getFullName());
        }
    }

    public void findEmployee(Employee employee) {
        if (employees.containsKey(employee.getFullName())) {
            System.out.println(employee);
        } else {
            System.out.println("Сотрудник не найден");
        }
    }
    public boolean checkLetters (Employee employee) {
        return StringUtils.isAlpha(employee.getFullNameTogether());
    }
    public static boolean checkSymbols (Employee employee) {
        return !employee.getFullNameTogether().matches("\\W");
    }
}
