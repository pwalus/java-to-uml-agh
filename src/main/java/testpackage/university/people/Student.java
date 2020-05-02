package testpackage.university.people;

import java.util.List;
import testpackage.abstraction.Person;
import testpackage.university.learn.Course;

public class Student extends Person<Long> {

    public String department;

    protected String registrationNumber;

    private String PESEL;

    private List<Course> courseList;

    public List<Course> getCourseList() {
        return courseList;
    }
}