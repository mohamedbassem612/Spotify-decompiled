package j$.time;

/* JADX INFO: compiled from: r8-map-id-d9f8928238715ac698104c66898e5631a6796c71eabc0cbc140853337a7ef765 */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes13.dex */
public abstract class Clock {
    public static Clock systemDefaultZone() {
        return new a(ZoneId.systemDefault());
    }

    public static Clock systemUTC() {
        return a.b;
    }

    public boolean equals(Object obj) {
        return this == obj;
    }

    public abstract ZoneId getZone();

    public int hashCode() {
        return super.hashCode();
    }

    public abstract Instant instant();

    public long millis() {
        return instant().toEpochMilli();
    }
}
