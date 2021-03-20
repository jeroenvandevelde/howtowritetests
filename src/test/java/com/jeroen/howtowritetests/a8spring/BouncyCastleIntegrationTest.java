package com.jeroen.howtowritetests.a8spring;

import com.jeroen.howtowritetests.a1naming.Person;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Import;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.when;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.DEFINED_PORT)
@Import(BouncyCastleClientConfig.class)
public class BouncyCastleIntegrationTest {

    @Autowired
    BouncyCastleStub bouncyCastleStub;

    @Autowired
    BouncyCastleService bouncyCastleService;

    @Test
    public void test() {
        when(bouncyCastleStub.getPerson("123"))
                .thenReturn(new Person("Jos", "Vermeulen"));

        assertThat(bouncyCastleService.getAllowedPersons())
                .isNotEmpty();
    }
}
