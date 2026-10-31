package j$.time;

import j$.time.temporal.ChronoField;
import j$.time.temporal.Temporal;
import j$.time.temporal.TemporalAccessor;
import j$.time.temporal.TemporalField;
import j$.time.zone.ZoneRules;
import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* JADX INFO: compiled from: r8-map-id-d9f8928238715ac698104c66898e5631a6796c71eabc0cbc140853337a7ef765 */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes13.dex */
public final class ZoneOffset extends ZoneId implements TemporalAccessor, j$.time.temporal.k, Comparable<ZoneOffset>, Serializable {
    private static final long serialVersionUID = 2357656521762053153L;
    public final int b;
    public final transient String c;
    public static final ConcurrentMap d = new ConcurrentHashMap(16, 0.75f, 4);
    public static final ConcurrentMap e = new ConcurrentHashMap(16, 0.75f, 4);
    public static final ZoneOffset UTC = ofTotalSeconds(0);
    public static final ZoneOffset f = ofTotalSeconds(-64800);
    public static final ZoneOffset g = ofTotalSeconds(64800);

    public ZoneOffset(int i) {
        String string;
        this.b = i;
        if (i == 0) {
            string = "Z";
        } else {
            int iAbs = Math.abs(i);
            int i2 = iAbs / 3600;
            int i3 = (iAbs / 60) % 60;
            StringBuilder sb = new StringBuilder(i < 0 ? "-" : "+");
            sb.append(i2 < 10 ? "0" : "");
            sb.append(i2);
            sb.append(i3 < 10 ? ":0" : ":");
            sb.append(i3);
            int i4 = iAbs % 60;
            if (i4 != 0) {
                sb.append(i4 < 10 ? ":0" : ":");
                sb.append(i4);
            }
            string = sb.toString();
        }
        this.c = string;
    }

    public static ZoneOffset P(TemporalAccessor temporalAccessor) {
        Objects.requireNonNull(temporalAccessor, "temporal");
        ZoneOffset zoneOffset = (ZoneOffset) temporalAccessor.d(j$.time.temporal.m.d);
        if (zoneOffset != null) {
            return zoneOffset;
        }
        j$.nio.file.r.f("Unable to obtain ZoneOffset from TemporalAccessor: ", temporalAccessor, " of type ", temporalAccessor.getClass().getName());
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:33:0x009f  */
    /* JADX WARN: Code duplicated, block: B:35:0x00a7  */
    public static ZoneOffset Q(String str) {
        int iS;
        int iS2;
        int iS3;
        char cCharAt;
        Objects.requireNonNull(str, "offsetId");
        ZoneOffset zoneOffset = (ZoneOffset) ((ConcurrentHashMap) e).get(str);
        if (zoneOffset != null) {
            return zoneOffset;
        }
        int length = str.length();
        if (length != 2) {
            if (length != 3) {
                if (length == 5) {
                    iS = S(str, 1, false);
                    iS2 = S(str, 3, false);
                } else if (length == 6) {
                    iS = S(str, 1, false);
                    iS2 = S(str, 4, true);
                } else if (length == 7) {
                    iS = S(str, 1, false);
                    iS2 = S(str, 3, false);
                    iS3 = S(str, 5, false);
                } else {
                    if (length != 9) {
                        j$.nio.file.r.h("Invalid ID for ZoneOffset, invalid format: ".concat(str));
                        return null;
                    }
                    iS = S(str, 1, false);
                    iS2 = S(str, 4, true);
                    iS3 = S(str, 7, true);
                }
                iS3 = 0;
            }
            cCharAt = str.charAt(0);
            if (cCharAt != '+' || cCharAt == '-') {
                return cCharAt == '-' ? R(-iS, -iS2, -iS3) : R(iS, iS2, iS3);
            }
            j$.nio.file.r.h("Invalid ID for ZoneOffset, plus/minus not found when expected: ".concat(str));
            return null;
        }
        str = str.charAt(0) + "0" + str.charAt(1);
        iS = S(str, 1, false);
        iS2 = 0;
        iS3 = 0;
        cCharAt = str.charAt(0);
        if (cCharAt != '+') {
        }
        if (cCharAt == '-') {
        }
    }

    public static ZoneOffset R(int i, int i2, int i3) {
        if (i < -18 || i > 18) {
            j$.nio.file.r.c("Zone offset hours not in valid range: value ", i, " is not in the range -18 to 18");
            return null;
        }
        if (i > 0) {
            if (i2 < 0 || i3 < 0) {
                j$.nio.file.r.h("Zone offset minutes and seconds must be positive because hours is positive");
                return null;
            }
        } else if (i < 0) {
            if (i2 > 0 || i3 > 0) {
                j$.nio.file.r.h("Zone offset minutes and seconds must be negative because hours is negative");
                return null;
            }
        } else if ((i2 > 0 && i3 < 0) || (i2 < 0 && i3 > 0)) {
            j$.nio.file.r.h("Zone offset minutes and seconds must have the same sign");
            return null;
        }
        if (i2 < -59 || i2 > 59) {
            j$.nio.file.r.c("Zone offset minutes not in valid range: value ", i2, " is not in the range -59 to 59");
            return null;
        }
        if (i3 < -59 || i3 > 59) {
            j$.nio.file.r.c("Zone offset seconds not in valid range: value ", i3, " is not in the range -59 to 59");
            return null;
        }
        if (Math.abs(i) != 18 || (i2 | i3) == 0) {
            return ofTotalSeconds((i2 * 60) + (i * 3600) + i3);
        }
        j$.nio.file.r.h("Zone offset not in valid range: -18:00 to +18:00");
        return null;
    }

    public static int S(CharSequence charSequence, int i, boolean z) {
        if (z && charSequence.charAt(i - 1) != ':') {
            j$.nio.file.r.j("Invalid ID for ZoneOffset, colon not found when expected: ", charSequence);
            return 0;
        }
        char cCharAt = charSequence.charAt(i);
        char cCharAt2 = charSequence.charAt(i + 1);
        if (cCharAt < '0' || cCharAt > '9' || cCharAt2 < '0' || cCharAt2 > '9') {
            j$.nio.file.r.j("Invalid ID for ZoneOffset, non numeric characters found: ", charSequence);
            return 0;
        }
        return (cCharAt2 - '0') + ((cCharAt - '0') * 10);
    }

    public static ZoneOffset T(DataInput dataInput) throws IOException {
        byte b = dataInput.readByte();
        return b == 127 ? ofTotalSeconds(dataInput.readInt()) : ofTotalSeconds(b * 900);
    }

    public static ZoneOffset ofTotalSeconds(int i) {
        if (i < -64800 || i > 64800) {
            j$.nio.file.r.h("Zone offset not in valid range: -18:00 to +18:00");
            return null;
        }
        if (i % 900 != 0) {
            return new ZoneOffset(i);
        }
        Integer numValueOf = Integer.valueOf(i);
        ConcurrentMap concurrentMap = d;
        ZoneOffset zoneOffset = (ZoneOffset) ((ConcurrentHashMap) concurrentMap).get(numValueOf);
        if (zoneOffset != null) {
            return zoneOffset;
        }
        ((ConcurrentHashMap) concurrentMap).putIfAbsent(numValueOf, new ZoneOffset(i));
        ZoneOffset zoneOffset2 = (ZoneOffset) ((ConcurrentHashMap) concurrentMap).get(numValueOf);
        ((ConcurrentHashMap) e).putIfAbsent(zoneOffset2.c, zoneOffset2);
        return zoneOffset2;
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private Object writeReplace() {
        return new o((byte) 8, this);
    }

    @Override // j$.time.ZoneId
    public final void O(DataOutput dataOutput) throws IOException {
        dataOutput.writeByte(8);
        U(dataOutput);
    }

    public final void U(DataOutput dataOutput) throws IOException {
        int i = this.b;
        int i2 = i % 900 == 0 ? i / 900 : 127;
        dataOutput.writeByte(i2);
        if (i2 == 127) {
            dataOutput.writeInt(i);
        }
    }

    @Override // java.lang.Comparable
    public final int compareTo(ZoneOffset zoneOffset) {
        return zoneOffset.b - this.b;
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final Object d(d dVar) {
        return (dVar == j$.time.temporal.m.d || dVar == j$.time.temporal.m.e) ? this : super.d(dVar);
    }

    @Override // j$.time.ZoneId
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ZoneOffset) && this.b == ((ZoneOffset) obj).b;
    }

    @Override // j$.time.temporal.k
    public final Temporal f(Temporal temporal) {
        return temporal.a(ChronoField.OFFSET_SECONDS, this.b);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final int g(TemporalField temporalField) {
        if (temporalField == ChronoField.OFFSET_SECONDS) {
            return this.b;
        }
        if (temporalField instanceof ChronoField) {
            throw new j$.time.temporal.n(b.a("Unsupported field: ", temporalField));
        }
        return super.k(temporalField).a(temporalField, j(temporalField));
    }

    @Override // j$.time.ZoneId
    public final String getId() {
        return this.c;
    }

    @Override // j$.time.ZoneId
    public final ZoneRules getRules() {
        return new ZoneRules(this);
    }

    public int getTotalSeconds() {
        return this.b;
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final boolean h(TemporalField temporalField) {
        if (temporalField instanceof ChronoField) {
            return temporalField == ChronoField.OFFSET_SECONDS;
        }
        return temporalField != null && temporalField.p(this);
    }

    @Override // j$.time.ZoneId
    public int hashCode() {
        return this.b;
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final long j(TemporalField temporalField) {
        if (temporalField == ChronoField.OFFSET_SECONDS) {
            return this.b;
        }
        if (temporalField instanceof ChronoField) {
            throw new j$.time.temporal.n(b.a("Unsupported field: ", temporalField));
        }
        return temporalField.K(this);
    }

    @Override // j$.time.ZoneId
    public final String toString() {
        return this.c;
    }
}
