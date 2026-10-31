package j$.time.zone;

import j$.nio.file.r;
import j$.time.DayOfWeek;
import j$.time.LocalTime;
import j$.time.Month;
import j$.time.ZoneOffset;
import j$.time.temporal.ChronoField;
import java.io.DataInput;
import java.io.DataOutput;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-d9f8928238715ac698104c66898e5631a6796c71eabc0cbc140853337a7ef765 */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes13.dex */
public final class e implements Serializable {
    private static final long serialVersionUID = 6889046316657758795L;
    public final Month a;
    public final byte b;
    public final DayOfWeek c;
    public final LocalTime d;
    public final boolean e;
    public final d f;
    public final ZoneOffset g;
    public final ZoneOffset h;
    public final ZoneOffset i;

    public e(Month month, int i, DayOfWeek dayOfWeek, LocalTime localTime, boolean z, d dVar, ZoneOffset zoneOffset, ZoneOffset zoneOffset2, ZoneOffset zoneOffset3) {
        this.a = month;
        this.b = (byte) i;
        this.c = dayOfWeek;
        this.d = localTime;
        this.e = z;
        this.f = dVar;
        this.g = zoneOffset;
        this.h = zoneOffset2;
        this.i = zoneOffset3;
    }

    public static e a(DataInput dataInput) {
        LocalTime localTimeOfSecondOfDay;
        int totalSeconds;
        ZoneOffset zoneOffsetOfTotalSeconds;
        int i = dataInput.readInt();
        Month monthK = Month.K(i >>> 28);
        int i2 = ((264241152 & i) >>> 22) - 32;
        int i3 = (3670016 & i) >>> 19;
        DayOfWeek dayOfWeekP = i3 == 0 ? null : DayOfWeek.p(i3);
        int i4 = (507904 & i) >>> 14;
        d dVar = d.values()[(i & 12288) >>> 12];
        int i5 = (i & 4080) >>> 4;
        int i6 = (i & 12) >>> 2;
        int i7 = i & 3;
        if (i4 == 31) {
            localTimeOfSecondOfDay = LocalTime.ofSecondOfDay(dataInput.readInt());
        } else {
            int i8 = i4 % 24;
            LocalTime localTime = LocalTime.e;
            ChronoField.HOUR_OF_DAY.P(i8);
            localTimeOfSecondOfDay = LocalTime.h[i8];
        }
        ZoneOffset zoneOffsetOfTotalSeconds2 = ZoneOffset.ofTotalSeconds(i5 == 255 ? dataInput.readInt() : (i5 - 128) * 900);
        if (i6 == 3) {
            totalSeconds = dataInput.readInt();
        } else {
            totalSeconds = (i6 * 1800) + zoneOffsetOfTotalSeconds2.getTotalSeconds();
        }
        ZoneOffset zoneOffsetOfTotalSeconds3 = ZoneOffset.ofTotalSeconds(totalSeconds);
        if (i7 == 3) {
            zoneOffsetOfTotalSeconds = ZoneOffset.ofTotalSeconds(dataInput.readInt());
        } else {
            zoneOffsetOfTotalSeconds = ZoneOffset.ofTotalSeconds((i7 * 1800) + zoneOffsetOfTotalSeconds2.getTotalSeconds());
        }
        boolean z = i4 == 24;
        Objects.requireNonNull(monthK, "month");
        Objects.requireNonNull(localTimeOfSecondOfDay, "time");
        Objects.requireNonNull(dVar, "timeDefnition");
        Objects.requireNonNull(zoneOffsetOfTotalSeconds2, "standardOffset");
        Objects.requireNonNull(zoneOffsetOfTotalSeconds3, "offsetBefore");
        Objects.requireNonNull(zoneOffsetOfTotalSeconds, "offsetAfter");
        if (i2 < -28 || i2 > 31 || i2 == 0) {
            r.a("Day of month indicator must be between -28 and 31 inclusive excluding zero");
            return null;
        }
        if (z && !localTimeOfSecondOfDay.equals(LocalTime.g)) {
            r.a("Time must be midnight when end of day flag is true");
            return null;
        }
        if (localTimeOfSecondOfDay.d == 0) {
            return new e(monthK, i2, dayOfWeekP, localTimeOfSecondOfDay, z, dVar, zoneOffsetOfTotalSeconds2, zoneOffsetOfTotalSeconds3, zoneOffsetOfTotalSeconds);
        }
        r.a("Time's nano-of-second must be zero");
        return null;
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private Object writeReplace() {
        return new a((byte) 3, this);
    }

    public final void b(DataOutput dataOutput) {
        byte b;
        int secondOfDay = this.e ? 86400 : this.d.toSecondOfDay();
        int totalSeconds = this.g.getTotalSeconds();
        int totalSeconds2 = this.h.getTotalSeconds() - totalSeconds;
        int totalSeconds3 = this.i.getTotalSeconds() - totalSeconds;
        if (secondOfDay % 3600 == 0) {
            b = this.e ? (byte) 24 : this.d.a;
        } else {
            b = 31;
        }
        int i = totalSeconds % 900 == 0 ? (totalSeconds / 900) + 128 : 255;
        int i2 = (totalSeconds2 == 0 || totalSeconds2 == 1800 || totalSeconds2 == 3600) ? totalSeconds2 / 1800 : 3;
        int i3 = (totalSeconds3 == 0 || totalSeconds3 == 1800 || totalSeconds3 == 3600) ? totalSeconds3 / 1800 : 3;
        DayOfWeek dayOfWeek = this.c;
        dataOutput.writeInt((this.a.getValue() << 28) + ((this.b + 32) << 22) + ((dayOfWeek == null ? 0 : dayOfWeek.getValue()) << 19) + (b << 14) + (this.f.ordinal() << 12) + (i << 4) + (i2 << 2) + i3);
        if (b == 31) {
            dataOutput.writeInt(secondOfDay);
        }
        if (i == 255) {
            dataOutput.writeInt(totalSeconds);
        }
        if (i2 == 3) {
            dataOutput.writeInt(this.h.getTotalSeconds());
        }
        if (i3 == 3) {
            dataOutput.writeInt(this.i.getTotalSeconds());
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return this.a == eVar.a && this.b == eVar.b && this.c == eVar.c && this.f == eVar.f && this.d.equals(eVar.d) && this.e == eVar.e && this.g.equals(eVar.g) && this.h.equals(eVar.h) && this.i.equals(eVar.i);
    }

    public final int hashCode() {
        int secondOfDay = ((this.d.toSecondOfDay() + (this.e ? 1 : 0)) << 15) + (this.a.ordinal() << 11) + ((this.b + 32) << 5);
        DayOfWeek dayOfWeek = this.c;
        return this.i.hashCode() ^ ((this.g.hashCode() ^ (this.f.ordinal() + (secondOfDay + ((dayOfWeek == null ? 7 : dayOfWeek.ordinal()) << 2)))) ^ this.h.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TransitionRule[");
        sb.append(this.i.b - this.h.b > 0 ? "Gap " : "Overlap ");
        sb.append(this.h);
        sb.append(" to ");
        sb.append(this.i);
        sb.append(", ");
        DayOfWeek dayOfWeek = this.c;
        if (dayOfWeek != null) {
            byte b = this.b;
            if (b == -1) {
                sb.append(dayOfWeek.name());
                sb.append(" on or before last day of ");
                sb.append(this.a.name());
            } else if (b < 0) {
                sb.append(dayOfWeek.name());
                sb.append(" on or before last day minus ");
                sb.append((-this.b) - 1);
                sb.append(" of ");
                sb.append(this.a.name());
            } else {
                sb.append(dayOfWeek.name());
                sb.append(" on or after ");
                sb.append(this.a.name());
                sb.append(' ');
                sb.append((int) this.b);
            }
        } else {
            sb.append(this.a.name());
            sb.append(' ');
            sb.append((int) this.b);
        }
        sb.append(" at ");
        sb.append(this.e ? "24:00" : this.d.toString());
        sb.append(" ");
        sb.append(this.f);
        sb.append(", standard offset ");
        sb.append(this.g);
        sb.append(']');
        return sb.toString();
    }
}
