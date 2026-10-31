package j$.time;

import j$.time.temporal.ChronoField;
import j$.time.temporal.ChronoUnit;
import j$.time.temporal.Temporal;
import j$.time.temporal.TemporalAmount;
import j$.time.temporal.TemporalUnit;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-d9f8928238715ac698104c66898e5631a6796c71eabc0cbc140853337a7ef765 */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes13.dex */
public final class Duration implements TemporalAmount, Comparable<Duration>, Serializable {
    public static final Duration ZERO = new Duration(0, 0);
    public static final BigInteger c = BigInteger.valueOf(1000000000);
    private static final long serialVersionUID = 3078945930695997490L;
    public final long a;
    public final int b;

    public Duration(long j, int i) {
        this.a = j;
        this.b = i;
    }

    public static Duration D(long j, int i) {
        return (((long) i) | j) == 0 ? ZERO : new Duration(j, i);
    }

    public static Duration between(Temporal temporal, Temporal temporal2) {
        try {
            return ofNanos(temporal.until(temporal2, ChronoUnit.NANOS));
        } catch (DateTimeException | ArithmeticException unused) {
            long jUntil = temporal.until(temporal2, ChronoUnit.SECONDS);
            long j = 0;
            try {
                ChronoField chronoField = ChronoField.NANO_OF_SECOND;
                long j2 = temporal2.j(chronoField) - temporal.j(chronoField);
                if (jUntil > 0 && j2 < 0) {
                    jUntil++;
                } else if (jUntil < 0 && j2 > 0) {
                    jUntil--;
                }
                j = j2;
            } catch (DateTimeException unused2) {
            }
            return ofSeconds(jUntil, j);
        }
    }

    public static Duration of(long j, TemporalUnit temporalUnit) {
        Duration duration = ZERO;
        duration.getClass();
        Objects.requireNonNull(temporalUnit, "unit");
        if (temporalUnit == ChronoUnit.DAYS) {
            return duration.K(Math.multiplyExact(j, 86400L), 0L);
        }
        if (temporalUnit.isDurationEstimated()) {
            throw new j$.time.temporal.n("Unit must not have an estimated duration");
        }
        if (j == 0) {
            return duration;
        }
        if (!(temporalUnit instanceof ChronoUnit)) {
            Duration durationMultipliedBy = temporalUnit.getDuration().multipliedBy(j);
            return duration.K(durationMultipliedBy.getSeconds(), 0L).K(0L, durationMultipliedBy.getNano());
        }
        int i = c.a[((ChronoUnit) temporalUnit).ordinal()];
        if (i == 1) {
            return duration.K(0L, j);
        }
        if (i == 2) {
            return duration.K((j / 1000000000) * 1000, 0L).K(0L, (j % 1000000000) * 1000);
        }
        if (i != 3) {
            return i != 4 ? duration.K(Math.multiplyExact(temporalUnit.getDuration().a, j), 0L) : duration.K(j, 0L);
        }
        return duration.K(j / 1000, (j % 1000) * 1000000);
    }

    public static Duration ofDays(long j) {
        return D(Math.multiplyExact(j, 86400L), 0);
    }

    public static Duration ofHours(long j) {
        return D(Math.multiplyExact(j, 3600L), 0);
    }

    public static Duration ofMillis(long j) {
        long j2 = j / 1000;
        int i = (int) (j % 1000);
        if (i < 0) {
            i += 1000;
            j2--;
        }
        return D(j2, i * 1000000);
    }

    public static Duration ofMinutes(long j) {
        return D(Math.multiplyExact(j, 60L), 0);
    }

    public static Duration ofNanos(long j) {
        long j2 = j / 1000000000;
        int i = (int) (j % 1000000000);
        if (i < 0) {
            i = (int) (((long) i) + 1000000000);
            j2--;
        }
        return D(j2, i);
    }

    public static Duration ofSeconds(long j, long j2) {
        return D(Math.addExact(j, Math.floorDiv(j2, 1000000000L)), (int) Math.floorMod(j2, 1000000000L));
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private Object writeReplace() {
        return new o((byte) 1, this);
    }

    public final Duration K(long j, long j2) {
        if ((j | j2) == 0) {
            return this;
        }
        return ofSeconds(Math.addExact(Math.addExact(this.a, j), j2 / 1000000000), ((long) this.b) + (j2 % 1000000000));
    }

    public Duration abs() {
        return isNegative() ? multipliedBy(-1L) : this;
    }

    @Override // java.lang.Comparable
    public int compareTo(Duration duration) {
        int iCompare = Long.compare(this.a, duration.a);
        return iCompare != 0 ? iCompare : this.b - duration.b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Duration) {
            Duration duration = (Duration) obj;
            if (this.a == duration.a && this.b == duration.b) {
                return true;
            }
        }
        return false;
    }

    public int getNano() {
        return this.b;
    }

    public long getSeconds() {
        return this.a;
    }

    public int hashCode() {
        long j = this.a;
        return (this.b * 51) + ((int) (j ^ (j >>> 32)));
    }

    public boolean isNegative() {
        return this.a < 0;
    }

    public Duration minus(Duration duration) {
        long seconds = duration.getSeconds();
        int nano = duration.getNano();
        return seconds == Long.MIN_VALUE ? K(Long.MAX_VALUE, -nano).K(1L, 0L) : K(-seconds, -nano);
    }

    public Duration multipliedBy(long j) {
        if (j == 0) {
            return ZERO;
        }
        if (j == 1) {
            return this;
        }
        BigInteger bigIntegerExact = BigDecimal.valueOf(this.a).add(BigDecimal.valueOf(this.b, 9)).multiply(BigDecimal.valueOf(j)).movePointRight(9).toBigIntegerExact();
        BigInteger[] bigIntegerArrDivideAndRemainder = bigIntegerExact.divideAndRemainder(c);
        if (bigIntegerArrDivideAndRemainder[0].bitLength() <= 63) {
            return ofSeconds(bigIntegerArrDivideAndRemainder[0].longValue(), bigIntegerArrDivideAndRemainder[1].intValue());
        }
        throw new ArithmeticException("Exceeds capacity of Duration: " + bigIntegerExact);
    }

    @Override // j$.time.temporal.TemporalAmount
    public final Temporal p(Temporal temporal) {
        long j = this.a;
        if (j != 0) {
            temporal = temporal.b(j, ChronoUnit.SECONDS);
        }
        int i = this.b;
        return i != 0 ? temporal.b(i, ChronoUnit.NANOS) : temporal;
    }

    public Duration plus(Duration duration) {
        return K(duration.getSeconds(), duration.getNano());
    }

    public long toDays() {
        return this.a / 86400;
    }

    public long toMillis() {
        long j = this.a;
        long j2 = this.b;
        if (j < 0) {
            j++;
            j2 -= 1000000000;
        }
        return Math.addExact(Math.multiplyExact(j, 1000L), j2 / 1000000);
    }

    public long toMinutes() {
        return this.a / 60;
    }

    public long toSeconds() {
        return this.a;
    }

    public final String toString() {
        if (this == ZERO) {
            return "PT0S";
        }
        long j = this.a;
        if (j < 0 && this.b > 0) {
            j++;
        }
        long j2 = j / 3600;
        int i = (int) ((j % 3600) / 60);
        int i2 = (int) (j % 60);
        StringBuilder sb = new StringBuilder(24);
        sb.append("PT");
        if (j2 != 0) {
            sb.append(j2);
            sb.append('H');
        }
        if (i != 0) {
            sb.append(i);
            sb.append('M');
        }
        if (i2 == 0 && this.b == 0 && sb.length() > 2) {
            return sb.toString();
        }
        if (this.a >= 0 || this.b <= 0 || i2 != 0) {
            sb.append(i2);
        } else {
            sb.append("-0");
        }
        if (this.b > 0) {
            int length = sb.length();
            long j3 = this.a;
            int i3 = this.b;
            if (j3 < 0) {
                sb.append(2000000000 - ((long) i3));
            } else {
                sb.append(((long) i3) + 1000000000);
            }
            while (sb.charAt(sb.length() - 1) == '0') {
                sb.setLength(sb.length() - 1);
            }
            sb.setCharAt(length, '.');
        }
        sb.append('S');
        return sb.toString();
    }

    @Override // j$.time.temporal.TemporalAmount
    public final Temporal x(Instant instant) {
        long j = this.a;
        Instant instantC = instant;
        if (j != 0) {
            instantC = instant.c(j, ChronoUnit.SECONDS);
        }
        int i = this.b;
        if (i == 0) {
            return instantC;
        }
        return instantC.c(i, ChronoUnit.NANOS);
    }

    public static Duration ofSeconds(long j) {
        return D(j, 0);
    }
}
