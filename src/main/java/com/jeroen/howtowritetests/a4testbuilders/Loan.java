package com.jeroen.howtowritetests.a4testbuilders;

import java.math.BigDecimal;
//2900
public record Loan(
        String firstName,
        String lastName,
        BigDecimal amount,
        String street,
        String houseNumber,
        String city,
//        int postalCode,
        String country,
        String gender,
        boolean gambler,
        boolean adult,
        int age,
        boolean medicalTopProfession) {
    public Loan {
        if (amount.compareTo(BigDecimal.ZERO) < 0) {
            throw new IllegalArgumentException("You can't have a negative loan");
        }
    }
}
