package org.example;

import org.apache.commons.lang3.StringUtils;

import java.util.Objects;

public class Employee {
    private final String name;
    private final String lastname;


    public Employee(String name, String lastname) {
        this.name = StringUtils.capitalize(name);
        this.lastname = StringUtils.capitalize(lastname);
    }

    public String toString() {
        return this.name + " " + this.lastname;
    }

    public String getName() {
        return name;
    }

    public String getLastname() {
        return lastname;
    }

    public String getFullName() {
        return name + " " + lastname;
    }
    public String getFullNameTogether() {
        return name + lastname;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return name.equals(employee.name) && lastname.equals(employee.lastname);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, lastname);
    }
}
