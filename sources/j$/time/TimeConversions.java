package j$.time;

/* JADX INFO: compiled from: r8-map-id-d9f8928238715ac698104c66898e5631a6796c71eabc0cbc140853337a7ef765 */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes13.dex */
public class TimeConversions {
    public static java.time.LocalDate convert(LocalDate localDate) {
        if (localDate == null) {
            return null;
        }
        return java.time.LocalDate.of(localDate.getYear(), localDate.getMonthValue(), localDate.getDayOfMonth());
    }

    public static java.time.Instant convert(Instant instant) {
        if (instant == null) {
            return null;
        }
        return java.time.Instant.ofEpochSecond(instant.getEpochSecond(), instant.getNano());
    }

    public static java.time.LocalTime convert(LocalTime localTime) {
        if (localTime == null) {
            return null;
        }
        return java.time.LocalTime.ofNanoOfDay(localTime.W());
    }

    public static java.time.Duration convert(Duration duration) {
        if (duration == null) {
            return null;
        }
        return java.time.Duration.ofSeconds(duration.getSeconds(), duration.getNano());
    }
}
