package com.jeroen.howtowritetests.a8springsolution;

import com.jeroen.howtowritetests.a1naming.Person;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public interface BouncyCastleStub {

    @GetMapping(value = "person", produces = "application/json")
    Person getPerson(@RequestParam("id") String id);
}
