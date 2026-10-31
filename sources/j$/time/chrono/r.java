package j$.time.chrono;

import j$.time.Clock;
import j$.time.DateTimeException;
import j$.time.Instant;
import j$.time.LocalDate;
import j$.time.ZoneId;
import j$.time.format.ResolverStyle;
import j$.time.temporal.ChronoField;
import j$.time.temporal.ChronoUnit;
import j$.time.temporal.Temporal;
import j$.time.temporal.TemporalAccessor;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-d9f8928238715ac698104c66898e5631a6796c71eabc0cbc140853337a7ef765 */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes13.dex */
public final class r extends a implements Serializable {
    public static final r c = new r();
    private static final long serialVersionUID = 459996390165777884L;

    private r() {
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    @Override // j$.time.chrono.Chronology
    public final int A(j jVar, int i) {
        if (!(jVar instanceof u)) {
            throw new ClassCastException("Era must be JapaneseEra");
        }
        u uVar = (u) jVar;
        int year = (uVar.b.getYear() + i) - 1;
        if (i == 1 || (year >= -999999999 && year <= 999999999 && year >= uVar.b.getYear() && jVar == u.m(LocalDate.of(year, 1, 1)))) {
            return year;
        }
        j$.nio.file.r.h("Invalid yearOfEra value");
        return 0;
    }

    @Override // j$.time.chrono.Chronology
    public final ChronoLocalDate E(TemporalAccessor temporalAccessor) {
        return temporalAccessor instanceof t ? (t) temporalAccessor : new t(LocalDate.D(temporalAccessor));
    }

    @Override // j$.time.chrono.Chronology
    public final ChronoZonedDateTime G(Temporal temporal) {
        return super.G(temporal);
    }

    @Override // j$.time.chrono.Chronology
    public final ChronoLocalDateTime H(TemporalAccessor temporalAccessor) {
        return super.H(temporalAccessor);
    }

    @Override // j$.time.chrono.a, j$.time.chrono.Chronology
    public final ChronoLocalDate M(Map map, ResolverStyle resolverStyle) {
        return (t) super.M(map, resolverStyle);
    }

    @Override // j$.time.chrono.Chronology
    public final ChronoZonedDateTime N(Instant instant, ZoneId zoneId) {
        return i.D(this, instant, zoneId);
    }

    @Override // j$.time.chrono.a
    public final ChronoLocalDate Q(Map map, ResolverStyle resolverStyle) {
        t tVarQ;
        ChronoField chronoField = ChronoField.ERA;
        Long l = (Long) map.get(chronoField);
        u uVarO = l != null ? u.o(w(chronoField).a(chronoField, l.longValue())) : null;
        ChronoField chronoField2 = ChronoField.YEAR_OF_ERA;
        Long l2 = (Long) map.get(chronoField2);
        int iA = l2 != null ? w(chronoField2).a(chronoField2, l2.longValue()) : 0;
        if (uVarO == null && l2 != null && !map.containsKey(ChronoField.YEAR) && resolverStyle != ResolverStyle.STRICT) {
            u[] uVarArr = u.e;
            uVarO = ((u[]) Arrays.copyOf(uVarArr, uVarArr.length))[((u[]) Arrays.copyOf(uVarArr, uVarArr.length)).length - 1];
        }
        if (l2 != null && uVarO != null) {
            ChronoField chronoField3 = ChronoField.MONTH_OF_YEAR;
            if (map.containsKey(chronoField3)) {
                ChronoField chronoField4 = ChronoField.DAY_OF_MONTH;
                if (map.containsKey(chronoField4)) {
                    map.remove(chronoField);
                    map.remove(chronoField2);
                    if (resolverStyle == ResolverStyle.LENIENT) {
                        return new t(LocalDate.of((uVarO.b.getYear() + iA) - 1, 1, 1)).P(Math.subtractExact(((Long) map.remove(chronoField3)).longValue(), 1L), ChronoUnit.MONTHS).P(Math.subtractExact(((Long) map.remove(chronoField4)).longValue(), 1L), ChronoUnit.DAYS);
                    }
                    int iA2 = w(chronoField3).a(chronoField3, ((Long) map.remove(chronoField3)).longValue());
                    int iA3 = w(chronoField4).a(chronoField4, ((Long) map.remove(chronoField4)).longValue());
                    if (resolverStyle != ResolverStyle.SMART) {
                        LocalDate localDate = t.d;
                        LocalDate localDateOf = LocalDate.of((uVarO.b.getYear() + iA) - 1, iA2, iA3);
                        if (!localDateOf.isBefore(uVarO.b) && uVarO == u.m(localDateOf)) {
                            return new t(uVarO, iA, localDateOf);
                        }
                        j$.nio.file.r.h("year, month, and day not valid for Era");
                        return null;
                    }
                    if (iA < 1) {
                        j$.nio.file.r.b("Invalid YearOfEra: ", iA);
                        return null;
                    }
                    int year = (uVarO.b.getYear() + iA) - 1;
                    try {
                        tVarQ = new t(LocalDate.of(year, iA2, iA3));
                    } catch (DateTimeException unused) {
                        tVarQ = new t(LocalDate.of(year, iA2, 1)).Q(new j$.time.d((byte) 5));
                    }
                    if (tVarQ.b == uVarO || tVarQ.g(ChronoField.YEAR_OF_ERA) <= 1 || iA <= 1) {
                        return tVarQ;
                    }
                    throw new DateTimeException("Invalid YearOfEra for Era: " + uVarO + " " + iA);
                }
            }
            ChronoField chronoField5 = ChronoField.DAY_OF_YEAR;
            if (map.containsKey(chronoField5)) {
                map.remove(chronoField);
                map.remove(chronoField2);
                if (resolverStyle == ResolverStyle.LENIENT) {
                    return new t(LocalDate.S((uVarO.b.getYear() + iA) - 1, 1)).P(Math.subtractExact(((Long) map.remove(chronoField5)).longValue(), 1L), ChronoUnit.DAYS);
                }
                int iA4 = w(chronoField5).a(chronoField5, ((Long) map.remove(chronoField5)).longValue());
                LocalDate localDate2 = t.d;
                LocalDate localDate3 = uVarO.b;
                LocalDate localDateS = iA == 1 ? LocalDate.S(localDate3.getYear(), (uVarO.b.O() + iA4) - 1) : LocalDate.S((localDate3.getYear() + iA) - 1, iA4);
                if (!localDateS.isBefore(uVarO.b) && uVarO == u.m(localDateS)) {
                    return new t(uVarO, iA, localDateS);
                }
                j$.nio.file.r.h("Invalid parameters");
            }
        }
        return null;
    }

    @Override // j$.time.chrono.Chronology
    public final ChronoLocalDate date(int i, int i2, int i3) {
        return new t(LocalDate.of(i, i2, i3));
    }

    @Override // j$.time.chrono.Chronology
    public final ChronoLocalDate dateEpochDay(long j) {
        return new t(LocalDate.ofEpochDay(j));
    }

    @Override // j$.time.chrono.Chronology
    public final ChronoLocalDate dateNow() {
        return new t(LocalDate.D(LocalDate.now(Clock.systemDefaultZone())));
    }

    @Override // j$.time.chrono.Chronology
    public final ChronoLocalDate dateYearDay(int i, int i2) {
        return new t(LocalDate.S(i, i2));
    }

    @Override // j$.time.chrono.Chronology
    public final j eraOf(int i) {
        return u.o(i);
    }

    @Override // j$.time.chrono.Chronology
    public final List eras() {
        u[] uVarArr = u.e;
        return j$.desugar.sun.nio.fs.g.o((u[]) Arrays.copyOf(uVarArr, uVarArr.length));
    }

    @Override // j$.time.chrono.Chronology
    public final String getCalendarType() {
        return "japanese";
    }

    @Override // j$.time.chrono.Chronology
    public final String getId() {
        return "Japanese";
    }

    @Override // j$.time.chrono.Chronology
    public final boolean isLeapYear(long j) {
        return IsoChronology.INSTANCE.isLeapYear(j);
    }

    @Override // j$.time.chrono.Chronology
    public final j$.time.temporal.o w(ChronoField chronoField) {
        switch (q.a[chronoField.ordinal()]) {
            case 1:
            case 2:
            case 3:
            case 4:
                j$.nio.file.r.d("Unsupported field: ", chronoField);
                return null;
            case 5:
                u[] uVarArr = u.e;
                int year = uVarArr[uVarArr.length - 1].b.getYear();
                int year2 = 1000000000 - uVarArr[uVarArr.length - 1].b.getYear();
                int year3 = uVarArr[0].b.getYear();
                int i = 1;
                while (true) {
                    u[] uVarArr2 = u.e;
                    if (i >= uVarArr2.length) {
                        return j$.time.temporal.o.g(1L, year2, 999999999 - year);
                    }
                    u uVar = uVarArr2[i];
                    year2 = Math.min(year2, (uVar.b.getYear() - year3) + 1);
                    year3 = uVar.b.getYear();
                    i++;
                }
                break;
            case 6:
                u uVar2 = u.d;
                long j = ChronoField.DAY_OF_YEAR.b.c;
                long jMin = j;
                for (u uVar3 : u.e) {
                    long jMin2 = Math.min(jMin, (uVar3.b.lengthOfYear() - uVar3.b.O()) + 1);
                    jMin = uVar3.n() != null ? Math.min(jMin2, uVar3.n().b.O() - 1) : jMin2;
                }
                return j$.time.temporal.o.g(1L, jMin, ChronoField.DAY_OF_YEAR.b.d);
            case 7:
                return j$.time.temporal.o.f(t.d.getYear(), 999999999L);
            case 8:
                long j2 = u.d.a;
                u[] uVarArr3 = u.e;
                return j$.time.temporal.o.f(j2, uVarArr3[uVarArr3.length - 1].a);
            default:
                return chronoField.b;
        }
    }

    public Object writeReplace() {
        return new a0((byte) 1, this);
    }
}
