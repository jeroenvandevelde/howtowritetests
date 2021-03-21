package com.jeroen.howtowritetests.a1naming;

import org.junit.jupiter.api.Test;

import static com.jeroen.howtowritetests.a1naming.Constants.FIRST_NAME;
import static com.jeroen.howtowritetests.a1naming.Constants.LAST_NAME;
import static org.assertj.core.api.Assertions.assertThat;

class PersonTest {

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
                .isEqualTo(FIRST_NAME);
    }
}