package j$.time;

import j$.time.chrono.Chronology;
import j$.time.chrono.IsoChronology;
import j$.time.format.DateTimeFormatterBuilder;
import j$.time.format.ResolverStyle;
import j$.time.format.c0;
import j$.time.temporal.ChronoField;
import j$.time.temporal.ChronoUnit;
import j$.time.temporal.Temporal;
import j$.time.temporal.TemporalField;
import j$.time.temporal.TemporalUnit;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.Locale;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-d9f8928238715ac698104c66898e5631a6796c71eabc0cbc140853337a7ef765 */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes13.dex */
public final class q implements Temporal, j$.time.temporal.k, Comparable, Serializable {
    public static final /* synthetic */ int b = 0;
    private static final long serialVersionUID = -23038383694477807L;
    public final int a;

    static {
        DateTimeFormatterBuilder dateTimeFormatterBuilder = new DateTimeFormatterBuilder();
        dateTimeFormatterBuilder.o(ChronoField.YEAR, 4, 10, c0.EXCEEDS_PAD);
        dateTimeFormatterBuilder.s(Locale.getDefault(), ResolverStyle.SMART, null);
    }

    public q(int i) {
        this.a = i;
    }

    public static q p(int i) {
        ChronoField.YEAR.P(i);
        return new q(i);
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private Object writeReplace() {
        return new o((byte) 11, this);
    }

    public final q D(long j) {
        if (j == 0) {
            return this;
        }
        ChronoField chronoField = ChronoField.YEAR;
        return p(chronoField.b.a(chronoField, ((long) this.a) + j));
    }

    @Override // j$.time.temporal.Temporal
    /* JADX INFO: renamed from: K, reason: merged with bridge method [inline-methods] */
    public final q a(TemporalField temporalField, long j) {
        if (!(temporalField instanceof ChronoField)) {
            return (q) temporalField.O(this, j);
        }
        ChronoField chronoField = (ChronoField) temporalField;
        chronoField.P(j);
        int i = p.a[chronoField.ordinal()];
        if (i == 1) {
            if (this.a < 1) {
                j = 1 - j;
            }
            return p((int) j);
        }
        if (i == 2) {
            return p((int) j);
        }
        if (i == 3) {
            return j(ChronoField.ERA) == j ? this : p(1 - this.a);
        }
        throw new j$.time.temporal.n(b.a("Unsupported field: ", temporalField));
    }

    @Override // j$.time.temporal.Temporal
    public final Temporal c(long j, TemporalUnit temporalUnit) {
        long j2;
        if (j == Long.MIN_VALUE) {
            this = b(Long.MAX_VALUE, temporalUnit);
            j2 = 1;
        } else {
            j2 = -j;
        }
        return this.b(j2, temporalUnit);
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return this.a - ((q) obj).a;
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final Object d(d dVar) {
        if (dVar == j$.time.temporal.m.b) {
            return IsoChronology.INSTANCE;
        }
        return dVar == j$.time.temporal.m.c ? ChronoUnit.YEARS : super.d(dVar);
    }

    @Override // j$.time.temporal.Temporal
    /* JADX INFO: renamed from: e */
    public final Temporal i(LocalDate localDate) {
        return (q) localDate.f(this);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof q) && this.a == ((q) obj).a;
    }

    @Override // j$.time.temporal.k
    public final Temporal f(Temporal temporal) {
        if (Chronology.n(temporal).equals(IsoChronology.INSTANCE)) {
            return temporal.a(ChronoField.YEAR, this.a);
        }
        j$.nio.file.r.h("Adjustment only supported on ISO date-time");
        return null;
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final int g(TemporalField temporalField) {
        return k(temporalField).a(temporalField, j(temporalField));
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final boolean h(TemporalField temporalField) {
        if (temporalField instanceof ChronoField) {
            return temporalField == ChronoField.YEAR || temporalField == ChronoField.YEAR_OF_ERA || temporalField == ChronoField.ERA;
        }
        return temporalField != null && temporalField.p(this);
    }

    public final int hashCode() {
        return this.a;
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final long j(TemporalField temporalField) {
        if (!(temporalField instanceof ChronoField)) {
            return temporalField.K(this);
        }
        int i = p.a[((ChronoField) temporalField).ordinal()];
        if (i == 1) {
            int i2 = this.a;
            if (i2 < 1) {
                i2 = 1 - i2;
            }
            return i2;
        }
        if (i == 2) {
            return this.a;
        }
        if (i == 3) {
            return this.a < 1 ? 0 : 1;
        }
        throw new j$.time.temporal.n(b.a("Unsupported field: ", temporalField));
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final j$.time.temporal.o k(TemporalField temporalField) {
        if (temporalField == ChronoField.YEAR_OF_ERA) {
            return j$.time.temporal.o.f(1L, this.a <= 0 ? 1000000000L : 999999999L);
        }
        return super.k(temporalField);
    }

    public final String toString() {
        return Integer.toString(this.a);
    }

    @Override // j$.time.temporal.Temporal
    public final long until(Temporal temporal, TemporalUnit temporalUnit) {
        q qVarP;
        if (temporal instanceof q) {
            qVarP = (q) temporal;
        } else {
            Objects.requireNonNull(temporal, "temporal");
            try {
                if (!IsoChronology.INSTANCE.equals(Chronology.n(temporal))) {
                    temporal = LocalDate.D(temporal);
                }
                qVarP = p(temporal.g(ChronoField.YEAR));
            } catch (DateTimeException e) {
                j$.nio.file.r.g("Unable to obtain Year from TemporalAccessor: ", temporal, temporal.getClass().getName(), e);
                return 0L;
            }
        }
        if (!(temporalUnit instanceof ChronoUnit)) {
            return temporalUnit.between(this, qVarP);
        }
        long j = ((long) qVarP.a) - ((long) this.a);
        int i = p.b[((ChronoUnit) temporalUnit).ordinal()];
        if (i == 1) {
            return j;
        }
        if (i == 2) {
            return j / 10;
        }
        if (i == 3) {
            return j / 100;
        }
        if (i == 4) {
            return j / 1000;
        }
        if (i == 5) {
            ChronoField chronoField = ChronoField.ERA;
            return qVarP.j(chronoField) - j(chronoField);
        }
        j$.nio.file.r.d("Unsupported unit: ", temporalUnit);
        return 0L;
    }

    @Override // j$.time.temporal.Temporal
    /* JADX INFO: renamed from: x, reason: merged with bridge method [inline-methods] */
    public final q b(long j, TemporalUnit temporalUnit) {
        if (!(temporalUnit instanceof ChronoUnit)) {
            return (q) temporalUnit.p(this, j);
        }
        int i = p.b[((ChronoUnit) temporalUnit).ordinal()];
        if (i == 1) {
            return D(j);
        }
        if (i == 2) {
            return D(Math.multiplyExact(j, 10L));
        }
        if (i == 3) {
            return D(Math.multiplyExact(j, 100L));
        }
        if (i == 4) {
            return D(Math.multiplyExact(j, 1000L));
        }
        if (i == 5) {
            ChronoField chronoField = ChronoField.ERA;
            return a(chronoField, Math.addExact(j(chronoField), j));
        }
        j$.nio.file.r.d("Unsupported unit: ", temporalUnit);
        return null;
    }
}
