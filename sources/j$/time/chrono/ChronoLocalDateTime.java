package j$.time.chrono;

import j$.time.Instant;
import j$.time.LocalTime;
import j$.time.ZoneId;
import j$.time.ZoneOffset;
import j$.time.chrono.ChronoLocalDate;
import j$.time.temporal.ChronoField;
import j$.time.temporal.ChronoUnit;
import j$.time.temporal.Temporal;
import j$.time.temporal.TemporalField;
import j$.time.temporal.TemporalUnit;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-d9f8928238715ac698104c66898e5631a6796c71eabc0cbc140853337a7ef765 */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes13.dex */
public interface ChronoLocalDateTime<D extends ChronoLocalDate> extends Temporal, j$.time.temporal.k, Comparable<ChronoLocalDateTime<?>> {
    ChronoZonedDateTime C(ZoneId zoneId);

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: J */
    default int compareTo(ChronoLocalDateTime chronoLocalDateTime) {
        int iCompareTo = toLocalDate().compareTo(chronoLocalDateTime.toLocalDate());
        return (iCompareTo == 0 && (iCompareTo = toLocalTime().compareTo(chronoLocalDateTime.toLocalTime())) == 0) ? getChronology().compareTo(chronoLocalDateTime.getChronology()) : iCompareTo;
    }

    @Override // j$.time.temporal.Temporal
    ChronoLocalDateTime a(TemporalField temporalField, long j);

    @Override // j$.time.temporal.Temporal
    ChronoLocalDateTime b(long j, TemporalUnit temporalUnit);

    @Override // j$.time.temporal.Temporal
    default ChronoLocalDateTime c(long j, TemporalUnit temporalUnit) {
        return e.p(getChronology(), super.c(j, temporalUnit));
    }

    @Override // j$.time.temporal.TemporalAccessor
    default Object d(j$.time.d dVar) {
        if (dVar == j$.time.temporal.m.a || dVar == j$.time.temporal.m.e || dVar == j$.time.temporal.m.d) {
            return null;
        }
        if (dVar == j$.time.temporal.m.g) {
            return toLocalTime();
        }
        if (dVar == j$.time.temporal.m.b) {
            return getChronology();
        }
        return dVar == j$.time.temporal.m.c ? ChronoUnit.NANOS : dVar.k(this);
    }

    @Override // j$.time.temporal.k
    default Temporal f(Temporal temporal) {
        return temporal.a(ChronoField.EPOCH_DAY, toLocalDate().toEpochDay()).a(ChronoField.NANO_OF_DAY, toLocalTime().W());
    }

    default Chronology getChronology() {
        return toLocalDate().getChronology();
    }

    @Override // j$.time.temporal.Temporal
    default ChronoLocalDateTime i(j$.time.temporal.k kVar) {
        return e.p(getChronology(), kVar.f(this));
    }

    default long toEpochSecond(ZoneOffset zoneOffset) {
        Objects.requireNonNull(zoneOffset, "offset");
        return ((toLocalDate().toEpochDay() * 86400) + ((long) toLocalTime().toSecondOfDay())) - ((long) zoneOffset.getTotalSeconds());
    }

    default Instant toInstant(ZoneOffset zoneOffset) {
        return Instant.ofEpochSecond(toEpochSecond(zoneOffset), toLocalTime().d);
    }

    ChronoLocalDate toLocalDate();

    LocalTime toLocalTime();
}
