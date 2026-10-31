package j$.time.chrono;

import j$.time.LocalDate;
import j$.time.LocalTime;
import j$.time.temporal.ChronoField;
import j$.time.temporal.ChronoUnit;
import j$.time.temporal.Temporal;
import j$.time.temporal.TemporalAmount;
import j$.time.temporal.TemporalField;
import j$.time.temporal.TemporalUnit;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;

/* JADX INFO: compiled from: r8-map-id-d9f8928238715ac698104c66898e5631a6796c71eabc0cbc140853337a7ef765 */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes13.dex */
public final class t extends c {
    public static final LocalDate d = LocalDate.of(1873, 1, 1);
    private static final long serialVersionUID = -305327627230580483L;
    public final transient LocalDate a;
    public final transient u b;
    public final transient int c;

    public t(LocalDate localDate) {
        if (localDate.isBefore(d)) {
            j$.nio.file.r.h("JapaneseDate before Meiji 6 is not supported");
            throw null;
        }
        u uVarM = u.m(localDate);
        this.b = uVarM;
        this.c = (localDate.getYear() - uVarM.b.getYear()) + 1;
        this.a = localDate;
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private Object writeReplace() {
        return new a0((byte) 4, this);
    }

    @Override // j$.time.chrono.c
    public final ChronoLocalDate D(long j) {
        return R(this.a.plusDays(j));
    }

    @Override // j$.time.chrono.ChronoLocalDate
    public final ChronoLocalDateTime F(LocalTime localTime) {
        return new e(this, localTime);
    }

    @Override // j$.time.chrono.c
    public final ChronoLocalDate K(long j) {
        return R(this.a.U(j));
    }

    @Override // j$.time.chrono.c, j$.time.chrono.ChronoLocalDate
    public final ChronoLocalDate L(TemporalAmount temporalAmount) {
        return (t) super.L(temporalAmount);
    }

    @Override // j$.time.chrono.c
    public final ChronoLocalDate O(long j) {
        return R(this.a.plusYears(j));
    }

    public final t P(long j, ChronoUnit chronoUnit) {
        return (t) super.b(j, (TemporalUnit) chronoUnit);
    }

    public final t Q(j$.time.d dVar) {
        return (t) super.i(dVar);
    }

    public final t R(LocalDate localDate) {
        return localDate.equals(this.a) ? this : new t(localDate);
    }

    @Override // j$.time.chrono.c, j$.time.chrono.ChronoLocalDate, j$.time.temporal.Temporal
    /* JADX INFO: renamed from: S, reason: merged with bridge method [inline-methods] */
    public final t a(TemporalField temporalField, long j) {
        if (!(temporalField instanceof ChronoField)) {
            return (t) super.a(temporalField, j);
        }
        ChronoField chronoField = (ChronoField) temporalField;
        if (j(chronoField) == j) {
            return this;
        }
        int[] iArr = s.a;
        int i = iArr[chronoField.ordinal()];
        if (i == 3 || i == 8 || i == 9) {
            r rVar = r.c;
            int iA = rVar.w(chronoField).a(chronoField, j);
            int i2 = iArr[chronoField.ordinal()];
            if (i2 == 3) {
                return R(this.a.Z(rVar.A(this.b, iA)));
            }
            if (i2 == 8) {
                return R(this.a.Z(rVar.A(u.o(iA), this.c)));
            }
            if (i2 == 9) {
                return R(this.a.Z(iA));
            }
        }
        return R(this.a.a(temporalField, j));
    }

    @Override // j$.time.chrono.c, j$.time.chrono.ChronoLocalDate, j$.time.temporal.Temporal
    public final ChronoLocalDate b(long j, TemporalUnit temporalUnit) {
        return (t) super.b(j, temporalUnit);
    }

    @Override // j$.time.chrono.c, j$.time.chrono.ChronoLocalDate, j$.time.temporal.Temporal
    public final ChronoLocalDate c(long j, TemporalUnit temporalUnit) {
        return (t) super.c(j, temporalUnit);
    }

    @Override // j$.time.chrono.c, j$.time.chrono.ChronoLocalDate, j$.time.temporal.Temporal
    /* JADX INFO: renamed from: e */
    public final Temporal i(LocalDate localDate) {
        return (t) super.i(localDate);
    }

    @Override // j$.time.chrono.c, j$.time.chrono.ChronoLocalDate
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof t) {
            return this.a.equals(((t) obj).a);
        }
        return false;
    }

    @Override // j$.time.chrono.ChronoLocalDate
    public final Chronology getChronology() {
        return r.c;
    }

    @Override // j$.time.chrono.ChronoLocalDate
    public final j getEra() {
        return this.b;
    }

    @Override // j$.time.chrono.ChronoLocalDate, j$.time.temporal.TemporalAccessor
    public final boolean h(TemporalField temporalField) {
        if (temporalField == ChronoField.ALIGNED_DAY_OF_WEEK_IN_MONTH || temporalField == ChronoField.ALIGNED_DAY_OF_WEEK_IN_YEAR || temporalField == ChronoField.ALIGNED_WEEK_OF_MONTH || temporalField == ChronoField.ALIGNED_WEEK_OF_YEAR) {
            return false;
        }
        if (temporalField instanceof ChronoField) {
            return ((ChronoField) temporalField).isDateBased();
        }
        return temporalField != null && temporalField.p(this);
    }

    @Override // j$.time.chrono.c, j$.time.chrono.ChronoLocalDate
    public final int hashCode() {
        r.c.getClass();
        return this.a.hashCode() ^ (-688086063);
    }

    @Override // j$.time.chrono.c, j$.time.chrono.ChronoLocalDate
    public final ChronoLocalDate i(j$.time.temporal.k kVar) {
        return (t) super.i(kVar);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final long j(TemporalField temporalField) {
        if (!(temporalField instanceof ChronoField)) {
            return temporalField.K(this);
        }
        switch (s.a[((ChronoField) temporalField).ordinal()]) {
            case 2:
                int i = this.c;
                LocalDate localDate = this.a;
                return i == 1 ? (localDate.O() - this.b.b.O()) + 1 : localDate.O();
            case 3:
                return this.c;
            case 4:
            case 5:
            case 6:
            case 7:
                throw new j$.time.temporal.n(j$.time.b.a("Unsupported field: ", temporalField));
            case 8:
                return this.b.a;
            default:
                return this.a.j(temporalField);
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
        int i = s.a[chronoField.ordinal()];
        if (i == 1) {
            return j$.time.temporal.o.f(1L, this.a.lengthOfMonth());
        }
        if (i == 2) {
            return j$.time.temporal.o.f(1L, lengthOfYear());
        }
        if (i != 3) {
            return r.c.w(chronoField);
        }
        int year = this.b.b.getYear();
        u uVarN = this.b.n();
        return uVarN != null ? j$.time.temporal.o.f(1L, (uVarN.b.getYear() - year) + 1) : j$.time.temporal.o.f(1L, 999999999 - year);
    }

    @Override // j$.time.chrono.ChronoLocalDate
    public final int lengthOfYear() {
        u uVarN = this.b.n();
        int iLengthOfYear = (uVarN == null || uVarN.b.getYear() != this.a.getYear()) ? this.a.lengthOfYear() : uVarN.b.O() - 1;
        return this.c == 1 ? iLengthOfYear - (this.b.b.O() - 1) : iLengthOfYear;
    }

    @Override // j$.time.chrono.ChronoLocalDate
    public final long toEpochDay() {
        return this.a.toEpochDay();
    }

    @Override // j$.time.chrono.c, j$.time.chrono.ChronoLocalDate, j$.time.temporal.Temporal
    public final Temporal b(long j, TemporalUnit temporalUnit) {
        return (t) super.b(j, temporalUnit);
    }

    @Override // j$.time.chrono.c, j$.time.chrono.ChronoLocalDate, j$.time.temporal.Temporal
    public final Temporal c(long j, TemporalUnit temporalUnit) {
        return (t) super.c(j, temporalUnit);
    }

    public t(u uVar, int i, LocalDate localDate) {
        if (!localDate.isBefore(d)) {
            this.b = uVar;
            this.c = i;
            this.a = localDate;
            return;
        }
        j$.nio.file.r.h("JapaneseDate before Meiji 6 is not supported");
        throw null;
    }
}
