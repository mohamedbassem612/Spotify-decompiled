package j$.time;

import j$.time.format.DateTimeFormatter;
import j$.time.temporal.ChronoField;
import j$.time.temporal.ChronoUnit;
import j$.time.temporal.Temporal;
import j$.time.temporal.TemporalAccessor;
import j$.time.temporal.TemporalAmount;
import j$.time.temporal.TemporalField;
import j$.time.temporal.TemporalUnit;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-d9f8928238715ac698104c66898e5631a6796c71eabc0cbc140853337a7ef765 */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes13.dex */
public final class Instant implements Temporal, j$.time.temporal.k, Comparable<Instant>, Serializable {
    public static final Instant c = new Instant(0, 0);
    public static final Instant d = ofEpochSecond(-31557014167219200L, 0);
    public static final Instant e = ofEpochSecond(31556889864403199L, 999999999);
    private static final long serialVersionUID = -665713676816604388L;
    public final long a;
    public final int b;

    public Instant(long j, int i) {
        this.a = j;
        this.b = i;
    }

    public static Instant now() {
        return Clock.systemUTC().instant();
    }

    public static Instant ofEpochMilli(long j) {
        return p(Math.floorDiv(j, 1000L), ((int) Math.floorMod(j, 1000L)) * 1000000);
    }

    public static Instant ofEpochSecond(long j, long j2) {
        return p(Math.addExact(j, Math.floorDiv(j2, 1000000000L)), (int) Math.floorMod(j2, 1000000000L));
    }

    public static Instant p(long j, int i) {
        if ((((long) i) | j) == 0) {
            return c;
        }
        if (j >= -31557014167219200L && j <= 31556889864403199L) {
            return new Instant(j, i);
        }
        j$.nio.file.r.h("Instant exceeds minimum or maximum instant");
        return null;
    }

    public static Instant parse(CharSequence charSequence) {
        return (Instant) DateTimeFormatter.ISO_INSTANT.a(charSequence, new d((byte) 0));
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private Object writeReplace() {
        return new o((byte) 2, this);
    }

    public static Instant x(TemporalAccessor temporalAccessor) {
        if (temporalAccessor instanceof Instant) {
            return (Instant) temporalAccessor;
        }
        Objects.requireNonNull(temporalAccessor, "temporal");
        try {
            return ofEpochSecond(temporalAccessor.j(ChronoField.INSTANT_SECONDS), temporalAccessor.g(ChronoField.NANO_OF_SECOND));
        } catch (DateTimeException e2) {
            j$.nio.file.r.g("Unable to obtain Instant from TemporalAccessor: ", temporalAccessor, temporalAccessor.getClass().getName(), e2);
            return null;
        }
    }

    public final Instant D(long j, long j2) {
        if ((j | j2) == 0) {
            return this;
        }
        return ofEpochSecond(Math.addExact(Math.addExact(this.a, j), j2 / 1000000000), ((long) this.b) + (j2 % 1000000000));
    }

    @Override // j$.time.temporal.Temporal
    /* JADX INFO: renamed from: K, reason: merged with bridge method [inline-methods] */
    public final Instant b(long j, TemporalUnit temporalUnit) {
        if (!(temporalUnit instanceof ChronoUnit)) {
            return (Instant) temporalUnit.p(this, j);
        }
        switch (e.b[((ChronoUnit) temporalUnit).ordinal()]) {
            case 1:
                return D(0L, j);
            case 2:
                return D(j / 1000000, (j % 1000000) * 1000);
            case 3:
                return D(j / 1000, (j % 1000) * 1000000);
            case 4:
                return D(j, 0L);
            case 5:
                return D(Math.multiplyExact(j, 60L), 0L);
            case 6:
                return D(Math.multiplyExact(j, 3600L), 0L);
            case 7:
                return D(Math.multiplyExact(j, 43200L), 0L);
            case 8:
                return D(Math.multiplyExact(j, 86400L), 0L);
            default:
                j$.nio.file.r.d("Unsupported unit: ", temporalUnit);
                return null;
        }
    }

    public final long O(Instant instant) {
        long jSubtractExact = Math.subtractExact(instant.a, this.a);
        long j = instant.b - this.b;
        if (jSubtractExact <= 0 || j >= 0) {
            return (jSubtractExact >= 0 || j <= 0) ? jSubtractExact : jSubtractExact + 1;
        }
        return jSubtractExact - 1;
    }

    @Override // j$.time.temporal.Temporal
    public final Temporal a(TemporalField temporalField, long j) {
        if (!(temporalField instanceof ChronoField)) {
            return (Instant) temporalField.O(this, j);
        }
        ChronoField chronoField = (ChronoField) temporalField;
        chronoField.P(j);
        int i = e.a[chronoField.ordinal()];
        if (i == 1) {
            return j != ((long) this.b) ? p(this.a, (int) j) : this;
        }
        if (i == 2) {
            int i2 = ((int) j) * 1000;
            return i2 != this.b ? p(this.a, i2) : this;
        }
        if (i == 3) {
            int i3 = ((int) j) * 1000000;
            return i3 != this.b ? p(this.a, i3) : this;
        }
        if (i == 4) {
            return j != this.a ? p(j, this.b) : this;
        }
        throw new j$.time.temporal.n(b.a("Unsupported field: ", temporalField));
    }

    public OffsetDateTime atOffset(ZoneOffset zoneOffset) {
        return OffsetDateTime.ofInstant(this, zoneOffset);
    }

    public ZonedDateTime atZone(ZoneId zoneId) {
        return ZonedDateTime.ofInstant(this, zoneId);
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
    public int compareTo(Instant instant) {
        int iCompare = Long.compare(this.a, instant.a);
        return iCompare != 0 ? iCompare : this.b - instant.b;
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final Object d(d dVar) {
        if (dVar == j$.time.temporal.m.c) {
            return ChronoUnit.NANOS;
        }
        if (dVar == j$.time.temporal.m.b || dVar == j$.time.temporal.m.a || dVar == j$.time.temporal.m.e || dVar == j$.time.temporal.m.d || dVar == j$.time.temporal.m.f || dVar == j$.time.temporal.m.g) {
            return null;
        }
        return dVar.k(this);
    }

    @Override // j$.time.temporal.Temporal
    /* JADX INFO: renamed from: e */
    public final Temporal i(LocalDate localDate) {
        return (Instant) localDate.f(this);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Instant) {
            Instant instant = (Instant) obj;
            if (this.a == instant.a && this.b == instant.b) {
                return true;
            }
        }
        return false;
    }

    @Override // j$.time.temporal.k
    public final Temporal f(Temporal temporal) {
        return temporal.a(ChronoField.INSTANT_SECONDS, this.a).a(ChronoField.NANO_OF_SECOND, this.b);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final int g(TemporalField temporalField) {
        if (!(temporalField instanceof ChronoField)) {
            return super.k(temporalField).a(temporalField, temporalField.K(this));
        }
        int i = e.a[((ChronoField) temporalField).ordinal()];
        if (i == 1) {
            return this.b;
        }
        if (i == 2) {
            return this.b / 1000;
        }
        if (i == 3) {
            return this.b / 1000000;
        }
        if (i == 4) {
            ChronoField chronoField = ChronoField.INSTANT_SECONDS;
            chronoField.b.a(chronoField, this.a);
        }
        throw new j$.time.temporal.n(b.a("Unsupported field: ", temporalField));
    }

    public long getEpochSecond() {
        return this.a;
    }

    public int getNano() {
        return this.b;
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final boolean h(TemporalField temporalField) {
        if (temporalField instanceof ChronoField) {
            return temporalField == ChronoField.INSTANT_SECONDS || temporalField == ChronoField.NANO_OF_SECOND || temporalField == ChronoField.MICRO_OF_SECOND || temporalField == ChronoField.MILLI_OF_SECOND;
        }
        return temporalField != null && temporalField.p(this);
    }

    public int hashCode() {
        long j = this.a;
        return (this.b * 51) + ((int) (j ^ (j >>> 32)));
    }

    public boolean isAfter(Instant instant) {
        return compareTo(instant) > 0;
    }

    public boolean isBefore(Instant instant) {
        return compareTo(instant) < 0;
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final long j(TemporalField temporalField) {
        int i;
        if (!(temporalField instanceof ChronoField)) {
            return temporalField.K(this);
        }
        int i2 = e.a[((ChronoField) temporalField).ordinal()];
        if (i2 == 1) {
            i = this.b;
        } else if (i2 == 2) {
            i = this.b / 1000;
        } else {
            if (i2 != 3) {
                if (i2 == 4) {
                    return this.a;
                }
                throw new j$.time.temporal.n(b.a("Unsupported field: ", temporalField));
            }
            i = this.b / 1000000;
        }
        return i;
    }

    public Instant minus(TemporalAmount temporalAmount) {
        return (Instant) temporalAmount.x(this);
    }

    public Instant minusNanos(long j) {
        return j == Long.MIN_VALUE ? D(0L, Long.MAX_VALUE).D(0L, 1L) : D(0L, -j);
    }

    public Instant plus(TemporalAmount temporalAmount) {
        return (Instant) temporalAmount.p(this);
    }

    public long toEpochMilli() {
        long j = this.a;
        return (j >= 0 || this.b <= 0) ? Math.addExact(Math.multiplyExact(j, 1000L), this.b / 1000000) : Math.addExact(Math.multiplyExact(j + 1, 1000L), (this.b / 1000000) - 1000);
    }

    public String toString() {
        return DateTimeFormatter.ISO_INSTANT.format(this);
    }

    @Override // j$.time.temporal.Temporal
    public final long until(Temporal temporal, TemporalUnit temporalUnit) {
        Instant instantX = x(temporal);
        if (!(temporalUnit instanceof ChronoUnit)) {
            return temporalUnit.between(this, instantX);
        }
        switch (e.b[((ChronoUnit) temporalUnit).ordinal()]) {
            case 1:
                return Math.addExact(Math.multiplyExact(Math.subtractExact(instantX.a, this.a), 1000000000L), instantX.b - this.b);
            case 2:
                return Math.addExact(Math.multiplyExact(Math.subtractExact(instantX.a, this.a), 1000000000L), instantX.b - this.b) / 1000;
            case 3:
                return Math.subtractExact(instantX.toEpochMilli(), toEpochMilli());
            case 4:
                return O(instantX);
            case 5:
                return O(instantX) / 60;
            case 6:
                return O(instantX) / 3600;
            case 7:
                return O(instantX) / 43200;
            case 8:
                return O(instantX) / 86400;
            default:
                j$.nio.file.r.d("Unsupported unit: ", temporalUnit);
                return 0L;
        }
    }

    public static Instant ofEpochSecond(long j) {
        return p(j, 0);
    }
}
