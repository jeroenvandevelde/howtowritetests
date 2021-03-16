package com.jeroen.howtowritetests.a1naming;

public record Person(String firstName, String lastName) {
    String getFullName() {
        if (lastName == null) {
            return firstName;
        }
        return firstName + lastName;
    }
}

