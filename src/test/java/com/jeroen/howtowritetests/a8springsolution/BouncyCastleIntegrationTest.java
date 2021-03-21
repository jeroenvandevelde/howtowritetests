package com.jeroen.howtowritetests.a8springsolution;

import com.jeroen.howtowritetests.a1naming.Person;
import com.jeroen.howtowritetests.a8spring.BouncyCastleService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.when;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.DEFINED_PORT)
//@Import(BouncyCastleClientConfig.class)
//PRofile
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
