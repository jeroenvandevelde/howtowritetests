package com.jeroen.howtowritetests.a4testbuilders;

import java.math.BigDecimal;

public class LoanTestBuilder {
    private String firstName;
    private String lastName;
    private BigDecimal amount;
    private String street;
    private String houseNumber;
    private String city;
    private String country;
    private String gender;
    private boolean gambler;
    private boolean adult;
    private int age;
    private boolean medicalTopProfession;

    private LoanTestBuilder() {
    }

    public static LoanTestBuilder aLoan() {
        return new LoanTestBuilder()
                .withFirstName("Joske")
                .withLastName("Vermeulen")
                .withAmount(BigDecimal.TEN)
                .withStreet("Trammesantlei")
                .withHouseNumber("122")
                .withCity("Schoten")
                .withCountry("België")
                .withGender("male")
                .withGambler(false)
                .withAdult(true)
                .withAge(11)
                .withMedicalTopProfession(false);
    }

    public Loan build() {
        return new Loan(firstName, lastName, amount, street, houseNumber, city, country, gender, gambler, adult, age, medicalTopProfession);
    }

    public LoanTestBuilder withFirstName(String firstName) {
        this.firstName = firstName;
        return this;
    }

    public LoanTestBuilder withLastName(String lastName) {
        this.lastName = lastName;
        return this;
    }

    public LoanTestBuilder withAmount(BigDecimal amount) {
        this.amount = amount;
        return this;
    }

    public LoanTestBuilder withStreet(String street) {
        this.street = street;
        return this;
    }

    public LoanTestBuilder withHouseNumber(String houseNumber) {
        this.houseNumber = houseNumber;
        return this;
    }

    public LoanTestBuilder withCity(String city) {
        this.city = city;
        return this;
    }

    public LoanTestBuilder withCountry(String country) {
        this.country = country;
        return this;
    }

    public LoanTestBuilder withGender(String gender) {
        this.gender = gender;
        return this;
    }

    public LoanTestBuilder withGambler(boolean gambler) {
        this.gambler = gambler;
        return this;
    }

    public LoanTestBuilder withAdult(boolean adult) {
        this.adult = adult;
        return this;
    }

    public LoanTestBuilder withAge(int age) {
        this.age = age;
        return this;
    }

    public LoanTestBuilder withMedicalTopProfession(boolean medicalTopProfession) {
        this.medicalTopProfession = medicalTopProfession;
        return this;
    }
}
