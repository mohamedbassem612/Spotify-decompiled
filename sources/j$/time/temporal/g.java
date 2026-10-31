package j$.time.temporal;

import j$.time.Duration;

/* JADX INFO: compiled from: r8-map-id-d9f8928238715ac698104c66898e5631a6796c71eabc0cbc140853337a7ef765 */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes13.dex */
public enum g implements TemporalUnit {
    WEEK_BASED_YEARS("WeekBasedYears", Duration.ofSeconds(31556952)),
    QUARTER_YEARS("QuarterYears", Duration.ofSeconds(7889238));

    public final String a;
    public final Duration b;

    g(String str, Duration duration) {
        this.a = str;
        this.b = duration;
    }

    @Override // j$.time.temporal.TemporalUnit
    public final long between(Temporal temporal, Temporal temporal2) {
        if (temporal.getClass() != temporal2.getClass()) {
            return temporal.until(temporal2, this);
        }
        int i = a.a[ordinal()];
        if (i == 1) {
            f fVar = h.c;
            return Math.subtractExact(temporal2.j(fVar), temporal.j(fVar));
        }
        if (i == 2) {
            return temporal.until(temporal2, ChronoUnit.MONTHS) / 3;
        }
        throw new IllegalStateException("Unreachable");
    }

    @Override // j$.time.temporal.TemporalUnit
    public final Duration getDuration() {
        return this.b;
    }

    @Override // j$.time.temporal.TemporalUnit
    public final boolean isDurationEstimated() {
        return true;
    }

    @Override // j$.time.temporal.TemporalUnit
    public final Temporal p(Temporal temporal, long j) {
        int i = a.a[ordinal()];
        if (i == 1) {
            f fVar = h.c;
            return temporal.a(fVar, Math.addExact(temporal.g(fVar), j));
        }
        if (i == 2) {
            return temporal.b(j / 4, ChronoUnit.YEARS).b((j % 4) * 3, ChronoUnit.MONTHS);
        }
        throw new IllegalStateException("Unreachable");
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.a;
    }
}
