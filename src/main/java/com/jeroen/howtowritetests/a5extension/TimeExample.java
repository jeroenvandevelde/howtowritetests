package com.jeroen.howtowritetests.a5extension;

import java.time.LocalDateTime;

public class TimeExample {
    public LocalDateTime getCurrentTime() {
        return DateTimeProvider.now();
    }
}
