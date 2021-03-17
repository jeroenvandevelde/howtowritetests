package com.jeroen.howtowritetests.a5extension;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.RegisterExtension;

import static org.assertj.core.api.Assertions.assertThat;

class TimeExampleTest {

    @RegisterExtension
    FixedTimeExtension fixedTimeExtension = FixedTimeExtension.freezeNow();

    @Test
    void testExtension() {
        assertThat(new TimeExample().getCurrentTime())
                .isEqualTo(DateTimeProvider.now());
    }
}