package j$.time;

import j$.time.chrono.Chronology;
import j$.time.chrono.IsoChronology;
import j$.time.temporal.ChronoUnit;
import j$.time.temporal.Temporal;
import j$.time.temporal.TemporalAccessor;
import j$.time.temporal.TemporalAmount;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.regex.Pattern;

/* JADX INFO: compiled from: r8-map-id-d9f8928238715ac698104c66898e5631a6796c71eabc0cbc140853337a7ef765 */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes13.dex */
public final class Period implements TemporalAmount, Serializable {
    public static final Period d = new Period(0, 0, 0);
    private static final long serialVersionUID = -3587258372562876L;
    public final int a;
    public final int b;
    public final int c;

    static {
        Pattern.compile("([-+]?)P(?:([-+]?[0-9]+)Y)?(?:([-+]?[0-9]+)M)?(?:([-+]?[0-9]+)W)?(?:([-+]?[0-9]+)D)?", 2);
        j$.desugar.sun.nio.fs.g.o(new Object[]{ChronoUnit.YEARS, ChronoUnit.MONTHS, ChronoUnit.DAYS});
    }

    public Period(int i, int i2, int i3) {
        this.a = i;
        this.b = i2;
        this.c = i3;
    }

    public static Period a(int i, int i2, int i3) {
        return ((i | i2) | i3) == 0 ? d : new Period(i, i2, i3);
    }

    public static void b(TemporalAccessor temporalAccessor) {
        Chronology chronology = (Chronology) temporalAccessor.d(j$.time.temporal.m.b);
        if (chronology == null || IsoChronology.INSTANCE.equals(chronology)) {
            return;
        }
        throw new DateTimeException("Chronology mismatch, expected: ISO, actual: " + chronology.getId());
    }

    public static Period between(LocalDate localDate, LocalDate localDate2) {
        localDate.getClass();
        LocalDate localDateD = LocalDate.D(localDate2);
        long jP = localDateD.P() - localDate.P();
        int iLengthOfMonth = localDateD.c - localDate.c;
        if (jP > 0 && iLengthOfMonth < 0) {
            jP--;
            iLengthOfMonth = (int) (localDateD.toEpochDay() - localDate.U(jP).toEpochDay());
        } else if (jP < 0 && iLengthOfMonth > 0) {
            jP++;
            iLengthOfMonth -= localDateD.lengthOfMonth();
        }
        return a(Math.toIntExact(jP / 12), (int) (jP % 12), iLengthOfMonth);
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private Object writeReplace() {
        return new o((byte) 14, this);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Period) {
            Period period = (Period) obj;
            if (this.a == period.a && this.b == period.b && this.c == period.c) {
                return true;
            }
        }
        return false;
    }

    public int getYears() {
        return this.a;
    }

    public final int hashCode() {
        return Integer.rotateLeft(this.c, 16) + Integer.rotateLeft(this.b, 8) + this.a;
    }

    @Override // j$.time.temporal.TemporalAmount
    public final Temporal p(Temporal temporal) {
        b(temporal);
        int i = this.b;
        int i2 = this.a;
        if (i != 0) {
            long j = (((long) i2) * 12) + ((long) i);
            if (j != 0) {
                temporal = temporal.b(j, ChronoUnit.MONTHS);
            }
        } else if (i2 != 0) {
            temporal = temporal.b(i2, ChronoUnit.YEARS);
        }
        int i3 = this.c;
        return i3 != 0 ? temporal.b(i3, ChronoUnit.DAYS) : temporal;
    }

    public final String toString() {
        if (this == d) {
            return "P0D";
        }
        StringBuilder sb = new StringBuilder("P");
        int i = this.a;
        if (i != 0) {
            sb.append(i);
            sb.append('Y');
        }
        int i2 = this.b;
        if (i2 != 0) {
            sb.append(i2);
            sb.append('M');
        }
        int i3 = this.c;
        if (i3 != 0) {
            sb.append(i3);
            sb.append('D');
        }
        return sb.toString();
    }

    @Override // j$.time.temporal.TemporalAmount
    public final Temporal x(Instant instant) {
        b(instant);
        int i = this.b;
        int i2 = this.a;
        Instant instantC = instant;
        if (i != 0) {
            long j = (((long) i2) * 12) + ((long) i);
            if (j != 0) {
                instantC = instant;
                instantC = instant.c(j, ChronoUnit.MONTHS);
            }
        } else if (i2 != 0) {
            instantC = instant.c(i2, ChronoUnit.YEARS);
        }
        instantC = instant;
        int i3 = this.c;
        if (i3 == 0) {
            return instantC;
        }
        return instantC.c(i3, ChronoUnit.DAYS);
    }
}
