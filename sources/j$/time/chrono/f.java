package j$.time.chrono;

import j$.time.Instant;
import j$.time.temporal.ChronoField;
import j$.time.temporal.ChronoUnit;
import j$.time.temporal.Temporal;
import j$.time.temporal.TemporalAccessor;
import j$.time.temporal.TemporalAmount;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;

/* JADX INFO: compiled from: r8-map-id-d9f8928238715ac698104c66898e5631a6796c71eabc0cbc140853337a7ef765 */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes13.dex */
public final class f implements TemporalAmount, Serializable {
    public static final /* synthetic */ int e = 0;
    private static final long serialVersionUID = 57387258289L;
    public final Chronology a;
    public final int b;
    public final int c;
    public final int d;

    static {
        j$.desugar.sun.nio.fs.g.o(new Object[]{ChronoUnit.YEARS, ChronoUnit.MONTHS, ChronoUnit.DAYS});
    }

    public f(Chronology chronology, int i, int i2, int i3) {
        this.a = chronology;
        this.b = i;
        this.c = i2;
        this.d = i3;
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    public final long a() {
        j$.time.temporal.o oVarW = this.a.w(ChronoField.MONTH_OF_YEAR);
        if (oVarW.a == oVarW.b && oVarW.c == oVarW.d && oVarW.d()) {
            return (oVarW.d - oVarW.a) + 1;
        }
        return -1L;
    }

    public final void b(TemporalAccessor temporalAccessor) {
        Chronology chronology = (Chronology) temporalAccessor.d(j$.time.temporal.m.b);
        if (chronology == null || this.a.equals(chronology)) {
            return;
        }
        j$.nio.file.r.f("Chronology mismatch, expected: ", this.a.getId(), ", actual: ", chronology.getId());
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return this.b == fVar.b && this.c == fVar.c && this.d == fVar.d && this.a.equals(fVar.a);
    }

    public final int hashCode() {
        return this.a.hashCode() ^ (Integer.rotateLeft(this.d, 16) + (Integer.rotateLeft(this.c, 8) + this.b));
    }

    @Override // j$.time.temporal.TemporalAmount
    public final Temporal p(Temporal temporal) {
        b(temporal);
        if (this.c == 0) {
            int i = this.b;
            if (i != 0) {
                temporal = temporal.b(i, ChronoUnit.YEARS);
            }
        } else {
            long jA = a();
            int i2 = this.b;
            if (jA > 0) {
                temporal = temporal.b((((long) i2) * jA) + ((long) this.c), ChronoUnit.MONTHS);
            } else {
                if (i2 != 0) {
                    temporal = temporal.b(i2, ChronoUnit.YEARS);
                }
                temporal = temporal.b(this.c, ChronoUnit.MONTHS);
            }
        }
        int i3 = this.d;
        return i3 != 0 ? temporal.b(i3, ChronoUnit.DAYS) : temporal;
    }

    public final String toString() {
        if (this.b == 0 && this.c == 0 && this.d == 0) {
            return this.a.toString() + " P0D";
        }
        StringBuilder sb = new StringBuilder();
        sb.append(this.a.toString());
        sb.append(" P");
        int i = this.b;
        if (i != 0) {
            sb.append(i);
            sb.append('Y');
        }
        int i2 = this.c;
        if (i2 != 0) {
            sb.append(i2);
            sb.append('M');
        }
        int i3 = this.d;
        if (i3 != 0) {
            sb.append(i3);
            sb.append('D');
        }
        return sb.toString();
    }

    public Object writeReplace() {
        return new a0((byte) 9, this);
    }

    @Override // j$.time.temporal.TemporalAmount
    public final Temporal x(Instant instant) {
        Instant instantC;
        Temporal temporalC;
        b(instant);
        if (this.c == 0) {
            int i = this.b;
            if (i != 0) {
                temporalC = instant;
                temporalC = instant.c(i, ChronoUnit.YEARS);
            }
        } else {
            long jA = a();
            int i2 = this.b;
            if (jA > 0) {
                instantC = instant;
                temporalC = instant.c((((long) i2) * jA) + ((long) this.c), ChronoUnit.MONTHS);
            } else {
                if (i2 != 0) {
                    instantC = instant.c(i2, ChronoUnit.YEARS);
                }
                temporalC = instantC.c(this.c, ChronoUnit.MONTHS);
            }
        }
        temporalC = instant;
        int i3 = this.d;
        return i3 != 0 ? temporalC.c(i3, ChronoUnit.DAYS) : temporalC;
    }
}
