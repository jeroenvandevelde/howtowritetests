package com.jeroen.howtowritetests.a3assertj;

public record Child(String name, int age) {

    public boolean isAllowedOnTheBouncyCastle() {
        return age > 12;
    }

}
