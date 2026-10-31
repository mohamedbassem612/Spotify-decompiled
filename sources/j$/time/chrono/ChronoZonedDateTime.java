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

/* JADX INFO: compiled from: r8-map-id-d9f8928238715ac698104c66898e5631a6796c71eabc0cbc140853337a7ef765 */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes13.dex */
public interface ChronoZonedDateTime<D extends ChronoLocalDate> extends Temporal, Comparable<ChronoZonedDateTime<?>> {
    ChronoZonedDateTime B(ZoneId zoneId);

    @Override // j$.time.temporal.Temporal
    ChronoZonedDateTime a(TemporalField temporalField, long j);

    @Override // j$.time.temporal.Temporal
    ChronoZonedDateTime b(long j, TemporalUnit temporalUnit);

    @Override // j$.time.temporal.Temporal
    default ChronoZonedDateTime c(long j, TemporalUnit temporalUnit) {
        return i.p(getChronology(), super.c(j, temporalUnit));
    }

    @Override // j$.time.temporal.TemporalAccessor
    default Object d(j$.time.d dVar) {
        if (dVar == j$.time.temporal.m.e || dVar == j$.time.temporal.m.a) {
            return getZone();
        }
        if (dVar == j$.time.temporal.m.d) {
            return getOffset();
        }
        if (dVar == j$.time.temporal.m.g) {
            return toLocalTime();
        }
        if (dVar == j$.time.temporal.m.b) {
            return getChronology();
        }
        return dVar == j$.time.temporal.m.c ? ChronoUnit.NANOS : dVar.k(this);
    }

    @Override // j$.time.temporal.TemporalAccessor
    default int g(TemporalField temporalField) {
        if (!(temporalField instanceof ChronoField)) {
            return super.g(temporalField);
        }
        int i = g.a[((ChronoField) temporalField).ordinal()];
        if (i != 1) {
            return i != 2 ? toLocalDateTime().g(temporalField) : getOffset().getTotalSeconds();
        }
        throw new j$.time.temporal.n("Invalid field 'InstantSeconds' for get() method, use getLong() instead");
    }

    default Chronology getChronology() {
        return toLocalDate().getChronology();
    }

    ZoneOffset getOffset();

    ZoneId getZone();

    @Override // j$.time.temporal.Temporal
    default ChronoZonedDateTime i(j$.time.temporal.k kVar) {
        return i.p(getChronology(), kVar.f(this));
    }

    @Override // j$.time.temporal.TemporalAccessor
    default long j(TemporalField temporalField) {
        if (!(temporalField instanceof ChronoField)) {
            return temporalField.K(this);
        }
        int i = g.a[((ChronoField) temporalField).ordinal()];
        if (i != 1) {
            return i != 2 ? toLocalDateTime().j(temporalField) : getOffset().getTotalSeconds();
        }
        return toEpochSecond();
    }

    @Override // j$.time.temporal.TemporalAccessor
    default j$.time.temporal.o k(TemporalField temporalField) {
        if (temporalField instanceof ChronoField) {
            return (temporalField == ChronoField.INSTANT_SECONDS || temporalField == ChronoField.OFFSET_SECONDS) ? ((ChronoField) temporalField).b : toLocalDateTime().k(temporalField);
        }
        return temporalField.x(this);
    }

    ChronoZonedDateTime l(ZoneId zoneId);

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
    default int compareTo(ChronoZonedDateTime chronoZonedDateTime) {
        int iCompare = Long.compare(toEpochSecond(), chronoZonedDateTime.toEpochSecond());
        return (iCompare == 0 && (iCompare = toLocalTime().d - chronoZonedDateTime.toLocalTime().d) == 0 && (iCompare = toLocalDateTime().compareTo(chronoZonedDateTime.toLocalDateTime())) == 0 && (iCompare = getZone().getId().compareTo(chronoZonedDateTime.getZone().getId())) == 0) ? getChronology().compareTo(chronoZonedDateTime.getChronology()) : iCompare;
    }

    default long toEpochSecond() {
        return ((toLocalDate().toEpochDay() * 86400) + ((long) toLocalTime().toSecondOfDay())) - ((long) getOffset().getTotalSeconds());
    }

    default Instant toInstant() {
        return Instant.ofEpochSecond(toEpochSecond(), toLocalTime().d);
    }

    default ChronoLocalDate toLocalDate() {
        return toLocalDateTime().toLocalDate();
    }

    ChronoLocalDateTime toLocalDateTime();

    default LocalTime toLocalTime() {
        return toLocalDateTime().toLocalTime();
    }
}
