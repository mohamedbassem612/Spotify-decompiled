package j$.time.chrono;

import j$.time.Duration;
import j$.time.Instant;
import j$.time.LocalDateTime;
import j$.time.ZoneId;
import j$.time.ZoneOffset;
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
public final class i implements ChronoZonedDateTime, Serializable {
    private static final long serialVersionUID = -5261813987200935591L;
    public final transient e a;
    public final transient ZoneOffset b;
    public final transient ZoneId c;

    public i(ZoneId zoneId, ZoneOffset zoneOffset, e eVar) {
        Objects.requireNonNull(eVar, "dateTime");
        this.a = eVar;
        this.b = zoneOffset;
        Objects.requireNonNull(zoneId, "zone");
        this.c = zoneId;
    }

    public static i D(Chronology chronology, Instant instant, ZoneId zoneId) {
        ZoneOffset zoneOffsetD = zoneId.getRules().d(instant);
        Objects.requireNonNull(zoneOffsetD, "offset");
        return new i(zoneId, zoneOffsetD, (e) chronology.H(LocalDateTime.ofEpochSecond(instant.getEpochSecond(), instant.getNano(), zoneOffsetD)));
    }

    public static i p(Chronology chronology, Temporal temporal) {
        i iVar = (i) temporal;
        if (chronology.equals(iVar.getChronology())) {
            return iVar;
        }
        j$.nio.file.r.k("Chronology mismatch, required: ", chronology.getId(), iVar.getChronology().getId());
        return null;
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private Object writeReplace() {
        return new a0((byte) 3, this);
    }

    public static i x(ZoneId zoneId, ZoneOffset zoneOffset, e eVar) {
        Objects.requireNonNull(eVar, "localDateTime");
        Objects.requireNonNull(zoneId, "zone");
        if (zoneId instanceof ZoneOffset) {
            return new i(zoneId, (ZoneOffset) zoneId, eVar);
        }
        ZoneRules rules = zoneId.getRules();
        LocalDateTime localDateTimeFrom = LocalDateTime.from(eVar);
        List listF = rules.f(localDateTimeFrom);
        if (listF.size() == 1) {
            zoneOffset = (ZoneOffset) listF.get(0);
        } else if (listF.size() == 0) {
            Object objE = rules.e(localDateTimeFrom);
            j$.time.zone.b bVar = objE instanceof j$.time.zone.b ? (j$.time.zone.b) objE : null;
            eVar = eVar.D(eVar.a, 0L, 0L, Duration.ofSeconds(bVar.d.getTotalSeconds() - bVar.c.getTotalSeconds()).getSeconds(), 0L);
            zoneOffset = bVar.d;
        } else {
            if (zoneOffset == null || !listF.contains(zoneOffset)) {
                zoneOffset = (ZoneOffset) listF.get(0);
            }
            eVar = eVar;
        }
        Objects.requireNonNull(zoneOffset, "offset");
        return new i(zoneId, zoneOffset, eVar);
    }

    @Override // j$.time.chrono.ChronoZonedDateTime
    public final ChronoZonedDateTime B(ZoneId zoneId) {
        return x(zoneId, this.b, this.a);
    }

    @Override // j$.time.chrono.ChronoZonedDateTime, j$.time.temporal.Temporal
    public final ChronoZonedDateTime a(TemporalField temporalField, long j) {
        if (!(temporalField instanceof ChronoField)) {
            return p(getChronology(), temporalField.O(this, j));
        }
        ChronoField chronoField = (ChronoField) temporalField;
        int i = h.a[chronoField.ordinal()];
        if (i == 1) {
            return b(j - toEpochSecond(), (TemporalUnit) ChronoUnit.SECONDS);
        }
        if (i != 2) {
            return x(this.c, this.b, this.a.a(temporalField, j));
        }
        return D(getChronology(), this.a.toInstant(ZoneOffset.ofTotalSeconds(chronoField.b.a(chronoField, j))), this.c);
    }

    @Override // j$.time.chrono.ChronoZonedDateTime, j$.time.temporal.Temporal
    public final ChronoZonedDateTime b(long j, TemporalUnit temporalUnit) {
        return temporalUnit instanceof ChronoUnit ? i(this.a.b(j, temporalUnit)) : p(getChronology(), temporalUnit.p(this, j));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ChronoZonedDateTime) && compareTo((ChronoZonedDateTime) obj) == 0;
    }

    @Override // j$.time.chrono.ChronoZonedDateTime
    public final ZoneOffset getOffset() {
        return this.b;
    }

    @Override // j$.time.chrono.ChronoZonedDateTime
    public final ZoneId getZone() {
        return this.c;
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final boolean h(TemporalField temporalField) {
        if (temporalField instanceof ChronoField) {
            return true;
        }
        return temporalField != null && temporalField.p(this);
    }

    public final int hashCode() {
        return Integer.rotateLeft(this.c.hashCode(), 3) ^ (this.a.hashCode() ^ this.b.hashCode());
    }

    @Override // j$.time.chrono.ChronoZonedDateTime
    public final ChronoZonedDateTime l(ZoneId zoneId) {
        if (this.c.equals(zoneId)) {
            return this;
        }
        return D(getChronology(), this.a.toInstant(this.b), zoneId);
    }

    @Override // j$.time.chrono.ChronoZonedDateTime
    public final ChronoLocalDateTime toLocalDateTime() {
        return this.a;
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
        Objects.requireNonNull(temporal, "endExclusive");
        ChronoZonedDateTime chronoZonedDateTimeG = getChronology().G(temporal);
        if (temporalUnit instanceof ChronoUnit) {
            return this.a.until(chronoZonedDateTimeG.l(this.b).toLocalDateTime(), temporalUnit);
        }
        Objects.requireNonNull(temporalUnit, "unit");
        return temporalUnit.between(this, chronoZonedDateTimeG);
    }
}
