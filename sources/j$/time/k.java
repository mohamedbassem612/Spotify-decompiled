package j$.time;

import j$.time.chrono.Chronology;
import j$.time.chrono.IsoChronology;
import j$.time.format.DateTimeFormatterBuilder;
import j$.time.format.ResolverStyle;
import j$.time.temporal.ChronoField;
import j$.time.temporal.Temporal;
import j$.time.temporal.TemporalAccessor;
import j$.time.temporal.TemporalField;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.Locale;

/* JADX INFO: compiled from: r8-map-id-d9f8928238715ac698104c66898e5631a6796c71eabc0cbc140853337a7ef765 */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes13.dex */
public final class k implements TemporalAccessor, j$.time.temporal.k, Comparable, Serializable {
    public static final /* synthetic */ int c = 0;
    private static final long serialVersionUID = -939150713474957432L;
    public final int a;
    public final int b;

    static {
        DateTimeFormatterBuilder dateTimeFormatterBuilder = new DateTimeFormatterBuilder();
        dateTimeFormatterBuilder.e("--");
        dateTimeFormatterBuilder.n(ChronoField.MONTH_OF_YEAR, 2);
        dateTimeFormatterBuilder.d('-');
        dateTimeFormatterBuilder.n(ChronoField.DAY_OF_MONTH, 2);
        dateTimeFormatterBuilder.s(Locale.getDefault(), ResolverStyle.SMART, null);
    }

    public k(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private Object writeReplace() {
        return new o((byte) 13, this);
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        k kVar = (k) obj;
        int i = this.a - kVar.a;
        return i == 0 ? this.b - kVar.b : i;
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final Object d(d dVar) {
        return dVar == j$.time.temporal.m.b ? IsoChronology.INSTANCE : super.d(dVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof k) {
            k kVar = (k) obj;
            if (this.a == kVar.a && this.b == kVar.b) {
                return true;
            }
        }
        return false;
    }

    @Override // j$.time.temporal.k
    public final Temporal f(Temporal temporal) {
        if (!Chronology.n(temporal).equals(IsoChronology.INSTANCE)) {
            j$.nio.file.r.h("Adjustment only supported on ISO date-time");
            return null;
        }
        Temporal temporalA = temporal.a(ChronoField.MONTH_OF_YEAR, this.a);
        ChronoField chronoField = ChronoField.DAY_OF_MONTH;
        return temporalA.a(chronoField, Math.min(temporalA.k(chronoField).d, this.b));
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final int g(TemporalField temporalField) {
        return k(temporalField).a(temporalField, j(temporalField));
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final boolean h(TemporalField temporalField) {
        if (temporalField instanceof ChronoField) {
            return temporalField == ChronoField.MONTH_OF_YEAR || temporalField == ChronoField.DAY_OF_MONTH;
        }
        return temporalField != null && temporalField.p(this);
    }

    public final int hashCode() {
        return (this.a << 6) + this.b;
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final long j(TemporalField temporalField) {
        int i;
        if (!(temporalField instanceof ChronoField)) {
            return temporalField.K(this);
        }
        int i2 = j.a[((ChronoField) temporalField).ordinal()];
        if (i2 == 1) {
            i = this.b;
        } else {
            if (i2 != 2) {
                throw new j$.time.temporal.n(b.a("Unsupported field: ", temporalField));
            }
            i = this.a;
        }
        return i;
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final j$.time.temporal.o k(TemporalField temporalField) {
        int i;
        if (temporalField == ChronoField.MONTH_OF_YEAR) {
            return temporalField.range();
        }
        if (temporalField != ChronoField.DAY_OF_MONTH) {
            return super.k(temporalField);
        }
        Month monthK = Month.K(this.a);
        monthK.getClass();
        int i2 = i.a[monthK.ordinal()];
        if (i2 != 1) {
            i = (i2 == 2 || i2 == 3 || i2 == 4 || i2 == 5) ? 30 : 31;
        } else {
            i = 28;
        }
        return j$.time.temporal.o.g(1L, i, Month.K(this.a).D());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(10);
        sb.append("--");
        sb.append(this.a < 10 ? "0" : "");
        sb.append(this.a);
        sb.append(this.b < 10 ? "-0" : "-");
        sb.append(this.b);
        return sb.toString();
    }
}
