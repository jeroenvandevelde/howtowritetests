package com.jeroen.howtowritetests.a8spring;

import com.jeroen.howtowritetests.a1naming.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import java.util.Map;

@Component
public class BouncyCastleClient implements IBouncyCastleClient {
    @Autowired
    RestTemplate restTemplate;

    @Override
    public Person getPerson() {
        return restTemplate.getForObject("http://localhost:8080/person?id={id}", Person.class, Map.of("id","123"));
    }
}
