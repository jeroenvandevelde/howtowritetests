package com.jeroen.howtowritetests.a2valueobject;

public class Animal /*extends ValueObject*/ {
    private final String name;
    private final String specie;

    public Animal(String name, String specie) {
        this.name = name;
        this.specie = specie;
    }

    public String getName() {
        return name;
    }

    public String getSpecie() {
        return specie;
    }
}
