package j$.time.chrono;

import j$.time.Clock;
import j$.time.Instant;
import j$.time.LocalDate;
import j$.time.LocalDateTime;
import j$.time.Month;
import j$.time.ZoneId;
import j$.time.ZonedDateTime;
import j$.time.format.ResolverStyle;
import j$.time.temporal.ChronoField;
import j$.time.temporal.Temporal;
import j$.time.temporal.TemporalAccessor;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-d9f8928238715ac698104c66898e5631a6796c71eabc0cbc140853337a7ef765 */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes13.dex */
public final class IsoChronology extends a implements Serializable {
    public static final IsoChronology INSTANCE = new IsoChronology();
    private static final long serialVersionUID = -1440403870442975015L;

    private IsoChronology() {
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    @Override // j$.time.chrono.Chronology
    public final int A(j jVar, int i) {
        if (jVar instanceof p) {
            return jVar == p.CE ? i : 1 - i;
        }
        throw new ClassCastException("Era must be IsoEra");
    }

    @Override // j$.time.chrono.Chronology
    public final ChronoLocalDate E(TemporalAccessor temporalAccessor) {
        return LocalDate.D(temporalAccessor);
    }

    @Override // j$.time.chrono.Chronology
    public final ChronoZonedDateTime G(Temporal temporal) {
        return ZonedDateTime.x(temporal);
    }

    @Override // j$.time.chrono.Chronology
    public final ChronoLocalDateTime H(TemporalAccessor temporalAccessor) {
        return LocalDateTime.from(temporalAccessor);
    }

    @Override // j$.time.chrono.a, j$.time.chrono.Chronology
    public final ChronoLocalDate M(Map map, ResolverStyle resolverStyle) {
        return (LocalDate) super.M(map, resolverStyle);
    }

    @Override // j$.time.chrono.Chronology
    public final ChronoZonedDateTime N(Instant instant, ZoneId zoneId) {
        return ZonedDateTime.ofInstant(instant, zoneId);
    }

    @Override // j$.time.chrono.a
    public final void O(Map map, ResolverStyle resolverStyle) {
        ChronoField chronoField = ChronoField.PROLEPTIC_MONTH;
        Long l = (Long) map.remove(chronoField);
        if (l != null) {
            if (resolverStyle != ResolverStyle.LENIENT) {
                chronoField.P(l.longValue());
            }
            a.p(map, ChronoField.MONTH_OF_YEAR, ((int) Math.floorMod(l.longValue(), 12L)) + 1);
            a.p(map, ChronoField.YEAR, Math.floorDiv(l.longValue(), 12L));
        }
    }

    @Override // j$.time.chrono.a
    public final ChronoLocalDate P(Map map, ResolverStyle resolverStyle) {
        ChronoField chronoField = ChronoField.YEAR;
        int iA = chronoField.b.a(chronoField, ((Long) map.remove(chronoField)).longValue());
        boolean z = true;
        if (resolverStyle == ResolverStyle.LENIENT) {
            return LocalDate.of(iA, 1, 1).U(Math.subtractExact(((Long) map.remove(ChronoField.MONTH_OF_YEAR)).longValue(), 1L)).plusDays(Math.subtractExact(((Long) map.remove(ChronoField.DAY_OF_MONTH)).longValue(), 1L));
        }
        ChronoField chronoField2 = ChronoField.MONTH_OF_YEAR;
        int iA2 = chronoField2.b.a(chronoField2, ((Long) map.remove(chronoField2)).longValue());
        ChronoField chronoField3 = ChronoField.DAY_OF_MONTH;
        int iA3 = chronoField3.b.a(chronoField3, ((Long) map.remove(chronoField3)).longValue());
        if (resolverStyle == ResolverStyle.SMART) {
            if (iA2 == 4 || iA2 == 6 || iA2 == 9 || iA2 == 11) {
                iA3 = Math.min(iA3, 30);
            } else if (iA2 == 2) {
                Month month = Month.FEBRUARY;
                long j = iA;
                int i = j$.time.q.b;
                if ((3 & j) != 0 || (j % 100 == 0 && j % 400 != 0)) {
                    z = false;
                }
                iA3 = Math.min(iA3, month.x(z));
            }
        }
        return LocalDate.of(iA, iA2, iA3);
    }

    @Override // j$.time.chrono.a
    public final ChronoLocalDate Q(Map map, ResolverStyle resolverStyle) {
        ChronoField chronoField = ChronoField.YEAR_OF_ERA;
        Long l = (Long) map.remove(chronoField);
        if (l != null) {
            if (resolverStyle != ResolverStyle.LENIENT) {
                chronoField.P(l.longValue());
            }
            Long l2 = (Long) map.remove(ChronoField.ERA);
            if (l2 == null) {
                ChronoField chronoField2 = ChronoField.YEAR;
                Long l3 = (Long) map.get(chronoField2);
                if (resolverStyle != ResolverStyle.STRICT) {
                    a.p(map, chronoField2, (l3 == null || l3.longValue() > 0) ? l.longValue() : Math.subtractExact(1L, l.longValue()));
                } else if (l3 != null) {
                    long jLongValue = l3.longValue();
                    long jLongValue2 = l.longValue();
                    if (jLongValue <= 0) {
                        jLongValue2 = Math.subtractExact(1L, jLongValue2);
                    }
                    a.p(map, chronoField2, jLongValue2);
                } else {
                    map.put(chronoField, l);
                }
            } else if (l2.longValue() == 1) {
                a.p(map, ChronoField.YEAR, l.longValue());
            } else {
                if (l2.longValue() != 0) {
                    j$.nio.file.r.j("Invalid value for era: ", l2);
                    return null;
                }
                a.p(map, ChronoField.YEAR, Math.subtractExact(1L, l.longValue()));
            }
        } else {
            ChronoField chronoField3 = ChronoField.ERA;
            if (map.containsKey(chronoField3)) {
                chronoField3.P(((Long) map.get(chronoField3)).longValue());
            }
        }
        return null;
    }

    @Override // j$.time.chrono.Chronology
    public final ChronoLocalDate date(int i, int i2, int i3) {
        return LocalDate.of(i, i2, i3);
    }

    @Override // j$.time.chrono.Chronology
    public final ChronoLocalDate dateEpochDay(long j) {
        return LocalDate.ofEpochDay(j);
    }

    @Override // j$.time.chrono.Chronology
    public final ChronoLocalDate dateNow() {
        Clock clockSystemDefaultZone = Clock.systemDefaultZone();
        Objects.requireNonNull(clockSystemDefaultZone, "clock");
        return LocalDate.D(LocalDate.now(clockSystemDefaultZone));
    }

    @Override // j$.time.chrono.Chronology
    public final ChronoLocalDate dateYearDay(int i, int i2) {
        return LocalDate.S(i, i2);
    }

    @Override // j$.time.chrono.Chronology
    public final j eraOf(int i) {
        if (i == 0) {
            return p.BCE;
        }
        if (i == 1) {
            return p.CE;
        }
        j$.nio.file.r.b("Invalid era: ", i);
        return null;
    }

    @Override // j$.time.chrono.Chronology
    public final List eras() {
        return j$.desugar.sun.nio.fs.g.o(p.values());
    }

    @Override // j$.time.chrono.Chronology
    public final String getCalendarType() {
        return "iso8601";
    }

    @Override // j$.time.chrono.Chronology
    public final String getId() {
        return "ISO";
    }

    @Override // j$.time.chrono.Chronology
    public final boolean isLeapYear(long j) {
        if ((3 & j) == 0) {
            return j % 100 != 0 || j % 400 == 0;
        }
        return false;
    }

    @Override // j$.time.chrono.Chronology
    public final j$.time.temporal.o w(ChronoField chronoField) {
        return chronoField.b;
    }

    public Object writeReplace() {
        return new a0((byte) 1, this);
    }
}
