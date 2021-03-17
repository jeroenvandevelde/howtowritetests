package com.jeroen.howtowritetests.a4testbuilder;

import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.assertj.core.api.Assertions.assertThatThrownBy;

public class LoanTest {

    @Test
    void validateThatNegativeLoansAreNotPossible() {
        assertThatThrownBy(() -> new Loan("Joske",
                "Vermeulen",
                BigDecimal.valueOf(-5),
                "Trammesantlei",
                "122",
                "Schoten",
                "Belgium",
                "male",
                true,
                false,
                10,
                false))
                .isInstanceOf(IllegalArgumentException.class);
    }

    //https://blog.cleancoder.com/uncle-bob/2017/03/03/TDD-Harms-Architecture.html
    //https://ordina-jworks.github.io/testing/2019/08/23/test-design.html
    @Test
    void validateThatNegativeLoansAreNotPossible_1() {
        assertThatThrownBy(() -> new Loan("Joske",
                "Vermeulen",
                BigDecimal.valueOf(-5),
                "Trammesantlei",
                "122",
                "Schoten",
                "Belgium",
                "male",
                true,
                false,
                10,
                false))
                .isInstanceOf(IllegalArgumentException.class);
    }

    @Test
    void validateThatNegativeLoansAreNotPossible_2() {
        assertThatThrownBy(() -> new Loan("Joske",
                "Vermeulen",
                BigDecimal.valueOf(-5),
                "Trammesantlei",
                "122",
                "Schoten",
                "Belgium",
                "male",
                true,
                false,
                10,
                false))
                .isInstanceOf(IllegalArgumentException.class);
    }

    @Test
    void validateThatNegativeLoansAreNotPossible_3() {
        assertThatThrownBy(() -> new Loan("Joske",
                "Vermeulen",
                BigDecimal.valueOf(-5),
                "Trammesantlei",
                "122",
                "Schoten",
                "Belgium",
                "male",
                true,
                false,
                10,
                false))
                .isInstanceOf(IllegalArgumentException.class);
    }

    @Test
    void validateThatNegativeLoansAreNotPossible_4() {
        assertThatThrownBy(() -> new Loan("Joske",
                "Vermeulen",
                BigDecimal.valueOf(-5),
                "Trammesantlei",
                "122",
                "Schoten",
                "Belgium",
                "male",
                true,
                false,
                10,
                false))
                .isInstanceOf(IllegalArgumentException.class);
    }

    @Test
    void validateThatNegativeLoansAreNotPossible_5() {
        assertThatThrownBy(() -> new Loan("Joske",
                "Vermeulen",
                BigDecimal.valueOf(-5),
                "Trammesantlei",
                "122",
                "Schoten",
                "Belgium",
                "male",
                true,
                false,
                10,
                false))
                .isInstanceOf(IllegalArgumentException.class);
    }
}
