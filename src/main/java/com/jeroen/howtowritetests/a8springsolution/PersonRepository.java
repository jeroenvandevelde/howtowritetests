package com.jeroen.howtowritetests.a8springsolution;

import com.jeroen.howtowritetests.a1naming.Person;
import org.springframework.stereotype.Repository;

@Repository
public class PersonRepository {

    public Person findParent(Person person) {
        return new Person("Bart", "Blommaerts");
    }
}
