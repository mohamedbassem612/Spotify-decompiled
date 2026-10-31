package j$.time;

import j$.time.chrono.ChronoLocalDateTime;
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
public final class LocalDateTime implements Temporal, j$.time.temporal.k, ChronoLocalDateTime<LocalDate>, Serializable {
    public static final LocalDateTime c = x(LocalDate.d, LocalTime.e);
    public static final LocalDateTime d = x(LocalDate.e, LocalTime.f);
    private static final long serialVersionUID = 6207766400415563566L;
    public final LocalDate a;
    public final LocalTime b;

    public LocalDateTime(LocalDate localDate, LocalTime localTime) {
        this.a = localDate;
        this.b = localTime;
    }

    public static LocalDateTime from(TemporalAccessor temporalAccessor) {
        if (temporalAccessor instanceof LocalDateTime) {
            return (LocalDateTime) temporalAccessor;
        }
        if (temporalAccessor instanceof ZonedDateTime) {
            return ((ZonedDateTime) temporalAccessor).toLocalDateTime();
        }
        if (temporalAccessor instanceof OffsetDateTime) {
            return ((OffsetDateTime) temporalAccessor).toLocalDateTime();
        }
        try {
            return new LocalDateTime(LocalDate.D(temporalAccessor), LocalTime.D(temporalAccessor));
        } catch (DateTimeException e) {
            j$.nio.file.r.g("Unable to obtain LocalDateTime from TemporalAccessor: ", temporalAccessor, temporalAccessor.getClass().getName(), e);
            return null;
        }
    }

    public static LocalDateTime now(Clock clock) {
        Objects.requireNonNull(clock, "clock");
        Instant instant = clock.instant();
        return ofEpochSecond(instant.getEpochSecond(), instant.getNano(), clock.getZone().getRules().d(instant));
    }

    public static LocalDateTime of(int i, int i2, int i3, int i4, int i5, int i6, int i7) {
        return new LocalDateTime(LocalDate.of(i, i2, i3), LocalTime.O(i4, i5, i6, i7));
    }

    public static LocalDateTime ofEpochSecond(long j, int i, ZoneOffset zoneOffset) {
        Objects.requireNonNull(zoneOffset, "offset");
        long j2 = i;
        ChronoField.NANO_OF_SECOND.P(j2);
        long totalSeconds = j + ((long) zoneOffset.getTotalSeconds());
        return new LocalDateTime(LocalDate.ofEpochDay(Math.floorDiv(totalSeconds, 86400L)), LocalTime.P((((long) ((int) Math.floorMod(totalSeconds, 86400L))) * 1000000000) + j2));
    }

    public static LocalDateTime ofInstant(Instant instant, ZoneId zoneId) {
        Objects.requireNonNull(instant, "instant");
        Objects.requireNonNull(zoneId, "zone");
        return ofEpochSecond(instant.getEpochSecond(), instant.getNano(), zoneId.getRules().d(instant));
    }

    public static LocalDateTime parse(CharSequence charSequence, DateTimeFormatter dateTimeFormatter) {
        Objects.requireNonNull(dateTimeFormatter, "formatter");
        return (LocalDateTime) dateTimeFormatter.a(charSequence, new d((byte) 2));
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private Object writeReplace() {
        return new o((byte) 5, this);
    }

    public static LocalDateTime x(LocalDate localDate, LocalTime localTime) {
        Objects.requireNonNull(localDate, "date");
        Objects.requireNonNull(localTime, "time");
        return new LocalDateTime(localDate, localTime);
    }

    @Override // j$.time.temporal.Temporal
    /* JADX INFO: renamed from: D, reason: merged with bridge method [inline-methods] */
    public final LocalDateTime b(long j, TemporalUnit temporalUnit) {
        if (!(temporalUnit instanceof ChronoUnit)) {
            return (LocalDateTime) temporalUnit.p(this, j);
        }
        switch (g.a[((ChronoUnit) temporalUnit).ordinal()]) {
            case 1:
                return P(this.a, 0L, 0L, 0L, j);
            case 2:
                LocalDateTime localDateTimeK = K(j / 86400000000L);
                return localDateTimeK.P(localDateTimeK.a, 0L, 0L, 0L, (j % 86400000000L) * 1000);
            case 3:
                LocalDateTime localDateTimeK2 = K(j / 86400000);
                return localDateTimeK2.P(localDateTimeK2.a, 0L, 0L, 0L, (j % 86400000) * 1000000);
            case 4:
                return O(j);
            case 5:
                return P(this.a, 0L, j, 0L, 0L);
            case 6:
                return plusHours(j);
            case 7:
                return K(j / 256).plusHours((j % 256) * 12);
            default:
                return Q(this.a.b(j, temporalUnit), this.b);
        }
    }

    @Override // j$.time.chrono.ChronoLocalDateTime, java.lang.Comparable
    /* JADX INFO: renamed from: J, reason: merged with bridge method [inline-methods] */
    public final int compareTo(ChronoLocalDateTime chronoLocalDateTime) {
        return chronoLocalDateTime instanceof LocalDateTime ? p((LocalDateTime) chronoLocalDateTime) : super.compareTo(chronoLocalDateTime);
    }

    public final LocalDateTime K(long j) {
        return Q(this.a.plusDays(j), this.b);
    }

    public final LocalDateTime O(long j) {
        return P(this.a, 0L, 0L, j, 0L);
    }

    public final LocalDateTime P(LocalDate localDate, long j, long j2, long j3, long j4) {
        long j5 = j | j2 | j3 | j4;
        LocalTime localTime = this.b;
        if (j5 == 0) {
            return Q(localDate, localTime);
        }
        long j6 = j / 24;
        long jW = localTime.W();
        long j7 = ((j % 24) * 3600000000000L) + ((j2 % 1440) * 60000000000L) + ((j3 % 86400) * 1000000000) + (j4 % 86400000000000L) + jW;
        long jFloorDiv = Math.floorDiv(j7, 86400000000000L) + j6 + (j2 / 1440) + (j3 / 86400) + (j4 / 86400000000000L);
        long jFloorMod = Math.floorMod(j7, 86400000000000L);
        return Q(localDate.plusDays(jFloorDiv), jFloorMod == jW ? this.b : LocalTime.P(jFloorMod));
    }

    public final LocalDateTime Q(LocalDate localDate, LocalTime localTime) {
        return (this.a == localDate && this.b == localTime) ? this : new LocalDateTime(localDate, localTime);
    }

    @Override // j$.time.chrono.ChronoLocalDateTime
    /* JADX INFO: renamed from: R, reason: merged with bridge method [inline-methods] */
    public final LocalDateTime i(j$.time.temporal.k kVar) {
        if (kVar instanceof LocalDate) {
            return Q((LocalDate) kVar, this.b);
        }
        if (kVar instanceof LocalTime) {
            return Q(this.a, (LocalTime) kVar);
        }
        return kVar instanceof LocalDateTime ? (LocalDateTime) kVar : (LocalDateTime) kVar.f(this);
    }

    @Override // j$.time.temporal.Temporal
    /* JADX INFO: renamed from: S, reason: merged with bridge method [inline-methods] */
    public final LocalDateTime a(TemporalField temporalField, long j) {
        if (!(temporalField instanceof ChronoField)) {
            return (LocalDateTime) temporalField.O(this, j);
        }
        boolean zQ = ((ChronoField) temporalField).Q();
        LocalDate localDate = this.a;
        return zQ ? Q(localDate, this.b.a(temporalField, j)) : Q(localDate.a(temporalField, j), this.b);
    }

    public OffsetDateTime atOffset(ZoneOffset zoneOffset) {
        return new OffsetDateTime(this, zoneOffset);
    }

    @Override // j$.time.chrono.ChronoLocalDateTime
    /* JADX INFO: renamed from: atZone, reason: merged with bridge method [inline-methods] */
    public ZonedDateTime C(ZoneId zoneId) {
        return ZonedDateTime.D(this, zoneId, null);
    }

    @Override // j$.time.temporal.Temporal
    public final ChronoLocalDateTime c(long j, TemporalUnit temporalUnit) {
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
        return dVar == j$.time.temporal.m.f ? this.a : super.d(dVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof LocalDateTime) {
            LocalDateTime localDateTime = (LocalDateTime) obj;
            if (this.a.equals(localDateTime.a) && this.b.equals(localDateTime.b)) {
                return true;
            }
        }
        return false;
    }

    @Override // j$.time.temporal.k
    public final Temporal f(Temporal temporal) {
        return super.f(temporal);
    }

    public String format(DateTimeFormatter dateTimeFormatter) {
        Objects.requireNonNull(dateTimeFormatter, "formatter");
        return dateTimeFormatter.format(this);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final int g(TemporalField temporalField) {
        if (temporalField instanceof ChronoField) {
            return ((ChronoField) temporalField).Q() ? this.b.g(temporalField) : this.a.g(temporalField);
        }
        return super.g(temporalField);
    }

    public int getDayOfMonth() {
        return this.a.getDayOfMonth();
    }

    public int getMinute() {
        return this.b.b;
    }

    public Month getMonth() {
        return this.a.getMonth();
    }

    public int getMonthValue() {
        return this.a.getMonthValue();
    }

    public int getNano() {
        return this.b.d;
    }

    public int getYear() {
        return this.a.getYear();
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final boolean h(TemporalField temporalField) {
        if (!(temporalField instanceof ChronoField)) {
            return temporalField != null && temporalField.p(this);
        }
        ChronoField chronoField = (ChronoField) temporalField;
        return chronoField.isDateBased() || chronoField.Q();
    }

    public int hashCode() {
        return this.b.hashCode() ^ this.a.hashCode();
    }

    public boolean isAfter(ChronoLocalDateTime<?> chronoLocalDateTime) {
        if (chronoLocalDateTime instanceof LocalDateTime) {
            return p((LocalDateTime) chronoLocalDateTime) > 0;
        }
        long epochDay = toLocalDate().toEpochDay();
        long epochDay2 = chronoLocalDateTime.toLocalDate().toEpochDay();
        if (epochDay <= epochDay2) {
            return epochDay == epochDay2 && this.b.W() > chronoLocalDateTime.toLocalTime().W();
        }
        return true;
    }

    public boolean isBefore(ChronoLocalDateTime<?> chronoLocalDateTime) {
        if (chronoLocalDateTime instanceof LocalDateTime) {
            return p((LocalDateTime) chronoLocalDateTime) < 0;
        }
        long epochDay = toLocalDate().toEpochDay();
        long epochDay2 = chronoLocalDateTime.toLocalDate().toEpochDay();
        if (epochDay >= epochDay2) {
            return epochDay == epochDay2 && this.b.W() < chronoLocalDateTime.toLocalTime().W();
        }
        return true;
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
            return ((ChronoField) temporalField).Q() ? this.b.k(temporalField) : this.a.k(temporalField);
        }
        return temporalField.x(this);
    }

    public LocalDateTime minusDays(long j) {
        long j2;
        if (j == Long.MIN_VALUE) {
            this = K(Long.MAX_VALUE);
            j2 = 1;
        } else {
            j2 = -j;
        }
        return this.K(j2);
    }

    public LocalDateTime minusMonths(long j) {
        LocalDate localDateU;
        LocalDate localDate = this.a;
        if (j == Long.MIN_VALUE) {
            this = Q(localDate.U(Long.MAX_VALUE), this.b);
            localDateU = this.a.U(1L);
        } else {
            localDateU = localDate.U(-j);
        }
        return this.Q(localDateU, this.b);
    }

    public final int p(LocalDateTime localDateTime) {
        int iP = this.a.p(localDateTime.toLocalDate());
        return iP == 0 ? this.b.compareTo(localDateTime.b) : iP;
    }

    public LocalDateTime plusHours(long j) {
        return P(this.a, j, 0L, 0L, 0L);
    }

    public LocalDateTime plusWeeks(long j) {
        return Q(this.a.V(j), this.b);
    }

    @Override // j$.time.chrono.ChronoLocalDateTime
    public final LocalTime toLocalTime() {
        return this.b;
    }

    public final String toString() {
        return this.a.toString() + "T" + this.b.toString();
    }

    /* JADX WARN: Code duplicated, block: B:30:0x00bf  */
    @Override // j$.time.temporal.Temporal
    public long until(Temporal temporal, TemporalUnit temporalUnit) {
        long jMultiplyExact;
        long j;
        LocalDateTime localDateTimeFrom = from(temporal);
        if (!(temporalUnit instanceof ChronoUnit)) {
            return temporalUnit.between(this, localDateTimeFrom);
        }
        ChronoUnit chronoUnit = (ChronoUnit) temporalUnit;
        if (chronoUnit.compareTo(ChronoUnit.DAYS) >= 0) {
            LocalDate localDatePlusDays = localDateTimeFrom.a;
            LocalDate localDate = this.a;
            boolean z = false;
            if (localDate != null) {
                localDatePlusDays.getClass();
                if (localDatePlusDays.p(localDate) > 0) {
                    z = true;
                }
            } else if (localDatePlusDays.toEpochDay() > localDate.toEpochDay()) {
                z = true;
            }
            if (z && localDateTimeFrom.b.compareTo(this.b) < 0) {
                localDatePlusDays = localDatePlusDays.minusDays(1L);
            } else if (localDatePlusDays.isBefore(this.a) && localDateTimeFrom.b.compareTo(this.b) > 0) {
                localDatePlusDays = localDatePlusDays.plusDays(1L);
            }
            return this.a.until(localDatePlusDays, temporalUnit);
        }
        LocalDate localDate2 = this.a;
        LocalDate localDate3 = localDateTimeFrom.a;
        localDate2.getClass();
        long epochDay = localDate3.toEpochDay() - localDate2.toEpochDay();
        if (epochDay == 0) {
            return this.b.until(localDateTimeFrom.b, temporalUnit);
        }
        long jW = localDateTimeFrom.b.W() - this.b.W();
        if (epochDay > 0) {
            jMultiplyExact = epochDay - 1;
            j = jW + 86400000000000L;
        } else {
            jMultiplyExact = epochDay + 1;
            j = jW - 86400000000000L;
        }
        switch (g.a[chronoUnit.ordinal()]) {
            case 1:
                jMultiplyExact = Math.multiplyExact(jMultiplyExact, 86400000000000L);
                break;
            case 2:
                jMultiplyExact = Math.multiplyExact(jMultiplyExact, 86400000000L);
                j /= 1000;
                break;
            case 3:
                jMultiplyExact = Math.multiplyExact(jMultiplyExact, 86400000L);
                j /= 1000000;
                break;
            case 4:
                jMultiplyExact = Math.multiplyExact(jMultiplyExact, 86400L);
                j /= 1000000000;
                break;
            case 5:
                jMultiplyExact = Math.multiplyExact(jMultiplyExact, 1440L);
                j /= 60000000000L;
                break;
            case 6:
                jMultiplyExact = Math.multiplyExact(jMultiplyExact, 24L);
                j /= 3600000000000L;
                break;
            case 7:
                jMultiplyExact = Math.multiplyExact(jMultiplyExact, 2L);
                j /= 43200000000000L;
                break;
        }
        return Math.addExact(jMultiplyExact, j);
    }

    @Override // j$.time.chrono.ChronoLocalDateTime
    public LocalDate toLocalDate() {
        return this.a;
    }

    public static LocalDateTime parse(CharSequence charSequence) {
        return parse(charSequence, DateTimeFormatter.ISO_LOCAL_DATE_TIME);
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

    public static LocalDateTime now() {
        return now(Clock.systemDefaultZone());
    }
}
