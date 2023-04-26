package org.example;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class EmployeeBook {
    Map<String, Employee> employees;

    public EmployeeBook() {
        this.employees = new HashMap<>();

    }

    public String addEmployee(Employee employee) {
        if (employees.containsValue(employee)) {
            throw new RuntimeException("Такой сотрудник уже есть");
        } else {
            employees.put(employee.getFullName(), employee);
        }
        return null;
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
}
