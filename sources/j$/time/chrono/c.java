package j$.time.chrono;

import j$.time.temporal.ChronoField;
import j$.time.temporal.ChronoUnit;
import j$.time.temporal.Temporal;
import j$.time.temporal.TemporalAmount;
import j$.time.temporal.TemporalField;
import j$.time.temporal.TemporalUnit;
import java.io.Serializable;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-d9f8928238715ac698104c66898e5631a6796c71eabc0cbc140853337a7ef765 */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes13.dex */
public abstract class c implements ChronoLocalDate, Temporal, j$.time.temporal.k, Serializable {
    private static final long serialVersionUID = 6282433883239719096L;

    public static ChronoLocalDate p(Chronology chronology, Temporal temporal) {
        ChronoLocalDate chronoLocalDate = (ChronoLocalDate) temporal;
        if (chronology.equals(chronoLocalDate.getChronology())) {
            return chronoLocalDate;
        }
        j$.nio.file.r.k("Chronology mismatch, expected: ", chronology.getId(), chronoLocalDate.getChronology().getId());
        return null;
    }

    public abstract ChronoLocalDate D(long j);

    public abstract ChronoLocalDate K(long j);

    @Override // j$.time.chrono.ChronoLocalDate
    public ChronoLocalDate L(TemporalAmount temporalAmount) {
        return super.L(temporalAmount);
    }

    public abstract ChronoLocalDate O(long j);

    @Override // j$.time.chrono.ChronoLocalDate, j$.time.temporal.Temporal
    public /* bridge */ /* synthetic */ Temporal a(TemporalField temporalField, long j) {
        return a(temporalField, j);
    }

    @Override // j$.time.chrono.ChronoLocalDate, j$.time.temporal.Temporal
    public ChronoLocalDate b(long j, TemporalUnit temporalUnit) {
        if (!(temporalUnit instanceof ChronoUnit)) {
            return super.b(j, temporalUnit);
        }
        switch (b.a[((ChronoUnit) temporalUnit).ordinal()]) {
            case 1:
                return D(j);
            case 2:
                return D(Math.multiplyExact(j, 7L));
            case 3:
                return K(j);
            case 4:
                return O(j);
            case 5:
                return O(Math.multiplyExact(j, 10L));
            case 6:
                return O(Math.multiplyExact(j, 100L));
            case 7:
                return O(Math.multiplyExact(j, 1000L));
            case 8:
                ChronoField chronoField = ChronoField.ERA;
                return a((TemporalField) chronoField, Math.addExact(j(chronoField), j));
            default:
                j$.nio.file.r.d("Unsupported unit: ", temporalUnit);
                return null;
        }
    }

    @Override // j$.time.chrono.ChronoLocalDate
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ChronoLocalDate) && compareTo((ChronoLocalDate) obj) == 0;
    }

    @Override // j$.time.chrono.ChronoLocalDate
    public int hashCode() {
        long epochDay = toEpochDay();
        return getChronology().hashCode() ^ ((int) (epochDay ^ (epochDay >>> 32)));
    }

    @Override // j$.time.chrono.ChronoLocalDate, j$.time.temporal.Temporal
    public ChronoLocalDate i(j$.time.temporal.k kVar) {
        return super.i(kVar);
    }

    @Override // j$.time.chrono.ChronoLocalDate
    public final String toString() {
        long j = j(ChronoField.YEAR_OF_ERA);
        long j2 = j(ChronoField.MONTH_OF_YEAR);
        long j3 = j(ChronoField.DAY_OF_MONTH);
        StringBuilder sb = new StringBuilder(30);
        sb.append(getChronology().toString());
        sb.append(" ");
        sb.append(getEra());
        sb.append(" ");
        sb.append(j);
        sb.append(j2 < 10 ? "-0" : "-");
        sb.append(j2);
        sb.append(j3 < 10 ? "-0" : "-");
        sb.append(j3);
        return sb.toString();
    }

    @Override // j$.time.chrono.ChronoLocalDate, j$.time.temporal.Temporal
    public final long until(Temporal temporal, TemporalUnit temporalUnit) {
        Objects.requireNonNull(temporal, "endExclusive");
        ChronoLocalDate chronoLocalDateE = getChronology().E(temporal);
        if (!(temporalUnit instanceof ChronoUnit)) {
            Objects.requireNonNull(temporalUnit, "unit");
            return temporalUnit.between(this, chronoLocalDateE);
        }
        switch (b.a[((ChronoUnit) temporalUnit).ordinal()]) {
            case 1:
                return chronoLocalDateE.toEpochDay() - toEpochDay();
            case 2:
                return (chronoLocalDateE.toEpochDay() - toEpochDay()) / 7;
            case 3:
                return x(chronoLocalDateE);
            case 4:
                return x(chronoLocalDateE) / 12;
            case 5:
                return x(chronoLocalDateE) / 120;
            case 6:
                return x(chronoLocalDateE) / 1200;
            case 7:
                return x(chronoLocalDateE) / 12000;
            case 8:
                ChronoField chronoField = ChronoField.ERA;
                return chronoLocalDateE.j(chronoField) - j(chronoField);
            default:
                j$.nio.file.r.d("Unsupported unit: ", temporalUnit);
                return 0L;
        }
    }

    public final long x(ChronoLocalDate chronoLocalDate) {
        if (getChronology().w(ChronoField.MONTH_OF_YEAR).d != 12) {
            throw new IllegalStateException("ChronoLocalDateImpl only supports Chronologies with 12 months per year");
        }
        ChronoField chronoField = ChronoField.PROLEPTIC_MONTH;
        long j = j(chronoField) * 32;
        ChronoField chronoField2 = ChronoField.DAY_OF_MONTH;
        return (((chronoLocalDate.j(chronoField) * 32) + ((long) chronoLocalDate.g(chronoField2))) - (j + ((long) g(chronoField2)))) / 32;
    }

    @Override // j$.time.chrono.ChronoLocalDate, j$.time.temporal.Temporal
    public ChronoLocalDate c(long j, TemporalUnit temporalUnit) {
        return super.c(j, temporalUnit);
    }
}
