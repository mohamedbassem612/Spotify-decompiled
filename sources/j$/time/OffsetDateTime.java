package j$.time;

import j$.time.chrono.IsoChronology;
import j$.time.format.DateTimeFormatter;
import j$.time.temporal.ChronoField;
import j$.time.temporal.ChronoUnit;
import j$.time.temporal.Temporal;
import j$.time.temporal.TemporalAccessor;
import j$.time.temporal.TemporalField;
import j$.time.temporal.TemporalUnit;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-d9f8928238715ac698104c66898e5631a6796c71eabc0cbc140853337a7ef765 */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes13.dex */
public final class OffsetDateTime implements Temporal, j$.time.temporal.k, Comparable<OffsetDateTime>, Serializable {
    public static final /* synthetic */ int c = 0;
    private static final long serialVersionUID = 2287754244819255394L;
    public final LocalDateTime a;
    public final ZoneOffset b;

    static {
        LocalDateTime.c.atOffset(ZoneOffset.g);
        LocalDateTime.d.atOffset(ZoneOffset.f);
    }

    public OffsetDateTime(LocalDateTime localDateTime, ZoneOffset zoneOffset) {
        Objects.requireNonNull(localDateTime, "dateTime");
        this.a = localDateTime;
        Objects.requireNonNull(zoneOffset, "offset");
        this.b = zoneOffset;
    }

    public static OffsetDateTime ofInstant(Instant instant, ZoneId zoneId) {
        Objects.requireNonNull(instant, "instant");
        Objects.requireNonNull(zoneId, "zone");
        ZoneOffset zoneOffsetD = zoneId.getRules().d(instant);
        return new OffsetDateTime(LocalDateTime.ofEpochSecond(instant.getEpochSecond(), instant.getNano(), zoneOffsetD), zoneOffsetD);
    }

    public static OffsetDateTime p(TemporalAccessor temporalAccessor) {
        if (temporalAccessor instanceof OffsetDateTime) {
            return (OffsetDateTime) temporalAccessor;
        }
        try {
            ZoneOffset zoneOffsetP = ZoneOffset.P(temporalAccessor);
            LocalDate localDate = (LocalDate) temporalAccessor.d(j$.time.temporal.m.f);
            LocalTime localTime = (LocalTime) temporalAccessor.d(j$.time.temporal.m.g);
            return (localDate == null || localTime == null) ? ofInstant(Instant.x(temporalAccessor), zoneOffsetP) : new OffsetDateTime(LocalDateTime.x(localDate, localTime), zoneOffsetP);
        } catch (DateTimeException e) {
            j$.nio.file.r.g("Unable to obtain OffsetDateTime from TemporalAccessor: ", temporalAccessor, temporalAccessor.getClass().getName(), e);
            return null;
        }
    }

    public static OffsetDateTime parse(CharSequence charSequence, DateTimeFormatter dateTimeFormatter) {
        Objects.requireNonNull(dateTimeFormatter, "formatter");
        return (OffsetDateTime) dateTimeFormatter.a(charSequence, new d((byte) 3));
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private Object writeReplace() {
        return new o((byte) 10, this);
    }

    public final OffsetDateTime D(LocalDateTime localDateTime, ZoneOffset zoneOffset) {
        return (this.a == localDateTime && this.b.equals(zoneOffset)) ? this : new OffsetDateTime(localDateTime, zoneOffset);
    }

    @Override // j$.time.temporal.Temporal
    public final Temporal a(TemporalField temporalField, long j) {
        if (!(temporalField instanceof ChronoField)) {
            return (OffsetDateTime) temporalField.O(this, j);
        }
        ChronoField chronoField = (ChronoField) temporalField;
        int i = l.a[chronoField.ordinal()];
        LocalDateTime localDateTime = this.a;
        if (i != 1) {
            return i != 2 ? D(localDateTime.a(temporalField, j), this.b) : D(localDateTime, ZoneOffset.ofTotalSeconds(chronoField.b.a(chronoField, j)));
        }
        return ofInstant(Instant.ofEpochSecond(j, localDateTime.getNano()), this.b);
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
    public final int compareTo(OffsetDateTime offsetDateTime) {
        int iCompare;
        OffsetDateTime offsetDateTime2 = offsetDateTime;
        if (getOffset().equals(offsetDateTime2.getOffset())) {
            iCompare = toLocalDateTime().compareTo(offsetDateTime2.toLocalDateTime());
        } else {
            iCompare = Long.compare(this.a.toEpochSecond(this.b), offsetDateTime2.a.toEpochSecond(offsetDateTime2.b));
            if (iCompare == 0) {
                iCompare = this.a.b.d - offsetDateTime2.a.b.d;
            }
        }
        return iCompare == 0 ? toLocalDateTime().compareTo(offsetDateTime2.toLocalDateTime()) : iCompare;
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final Object d(d dVar) {
        if (dVar == j$.time.temporal.m.d || dVar == j$.time.temporal.m.e) {
            return getOffset();
        }
        if (dVar == j$.time.temporal.m.a) {
            return null;
        }
        if (dVar == j$.time.temporal.m.f) {
            return toLocalDate();
        }
        if (dVar == j$.time.temporal.m.g) {
            return this.a.b;
        }
        if (dVar == j$.time.temporal.m.b) {
            return IsoChronology.INSTANCE;
        }
        return dVar == j$.time.temporal.m.c ? ChronoUnit.NANOS : dVar.k(this);
    }

    @Override // j$.time.temporal.Temporal
    /* JADX INFO: renamed from: e */
    public final Temporal i(LocalDate localDate) {
        return localDate == null ? (OffsetDateTime) localDate.f(this) : D(this.a.i(localDate), this.b);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof OffsetDateTime) {
            OffsetDateTime offsetDateTime = (OffsetDateTime) obj;
            if (this.a.equals(offsetDateTime.a) && this.b.equals(offsetDateTime.b)) {
                return true;
            }
        }
        return false;
    }

    @Override // j$.time.temporal.k
    public final Temporal f(Temporal temporal) {
        return temporal.a(ChronoField.EPOCH_DAY, toLocalDate().toEpochDay()).a(ChronoField.NANO_OF_DAY, this.a.b.W()).a(ChronoField.OFFSET_SECONDS, getOffset().getTotalSeconds());
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
        int i = l.a[((ChronoField) temporalField).ordinal()];
        if (i != 1) {
            return i != 2 ? this.a.g(temporalField) : getOffset().getTotalSeconds();
        }
        throw new j$.time.temporal.n("Invalid field 'InstantSeconds' for get() method, use getLong() instead");
    }

    public int getDayOfMonth() {
        return this.a.getDayOfMonth();
    }

    public DayOfWeek getDayOfWeek() {
        return this.a.a.getDayOfWeek();
    }

    public Month getMonth() {
        return this.a.getMonth();
    }

    public ZoneOffset getOffset() {
        return this.b;
    }

    public int getYear() {
        return this.a.getYear();
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final boolean h(TemporalField temporalField) {
        if (temporalField instanceof ChronoField) {
            return true;
        }
        return temporalField != null && temporalField.p(this);
    }

    public int hashCode() {
        return this.b.hashCode() ^ this.a.hashCode();
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final long j(TemporalField temporalField) {
        if (!(temporalField instanceof ChronoField)) {
            return temporalField.K(this);
        }
        int i = l.a[((ChronoField) temporalField).ordinal()];
        if (i != 1) {
            return i != 2 ? this.a.j(temporalField) : getOffset().getTotalSeconds();
        }
        return this.a.toEpochSecond(this.b);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final j$.time.temporal.o k(TemporalField temporalField) {
        if (temporalField instanceof ChronoField) {
            return (temporalField == ChronoField.INSTANT_SECONDS || temporalField == ChronoField.OFFSET_SECONDS) ? ((ChronoField) temporalField).b : this.a.k(temporalField);
        }
        return temporalField.x(this);
    }

    public OffsetDateTime plusMinutes(long j) {
        LocalDateTime localDateTime = this.a;
        return D(localDateTime.P(localDateTime.a, 0L, j, 0L, 0L), this.b);
    }

    public Instant toInstant() {
        return this.a.toInstant(this.b);
    }

    public LocalDate toLocalDate() {
        return this.a.toLocalDate();
    }

    public LocalDateTime toLocalDateTime() {
        return this.a;
    }

    public final String toString() {
        return this.a.toString() + this.b.c;
    }

    @Override // j$.time.temporal.Temporal
    public final long until(Temporal temporal, TemporalUnit temporalUnit) {
        OffsetDateTime offsetDateTimeP = p(temporal);
        if (!(temporalUnit instanceof ChronoUnit)) {
            return temporalUnit.between(this, offsetDateTimeP);
        }
        ZoneOffset zoneOffset = this.b;
        if (!zoneOffset.equals(offsetDateTimeP.b)) {
            offsetDateTimeP = new OffsetDateTime(offsetDateTimeP.a.O(zoneOffset.getTotalSeconds() - offsetDateTimeP.b.getTotalSeconds()), zoneOffset);
        }
        return this.a.until(offsetDateTimeP.a, temporalUnit);
    }

    @Override // j$.time.temporal.Temporal
    /* JADX INFO: renamed from: x, reason: merged with bridge method [inline-methods] */
    public final OffsetDateTime b(long j, TemporalUnit temporalUnit) {
        return temporalUnit instanceof ChronoUnit ? D(this.a.b(j, temporalUnit), this.b) : (OffsetDateTime) temporalUnit.p(this, j);
    }

    public static OffsetDateTime parse(CharSequence charSequence) {
        return parse(charSequence, DateTimeFormatter.ISO_OFFSET_DATE_TIME);
    }
}
