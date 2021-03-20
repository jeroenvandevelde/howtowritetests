package com.jeroen.howtowritetests.a5pure;

import com.jeroen.howtowritetests.a1naming.Person;

public class PureExample {

    public void toExecuteLogic() {
        Person person = httpRequestFindPerson();
        doSomeBusinessLogic(person);
        //TODO write this out without the podcast

    }

    private Person httpRequestFindPerson() {
        return new Person("Jos", "Vermeuelen");
    }

    private void doSomeBusinessLogic(Person person) {
    }
}
