package j$.time;

import j$.time.chrono.ChronoLocalDate;
import j$.time.chrono.ChronoLocalDateTime;
import j$.time.chrono.Chronology;
import j$.time.chrono.IsoChronology;
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
public final class LocalDate implements Temporal, j$.time.temporal.k, ChronoLocalDate, Serializable {
    public static final LocalDate d = of(-999999999, 1, 1);
    public static final LocalDate e = of(999999999, 12, 31);
    private static final long serialVersionUID = 2942565459149668126L;
    public final int a;
    public final short b;
    public final short c;

    static {
        of(1970, 1, 1);
    }

    public LocalDate(int i, int i2, int i3) {
        this.a = i;
        this.b = (short) i2;
        this.c = (short) i3;
    }

    public static LocalDate D(TemporalAccessor temporalAccessor) {
        Objects.requireNonNull(temporalAccessor, "temporal");
        LocalDate localDate = (LocalDate) temporalAccessor.d(j$.time.temporal.m.f);
        if (localDate != null) {
            return localDate;
        }
        j$.nio.file.r.f("Unable to obtain LocalDate from TemporalAccessor: ", temporalAccessor, " of type ", temporalAccessor.getClass().getName());
        return null;
    }

    public static LocalDate S(int i, int i2) {
        long j = i;
        ChronoField.YEAR.P(j);
        ChronoField.DAY_OF_YEAR.P(i2);
        boolean zIsLeapYear = IsoChronology.INSTANCE.isLeapYear(j);
        if (i2 == 366 && !zIsLeapYear) {
            j$.nio.file.r.c("Invalid date 'DayOfYear 366' as '", i, "' is not a leap year");
            return null;
        }
        Month monthK = Month.K(((i2 - 1) / 31) + 1);
        if (i2 > (monthK.x(zIsLeapYear) + monthK.p(zIsLeapYear)) - 1) {
            monthK = Month.a[(monthK.ordinal() + 13) % 12];
        }
        return new LocalDate(i, monthK.getValue(), (i2 - monthK.p(zIsLeapYear)) + 1);
    }

    public static LocalDate W(int i, int i2, int i3) {
        if (i2 == 2) {
            i3 = Math.min(i3, IsoChronology.INSTANCE.isLeapYear((long) i) ? 29 : 28);
        } else if (i2 == 4 || i2 == 6 || i2 == 9 || i2 == 11) {
            i3 = Math.min(i3, 30);
        }
        return new LocalDate(i, i2, i3);
    }

    public static LocalDate now(Clock clock) {
        Objects.requireNonNull(clock, "clock");
        Instant instant = clock.instant();
        ZoneId zone = clock.getZone();
        Objects.requireNonNull(instant, "instant");
        Objects.requireNonNull(zone, "zone");
        return ofEpochDay(Math.floorDiv(instant.getEpochSecond() + ((long) zone.getRules().d(instant).getTotalSeconds()), 86400L));
    }

    public static LocalDate of(int i, int i2, int i3) {
        ChronoField.YEAR.P(i);
        ChronoField.MONTH_OF_YEAR.P(i2);
        ChronoField.DAY_OF_MONTH.P(i3);
        return x(i, i2, i3);
    }

    public static LocalDate ofEpochDay(long j) {
        long j2;
        ChronoField.EPOCH_DAY.P(j);
        long j3 = 719468 + j;
        if (j3 < 0) {
            long j4 = ((j + 719469) / 146097) - 1;
            j2 = j4 * 400;
            j3 += (-j4) * 146097;
        } else {
            j2 = 0;
        }
        long j5 = ((j3 * 400) + 591) / 146097;
        long j6 = j3 - ((j5 / 400) + (((j5 / 4) + (j5 * 365)) - (j5 / 100)));
        if (j6 < 0) {
            j5--;
            j6 = j3 - ((j5 / 400) + (((j5 / 4) + (365 * j5)) - (j5 / 100)));
        }
        int i = (int) j6;
        int i2 = ((i * 5) + 2) / 153;
        int i3 = ((i2 + 2) % 12) + 1;
        int i4 = (i - (((i2 * 306) + 5) / 10)) + 1;
        long j7 = j5 + j2 + ((long) (i2 / 10));
        ChronoField chronoField = ChronoField.YEAR;
        return new LocalDate(chronoField.b.a(chronoField, j7), i3, i4);
    }

    public static LocalDate parse(CharSequence charSequence) {
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ISO_LOCAL_DATE;
        Objects.requireNonNull(dateTimeFormatter, "formatter");
        return (LocalDate) dateTimeFormatter.a(charSequence, new d((byte) 1));
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private Object writeReplace() {
        return new o((byte) 3, this);
    }

    public static LocalDate x(int i, int i2, int i3) {
        int i4 = 28;
        if (i3 > 28) {
            if (i2 != 2) {
                i4 = (i2 == 4 || i2 == 6 || i2 == 9 || i2 == 11) ? 30 : 31;
            } else if (IsoChronology.INSTANCE.isLeapYear(i)) {
                i4 = 29;
            }
            if (i3 > i4) {
                if (i3 == 29) {
                    j$.nio.file.r.c("Invalid date 'February 29' as '", i, "' is not a leap year");
                    return null;
                }
                throw new DateTimeException("Invalid date '" + Month.K(i2).name() + " " + i3 + "'");
            }
        }
        return new LocalDate(i, i2, i3);
    }

    @Override // j$.time.chrono.ChronoLocalDate
    public final ChronoLocalDateTime F(LocalTime localTime) {
        return LocalDateTime.x(this, localTime);
    }

    public final int K(TemporalField temporalField) {
        switch (f.a[((ChronoField) temporalField).ordinal()]) {
            case 1:
                return this.c;
            case 2:
                return O();
            case 3:
                return ((this.c - 1) / 7) + 1;
            case 4:
                int i = this.a;
                return i >= 1 ? i : 1 - i;
            case 5:
                return getDayOfWeek().getValue();
            case 6:
                return ((this.c - 1) % 7) + 1;
            case 7:
                return ((O() - 1) % 7) + 1;
            case 8:
                throw new j$.time.temporal.n("Invalid field 'EpochDay' for get() method, use getLong() instead");
            case 9:
                return ((O() - 1) / 7) + 1;
            case 10:
                return this.b;
            case 11:
                throw new j$.time.temporal.n("Invalid field 'ProlepticMonth' for get() method, use getLong() instead");
            case 12:
                return this.a;
            case 13:
                return this.a >= 1 ? 1 : 0;
            default:
                throw new j$.time.temporal.n(b.a("Unsupported field: ", temporalField));
        }
    }

    @Override // j$.time.chrono.ChronoLocalDate
    public final ChronoLocalDate L(TemporalAmount temporalAmount) {
        Period period = (Period) temporalAmount;
        return U((((long) period.a) * 12) + ((long) period.b)).plusDays(period.c);
    }

    public final int O() {
        return (getMonth().p(isLeapYear()) + this.c) - 1;
    }

    public final long P() {
        return ((((long) this.a) * 12) + ((long) this.b)) - 1;
    }

    @Override // j$.time.temporal.Temporal
    /* JADX INFO: renamed from: Q, reason: merged with bridge method [inline-methods] */
    public final LocalDate c(long j, TemporalUnit temporalUnit) {
        long j2;
        if (j == Long.MIN_VALUE) {
            this = b(Long.MAX_VALUE, temporalUnit);
            j2 = 1;
        } else {
            j2 = -j;
        }
        return this.b(j2, temporalUnit);
    }

    public final long R(LocalDate localDate) {
        return (((localDate.P() * 32) + ((long) localDate.getDayOfMonth())) - ((P() * 32) + ((long) getDayOfMonth()))) / 32;
    }

    @Override // j$.time.temporal.Temporal
    /* JADX INFO: renamed from: T, reason: merged with bridge method [inline-methods] */
    public final LocalDate b(long j, TemporalUnit temporalUnit) {
        if (!(temporalUnit instanceof ChronoUnit)) {
            return (LocalDate) temporalUnit.p(this, j);
        }
        switch (f.b[((ChronoUnit) temporalUnit).ordinal()]) {
            case 1:
                return plusDays(j);
            case 2:
                return V(j);
            case 3:
                return U(j);
            case 4:
                return plusYears(j);
            case 5:
                return plusYears(Math.multiplyExact(j, 10L));
            case 6:
                return plusYears(Math.multiplyExact(j, 100L));
            case 7:
                return plusYears(Math.multiplyExact(j, 1000L));
            case 8:
                ChronoField chronoField = ChronoField.ERA;
                return a(chronoField, Math.addExact(j(chronoField), j));
            default:
                j$.nio.file.r.d("Unsupported unit: ", temporalUnit);
                return null;
        }
    }

    public final LocalDate U(long j) {
        if (j == 0) {
            return this;
        }
        long j2 = (((long) this.a) * 12) + ((long) (this.b - 1)) + j;
        ChronoField chronoField = ChronoField.YEAR;
        return W(chronoField.b.a(chronoField, Math.floorDiv(j2, 12L)), ((int) Math.floorMod(j2, 12L)) + 1, this.c);
    }

    public final LocalDate V(long j) {
        return plusDays(Math.multiplyExact(j, 7L));
    }

    @Override // j$.time.chrono.ChronoLocalDate
    /* JADX INFO: renamed from: X, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public final LocalDate i(j$.time.temporal.k kVar) {
        return kVar instanceof LocalDate ? (LocalDate) kVar : (LocalDate) kVar.f(this);
    }

    @Override // j$.time.temporal.Temporal
    /* JADX INFO: renamed from: Y, reason: merged with bridge method [inline-methods] */
    public final LocalDate a(TemporalField temporalField, long j) {
        if (!(temporalField instanceof ChronoField)) {
            return (LocalDate) temporalField.O(this, j);
        }
        ChronoField chronoField = (ChronoField) temporalField;
        chronoField.P(j);
        switch (f.a[chronoField.ordinal()]) {
            case 1:
                int i = (int) j;
                if (this.c != i) {
                    return of(this.a, this.b, i);
                }
                return this;
            case 2:
                int i2 = (int) j;
                if (O() != i2) {
                    return S(this.a, i2);
                }
                return this;
            case 3:
                return V(j - j(ChronoField.ALIGNED_WEEK_OF_MONTH));
            case 4:
                if (this.a < 1) {
                    j = 1 - j;
                }
                return Z((int) j);
            case 5:
                return plusDays(j - ((long) getDayOfWeek().getValue()));
            case 6:
                return plusDays(j - j(ChronoField.ALIGNED_DAY_OF_WEEK_IN_MONTH));
            case 7:
                return plusDays(j - j(ChronoField.ALIGNED_DAY_OF_WEEK_IN_YEAR));
            case 8:
                return ofEpochDay(j);
            case 9:
                return V(j - j(ChronoField.ALIGNED_WEEK_OF_YEAR));
            case 10:
                int i3 = (int) j;
                if (this.b != i3) {
                    ChronoField.MONTH_OF_YEAR.P(i3);
                    return W(this.a, i3, this.c);
                }
                return this;
            case 11:
                return U(j - P());
            case 12:
                return Z((int) j);
            case 13:
                if (j(ChronoField.ERA) != j) {
                    return Z(1 - this.a);
                }
                return this;
            default:
                throw new j$.time.temporal.n(b.a("Unsupported field: ", temporalField));
        }
    }

    public final LocalDate Z(int i) {
        if (this.a == i) {
            return this;
        }
        ChronoField.YEAR.P(i);
        return W(i, this.b, this.c);
    }

    public ZonedDateTime atStartOfDay(ZoneId zoneId) {
        Objects.requireNonNull(zoneId, "zone");
        LocalDateTime localDateTimeX = LocalDateTime.x(this, LocalTime.g);
        if (!(zoneId instanceof ZoneOffset)) {
            Object objE = zoneId.getRules().e(localDateTimeX);
            j$.time.zone.b bVar = objE instanceof j$.time.zone.b ? (j$.time.zone.b) objE : null;
            if (bVar != null && bVar.p()) {
                localDateTimeX = bVar.b.O(bVar.d.getTotalSeconds() - bVar.c.getTotalSeconds());
            }
        }
        return ZonedDateTime.D(localDateTimeX, zoneId, null);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // j$.time.chrono.ChronoLocalDate, java.lang.Comparable
    public int compareTo(ChronoLocalDate chronoLocalDate) {
        return chronoLocalDate instanceof LocalDate ? p((LocalDate) chronoLocalDate) : super.compareTo(chronoLocalDate);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final Object d(d dVar) {
        return dVar == j$.time.temporal.m.f ? this : super.d(dVar);
    }

    @Override // j$.time.chrono.ChronoLocalDate
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof LocalDate) && p((LocalDate) obj) == 0;
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
        return temporalField instanceof ChronoField ? K(temporalField) : super.g(temporalField);
    }

    @Override // j$.time.chrono.ChronoLocalDate
    public final Chronology getChronology() {
        return IsoChronology.INSTANCE;
    }

    public int getDayOfMonth() {
        return this.c;
    }

    public DayOfWeek getDayOfWeek() {
        return DayOfWeek.p(((int) Math.floorMod(toEpochDay() + 3, 7L)) + 1);
    }

    @Override // j$.time.chrono.ChronoLocalDate
    public final j$.time.chrono.j getEra() {
        return getYear() >= 1 ? j$.time.chrono.p.CE : j$.time.chrono.p.BCE;
    }

    public Month getMonth() {
        return Month.K(this.b);
    }

    public int getMonthValue() {
        return this.b;
    }

    public int getYear() {
        return this.a;
    }

    @Override // j$.time.chrono.ChronoLocalDate
    public int hashCode() {
        int i = this.a;
        return (i & (-2048)) ^ (((i << 11) + (this.b << 6)) + this.c);
    }

    public boolean isBefore(ChronoLocalDate chronoLocalDate) {
        if (chronoLocalDate instanceof LocalDate) {
            return p((LocalDate) chronoLocalDate) < 0;
        }
        return toEpochDay() < chronoLocalDate.toEpochDay();
    }

    public boolean isEqual(ChronoLocalDate chronoLocalDate) {
        if (chronoLocalDate instanceof LocalDate) {
            return p((LocalDate) chronoLocalDate) == 0;
        }
        return toEpochDay() == chronoLocalDate.toEpochDay();
    }

    @Override // j$.time.chrono.ChronoLocalDate
    public final boolean isLeapYear() {
        return IsoChronology.INSTANCE.isLeapYear(this.a);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final long j(TemporalField temporalField) {
        if (!(temporalField instanceof ChronoField)) {
            return temporalField.K(this);
        }
        if (temporalField == ChronoField.EPOCH_DAY) {
            return toEpochDay();
        }
        return temporalField == ChronoField.PROLEPTIC_MONTH ? P() : K(temporalField);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final j$.time.temporal.o k(TemporalField temporalField) {
        if (!(temporalField instanceof ChronoField)) {
            return temporalField.x(this);
        }
        ChronoField chronoField = (ChronoField) temporalField;
        if (!chronoField.isDateBased()) {
            throw new j$.time.temporal.n(b.a("Unsupported field: ", temporalField));
        }
        int i = f.a[chronoField.ordinal()];
        if (i == 1) {
            return j$.time.temporal.o.f(1L, lengthOfMonth());
        }
        if (i == 2) {
            return j$.time.temporal.o.f(1L, lengthOfYear());
        }
        if (i == 3) {
            return j$.time.temporal.o.f(1L, (getMonth() != Month.FEBRUARY || isLeapYear()) ? 5L : 4L);
        }
        if (i != 4) {
            return chronoField.b;
        }
        return getYear() <= 0 ? j$.time.temporal.o.f(1L, 1000000000L) : j$.time.temporal.o.f(1L, 999999999L);
    }

    public final int lengthOfMonth() {
        short s = this.b;
        if (s != 2) {
            return (s == 4 || s == 6 || s == 9 || s == 11) ? 30 : 31;
        }
        return isLeapYear() ? 29 : 28;
    }

    @Override // j$.time.chrono.ChronoLocalDate
    public final int lengthOfYear() {
        return isLeapYear() ? 366 : 365;
    }

    public LocalDate minusDays(long j) {
        long j2;
        if (j == Long.MIN_VALUE) {
            this = plusDays(Long.MAX_VALUE);
            j2 = 1;
        } else {
            j2 = -j;
        }
        return this.plusDays(j2);
    }

    public final int p(LocalDate localDate) {
        int i = this.a - localDate.a;
        return (i == 0 && (i = this.b - localDate.b) == 0) ? this.c - localDate.c : i;
    }

    public LocalDate plusDays(long j) {
        if (j == 0) {
            return this;
        }
        long j2 = ((long) this.c) + j;
        if (j2 > 0) {
            if (j2 <= 28) {
                return new LocalDate(this.a, this.b, (int) j2);
            }
            if (j2 <= 59) {
                long jLengthOfMonth = lengthOfMonth();
                if (j2 <= jLengthOfMonth) {
                    return new LocalDate(this.a, this.b, (int) j2);
                }
                short s = this.b;
                if (s < 12) {
                    return new LocalDate(this.a, s + 1, (int) (j2 - jLengthOfMonth));
                }
                ChronoField.YEAR.P(this.a + 1);
                return new LocalDate(this.a + 1, 1, (int) (j2 - jLengthOfMonth));
            }
        }
        return ofEpochDay(Math.addExact(toEpochDay(), j));
    }

    public LocalDate plusYears(long j) {
        if (j == 0) {
            return this;
        }
        ChronoField chronoField = ChronoField.YEAR;
        return W(chronoField.b.a(chronoField, ((long) this.a) + j), this.b, this.c);
    }

    @Override // j$.time.chrono.ChronoLocalDate
    public long toEpochDay() {
        long j;
        long j2 = this.a;
        long j3 = this.b;
        long j4 = 365 * j2;
        if (j2 >= 0) {
            j = ((j2 + 399) / 400) + (((3 + j2) / 4) - ((99 + j2) / 100)) + j4;
        } else {
            j = j4 - ((j2 / (-400)) + ((j2 / (-4)) - (j2 / (-100))));
        }
        long j5 = (((367 * j3) - 362) / 12) + j + ((long) (this.c - 1));
        if (j3 > 2) {
            j5 = !isLeapYear() ? j5 - 2 : j5 - 1;
        }
        return j5 - 719528;
    }

    @Override // j$.time.chrono.ChronoLocalDate
    public final String toString() {
        int i = this.a;
        short s = this.b;
        short s2 = this.c;
        int iAbs = Math.abs(i);
        StringBuilder sb = new StringBuilder(10);
        if (iAbs >= 1000) {
            if (i > 9999) {
                sb.append('+');
            }
            sb.append(i);
        } else if (i < 0) {
            sb.append(i - 10000);
            sb.deleteCharAt(1);
        } else {
            sb.append(i + 10000);
            sb.deleteCharAt(0);
        }
        sb.append(s < 10 ? "-0" : "-");
        sb.append((int) s);
        sb.append(s2 < 10 ? "-0" : "-");
        sb.append((int) s2);
        return sb.toString();
    }

    @Override // j$.time.temporal.Temporal
    public long until(Temporal temporal, TemporalUnit temporalUnit) {
        LocalDate localDateD = D(temporal);
        if (!(temporalUnit instanceof ChronoUnit)) {
            return temporalUnit.between(this, localDateD);
        }
        switch (f.b[((ChronoUnit) temporalUnit).ordinal()]) {
            case 1:
                return localDateD.toEpochDay() - toEpochDay();
            case 2:
                return (localDateD.toEpochDay() - toEpochDay()) / 7;
            case 3:
                return R(localDateD);
            case 4:
                return R(localDateD) / 12;
            case 5:
                return R(localDateD) / 120;
            case 6:
                return R(localDateD) / 1200;
            case 7:
                return R(localDateD) / 12000;
            case 8:
                ChronoField chronoField = ChronoField.ERA;
                return localDateD.j(chronoField) - j(chronoField);
            default:
                j$.nio.file.r.d("Unsupported unit: ", temporalUnit);
                return 0L;
        }
    }

    public static LocalDate now(ZoneId zoneId) {
        a aVar;
        Objects.requireNonNull(zoneId, "zone");
        if (zoneId == ZoneOffset.UTC) {
            aVar = a.b;
        } else {
            aVar = new a(zoneId);
        }
        return now(aVar);
    }

    public static LocalDate now() {
        return now(Clock.systemDefaultZone());
    }

    public LocalDateTime atStartOfDay() {
        return LocalDateTime.x(this, LocalTime.g);
    }
}
