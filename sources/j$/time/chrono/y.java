package j$.time.chrono;

import j$.time.LocalDate;
import j$.time.LocalTime;
import j$.time.temporal.ChronoField;
import j$.time.temporal.Temporal;
import j$.time.temporal.TemporalAmount;
import j$.time.temporal.TemporalField;
import j$.time.temporal.TemporalUnit;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-d9f8928238715ac698104c66898e5631a6796c71eabc0cbc140853337a7ef765 */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes13.dex */
public final class y extends c {
    private static final long serialVersionUID = 1300372329181994526L;
    public final transient LocalDate a;

    public y(LocalDate localDate) {
        Objects.requireNonNull(localDate, "isoDate");
        this.a = localDate;
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private Object writeReplace() {
        return new a0((byte) 7, this);
    }

    @Override // j$.time.chrono.c
    public final ChronoLocalDate D(long j) {
        return Q(this.a.plusDays(j));
    }

    @Override // j$.time.chrono.ChronoLocalDate
    public final ChronoLocalDateTime F(LocalTime localTime) {
        return new e(this, localTime);
    }

    @Override // j$.time.chrono.c
    public final ChronoLocalDate K(long j) {
        return Q(this.a.U(j));
    }

    @Override // j$.time.chrono.c, j$.time.chrono.ChronoLocalDate
    public final ChronoLocalDate L(TemporalAmount temporalAmount) {
        return (y) super.L(temporalAmount);
    }

    @Override // j$.time.chrono.c
    public final ChronoLocalDate O(long j) {
        return Q(this.a.plusYears(j));
    }

    public final int P() {
        return this.a.getYear() - 1911;
    }

    public final y Q(LocalDate localDate) {
        return localDate.equals(this.a) ? this : new y(localDate);
    }

    /* JADX WARN: Code duplicated, block: B:16:0x004d  */
    /* JADX WARN: Code duplicated, block: B:18:0x005f A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:19:0x0061 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:22:0x006e  */
    /* JADX WARN: Code duplicated, block: B:24:0x007f  */
    /* JADX WARN: Code duplicated, block: B:26:0x008c  */
    /* JADX WARN: Code duplicated, block: B:28:0x0095  */
    /* JADX WARN: Code duplicated, block: B:29:0x0098  */
    @Override // j$.time.chrono.c, j$.time.chrono.ChronoLocalDate, j$.time.temporal.Temporal
    /* JADX INFO: renamed from: R, reason: merged with bridge method [inline-methods] */
    public final y a(TemporalField temporalField, long j) {
        int iA;
        int i;
        int i2;
        if (!(temporalField instanceof ChronoField)) {
            return (y) super.a(temporalField, j);
        }
        ChronoField chronoField = (ChronoField) temporalField;
        if (j(chronoField) == j) {
            return this;
        }
        int[] iArr = x.a;
        int i3 = iArr[chronoField.ordinal()];
        if (i3 == 4) {
            iA = w.c.w(chronoField).a(chronoField, j);
            i = iArr[chronoField.ordinal()];
            if (i != 4) {
                LocalDate localDate = this.a;
                if (P() >= 1) {
                    i2 = iA + 1911;
                } else {
                    i2 = 1912 - iA;
                }
                return Q(localDate.Z(i2));
            }
            if (i != 6) {
                return Q(this.a.Z(iA + 1911));
            }
            if (i == 7) {
                return Q(this.a.Z(1912 - P()));
            }
        } else {
            if (i3 == 5) {
                w.c.w(chronoField).b(chronoField, j);
                return Q(this.a.U(j - (((((long) P()) * 12) + ((long) this.a.getMonthValue())) - 1)));
            }
            if (i3 == 6 || i3 == 7) {
                iA = w.c.w(chronoField).a(chronoField, j);
                i = iArr[chronoField.ordinal()];
                if (i != 4) {
                    LocalDate localDate2 = this.a;
                    if (P() >= 1) {
                        i2 = iA + 1911;
                    } else {
                        i2 = 1912 - iA;
                    }
                    return Q(localDate2.Z(i2));
                }
                if (i != 6) {
                    return Q(this.a.Z(iA + 1911));
                }
                if (i == 7) {
                    return Q(this.a.Z(1912 - P()));
                }
            }
        }
        return Q(this.a.a(temporalField, j));
    }

    @Override // j$.time.chrono.c, j$.time.chrono.ChronoLocalDate, j$.time.temporal.Temporal
    public final ChronoLocalDate b(long j, TemporalUnit temporalUnit) {
        return (y) super.b(j, temporalUnit);
    }

    @Override // j$.time.chrono.c, j$.time.chrono.ChronoLocalDate, j$.time.temporal.Temporal
    public final ChronoLocalDate c(long j, TemporalUnit temporalUnit) {
        return (y) super.c(j, temporalUnit);
    }

    @Override // j$.time.chrono.c, j$.time.chrono.ChronoLocalDate, j$.time.temporal.Temporal
    /* JADX INFO: renamed from: e */
    public final Temporal i(LocalDate localDate) {
        return (y) super.i(localDate);
    }

    @Override // j$.time.chrono.c, j$.time.chrono.ChronoLocalDate
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof y) {
            return this.a.equals(((y) obj).a);
        }
        return false;
    }

    @Override // j$.time.chrono.ChronoLocalDate
    public final Chronology getChronology() {
        return w.c;
    }

    @Override // j$.time.chrono.ChronoLocalDate
    public final j getEra() {
        return P() >= 1 ? z.ROC : z.BEFORE_ROC;
    }

    @Override // j$.time.chrono.c, j$.time.chrono.ChronoLocalDate
    public final int hashCode() {
        w.c.getClass();
        return this.a.hashCode() ^ (-1990173233);
    }

    @Override // j$.time.chrono.c, j$.time.chrono.ChronoLocalDate
    public final ChronoLocalDate i(j$.time.temporal.k kVar) {
        return (y) super.i(kVar);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final long j(TemporalField temporalField) {
        if (!(temporalField instanceof ChronoField)) {
            return temporalField.K(this);
        }
        int i = x.a[((ChronoField) temporalField).ordinal()];
        if (i == 4) {
            int iP = P();
            if (iP < 1) {
                iP = 1 - iP;
            }
            return iP;
        }
        if (i == 5) {
            return ((((long) P()) * 12) + ((long) this.a.getMonthValue())) - 1;
        }
        if (i == 6) {
            return P();
        }
        if (i != 7) {
            return this.a.j(temporalField);
        }
        return P() < 1 ? 0 : 1;
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final j$.time.temporal.o k(TemporalField temporalField) {
        if (!(temporalField instanceof ChronoField)) {
            return temporalField.x(this);
        }
        if (!h(temporalField)) {
            throw new j$.time.temporal.n(j$.time.b.a("Unsupported field: ", temporalField));
        }
        ChronoField chronoField = (ChronoField) temporalField;
        int i = x.a[chronoField.ordinal()];
        if (i == 1 || i == 2 || i == 3) {
            return this.a.k(temporalField);
        }
        if (i != 4) {
            return w.c.w(chronoField);
        }
        j$.time.temporal.o oVar = ChronoField.YEAR.b;
        return j$.time.temporal.o.f(1L, P() <= 0 ? (-oVar.a) + 1912 : oVar.d - 1911);
    }

    @Override // j$.time.chrono.ChronoLocalDate
    public final long toEpochDay() {
        return this.a.toEpochDay();
    }

    @Override // j$.time.chrono.c, j$.time.chrono.ChronoLocalDate, j$.time.temporal.Temporal
    public final Temporal b(long j, TemporalUnit temporalUnit) {
        return (y) super.b(j, temporalUnit);
    }

    @Override // j$.time.chrono.c, j$.time.chrono.ChronoLocalDate, j$.time.temporal.Temporal
    public final Temporal c(long j, TemporalUnit temporalUnit) {
        return (y) super.c(j, temporalUnit);
    }
}
