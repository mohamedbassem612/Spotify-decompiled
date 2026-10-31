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
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-d9f8928238715ac698104c66898e5631a6796c71eabc0cbc140853337a7ef765 */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes13.dex */
public final class w extends a implements Serializable {
    public static final w c = new w();
    private static final long serialVersionUID = 1039765215346859963L;

    private w() {
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    @Override // j$.time.chrono.Chronology
    public final int A(j jVar, int i) {
        if (jVar instanceof z) {
            return jVar == z.ROC ? i : 1 - i;
        }
        throw new ClassCastException("Era must be MinguoEra");
    }

    @Override // j$.time.chrono.Chronology
    public final ChronoLocalDate E(TemporalAccessor temporalAccessor) {
        return temporalAccessor instanceof y ? (y) temporalAccessor : new y(LocalDate.D(temporalAccessor));
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
        return (y) super.M(map, resolverStyle);
    }

    @Override // j$.time.chrono.Chronology
    public final ChronoZonedDateTime N(Instant instant, ZoneId zoneId) {
        return i.D(this, instant, zoneId);
    }

    @Override // j$.time.chrono.Chronology
    public final ChronoLocalDate date(int i, int i2, int i3) {
        return new y(LocalDate.of(i + 1911, i2, i3));
    }

    @Override // j$.time.chrono.Chronology
    public final ChronoLocalDate dateEpochDay(long j) {
        return new y(LocalDate.ofEpochDay(j));
    }

    @Override // j$.time.chrono.Chronology
    public final ChronoLocalDate dateNow() {
        return new y(LocalDate.D(LocalDate.now(Clock.systemDefaultZone())));
    }

    @Override // j$.time.chrono.Chronology
    public final ChronoLocalDate dateYearDay(int i, int i2) {
        return new y(LocalDate.S(i + 1911, i2));
    }

    @Override // j$.time.chrono.Chronology
    public final j eraOf(int i) {
        if (i == 0) {
            return z.BEFORE_ROC;
        }
        if (i == 1) {
            return z.ROC;
        }
        j$.nio.file.r.b("Invalid era: ", i);
        return null;
    }

    @Override // j$.time.chrono.Chronology
    public final List eras() {
        return j$.desugar.sun.nio.fs.g.o(z.values());
    }

    @Override // j$.time.chrono.Chronology
    public final String getCalendarType() {
        return "roc";
    }

    @Override // j$.time.chrono.Chronology
    public final String getId() {
        return "Minguo";
    }

    @Override // j$.time.chrono.Chronology
    public final boolean isLeapYear(long j) {
        return IsoChronology.INSTANCE.isLeapYear(j + 1911);
    }

    @Override // j$.time.chrono.Chronology
    public final j$.time.temporal.o w(ChronoField chronoField) {
        int i = v.a[chronoField.ordinal()];
        if (i == 1) {
            j$.time.temporal.o oVar = ChronoField.PROLEPTIC_MONTH.b;
            return j$.time.temporal.o.f(oVar.a - 22932, oVar.d - 22932);
        }
        if (i == 2) {
            j$.time.temporal.o oVar2 = ChronoField.YEAR.b;
            return j$.time.temporal.o.g(1L, oVar2.d - 1911, (-oVar2.a) + 1912);
        }
        if (i != 3) {
            return chronoField.b;
        }
        j$.time.temporal.o oVar3 = ChronoField.YEAR.b;
        return j$.time.temporal.o.f(oVar3.a - 1911, oVar3.d - 1911);
    }

    public Object writeReplace() {
        return new a0((byte) 1, this);
    }
}
