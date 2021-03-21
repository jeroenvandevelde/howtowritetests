package com.jeroen.howtowritetests.a8springsolution;

import org.mockito.Mockito;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BouncyCastleClientConfig {
    @Bean
    public BouncyCastleStub bouncyCastleStub() {
        return Mockito.mock(BouncyCastleStub.class);
    }
}
