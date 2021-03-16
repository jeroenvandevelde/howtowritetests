package com.jeroen.howtowritetests.a1naming;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class PersonTest {

    public static final String FIRST_NAME = "Jeroen";
    public static final String LAST_NAME = "Vandevelde";

    @Test
    void testGetFullName() {
        Person person = new Person(FIRST_NAME, LAST_NAME);

        assertThat(person.getFullName())
                .isEqualTo(FIRST_NAME + LAST_NAME);
    }

    @Test
    void testGetName() {
        Person person = new Person(FIRST_NAME, null);

        assertThat(person.getFullName())
                .isEqualTo("Jeroen");
    }
}