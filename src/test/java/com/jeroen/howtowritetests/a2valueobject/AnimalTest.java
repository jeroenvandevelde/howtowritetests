package com.jeroen.howtowritetests.a2valueobject;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class AnimalTest {

    @Test
    void whenAnimalWithSameNameAndSpecieShouldBeEqual() {
        Animal duckTom = new Animal("Tom", "duck");
        Animal duckTom2 = new Animal("Tom", "duck");

        assertThat(duckTom)
                .isEqualTo(duckTom2);
    }

}