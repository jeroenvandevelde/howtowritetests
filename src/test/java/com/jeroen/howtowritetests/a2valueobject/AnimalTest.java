package com.jeroen.howtowritetests.a2valueobject;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class AnimalTest {

    @Test
    void whenAnimalWithSameNameAndSpecieShouldBeEqual() {
        Animal duckTom = new Animal("Tom", "Grouchy smurf");
        Animal duckTom2 = new Animal("Tom", "Grouchy smurf"); //Grouchy smurf Moppersmurf

        assertThat(duckTom)
                .isEqualTo(duckTom2);
    }

}