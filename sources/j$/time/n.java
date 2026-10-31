package j$.time;

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
public final class n implements Temporal, j$.time.temporal.k, Comparable, Serializable {
    public static final /* synthetic */ int c = 0;
    private static final long serialVersionUID = 7264499704384272492L;
    public final LocalTime a;
    public final ZoneOffset b;

    static {
        LocalTime localTime = LocalTime.e;
        ZoneOffset zoneOffset = ZoneOffset.g;
        localTime.getClass();
        new n(localTime, zoneOffset);
        LocalTime localTime2 = LocalTime.f;
        ZoneOffset zoneOffset2 = ZoneOffset.f;
        localTime2.getClass();
        new n(localTime2, zoneOffset2);
    }

    public n(LocalTime localTime, ZoneOffset zoneOffset) {
        Objects.requireNonNull(localTime, "time");
        this.a = localTime;
        Objects.requireNonNull(zoneOffset, "offset");
        this.b = zoneOffset;
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private Object writeReplace() {
        return new o((byte) 9, this);
    }

    public final n D(LocalTime localTime, ZoneOffset zoneOffset) {
        return (this.a == localTime && this.b.equals(zoneOffset)) ? this : new n(localTime, zoneOffset);
    }

    @Override // j$.time.temporal.Temporal
    public final Temporal a(TemporalField temporalField, long j) {
        if (!(temporalField instanceof ChronoField)) {
            return (n) temporalField.O(this, j);
        }
        ChronoField chronoField = ChronoField.OFFSET_SECONDS;
        LocalTime localTime = this.a;
        if (temporalField != chronoField) {
            return D(localTime.a(temporalField, j), this.b);
        }
        ChronoField chronoField2 = (ChronoField) temporalField;
        return D(localTime, ZoneOffset.ofTotalSeconds(chronoField2.b.a(chronoField2, j)));
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
        n nVar = (n) obj;
        if (this.b.equals(nVar.b)) {
            return this.a.compareTo(nVar.a);
        }
        int iCompare = Long.compare(x(), nVar.x());
        return iCompare == 0 ? this.a.compareTo(nVar.a) : iCompare;
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final Object d(d dVar) {
        if (dVar == j$.time.temporal.m.d || dVar == j$.time.temporal.m.e) {
            return this.b;
        }
        if (((dVar == j$.time.temporal.m.a) || (dVar == j$.time.temporal.m.b)) || dVar == j$.time.temporal.m.f) {
            return null;
        }
        if (dVar == j$.time.temporal.m.g) {
            return this.a;
        }
        return dVar == j$.time.temporal.m.c ? ChronoUnit.NANOS : dVar.k(this);
    }

    @Override // j$.time.temporal.Temporal
    /* JADX INFO: renamed from: e */
    public final Temporal i(LocalDate localDate) {
        return (n) localDate.f(this);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof n) {
            n nVar = (n) obj;
            if (this.a.equals(nVar.a) && this.b.equals(nVar.b)) {
                return true;
            }
        }
        return false;
    }

    @Override // j$.time.temporal.k
    public final Temporal f(Temporal temporal) {
        return temporal.a(ChronoField.NANO_OF_DAY, this.a.W()).a(ChronoField.OFFSET_SECONDS, this.b.getTotalSeconds());
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final boolean h(TemporalField temporalField) {
        if (temporalField instanceof ChronoField) {
            return ((ChronoField) temporalField).Q() || temporalField == ChronoField.OFFSET_SECONDS;
        }
        return temporalField != null && temporalField.p(this);
    }

    public final int hashCode() {
        return this.b.hashCode() ^ this.a.hashCode();
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final long j(TemporalField temporalField) {
        if (temporalField instanceof ChronoField) {
            return temporalField == ChronoField.OFFSET_SECONDS ? this.b.getTotalSeconds() : this.a.j(temporalField);
        }
        return temporalField.K(this);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final j$.time.temporal.o k(TemporalField temporalField) {
        if (temporalField instanceof ChronoField) {
            return temporalField == ChronoField.OFFSET_SECONDS ? ((ChronoField) temporalField).b : this.a.k(temporalField);
        }
        return temporalField.x(this);
    }

    @Override // j$.time.temporal.Temporal
    /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
    public final n b(long j, TemporalUnit temporalUnit) {
        return temporalUnit instanceof ChronoUnit ? D(this.a.b(j, temporalUnit), this.b) : (n) temporalUnit.p(this, j);
    }

    public final String toString() {
        return this.a.toString() + this.b.c;
    }

    @Override // j$.time.temporal.Temporal
    public final long until(Temporal temporal, TemporalUnit temporalUnit) {
        n nVar;
        if (temporal instanceof n) {
            nVar = (n) temporal;
        } else {
            try {
                nVar = new n(LocalTime.D(temporal), ZoneOffset.P(temporal));
            } catch (DateTimeException e) {
                j$.nio.file.r.g("Unable to obtain OffsetTime from TemporalAccessor: ", temporal, temporal.getClass().getName(), e);
                return 0L;
            }
        }
        if (!(temporalUnit instanceof ChronoUnit)) {
            return temporalUnit.between(this, nVar);
        }
        long jX = nVar.x() - x();
        switch (m.a[((ChronoUnit) temporalUnit).ordinal()]) {
            case 1:
                return jX;
            case 2:
                return jX / 1000;
            case 3:
                return jX / 1000000;
            case 4:
                return jX / 1000000000;
            case 5:
                return jX / 60000000000L;
            case 6:
                return jX / 3600000000000L;
            case 7:
                return jX / 43200000000000L;
            default:
                j$.nio.file.r.d("Unsupported unit: ", temporalUnit);
                return 0L;
        }
    }

    public final long x() {
        return this.a.W() - (((long) this.b.getTotalSeconds()) * 1000000000);
    }
}
