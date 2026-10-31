package j$.time.chrono;

import j$.time.DateTimeException;
import j$.time.LocalDate;
import j$.time.LocalTime;
import j$.time.temporal.ChronoField;
import j$.time.temporal.Temporal;
import j$.time.temporal.TemporalAmount;
import j$.time.temporal.TemporalField;
import j$.time.temporal.TemporalUnit;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-d9f8928238715ac698104c66898e5631a6796c71eabc0cbc140853337a7ef765 */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes13.dex */
public final class n extends c {
    private static final long serialVersionUID = -5207853542612002020L;
    public final transient l a;
    public final transient int b;
    public final transient int c;
    public final transient int d;

    public n(l lVar, long j) {
        int i = (int) j;
        lVar.R();
        if (i < lVar.e || i >= lVar.f) {
            j$.nio.file.r.h("Hijrah date out of range");
            throw null;
        }
        int iBinarySearch = Arrays.binarySearch(lVar.d, i);
        iBinarySearch = iBinarySearch < 0 ? (-iBinarySearch) - 2 : iBinarySearch;
        int[] iArr = {lVar.T(iBinarySearch), ((lVar.g + iBinarySearch) % 12) + 1, (i - lVar.d[iBinarySearch]) + 1};
        this.a = lVar;
        this.b = iArr[0];
        this.c = iArr[1];
        this.d = iArr[2];
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private Object writeReplace() {
        return new a0((byte) 6, this);
    }

    @Override // j$.time.chrono.ChronoLocalDate
    public final ChronoLocalDateTime F(LocalTime localTime) {
        return new e(this, localTime);
    }

    @Override // j$.time.chrono.c, j$.time.chrono.ChronoLocalDate
    public final ChronoLocalDate L(TemporalAmount temporalAmount) {
        return (n) super.L(temporalAmount);
    }

    @Override // j$.time.chrono.c
    public final ChronoLocalDate O(long j) {
        return j == 0 ? this : S(Math.addExact(this.b, (int) j), this.c, this.d);
    }

    public final int P() {
        return this.a.X(this.b, this.c - 1) + this.d;
    }

    @Override // j$.time.chrono.c
    /* JADX INFO: renamed from: Q, reason: merged with bridge method [inline-methods] */
    public final n D(long j) {
        return new n(this.a, toEpochDay() + j);
    }

    @Override // j$.time.chrono.c
    /* JADX INFO: renamed from: R, reason: merged with bridge method [inline-methods] */
    public final n K(long j) {
        if (j == 0) {
            return this;
        }
        long j2 = (((long) this.b) * 12) + ((long) (this.c - 1)) + j;
        l lVar = this.a;
        long jFloorDiv = Math.floorDiv(j2, 12L);
        if (jFloorDiv >= lVar.T(0) && jFloorDiv <= lVar.T(lVar.d.length - 1) - 1) {
            return S((int) jFloorDiv, ((int) Math.floorMod(j2, 12L)) + 1, this.d);
        }
        throw new DateTimeException("Invalid Hijrah year: " + jFloorDiv);
    }

    public final n S(int i, int i2, int i3) {
        int iV = this.a.V(i, i2);
        if (i3 > iV) {
            i3 = iV;
        }
        return new n(this.a, i, i2, i3);
    }

    @Override // j$.time.chrono.c, j$.time.chrono.ChronoLocalDate, j$.time.temporal.Temporal
    /* JADX INFO: renamed from: T, reason: merged with bridge method [inline-methods] */
    public final n a(TemporalField temporalField, long j) {
        if (!(temporalField instanceof ChronoField)) {
            return (n) super.a(temporalField, j);
        }
        ChronoField chronoField = (ChronoField) temporalField;
        this.a.w(chronoField).b(chronoField, j);
        int i = (int) j;
        switch (m.a[chronoField.ordinal()]) {
            case 1:
                return S(this.b, this.c, i);
            case 2:
                return D(Math.min(i, lengthOfYear()) - P());
            case 3:
                return D((j - j(ChronoField.ALIGNED_WEEK_OF_MONTH)) * 7);
            case 4:
                return D(j - ((long) (((int) Math.floorMod(toEpochDay() + 3, 7L)) + 1)));
            case 5:
                return D(j - j(ChronoField.ALIGNED_DAY_OF_WEEK_IN_MONTH));
            case 6:
                return D(j - j(ChronoField.ALIGNED_DAY_OF_WEEK_IN_YEAR));
            case 7:
                return new n(this.a, j);
            case 8:
                return D((j - j(ChronoField.ALIGNED_WEEK_OF_YEAR)) * 7);
            case 9:
                return S(this.b, i, this.d);
            case 10:
                return K(j - (((((long) this.b) * 12) + ((long) this.c)) - 1));
            case 11:
                if (this.b < 1) {
                    i = 1 - i;
                }
                return S(i, this.c, this.d);
            case 12:
                return S(i, this.c, this.d);
            case 13:
                return S(1 - this.b, this.c, this.d);
            default:
                throw new j$.time.temporal.n(j$.time.b.a("Unsupported field: ", temporalField));
        }
    }

    @Override // j$.time.chrono.c, j$.time.chrono.ChronoLocalDate, j$.time.temporal.Temporal
    public final ChronoLocalDate b(long j, TemporalUnit temporalUnit) {
        return (n) super.b(j, temporalUnit);
    }

    @Override // j$.time.chrono.c, j$.time.chrono.ChronoLocalDate, j$.time.temporal.Temporal
    public final ChronoLocalDate c(long j, TemporalUnit temporalUnit) {
        return (n) super.c(j, temporalUnit);
    }

    @Override // j$.time.chrono.c, j$.time.chrono.ChronoLocalDate, j$.time.temporal.Temporal
    /* JADX INFO: renamed from: e */
    public final Temporal i(LocalDate localDate) {
        return (n) super.i(localDate);
    }

    @Override // j$.time.chrono.c, j$.time.chrono.ChronoLocalDate
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof n) {
            n nVar = (n) obj;
            if (this.b == nVar.b && this.c == nVar.c && this.d == nVar.d && this.a.equals(nVar.a)) {
                return true;
            }
        }
        return false;
    }

    @Override // j$.time.chrono.ChronoLocalDate
    public final Chronology getChronology() {
        return this.a;
    }

    @Override // j$.time.chrono.ChronoLocalDate
    public final j getEra() {
        return o.AH;
    }

    @Override // j$.time.chrono.c, j$.time.chrono.ChronoLocalDate
    public final int hashCode() {
        int i = this.b;
        int i2 = this.c;
        int i3 = this.d;
        this.a.getClass();
        return ((i & (-2048)) ^ 2100100019) ^ (((i << 11) + (i2 << 6)) + i3);
    }

    @Override // j$.time.chrono.c, j$.time.chrono.ChronoLocalDate
    public final ChronoLocalDate i(j$.time.temporal.k kVar) {
        return (n) super.i(kVar);
    }

    @Override // j$.time.chrono.ChronoLocalDate
    public final boolean isLeapYear() {
        return this.a.isLeapYear(this.b);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final long j(TemporalField temporalField) {
        int iP;
        int iFloorMod;
        if (!(temporalField instanceof ChronoField)) {
            return temporalField.K(this);
        }
        switch (m.a[((ChronoField) temporalField).ordinal()]) {
            case 1:
                iP = this.d;
                return iP;
            case 2:
                iP = P();
                return iP;
            case 3:
                iFloorMod = (this.d - 1) / 7;
                iP = iFloorMod + 1;
                return iP;
            case 4:
                iFloorMod = (int) Math.floorMod(toEpochDay() + 3, 7L);
                iP = iFloorMod + 1;
                return iP;
            case 5:
                iFloorMod = (this.d - 1) % 7;
                iP = iFloorMod + 1;
                return iP;
            case 6:
                iFloorMod = (P() - 1) % 7;
                iP = iFloorMod + 1;
                return iP;
            case 7:
                return toEpochDay();
            case 8:
                iFloorMod = (P() - 1) / 7;
                iP = iFloorMod + 1;
                return iP;
            case 9:
                iP = this.c;
                return iP;
            case 10:
                return ((((long) this.b) * 12) + ((long) this.c)) - 1;
            case 11:
                iP = this.b;
                return iP;
            case 12:
                iP = this.b;
                return iP;
            case 13:
                return this.b <= 1 ? 0 : 1;
            default:
                throw new j$.time.temporal.n(j$.time.b.a("Unsupported field: ", temporalField));
        }
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
        int i = m.a[chronoField.ordinal()];
        if (i == 1) {
            return j$.time.temporal.o.f(1L, this.a.V(this.b, this.c));
        }
        if (i != 2) {
            return i != 3 ? this.a.w(chronoField) : j$.time.temporal.o.f(1L, 5L);
        }
        return j$.time.temporal.o.f(1L, lengthOfYear());
    }

    @Override // j$.time.chrono.ChronoLocalDate
    public final int lengthOfYear() {
        return this.a.X(this.b, 12);
    }

    @Override // j$.time.chrono.ChronoLocalDate
    public final long toEpochDay() {
        return this.a.U(this.b, this.c, this.d);
    }

    @Override // j$.time.chrono.c, j$.time.chrono.ChronoLocalDate, j$.time.temporal.Temporal
    public final Temporal b(long j, TemporalUnit temporalUnit) {
        return (n) super.b(j, temporalUnit);
    }

    @Override // j$.time.chrono.c, j$.time.chrono.ChronoLocalDate, j$.time.temporal.Temporal
    public final Temporal c(long j, TemporalUnit temporalUnit) {
        return (n) super.c(j, temporalUnit);
    }

    public n(l lVar, int i, int i2, int i3) {
        lVar.U(i, i2, i3);
        this.a = lVar;
        this.b = i;
        this.c = i2;
        this.d = i3;
    }
}
