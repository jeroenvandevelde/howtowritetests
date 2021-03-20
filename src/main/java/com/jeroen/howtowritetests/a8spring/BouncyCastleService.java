package com.jeroen.howtowritetests.a8spring;

import com.jeroen.howtowritetests.a1naming.Person;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BouncyCastleService {
    private final IBouncyCastleClient bouncyCastleClient;

    public BouncyCastleService(IBouncyCastleClient bouncyCastleClient) {
        this.bouncyCastleClient = bouncyCastleClient;
    }

    public List<Person> getAllowedPersons() {
        return List.of(bouncyCastleClient.getPerson());
    }
}
