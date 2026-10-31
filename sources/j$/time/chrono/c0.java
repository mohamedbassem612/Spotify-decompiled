package j$.time.chrono;

import j$.time.Clock;
import j$.time.Instant;
import j$.time.LocalDate;
import j$.time.ZoneId;
import j$.time.format.ResolverStyle;
import j$.time.temporal.ChronoField;
import j$.time.temporal.Temporal;
import j$.time.temporal.TemporalAccessor;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-d9f8928238715ac698104c66898e5631a6796c71eabc0cbc140853337a7ef765 */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes13.dex */
public final class c0 extends a implements Serializable {
    public static final c0 c = new c0();
    private static final long serialVersionUID = 2775954514031616474L;

    static {
        HashMap map = new HashMap();
        HashMap map2 = new HashMap();
        HashMap map3 = new HashMap();
        map.put("en", new String[]{"BB", "BE"});
        map.put("th", new String[]{"BB", "BE"});
        map2.put("en", new String[]{"B.B.", "B.E."});
        map2.put("th", new String[]{"พ.ศ.", "ปีก่อนคริสต์กาลที่"});
        map3.put("en", new String[]{"Before Buddhist", "Budhhist Era"});
        map3.put("th", new String[]{"พุทธศักราช", "ปีก่อนคริสต์กาลที่"});
    }

    private c0() {
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    @Override // j$.time.chrono.Chronology
    public final int A(j jVar, int i) {
        if (jVar instanceof f0) {
            return jVar == f0.BE ? i : 1 - i;
        }
        throw new ClassCastException("Era must be BuddhistEra");
    }

    @Override // j$.time.chrono.Chronology
    public final ChronoLocalDate E(TemporalAccessor temporalAccessor) {
        return temporalAccessor instanceof e0 ? (e0) temporalAccessor : new e0(LocalDate.D(temporalAccessor));
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
        return (e0) super.M(map, resolverStyle);
    }

    @Override // j$.time.chrono.Chronology
    public final ChronoZonedDateTime N(Instant instant, ZoneId zoneId) {
        return i.D(this, instant, zoneId);
    }

    @Override // j$.time.chrono.Chronology
    public final ChronoLocalDate date(int i, int i2, int i3) {
        return new e0(LocalDate.of(i - 543, i2, i3));
    }

    @Override // j$.time.chrono.Chronology
    public final ChronoLocalDate dateEpochDay(long j) {
        return new e0(LocalDate.ofEpochDay(j));
    }

    @Override // j$.time.chrono.Chronology
    public final ChronoLocalDate dateNow() {
        return new e0(LocalDate.D(LocalDate.now(Clock.systemDefaultZone())));
    }

    @Override // j$.time.chrono.Chronology
    public final ChronoLocalDate dateYearDay(int i, int i2) {
        return new e0(LocalDate.S(i - 543, i2));
    }

    @Override // j$.time.chrono.Chronology
    public final j eraOf(int i) {
        if (i == 0) {
            return f0.BEFORE_BE;
        }
        if (i == 1) {
            return f0.BE;
        }
        j$.nio.file.r.b("Invalid era: ", i);
        return null;
    }

    @Override // j$.time.chrono.Chronology
    public final List eras() {
        return j$.desugar.sun.nio.fs.g.o(f0.values());
    }

    @Override // j$.time.chrono.Chronology
    public final String getCalendarType() {
        return "buddhist";
    }

    @Override // j$.time.chrono.Chronology
    public final String getId() {
        return "ThaiBuddhist";
    }

    @Override // j$.time.chrono.Chronology
    public final boolean isLeapYear(long j) {
        return IsoChronology.INSTANCE.isLeapYear(j - 543);
    }

    @Override // j$.time.chrono.Chronology
    public final j$.time.temporal.o w(ChronoField chronoField) {
        int i = b0.a[chronoField.ordinal()];
        if (i == 1) {
            j$.time.temporal.o oVar = ChronoField.PROLEPTIC_MONTH.b;
            return j$.time.temporal.o.f(oVar.a + 6516, oVar.d + 6516);
        }
        if (i == 2) {
            j$.time.temporal.o oVar2 = ChronoField.YEAR.b;
            return j$.time.temporal.o.g(1L, (-(oVar2.a + 543)) + 1, oVar2.d + 543);
        }
        if (i != 3) {
            return chronoField.b;
        }
        j$.time.temporal.o oVar3 = ChronoField.YEAR.b;
        return j$.time.temporal.o.f(oVar3.a + 543, oVar3.d + 543);
    }

    public Object writeReplace() {
        return new a0((byte) 1, this);
    }
}
