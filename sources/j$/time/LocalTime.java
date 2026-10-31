package j$.time;

import j$.time.temporal.ChronoField;
import j$.time.temporal.ChronoUnit;
import j$.time.temporal.Temporal;
import j$.time.temporal.TemporalAccessor;
import j$.time.temporal.TemporalField;
import j$.time.temporal.TemporalUnit;
import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-d9f8928238715ac698104c66898e5631a6796c71eabc0cbc140853337a7ef765 */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes13.dex */
public final class LocalTime implements Temporal, j$.time.temporal.k, Comparable<LocalTime>, Serializable {
    public static final LocalTime e;
    public static final LocalTime f;
    public static final LocalTime g;
    public static final LocalTime[] h = new LocalTime[24];
    private static final long serialVersionUID = 6414437269572265201L;
    public final byte a;
    public final byte b;
    public final byte c;
    public final int d;

    static {
        int i = 0;
        while (true) {
            LocalTime[] localTimeArr = h;
            if (i >= localTimeArr.length) {
                LocalTime localTime = localTimeArr[0];
                g = localTime;
                LocalTime localTime2 = localTimeArr[12];
                e = localTime;
                f = new LocalTime(23, 59, 59, 999999999);
                return;
            }
            localTimeArr[i] = new LocalTime(i, 0, 0, 0);
            i++;
        }
    }

    public LocalTime(int i, int i2, int i3, int i4) {
        this.a = (byte) i;
        this.b = (byte) i2;
        this.c = (byte) i3;
        this.d = i4;
    }

    public static LocalTime D(TemporalAccessor temporalAccessor) {
        Objects.requireNonNull(temporalAccessor, "temporal");
        LocalTime localTime = (LocalTime) temporalAccessor.d(j$.time.temporal.m.g);
        if (localTime != null) {
            return localTime;
        }
        j$.nio.file.r.f("Unable to obtain LocalTime from TemporalAccessor: ", temporalAccessor, " of type ", temporalAccessor.getClass().getName());
        return null;
    }

    public static LocalTime O(int i, int i2, int i3, int i4) {
        ChronoField.HOUR_OF_DAY.P(i);
        ChronoField.MINUTE_OF_HOUR.P(i2);
        ChronoField.SECOND_OF_MINUTE.P(i3);
        ChronoField.NANO_OF_SECOND.P(i4);
        return x(i, i2, i3, i4);
    }

    public static LocalTime P(long j) {
        ChronoField.NANO_OF_DAY.P(j);
        int i = (int) (j / 3600000000000L);
        long j2 = j - (((long) i) * 3600000000000L);
        int i2 = (int) (j2 / 60000000000L);
        long j3 = j2 - (((long) i2) * 60000000000L);
        int i3 = (int) (j3 / 1000000000);
        return x(i, i2, i3, (int) (j3 - (((long) i3) * 1000000000)));
    }

    public static LocalTime V(DataInput dataInput) throws IOException {
        int i;
        int i2;
        int i3 = dataInput.readByte();
        int i4 = 0;
        if (i3 < 0) {
            i3 = ~i3;
            i2 = 0;
            i = 0;
        } else {
            byte b = dataInput.readByte();
            if (b < 0) {
                int i5 = ~b;
                i = 0;
                i4 = i5;
                i2 = 0;
            } else {
                byte b2 = dataInput.readByte();
                if (b2 < 0) {
                    i2 = ~b2;
                    i = 0;
                    i4 = b;
                } else {
                    i = dataInput.readInt();
                    i4 = b;
                    i2 = b2;
                }
            }
        }
        return O(i3, i4, i2, i);
    }

    public static LocalTime ofSecondOfDay(long j) {
        ChronoField.SECOND_OF_DAY.P(j);
        int i = (int) (j / 3600);
        long j2 = j - ((long) (i * 3600));
        int i2 = (int) (j2 / 60);
        return x(i, i2, (int) (j2 - ((long) (i2 * 60))), 0);
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private Object writeReplace() {
        return new o((byte) 4, this);
    }

    public static LocalTime x(int i, int i2, int i3, int i4) {
        return ((i2 | i3) | i4) == 0 ? h[i] : new LocalTime(i, i2, i3, i4);
    }

    public final int K(TemporalField temporalField) {
        switch (h.a[((ChronoField) temporalField).ordinal()]) {
            case 1:
                return this.d;
            case 2:
                throw new j$.time.temporal.n("Invalid field 'NanoOfDay' for get() method, use getLong() instead");
            case 3:
                return this.d / 1000;
            case 4:
                throw new j$.time.temporal.n("Invalid field 'MicroOfDay' for get() method, use getLong() instead");
            case 5:
                return this.d / 1000000;
            case 6:
                return (int) (W() / 1000000);
            case 7:
                return this.c;
            case 8:
                return toSecondOfDay();
            case 9:
                return this.b;
            case 10:
                return (this.a * 60) + this.b;
            case 11:
                return this.a % 12;
            case 12:
                int i = this.a % 12;
                if (i % 12 == 0) {
                    return 12;
                }
                return i;
            case 13:
                return this.a;
            case 14:
                byte b = this.a;
                if (b == 0) {
                    return 24;
                }
                return b;
            case 15:
                return this.a / 12;
            default:
                throw new j$.time.temporal.n(b.a("Unsupported field: ", temporalField));
        }
    }

    @Override // j$.time.temporal.Temporal
    /* JADX INFO: renamed from: Q, reason: merged with bridge method [inline-methods] */
    public final LocalTime b(long j, TemporalUnit temporalUnit) {
        if (!(temporalUnit instanceof ChronoUnit)) {
            return (LocalTime) temporalUnit.p(this, j);
        }
        switch (h.b[((ChronoUnit) temporalUnit).ordinal()]) {
            case 1:
                return T(j);
            case 2:
                return T((j % 86400000000L) * 1000);
            case 3:
                return T((j % 86400000) * 1000000);
            case 4:
                return U(j);
            case 5:
                return S(j);
            case 6:
                return R(j);
            case 7:
                return R((j % 2) * 12);
            default:
                j$.nio.file.r.d("Unsupported unit: ", temporalUnit);
                return null;
        }
    }

    public final LocalTime R(long j) {
        return j == 0 ? this : x(((((int) (j % 24)) + this.a) + 24) % 24, this.b, this.c, this.d);
    }

    public final LocalTime S(long j) {
        if (j != 0) {
            int i = (this.a * 60) + this.b;
            int i2 = ((((int) (j % 1440)) + i) + 1440) % 1440;
            if (i != i2) {
                return x(i2 / 60, i2 % 60, this.c, this.d);
            }
        }
        return this;
    }

    public final LocalTime T(long j) {
        if (j != 0) {
            long jW = W();
            long j2 = (((j % 86400000000000L) + jW) + 86400000000000L) % 86400000000000L;
            if (jW != j2) {
                return x((int) (j2 / 3600000000000L), (int) ((j2 / 60000000000L) % 60), (int) ((j2 / 1000000000) % 60), (int) (j2 % 1000000000));
            }
        }
        return this;
    }

    public final LocalTime U(long j) {
        if (j != 0) {
            int i = (this.b * 60) + (this.a * 3600) + this.c;
            int i2 = ((((int) (j % 86400)) + i) + 86400) % 86400;
            if (i != i2) {
                return x(i2 / 3600, (i2 / 60) % 60, i2 % 60, this.d);
            }
        }
        return this;
    }

    public final long W() {
        return (((long) this.c) * 1000000000) + (((long) this.b) * 60000000000L) + (((long) this.a) * 3600000000000L) + ((long) this.d);
    }

    @Override // j$.time.temporal.Temporal
    /* JADX INFO: renamed from: X, reason: merged with bridge method [inline-methods] */
    public final LocalTime a(TemporalField temporalField, long j) {
        if (!(temporalField instanceof ChronoField)) {
            return (LocalTime) temporalField.O(this, j);
        }
        ChronoField chronoField = (ChronoField) temporalField;
        chronoField.P(j);
        switch (h.a[chronoField.ordinal()]) {
            case 1:
                return Y((int) j);
            case 2:
                return P(j);
            case 3:
                return Y(((int) j) * 1000);
            case 4:
                return P(j * 1000);
            case 5:
                return Y(((int) j) * 1000000);
            case 6:
                return P(j * 1000000);
            case 7:
                int i = (int) j;
                if (this.c != i) {
                    ChronoField.SECOND_OF_MINUTE.P(i);
                    return x(this.a, this.b, i, this.d);
                }
                return this;
            case 8:
                return U(j - ((long) toSecondOfDay()));
            case 9:
                int i2 = (int) j;
                if (this.b != i2) {
                    ChronoField.MINUTE_OF_HOUR.P(i2);
                    return x(this.a, i2, this.c, this.d);
                }
                return this;
            case 10:
                return S(j - ((long) ((this.a * 60) + this.b)));
            case 11:
                return R(j - ((long) (this.a % 12)));
            case 12:
                if (j == 12) {
                    j = 0;
                }
                return R(j - ((long) (this.a % 12)));
            case 13:
                int i3 = (int) j;
                if (this.a != i3) {
                    ChronoField.HOUR_OF_DAY.P(i3);
                    return x(i3, this.b, this.c, this.d);
                }
                return this;
            case 14:
                if (j == 24) {
                    j = 0;
                }
                int i4 = (int) j;
                if (this.a != i4) {
                    ChronoField.HOUR_OF_DAY.P(i4);
                    return x(i4, this.b, this.c, this.d);
                }
                return this;
            case 15:
                return R((j - ((long) (this.a / 12))) * 12);
            default:
                throw new j$.time.temporal.n(b.a("Unsupported field: ", temporalField));
        }
    }

    public final LocalTime Y(int i) {
        if (this.d == i) {
            return this;
        }
        ChronoField.NANO_OF_SECOND.P(i);
        return x(this.a, this.b, this.c, i);
    }

    public final void Z(DataOutput dataOutput) throws IOException {
        if (this.d != 0) {
            dataOutput.writeByte(this.a);
            dataOutput.writeByte(this.b);
            dataOutput.writeByte(this.c);
            dataOutput.writeInt(this.d);
            return;
        }
        if (this.c != 0) {
            dataOutput.writeByte(this.a);
            dataOutput.writeByte(this.b);
            dataOutput.writeByte(~this.c);
            return;
        }
        byte b = this.b;
        byte b2 = this.a;
        if (b == 0) {
            dataOutput.writeByte(~b2);
        } else {
            dataOutput.writeByte(b2);
            dataOutput.writeByte(~this.b);
        }
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

    @Override // j$.time.temporal.TemporalAccessor
    public final Object d(d dVar) {
        if (dVar == j$.time.temporal.m.b || dVar == j$.time.temporal.m.a || dVar == j$.time.temporal.m.e || dVar == j$.time.temporal.m.d) {
            return null;
        }
        if (dVar == j$.time.temporal.m.g) {
            return this;
        }
        if (dVar == j$.time.temporal.m.f) {
            return null;
        }
        return dVar == j$.time.temporal.m.c ? ChronoUnit.NANOS : dVar.k(this);
    }

    @Override // j$.time.temporal.Temporal
    /* JADX INFO: renamed from: e */
    public final Temporal i(LocalDate localDate) {
        return (LocalTime) localDate.f(this);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof LocalTime) {
            LocalTime localTime = (LocalTime) obj;
            if (this.a == localTime.a && this.b == localTime.b && this.c == localTime.c && this.d == localTime.d) {
                return true;
            }
        }
        return false;
    }

    @Override // j$.time.temporal.k
    public final Temporal f(Temporal temporal) {
        return temporal.a(ChronoField.NANO_OF_DAY, W());
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final int g(TemporalField temporalField) {
        return temporalField instanceof ChronoField ? K(temporalField) : super.g(temporalField);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final boolean h(TemporalField temporalField) {
        if (temporalField instanceof ChronoField) {
            return ((ChronoField) temporalField).Q();
        }
        return temporalField != null && temporalField.p(this);
    }

    public final int hashCode() {
        long jW = W();
        return (int) (jW ^ (jW >>> 32));
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final long j(TemporalField temporalField) {
        if (!(temporalField instanceof ChronoField)) {
            return temporalField.K(this);
        }
        if (temporalField == ChronoField.NANO_OF_DAY) {
            return W();
        }
        return temporalField == ChronoField.MICRO_OF_DAY ? W() / 1000 : K(temporalField);
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
    public final int compareTo(LocalTime localTime) {
        int iCompare = Integer.compare(this.a, localTime.a);
        return (iCompare == 0 && (iCompare = Integer.compare(this.b, localTime.b)) == 0 && (iCompare = Integer.compare(this.c, localTime.c)) == 0) ? Integer.compare(this.d, localTime.d) : iCompare;
    }

    public int toSecondOfDay() {
        return (this.b * 60) + (this.a * 3600) + this.c;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(18);
        byte b = this.a;
        byte b2 = this.b;
        byte b3 = this.c;
        int i = this.d;
        sb.append(b < 10 ? "0" : "");
        sb.append((int) b);
        sb.append(b2 < 10 ? ":0" : ":");
        sb.append((int) b2);
        if (b3 > 0 || i > 0) {
            sb.append(b3 < 10 ? ":0" : ":");
            sb.append((int) b3);
            if (i > 0) {
                sb.append('.');
                if (i % 1000000 == 0) {
                    sb.append(Integer.toString((i / 1000000) + 1000).substring(1));
                } else if (i % 1000 == 0) {
                    sb.append(Integer.toString((i / 1000) + 1000000).substring(1));
                } else {
                    sb.append(Integer.toString(i + 1000000000).substring(1));
                }
            }
        }
        return sb.toString();
    }

    public LocalTime truncatedTo(TemporalUnit temporalUnit) {
        if (temporalUnit == ChronoUnit.NANOS) {
            return this;
        }
        Duration duration = temporalUnit.getDuration();
        if (duration.getSeconds() > 86400) {
            throw new j$.time.temporal.n("Unit is too large to be used for truncation");
        }
        long j = duration.a;
        long j2 = duration.b;
        if (j < 0) {
            j++;
            j2 -= 1000000000;
        }
        long jAddExact = Math.addExact(Math.multiplyExact(j, 1000000000L), j2);
        if (86400000000000L % jAddExact == 0) {
            return P((W() / jAddExact) * jAddExact);
        }
        throw new j$.time.temporal.n("Unit must divide into a standard day without remainder");
    }

    @Override // j$.time.temporal.Temporal
    public final long until(Temporal temporal, TemporalUnit temporalUnit) {
        LocalTime localTimeD = D(temporal);
        if (!(temporalUnit instanceof ChronoUnit)) {
            return temporalUnit.between(this, localTimeD);
        }
        long jW = localTimeD.W() - W();
        switch (h.b[((ChronoUnit) temporalUnit).ordinal()]) {
            case 1:
                return jW;
            case 2:
                return jW / 1000;
            case 3:
                return jW / 1000000;
            case 4:
                return jW / 1000000000;
            case 5:
                return jW / 60000000000L;
            case 6:
                return jW / 3600000000000L;
            case 7:
                return jW / 43200000000000L;
            default:
                j$.nio.file.r.d("Unsupported unit: ", temporalUnit);
                return 0L;
        }
    }
}
