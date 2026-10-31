package j$.time;

import j$.time.chrono.ChronoZonedDateTime;
import j$.time.format.DateTimeFormatter;
import j$.time.temporal.ChronoField;
import j$.time.temporal.ChronoUnit;
import j$.time.temporal.Temporal;
import j$.time.temporal.TemporalField;
import j$.time.temporal.TemporalUnit;
import j$.time.zone.ZoneRules;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.List;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-d9f8928238715ac698104c66898e5631a6796c71eabc0cbc140853337a7ef765 */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes13.dex */
public final class ZonedDateTime implements Temporal, ChronoZonedDateTime<LocalDate>, Serializable {
    private static final long serialVersionUID = -6260982410461394882L;
    public final LocalDateTime a;
    public final ZoneOffset b;
    public final ZoneId c;

    public ZonedDateTime(LocalDateTime localDateTime, ZoneId zoneId, ZoneOffset zoneOffset) {
        this.a = localDateTime;
        this.b = zoneOffset;
        this.c = zoneId;
    }

    public static ZonedDateTime D(LocalDateTime localDateTime, ZoneId zoneId, ZoneOffset zoneOffset) {
        Objects.requireNonNull(localDateTime, "localDateTime");
        Objects.requireNonNull(zoneId, "zone");
        if (zoneId instanceof ZoneOffset) {
            return new ZonedDateTime(localDateTime, zoneId, (ZoneOffset) zoneId);
        }
        ZoneRules rules = zoneId.getRules();
        List listF = rules.f(localDateTime);
        if (listF.size() == 1) {
            zoneOffset = (ZoneOffset) listF.get(0);
        } else if (listF.size() == 0) {
            Object objE = rules.e(localDateTime);
            j$.time.zone.b bVar = objE instanceof j$.time.zone.b ? (j$.time.zone.b) objE : null;
            localDateTime = localDateTime.O(Duration.ofSeconds(bVar.d.getTotalSeconds() - bVar.c.getTotalSeconds()).getSeconds());
            zoneOffset = bVar.d;
        } else if (zoneOffset == null || !listF.contains(zoneOffset)) {
            zoneOffset = (ZoneOffset) listF.get(0);
            Objects.requireNonNull(zoneOffset, "offset");
        }
        return new ZonedDateTime(localDateTime, zoneId, zoneOffset);
    }

    public static ZonedDateTime now(ZoneId zoneId) {
        Objects.requireNonNull(zoneId, "zone");
        a aVar = zoneId == ZoneOffset.UTC ? a.b : new a(zoneId);
        Objects.requireNonNull(aVar, "clock");
        return ofInstant(aVar.instant(), aVar.getZone());
    }

    public static ZonedDateTime ofInstant(Instant instant, ZoneId zoneId) {
        Objects.requireNonNull(instant, "instant");
        Objects.requireNonNull(zoneId, "zone");
        return p(instant.getEpochSecond(), instant.getNano(), zoneId);
    }

    public static ZonedDateTime p(long j, int i, ZoneId zoneId) {
        ZoneOffset zoneOffsetD = zoneId.getRules().d(Instant.ofEpochSecond(j, i));
        return new ZonedDateTime(LocalDateTime.ofEpochSecond(j, i, zoneOffsetD), zoneId, zoneOffsetD);
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private Object writeReplace() {
        return new o((byte) 6, this);
    }

    public static ZonedDateTime x(Temporal temporal) {
        if (temporal instanceof ZonedDateTime) {
            return (ZonedDateTime) temporal;
        }
        try {
            ZoneId zoneIdP = ZoneId.p(temporal);
            ChronoField chronoField = ChronoField.INSTANT_SECONDS;
            return temporal.h(chronoField) ? p(temporal.j(chronoField), temporal.g(ChronoField.NANO_OF_SECOND), zoneIdP) : D(LocalDateTime.x(LocalDate.D(temporal), LocalTime.D(temporal)), zoneIdP, null);
        } catch (DateTimeException e) {
            j$.nio.file.r.g("Unable to obtain ZonedDateTime from TemporalAccessor: ", temporal, temporal.getClass().getName(), e);
            return null;
        }
    }

    @Override // j$.time.chrono.ChronoZonedDateTime
    public final ChronoZonedDateTime B(ZoneId zoneId) {
        Objects.requireNonNull(zoneId, "zone");
        return this.c.equals(zoneId) ? this : D(this.a, zoneId, this.b);
    }

    @Override // j$.time.temporal.Temporal
    /* JADX INFO: renamed from: K, reason: merged with bridge method [inline-methods] */
    public final ZonedDateTime b(long j, TemporalUnit temporalUnit) {
        if (!(temporalUnit instanceof ChronoUnit)) {
            return (ZonedDateTime) temporalUnit.p(this, j);
        }
        ChronoUnit chronoUnit = (ChronoUnit) temporalUnit;
        boolean z = chronoUnit.compareTo(ChronoUnit.DAYS) >= 0 && chronoUnit != ChronoUnit.FOREVER;
        LocalDateTime localDateTime = this.a;
        if (z) {
            return D(localDateTime.b(j, temporalUnit), this.c, this.b);
        }
        LocalDateTime localDateTimeB = localDateTime.b(j, temporalUnit);
        ZoneOffset zoneOffset = this.b;
        ZoneId zoneId = this.c;
        Objects.requireNonNull(localDateTimeB, "localDateTime");
        Objects.requireNonNull(zoneOffset, "offset");
        Objects.requireNonNull(zoneId, "zone");
        return zoneId.getRules().f(localDateTimeB).contains(zoneOffset) ? new ZonedDateTime(localDateTimeB, zoneId, zoneOffset) : p(localDateTimeB.toEpochSecond(zoneOffset), localDateTimeB.getNano(), zoneId);
    }

    public final ZonedDateTime O(ZoneOffset zoneOffset) {
        return (zoneOffset.equals(this.b) || !this.c.getRules().f(this.a).contains(zoneOffset)) ? this : new ZonedDateTime(this.a, this.c, zoneOffset);
    }

    @Override // j$.time.chrono.ChronoZonedDateTime
    /* JADX INFO: renamed from: P, reason: merged with bridge method [inline-methods] */
    public final ZonedDateTime i(j$.time.temporal.k kVar) {
        if (kVar instanceof LocalDate) {
            return D(LocalDateTime.x((LocalDate) kVar, this.a.b), this.c, this.b);
        }
        if (kVar instanceof LocalTime) {
            return D(LocalDateTime.x(this.a.toLocalDate(), (LocalTime) kVar), this.c, this.b);
        }
        if (kVar instanceof LocalDateTime) {
            return D((LocalDateTime) kVar, this.c, this.b);
        }
        if (kVar instanceof OffsetDateTime) {
            OffsetDateTime offsetDateTime = (OffsetDateTime) kVar;
            return D(offsetDateTime.toLocalDateTime(), this.c, offsetDateTime.getOffset());
        }
        if (!(kVar instanceof Instant)) {
            return kVar instanceof ZoneOffset ? O((ZoneOffset) kVar) : (ZonedDateTime) kVar.f(this);
        }
        Instant instant = (Instant) kVar;
        return p(instant.getEpochSecond(), instant.getNano(), this.c);
    }

    @Override // j$.time.temporal.Temporal
    public final ChronoZonedDateTime c(long j, TemporalUnit temporalUnit) {
        long j2;
        if (j == Long.MIN_VALUE) {
            this = b(Long.MAX_VALUE, temporalUnit);
            j2 = 1;
        } else {
            j2 = -j;
        }
        return this.b(j2, temporalUnit);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final Object d(d dVar) {
        return dVar == j$.time.temporal.m.f ? toLocalDate() : super.d(dVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ZonedDateTime) {
            ZonedDateTime zonedDateTime = (ZonedDateTime) obj;
            if (this.a.equals(zonedDateTime.a) && this.b.equals(zonedDateTime.b) && this.c.equals(zonedDateTime.c)) {
                return true;
            }
        }
        return false;
    }

    public String format(DateTimeFormatter dateTimeFormatter) {
        Objects.requireNonNull(dateTimeFormatter, "formatter");
        return dateTimeFormatter.format(this);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final int g(TemporalField temporalField) {
        if (!(temporalField instanceof ChronoField)) {
            return super.g(temporalField);
        }
        int i = t.a[((ChronoField) temporalField).ordinal()];
        if (i != 1) {
            return i != 2 ? this.a.g(temporalField) : this.b.getTotalSeconds();
        }
        throw new j$.time.temporal.n("Invalid field 'InstantSeconds' for get() method, use getLong() instead");
    }

    @Override // j$.time.chrono.ChronoZonedDateTime
    public final ZoneOffset getOffset() {
        return this.b;
    }

    @Override // j$.time.chrono.ChronoZonedDateTime
    public ZoneId getZone() {
        return this.c;
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final boolean h(TemporalField temporalField) {
        if (temporalField instanceof ChronoField) {
            return true;
        }
        return temporalField != null && temporalField.p(this);
    }

    public int hashCode() {
        return Integer.rotateLeft(this.c.hashCode(), 3) ^ (this.a.hashCode() ^ this.b.hashCode());
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final long j(TemporalField temporalField) {
        if (!(temporalField instanceof ChronoField)) {
            return temporalField.K(this);
        }
        int i = t.a[((ChronoField) temporalField).ordinal()];
        if (i != 1) {
            return i != 2 ? this.a.j(temporalField) : this.b.getTotalSeconds();
        }
        return toEpochSecond();
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final j$.time.temporal.o k(TemporalField temporalField) {
        if (temporalField instanceof ChronoField) {
            return (temporalField == ChronoField.INSTANT_SECONDS || temporalField == ChronoField.OFFSET_SECONDS) ? ((ChronoField) temporalField).b : this.a.k(temporalField);
        }
        return temporalField.x(this);
    }

    @Override // j$.time.chrono.ChronoZonedDateTime
    public LocalDate toLocalDate() {
        return this.a.toLocalDate();
    }

    @Override // j$.time.chrono.ChronoZonedDateTime
    public final LocalTime toLocalTime() {
        return this.a.b;
    }

    public final String toString() {
        String str = this.a.toString() + this.b.c;
        ZoneOffset zoneOffset = this.b;
        ZoneId zoneId = this.c;
        if (zoneOffset == zoneId) {
            return str;
        }
        return str + "[" + zoneId.toString() + "]";
    }

    @Override // j$.time.temporal.Temporal
    public final long until(Temporal temporal, TemporalUnit temporalUnit) {
        ZonedDateTime zonedDateTimeX = x(temporal);
        if (!(temporalUnit instanceof ChronoUnit)) {
            return temporalUnit.between(this, zonedDateTimeX);
        }
        ZonedDateTime zonedDateTimeL = zonedDateTimeX.l(this.c);
        ChronoUnit chronoUnit = (ChronoUnit) temporalUnit;
        return (chronoUnit.compareTo(ChronoUnit.DAYS) < 0 || chronoUnit == ChronoUnit.FOREVER) ? new OffsetDateTime(this.a, this.b).until(new OffsetDateTime(zonedDateTimeL.a, zonedDateTimeL.b), temporalUnit) : this.a.until(zonedDateTimeL.a, temporalUnit);
    }

    @Override // j$.time.temporal.Temporal
    /* JADX INFO: renamed from: with, reason: merged with bridge method [inline-methods] */
    public ZonedDateTime a(TemporalField temporalField, long j) {
        if (!(temporalField instanceof ChronoField)) {
            return (ZonedDateTime) temporalField.O(this, j);
        }
        ChronoField chronoField = (ChronoField) temporalField;
        int i = t.a[chronoField.ordinal()];
        if (i != 1) {
            return i != 2 ? D(this.a.a(temporalField, j), this.c, this.b) : O(ZoneOffset.ofTotalSeconds(chronoField.b.a(chronoField, j)));
        }
        return p(j, this.a.getNano(), this.c);
    }

    @Override // j$.time.chrono.ChronoZonedDateTime
    /* JADX INFO: renamed from: withZoneSameInstant, reason: merged with bridge method [inline-methods] */
    public ZonedDateTime l(ZoneId zoneId) {
        Objects.requireNonNull(zoneId, "zone");
        return this.c.equals(zoneId) ? this : p(this.a.toEpochSecond(this.b), this.a.getNano(), zoneId);
    }

    @Override // j$.time.chrono.ChronoZonedDateTime
    public LocalDateTime toLocalDateTime() {
        return this.a;
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

    public static ZonedDateTime now() {
        Clock clockSystemDefaultZone = Clock.systemDefaultZone();
        Objects.requireNonNull(clockSystemDefaultZone, "clock");
        return ofInstant(clockSystemDefaultZone.instant(), clockSystemDefaultZone.getZone());
    }
}
