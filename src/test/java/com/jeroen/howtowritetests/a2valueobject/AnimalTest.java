package com.jeroen.howtowritetests.a2valueobject;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class AnimalTest {

    @Test
    void whenAnimalWithSameNameAndSpecieShouldBeEqual() {
        Animal sheepRaf = new Animal("Raf", "sheep");
        Animal sheepTom = new Animal("Tom", "sheep");

        assertThat(sheepRaf)
                .isEqualTo(sheepTom);
    }

}