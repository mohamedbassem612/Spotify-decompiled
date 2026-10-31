package j$.time.chrono;

import j$.time.DateTimeException;
import j$.time.Instant;
import j$.time.LocalTime;
import j$.time.ZoneId;
import j$.time.format.ResolverStyle;
import j$.time.temporal.ChronoField;
import j$.time.temporal.Temporal;
import j$.time.temporal.TemporalAccessor;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-d9f8928238715ac698104c66898e5631a6796c71eabc0cbc140853337a7ef765 */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes13.dex */
public interface Chronology extends Comparable<Chronology> {
    static Chronology n(TemporalAccessor temporalAccessor) {
        Objects.requireNonNull(temporalAccessor, "temporal");
        Chronology chronology = (Chronology) temporalAccessor.d(j$.time.temporal.m.b);
        IsoChronology isoChronology = IsoChronology.INSTANCE;
        if (chronology != null) {
            return chronology;
        }
        Objects.requireNonNull(isoChronology, "defaultObj");
        return isoChronology;
    }

    int A(j jVar, int i);

    ChronoLocalDate E(TemporalAccessor temporalAccessor);

    default ChronoZonedDateTime G(Temporal temporal) {
        try {
            ZoneId zoneIdP = ZoneId.p(temporal);
            try {
                return N(Instant.x(temporal), zoneIdP);
            } catch (DateTimeException unused) {
                return i.x(zoneIdP, null, e.p(this, H(temporal)));
            }
        } catch (DateTimeException e) {
            throw new DateTimeException("Unable to obtain ChronoZonedDateTime from TemporalAccessor: " + temporal.getClass(), e);
        }
    }

    default ChronoLocalDateTime H(TemporalAccessor temporalAccessor) {
        try {
            return E(temporalAccessor).F(LocalTime.D(temporalAccessor));
        } catch (DateTimeException e) {
            throw new DateTimeException("Unable to obtain ChronoLocalDateTime from TemporalAccessor: " + temporalAccessor.getClass(), e);
        }
    }

    ChronoLocalDate M(Map map, ResolverStyle resolverStyle);

    default ChronoZonedDateTime N(Instant instant, ZoneId zoneId) {
        return i.D(this, instant, zoneId);
    }

    ChronoLocalDate date(int i, int i2, int i3);

    ChronoLocalDate dateEpochDay(long j);

    ChronoLocalDate dateNow();

    ChronoLocalDate dateYearDay(int i, int i2);

    boolean equals(Object obj);

    j eraOf(int i);

    List eras();

    String getCalendarType();

    String getId();

    int hashCode();

    boolean isLeapYear(long j);

    String toString();

    j$.time.temporal.o w(ChronoField chronoField);

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: z, reason: merged with bridge method [inline-methods] */
    int compareTo(Chronology chronology);
}
