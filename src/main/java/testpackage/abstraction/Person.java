package testpackage.abstraction;

import testpackage.location.Address;
import testpackage.abstraction.PersistInterface;

public abstract class Person<ID> implements PersistInterface<ID> {

    private String firstName;

    private String lastName;

    private Integer age;

    private Address address;

    public void save() {
        System.out.println("Save entity...");
    }

    public PersistInterface<ID> find(ID id){
        return null;
    }

    public String getFullName() {
        return firstName + " " +lastName;
    }

    protected String getFirstName() {
        return firstName;
    }

    protected String getLastName() {
        return lastName;
    }

    protected Integer getAge() {
        return age;
    }

    private Address getAddress() {
        return address;
    }
}