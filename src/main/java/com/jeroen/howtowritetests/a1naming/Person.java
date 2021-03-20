package com.jeroen.howtowritetests.a1naming;

public record Person(String firstName, String lastName) {
    String getFullName() {
        if (lastName == null) {
            return firstName;
        }
        return firstName + lastName;
    }

    //Necessary as this spring/jackson version doesn't work with records
    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }
}

