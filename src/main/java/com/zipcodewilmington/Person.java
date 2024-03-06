package com.zipcodewilmington;

/**
 * Created by leon on 1/24/18.
 */
public class Person {
    private final String firstName;
    private final String lastName;


    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    // why is this called a GETTER??
    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    @Override // why is Override here??
    public String toString() {
        return new StringBuilder()
                .append("\nMy first name is " + firstName)
                .append("\nMy last name is " + lastName)
                .toString();
    }
}
