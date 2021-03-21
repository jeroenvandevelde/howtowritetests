package com.jeroen.howtowritetests.a5pure;

import com.jeroen.howtowritetests.a1naming.Person;
import com.jeroen.howtowritetests.a8spring.PersonRepository;

//Split phase refactor
public class PureExample {
    private final PersonRepository personRepository = new PersonRepository();

    public Person toExecuteLogic() {
        //Do Some business logic
        Person person = httpRequestFindPerson();
        //Do Some Business logic
        Person parent = personRepository.findParent(person);
        //Do some business logic
        return new Person(person.firstName(), parent.getLastName());
    }

    private Person httpRequestFindPerson() {
        return new Person("Jos", "Vermeuelen");
    }

}
