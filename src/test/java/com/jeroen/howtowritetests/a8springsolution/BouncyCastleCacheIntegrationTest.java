package com.jeroen.howtowritetests.a8springsolution;

import com.jeroen.howtowritetests.a1naming.Person;
import com.jeroen.howtowritetests.a8spring.BouncyCastleClient;
import com.jeroen.howtowritetests.a8spring.BouncyCastleService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.when;

@SpringBootTest
public class BouncyCastleCacheIntegrationTest {

    @MockBean
    BouncyCastleClient bouncyCastleClient;

    @Autowired
    BouncyCastleService bouncyCastleService;

    @Test
    public void firstTest() {
        when(bouncyCastleClient.getPerson())
                .thenReturn(new Person("Jos", "Vermeulen"));

        assertThat(bouncyCastleService.getAllowedPersons())
                .isNotEmpty();
    }

    @Test
    public void secondTest() {
        when(bouncyCastleClient.getPerson())
                .thenReturn(new Person("Jos", "Vermeulen"));

        assertThat(bouncyCastleService.getAllowedPersons())
                .isNotEmpty();
    }
}
