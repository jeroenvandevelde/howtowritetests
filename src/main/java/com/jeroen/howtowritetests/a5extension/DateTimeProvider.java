package com.jeroen.howtowritetests.a5extension;

import java.time.*;

import static java.time.Clock.system;

public class DateTimeProvider {
    public static final ZoneId DEFAULT_ZONE_ID = ZoneId.of("UTC");
    private static Clock clock = system(DEFAULT_ZONE_ID);

    private DateTimeProvider() {
    }

    public static ZonedDateTime zonedNow() {
        return ZonedDateTime.now(clock);
    }

    public static LocalDateTime now() {
        return LocalDateTime.now(clock);
    }

    public static Instant timestamp() {
        return Instant.now(clock);
    }
}
