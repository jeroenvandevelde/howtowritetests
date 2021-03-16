package com.jeroen.howtowritetests.a3assertj;

import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.stream.Collectors;

import static org.assertj.core.api.Assertions.assertThat;

class ChildTest {

    //https://assertj.github.io/doc/

    //Extracting list or map
    @Test
    void isChildOlderThan12_ShouldReturnOnlyChildrenOlderThan12() {
        Child bart = new Child("Bart", 4);
        Child nick = new Child("Nick", 5);
        Child bram = new Child("Bram", 17);
        Child kevin = new Child("Kevin", 16);

        List<Child> children = List.of(bart, kevin, nick, bram);

        List<Child> allowedChildrenOnTheBouncyCastle = children.stream()
                .filter(Child::isAllowedOnTheBouncyCastle)
                .collect(Collectors.toList());

        List<String> allowedNamesForTheBouncyCastle = allowedChildrenOnTheBouncyCastle.stream()
                .map(Child::name)
                .collect(Collectors.toList());

        assertThat(allowedNamesForTheBouncyCastle)
                .containsOnly("Bram", "Kevin");
    }

}