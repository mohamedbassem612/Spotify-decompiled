package j$.time;

import j$.time.chrono.Chronology;
import j$.time.chrono.IsoChronology;
import j$.time.format.DateTimeFormatterBuilder;
import j$.time.format.ResolverStyle;
import j$.time.format.c0;
import j$.time.temporal.ChronoField;
import j$.time.temporal.ChronoUnit;
import j$.time.temporal.Temporal;
import j$.time.temporal.TemporalAccessor;
import j$.time.temporal.TemporalField;
import j$.time.temporal.TemporalUnit;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.Locale;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-d9f8928238715ac698104c66898e5631a6796c71eabc0cbc140853337a7ef765 */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes13.dex */
public final class YearMonth implements Temporal, j$.time.temporal.k, Comparable<YearMonth>, Serializable {
    public static final /* synthetic */ int c = 0;
    private static final long serialVersionUID = 4183400860270640070L;
    public final int a;
    public final int b;

    static {
        DateTimeFormatterBuilder dateTimeFormatterBuilder = new DateTimeFormatterBuilder();
        dateTimeFormatterBuilder.o(ChronoField.YEAR, 4, 10, c0.EXCEEDS_PAD);
        dateTimeFormatterBuilder.d('-');
        dateTimeFormatterBuilder.n(ChronoField.MONTH_OF_YEAR, 2);
        dateTimeFormatterBuilder.s(Locale.getDefault(), ResolverStyle.SMART, null);
    }

    public YearMonth(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    public static YearMonth from(TemporalAccessor temporalAccessor) {
        if (temporalAccessor instanceof YearMonth) {
            return (YearMonth) temporalAccessor;
        }
        Objects.requireNonNull(temporalAccessor, "temporal");
        try {
            if (!IsoChronology.INSTANCE.equals(Chronology.n(temporalAccessor))) {
                temporalAccessor = LocalDate.D(temporalAccessor);
            }
            return x(temporalAccessor.g(ChronoField.YEAR), temporalAccessor.g(ChronoField.MONTH_OF_YEAR));
        } catch (DateTimeException e) {
            j$.nio.file.r.g("Unable to obtain YearMonth from TemporalAccessor: ", temporalAccessor, temporalAccessor.getClass().getName(), e);
            return null;
        }
    }

    public static YearMonth now(Clock clock) {
        LocalDate localDateNow = LocalDate.now(clock);
        int year = localDateNow.getYear();
        Month month = localDateNow.getMonth();
        Objects.requireNonNull(month, "month");
        return x(year, month.getValue());
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private Object writeReplace() {
        return new o((byte) 12, this);
    }

    public static YearMonth x(int i, int i2) {
        ChronoField.YEAR.P(i);
        ChronoField.MONTH_OF_YEAR.P(i2);
        return new YearMonth(i, i2);
    }

    @Override // j$.time.temporal.Temporal
    /* JADX INFO: renamed from: D, reason: merged with bridge method [inline-methods] */
    public final YearMonth b(long j, TemporalUnit temporalUnit) {
        if (!(temporalUnit instanceof ChronoUnit)) {
            return (YearMonth) temporalUnit.p(this, j);
        }
        switch (r.b[((ChronoUnit) temporalUnit).ordinal()]) {
            case 1:
                return plusMonths(j);
            case 2:
                return K(j);
            case 3:
                return K(Math.multiplyExact(j, 10L));
            case 4:
                return K(Math.multiplyExact(j, 100L));
            case 5:
                return K(Math.multiplyExact(j, 1000L));
            case 6:
                ChronoField chronoField = ChronoField.ERA;
                return a(chronoField, Math.addExact(j(chronoField), j));
            default:
                j$.nio.file.r.d("Unsupported unit: ", temporalUnit);
                return null;
        }
    }

    public final YearMonth K(long j) {
        if (j == 0) {
            return this;
        }
        ChronoField chronoField = ChronoField.YEAR;
        return O(chronoField.b.a(chronoField, ((long) this.a) + j), this.b);
    }

    public final YearMonth O(int i, int i2) {
        return (this.a == i && this.b == i2) ? this : new YearMonth(i, i2);
    }

    @Override // j$.time.temporal.Temporal
    /* JADX INFO: renamed from: P, reason: merged with bridge method [inline-methods] */
    public final YearMonth a(TemporalField temporalField, long j) {
        if (!(temporalField instanceof ChronoField)) {
            return (YearMonth) temporalField.O(this, j);
        }
        ChronoField chronoField = (ChronoField) temporalField;
        chronoField.P(j);
        int i = r.a[chronoField.ordinal()];
        if (i == 1) {
            int i2 = (int) j;
            ChronoField.MONTH_OF_YEAR.P(i2);
            return O(this.a, i2);
        }
        if (i == 2) {
            return plusMonths(j - p());
        }
        if (i == 3) {
            if (this.a < 1) {
                j = 1 - j;
            }
            int i3 = (int) j;
            ChronoField.YEAR.P(i3);
            return O(i3, this.b);
        }
        if (i == 4) {
            int i4 = (int) j;
            ChronoField.YEAR.P(i4);
            return O(i4, this.b);
        }
        if (i != 5) {
            throw new j$.time.temporal.n(b.a("Unsupported field: ", temporalField));
        }
        if (j(ChronoField.ERA) == j) {
            return this;
        }
        int i5 = 1 - this.a;
        ChronoField.YEAR.P(i5);
        return O(i5, this.b);
    }

    public LocalDate atDay(int i) {
        return LocalDate.of(this.a, this.b, i);
    }

    public LocalDate atEndOfMonth() {
        return LocalDate.of(this.a, this.b, lengthOfMonth());
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
    public final int compareTo(YearMonth yearMonth) {
        YearMonth yearMonth2 = yearMonth;
        int i = this.a - yearMonth2.a;
        return i == 0 ? this.b - yearMonth2.b : i;
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final Object d(d dVar) {
        if (dVar == j$.time.temporal.m.b) {
            return IsoChronology.INSTANCE;
        }
        return dVar == j$.time.temporal.m.c ? ChronoUnit.MONTHS : super.d(dVar);
    }

    @Override // j$.time.temporal.Temporal
    /* JADX INFO: renamed from: e */
    public final Temporal i(LocalDate localDate) {
        return (YearMonth) localDate.f(this);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof YearMonth) {
            YearMonth yearMonth = (YearMonth) obj;
            if (this.a == yearMonth.a && this.b == yearMonth.b) {
                return true;
            }
        }
        return false;
    }

    @Override // j$.time.temporal.k
    public final Temporal f(Temporal temporal) {
        if (Chronology.n(temporal).equals(IsoChronology.INSTANCE)) {
            return temporal.a(ChronoField.PROLEPTIC_MONTH, p());
        }
        j$.nio.file.r.h("Adjustment only supported on ISO date-time");
        return null;
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final int g(TemporalField temporalField) {
        return k(temporalField).a(temporalField, j(temporalField));
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

    @Override // j$.time.temporal.TemporalAccessor
    public final boolean h(TemporalField temporalField) {
        if (temporalField instanceof ChronoField) {
            return temporalField == ChronoField.YEAR || temporalField == ChronoField.MONTH_OF_YEAR || temporalField == ChronoField.PROLEPTIC_MONTH || temporalField == ChronoField.YEAR_OF_ERA || temporalField == ChronoField.ERA;
        }
        return temporalField != null && temporalField.p(this);
    }

    public int hashCode() {
        return (this.b << 27) ^ this.a;
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final long j(TemporalField temporalField) {
        int i;
        if (!(temporalField instanceof ChronoField)) {
            return temporalField.K(this);
        }
        int i2 = r.a[((ChronoField) temporalField).ordinal()];
        if (i2 == 1) {
            i = this.b;
        } else {
            if (i2 == 2) {
                return p();
            }
            if (i2 == 3) {
                int i3 = this.a;
                if (i3 < 1) {
                    i3 = 1 - i3;
                }
                return i3;
            }
            if (i2 != 4) {
                if (i2 == 5) {
                    return this.a < 1 ? 0 : 1;
                }
                throw new j$.time.temporal.n(b.a("Unsupported field: ", temporalField));
            }
            i = this.a;
        }
        return i;
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final j$.time.temporal.o k(TemporalField temporalField) {
        if (temporalField == ChronoField.YEAR_OF_ERA) {
            return j$.time.temporal.o.f(1L, getYear() <= 0 ? 1000000000L : 999999999L);
        }
        return super.k(temporalField);
    }

    public int lengthOfMonth() {
        return getMonth().x(IsoChronology.INSTANCE.isLeapYear(this.a));
    }

    public YearMonth minusMonths(long j) {
        long j2;
        if (j == Long.MIN_VALUE) {
            this = plusMonths(Long.MAX_VALUE);
            j2 = 1;
        } else {
            j2 = -j;
        }
        return this.plusMonths(j2);
    }

    public final long p() {
        return ((((long) this.a) * 12) + ((long) this.b)) - 1;
    }

    public YearMonth plusMonths(long j) {
        if (j == 0) {
            return this;
        }
        long j2 = (((long) this.a) * 12) + ((long) (this.b - 1)) + j;
        ChronoField chronoField = ChronoField.YEAR;
        return O(chronoField.b.a(chronoField, Math.floorDiv(j2, 12L)), ((int) Math.floorMod(j2, 12L)) + 1);
    }

    public final String toString() {
        int iAbs = Math.abs(this.a);
        StringBuilder sb = new StringBuilder(9);
        int i = this.a;
        if (iAbs >= 1000) {
            sb.append(i);
        } else if (i < 0) {
            sb.append(i - 10000);
            sb.deleteCharAt(1);
        } else {
            sb.append(i + 10000);
            sb.deleteCharAt(0);
        }
        sb.append(this.b < 10 ? "-0" : "-");
        sb.append(this.b);
        return sb.toString();
    }

    @Override // j$.time.temporal.Temporal
    public final long until(Temporal temporal, TemporalUnit temporalUnit) {
        YearMonth yearMonthFrom = from(temporal);
        if (!(temporalUnit instanceof ChronoUnit)) {
            return temporalUnit.between(this, yearMonthFrom);
        }
        long jP = yearMonthFrom.p() - p();
        switch (r.b[((ChronoUnit) temporalUnit).ordinal()]) {
            case 1:
                return jP;
            case 2:
                return jP / 12;
            case 3:
                return jP / 120;
            case 4:
                return jP / 1200;
            case 5:
                return jP / 12000;
            case 6:
                ChronoField chronoField = ChronoField.ERA;
                return yearMonthFrom.j(chronoField) - j(chronoField);
            default:
                j$.nio.file.r.d("Unsupported unit: ", temporalUnit);
                return 0L;
        }
    }
}
