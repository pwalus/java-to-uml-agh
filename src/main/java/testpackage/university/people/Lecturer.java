package testpackage.university.people;

import testpackage.abstraction.Person;

public class Lecturer extends Person<Long> {

    private Double salary;

    public Double getSalary() {
        return salary;
    }
}