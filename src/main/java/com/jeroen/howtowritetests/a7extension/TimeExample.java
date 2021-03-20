package com.jeroen.howtowritetests.a7extension;

import java.time.LocalDateTime;

public class TimeExample {
    public LocalDateTime getCurrentTime() {
        return DateTimeProvider.now();
    }
}
