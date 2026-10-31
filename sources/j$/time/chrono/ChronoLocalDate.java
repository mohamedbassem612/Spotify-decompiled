package j$.time.chrono;

import j$.time.LocalTime;
import j$.time.temporal.ChronoField;
import j$.time.temporal.ChronoUnit;
import j$.time.temporal.Temporal;
import j$.time.temporal.TemporalAmount;
import j$.time.temporal.TemporalField;
import j$.time.temporal.TemporalUnit;

/* JADX INFO: compiled from: r8-map-id-d9f8928238715ac698104c66898e5631a6796c71eabc0cbc140853337a7ef765 */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes13.dex */
public interface ChronoLocalDate extends Temporal, j$.time.temporal.k, Comparable<ChronoLocalDate> {
    default ChronoLocalDateTime F(LocalTime localTime) {
        return new e(this, localTime);
    }

    default ChronoLocalDate L(TemporalAmount temporalAmount) {
        return c.p(getChronology(), temporalAmount.p(this));
    }

    @Override // j$.time.temporal.Temporal
    default ChronoLocalDate a(TemporalField temporalField, long j) {
        if (temporalField instanceof ChronoField) {
            throw new j$.time.temporal.n(j$.time.b.a("Unsupported field: ", temporalField));
        }
        return c.p(getChronology(), temporalField.O(this, j));
    }

    @Override // j$.time.temporal.Temporal
    default ChronoLocalDate b(long j, TemporalUnit temporalUnit) {
        if (!(temporalUnit instanceof ChronoUnit)) {
            return c.p(getChronology(), temporalUnit.p(this, j));
        }
        j$.nio.file.r.d("Unsupported unit: ", temporalUnit);
        return null;
    }

    @Override // j$.time.temporal.Temporal
    default ChronoLocalDate c(long j, TemporalUnit temporalUnit) {
        return c.p(getChronology(), super.c(j, temporalUnit));
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // java.lang.Comparable
    default int compareTo(ChronoLocalDate chronoLocalDate) {
        int iCompare = Long.compare(toEpochDay(), chronoLocalDate.toEpochDay());
        if (iCompare != 0) {
            return iCompare;
        }
        return ((a) getChronology()).compareTo(chronoLocalDate.getChronology());
    }

    @Override // j$.time.temporal.TemporalAccessor
    default Object d(j$.time.d dVar) {
        if (dVar == j$.time.temporal.m.a || dVar == j$.time.temporal.m.e || dVar == j$.time.temporal.m.d || dVar == j$.time.temporal.m.g) {
            return null;
        }
        if (dVar == j$.time.temporal.m.b) {
            return getChronology();
        }
        return dVar == j$.time.temporal.m.c ? ChronoUnit.DAYS : dVar.k(this);
    }

    boolean equals(Object obj);

    @Override // j$.time.temporal.k
    default Temporal f(Temporal temporal) {
        return temporal.a(ChronoField.EPOCH_DAY, toEpochDay());
    }

    Chronology getChronology();

    default j getEra() {
        return getChronology().eraOf(g(ChronoField.ERA));
    }

    @Override // j$.time.temporal.TemporalAccessor
    default boolean h(TemporalField temporalField) {
        if (temporalField instanceof ChronoField) {
            return ((ChronoField) temporalField).isDateBased();
        }
        return temporalField != null && temporalField.p(this);
    }

    int hashCode();

    @Override // j$.time.temporal.Temporal
    default ChronoLocalDate i(j$.time.temporal.k kVar) {
        return c.p(getChronology(), kVar.f(this));
    }

    default boolean isLeapYear() {
        return getChronology().isLeapYear(j(ChronoField.YEAR));
    }

    default int lengthOfYear() {
        return isLeapYear() ? 366 : 365;
    }

    default long toEpochDay() {
        return j(ChronoField.EPOCH_DAY);
    }

    String toString();

    @Override // j$.time.temporal.Temporal
    long until(Temporal temporal, TemporalUnit temporalUnit);
}
