package j$.time.chrono;

import j$.time.LocalTime;
import j$.time.ZoneId;
import j$.time.temporal.ChronoField;
import j$.time.temporal.ChronoUnit;
import j$.time.temporal.Temporal;
import j$.time.temporal.TemporalField;
import j$.time.temporal.TemporalUnit;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-d9f8928238715ac698104c66898e5631a6796c71eabc0cbc140853337a7ef765 */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes13.dex */
public final class e implements ChronoLocalDateTime, Temporal, j$.time.temporal.k, Serializable {
    private static final long serialVersionUID = 4556003607393004514L;
    public final transient ChronoLocalDate a;
    public final transient LocalTime b;

    public e(ChronoLocalDate chronoLocalDate, LocalTime localTime) {
        Objects.requireNonNull(localTime, "time");
        this.a = chronoLocalDate;
        this.b = localTime;
    }

    public static e p(Chronology chronology, Temporal temporal) {
        e eVar = (e) temporal;
        if (chronology.equals(eVar.getChronology())) {
            return eVar;
        }
        j$.nio.file.r.k("Chronology mismatch, required: ", chronology.getId(), eVar.getChronology().getId());
        return null;
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private Object writeReplace() {
        return new a0((byte) 2, this);
    }

    @Override // j$.time.chrono.ChronoLocalDateTime
    public final ChronoZonedDateTime C(ZoneId zoneId) {
        return i.x(zoneId, null, this);
    }

    public final e D(ChronoLocalDate chronoLocalDate, long j, long j2, long j3, long j4) {
        long j5 = j | j2 | j3 | j4;
        LocalTime localTime = this.b;
        if (j5 == 0) {
            return K(chronoLocalDate, localTime);
        }
        long j6 = j / 24;
        long jW = localTime.W();
        long j7 = ((j % 24) * 3600000000000L) + ((j2 % 1440) * 60000000000L) + ((j3 % 86400) * 1000000000) + (j4 % 86400000000000L) + jW;
        long jFloorDiv = Math.floorDiv(j7, 86400000000000L) + j6 + (j2 / 1440) + (j3 / 86400) + (j4 / 86400000000000L);
        long jFloorMod = Math.floorMod(j7, 86400000000000L);
        return K(chronoLocalDate.b(jFloorDiv, (TemporalUnit) ChronoUnit.DAYS), jFloorMod == jW ? this.b : LocalTime.P(jFloorMod));
    }

    public final e K(Temporal temporal, LocalTime localTime) {
        ChronoLocalDate chronoLocalDate = this.a;
        return (chronoLocalDate == temporal && this.b == localTime) ? this : new e(c.p(chronoLocalDate.getChronology(), temporal), localTime);
    }

    @Override // j$.time.chrono.ChronoLocalDateTime
    /* JADX INFO: renamed from: O, reason: merged with bridge method [inline-methods] */
    public final e i(j$.time.temporal.k kVar) {
        if (kVar instanceof ChronoLocalDate) {
            return K((ChronoLocalDate) kVar, this.b);
        }
        boolean z = kVar instanceof LocalTime;
        ChronoLocalDate chronoLocalDate = this.a;
        if (z) {
            return K(chronoLocalDate, (LocalTime) kVar);
        }
        return kVar instanceof e ? p(chronoLocalDate.getChronology(), (e) kVar) : p(chronoLocalDate.getChronology(), (e) kVar.f(this));
    }

    @Override // j$.time.chrono.ChronoLocalDateTime, j$.time.temporal.Temporal
    /* JADX INFO: renamed from: P, reason: merged with bridge method [inline-methods] */
    public final e a(TemporalField temporalField, long j) {
        if (!(temporalField instanceof ChronoField)) {
            return p(this.a.getChronology(), temporalField.O(this, j));
        }
        boolean zQ = ((ChronoField) temporalField).Q();
        ChronoLocalDate chronoLocalDate = this.a;
        return zQ ? K(chronoLocalDate, this.b.a(temporalField, j)) : K(chronoLocalDate.a(temporalField, j), this.b);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ChronoLocalDateTime) && compareTo((ChronoLocalDateTime) obj) == 0;
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final int g(TemporalField temporalField) {
        if (temporalField instanceof ChronoField) {
            return ((ChronoField) temporalField).Q() ? this.b.g(temporalField) : this.a.g(temporalField);
        }
        return k(temporalField).a(temporalField, j(temporalField));
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final boolean h(TemporalField temporalField) {
        if (!(temporalField instanceof ChronoField)) {
            return temporalField != null && temporalField.p(this);
        }
        ChronoField chronoField = (ChronoField) temporalField;
        return chronoField.isDateBased() || chronoField.Q();
    }

    public final int hashCode() {
        return this.b.hashCode() ^ this.a.hashCode();
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final long j(TemporalField temporalField) {
        if (temporalField instanceof ChronoField) {
            return ((ChronoField) temporalField).Q() ? this.b.j(temporalField) : this.a.j(temporalField);
        }
        return temporalField.K(this);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final j$.time.temporal.o k(TemporalField temporalField) {
        if (temporalField instanceof ChronoField) {
            return (((ChronoField) temporalField).Q() ? this.b : this.a).k(temporalField);
        }
        return temporalField.x(this);
    }

    @Override // j$.time.chrono.ChronoLocalDateTime
    public final ChronoLocalDate toLocalDate() {
        return this.a;
    }

    @Override // j$.time.chrono.ChronoLocalDateTime
    public final LocalTime toLocalTime() {
        return this.b;
    }

    public final String toString() {
        return this.a.toString() + "T" + this.b.toString();
    }

    @Override // j$.time.temporal.Temporal
    public final long until(Temporal temporal, TemporalUnit temporalUnit) {
        Objects.requireNonNull(temporal, "endExclusive");
        ChronoLocalDateTime chronoLocalDateTimeH = getChronology().H(temporal);
        if (!(temporalUnit instanceof ChronoUnit)) {
            Objects.requireNonNull(temporalUnit, "unit");
            return temporalUnit.between(this, chronoLocalDateTimeH);
        }
        ChronoUnit chronoUnit = (ChronoUnit) temporalUnit;
        ChronoUnit chronoUnit2 = ChronoUnit.DAYS;
        if (chronoUnit.compareTo(chronoUnit2) >= 0) {
            ChronoLocalDate localDate = chronoLocalDateTimeH.toLocalDate();
            if (chronoLocalDateTimeH.toLocalTime().compareTo(this.b) < 0) {
                localDate = localDate.c(1L, (TemporalUnit) chronoUnit2);
            }
            return this.a.until(localDate, temporalUnit);
        }
        ChronoField chronoField = ChronoField.EPOCH_DAY;
        long j = chronoLocalDateTimeH.j(chronoField) - this.a.j(chronoField);
        switch (d.a[chronoUnit.ordinal()]) {
            case 1:
                j = Math.multiplyExact(j, 86400000000000L);
                break;
            case 2:
                j = Math.multiplyExact(j, 86400000000L);
                break;
            case 3:
                j = Math.multiplyExact(j, 86400000L);
                break;
            case 4:
                j = Math.multiplyExact(j, 86400L);
                break;
            case 5:
                j = Math.multiplyExact(j, 1440L);
                break;
            case 6:
                j = Math.multiplyExact(j, 24L);
                break;
            case 7:
                j = Math.multiplyExact(j, 2L);
                break;
        }
        return Math.addExact(j, this.b.until(chronoLocalDateTimeH.toLocalTime(), temporalUnit));
    }

    @Override // j$.time.chrono.ChronoLocalDateTime, j$.time.temporal.Temporal
    /* JADX INFO: renamed from: x, reason: merged with bridge method [inline-methods] */
    public final e b(long j, TemporalUnit temporalUnit) {
        if (!(temporalUnit instanceof ChronoUnit)) {
            return p(this.a.getChronology(), temporalUnit.p(this, j));
        }
        switch (d.a[((ChronoUnit) temporalUnit).ordinal()]) {
            case 1:
                return D(this.a, 0L, 0L, 0L, j);
            case 2:
                e eVarK = K(this.a.b(j / 86400000000L, (TemporalUnit) ChronoUnit.DAYS), this.b);
                return eVarK.D(eVarK.a, 0L, 0L, 0L, (j % 86400000000L) * 1000);
            case 3:
                e eVarK2 = K(this.a.b(j / 86400000, (TemporalUnit) ChronoUnit.DAYS), this.b);
                return eVarK2.D(eVarK2.a, 0L, 0L, 0L, (j % 86400000) * 1000000);
            case 4:
                return D(this.a, 0L, 0L, j, 0L);
            case 5:
                return D(this.a, 0L, j, 0L, 0L);
            case 6:
                return D(this.a, j, 0L, 0L, 0L);
            case 7:
                e eVarK3 = K(this.a.b(j / 256, (TemporalUnit) ChronoUnit.DAYS), this.b);
                return eVarK3.D(eVarK3.a, (j % 256) * 12, 0L, 0L, 0L);
            default:
                return K(this.a.b(j, temporalUnit), this.b);
        }
    }
}
