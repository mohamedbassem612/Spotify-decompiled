package j$.time.zone;

import j$.time.Clock;
import j$.time.DayOfWeek;
import j$.time.Instant;
import j$.time.LocalDate;
import j$.time.LocalDateTime;
import j$.time.LocalTime;
import j$.time.Month;
import j$.time.ZoneOffset;
import j$.time.chrono.IsoChronology;
import j$.time.temporal.ChronoField;
import j$.time.temporal.l;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.TimeZone;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* JADX INFO: compiled from: r8-map-id-d9f8928238715ac698104c66898e5631a6796c71eabc0cbc140853337a7ef765 */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes13.dex */
public final class ZoneRules implements Serializable {
    public static final long[] i = new long[0];
    public static final e[] j = new e[0];
    public static final LocalDateTime[] k = new LocalDateTime[0];
    public static final b[] l = new b[0];
    private static final long serialVersionUID = 3044319355680032515L;
    public final long[] a;
    public final ZoneOffset[] b;
    public final long[] c;
    public final LocalDateTime[] d;
    public final ZoneOffset[] e;
    public final e[] f;
    public final TimeZone g;
    public final transient ConcurrentMap h = new ConcurrentHashMap();

    public ZoneRules(long[] jArr, ZoneOffset[] zoneOffsetArr, long[] jArr2, ZoneOffset[] zoneOffsetArr2, e[] eVarArr) {
        this.a = jArr;
        this.b = zoneOffsetArr;
        this.c = jArr2;
        this.e = zoneOffsetArr2;
        this.f = eVarArr;
        if (jArr2.length == 0) {
            this.d = k;
        } else {
            ArrayList arrayList = new ArrayList();
            int i2 = 0;
            while (i2 < jArr2.length) {
                ZoneOffset zoneOffset = zoneOffsetArr2[i2];
                int i3 = i2 + 1;
                ZoneOffset zoneOffset2 = zoneOffsetArr2[i3];
                LocalDateTime localDateTimeOfEpochSecond = LocalDateTime.ofEpochSecond(jArr2[i2], 0, zoneOffset);
                if (zoneOffset2.getTotalSeconds() > zoneOffset.getTotalSeconds()) {
                    arrayList.add(localDateTimeOfEpochSecond);
                    arrayList.add(localDateTimeOfEpochSecond.O(zoneOffset2.getTotalSeconds() - zoneOffset.getTotalSeconds()));
                } else {
                    arrayList.add(localDateTimeOfEpochSecond.O(zoneOffset2.getTotalSeconds() - zoneOffset.getTotalSeconds()));
                    arrayList.add(localDateTimeOfEpochSecond);
                }
                i2 = i3;
            }
            this.d = (LocalDateTime[]) arrayList.toArray(new LocalDateTime[arrayList.size()]);
        }
        this.g = null;
    }

    public static Object a(LocalDateTime localDateTime, b bVar) {
        LocalDateTime localDateTime2 = bVar.b;
        if (bVar.p()) {
            if (localDateTime.isBefore(localDateTime2)) {
                return bVar.c;
            }
            if (!localDateTime.isBefore(bVar.b.O(bVar.d.getTotalSeconds() - bVar.c.getTotalSeconds()))) {
                return bVar.d;
            }
        } else {
            if (!localDateTime.isBefore(localDateTime2)) {
                return bVar.d;
            }
            if (localDateTime.isBefore(bVar.b.O(bVar.d.getTotalSeconds() - bVar.c.getTotalSeconds()))) {
                return bVar.c;
            }
        }
        return bVar;
    }

    public static int c(long j2, ZoneOffset zoneOffset) {
        return LocalDate.ofEpochDay(Math.floorDiv(j2 + ((long) zoneOffset.getTotalSeconds()), 86400L)).getYear();
    }

    public static ZoneOffset i(int i2) {
        return ZoneOffset.ofTotalSeconds(i2 / 1000);
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private Object writeReplace() {
        return new a(this.g != null ? (byte) 100 : (byte) 1, this);
    }

    public final b[] b(int i2) {
        LocalDate localDateX;
        b[] bVarArr = l;
        Integer numValueOf = Integer.valueOf(i2);
        b[] bVarArr2 = (b[]) ((ConcurrentHashMap) this.h).get(numValueOf);
        if (bVarArr2 != null) {
            return bVarArr2;
        }
        long j2 = 1;
        byte b = 0;
        byte b2 = 1;
        if (this.g != null) {
            if (i2 < 1800) {
                return bVarArr;
            }
            LocalDateTime localDateTime = LocalDateTime.c;
            LocalDate localDateOf = LocalDate.of(i2 - 1, 12, 31);
            ChronoField.HOUR_OF_DAY.P(0L);
            long epochSecond = new LocalDateTime(localDateOf, LocalTime.h[0]).toEpochSecond(this.b[0]);
            long j3 = 1000;
            int offset = this.g.getOffset(epochSecond * 1000);
            long j4 = 31968000 + epochSecond;
            while (epochSecond < j4) {
                long j5 = epochSecond + 7776000;
                long j6 = j3;
                if (offset != this.g.getOffset(j5 * j6)) {
                    while (j5 - epochSecond > j2) {
                        long jFloorDiv = Math.floorDiv(j5 + epochSecond, 2L);
                        if (this.g.getOffset(jFloorDiv * j6) == offset) {
                            epochSecond = jFloorDiv;
                        } else {
                            j5 = jFloorDiv;
                        }
                        j2 = 1;
                    }
                    if (this.g.getOffset(epochSecond * j6) == offset) {
                        epochSecond = j5;
                    }
                    ZoneOffset zoneOffsetI = i(offset);
                    int offset2 = this.g.getOffset(epochSecond * j6);
                    ZoneOffset zoneOffsetI2 = i(offset2);
                    if (c(epochSecond, zoneOffsetI2) == i2) {
                        bVarArr = (b[]) Arrays.copyOf(bVarArr, bVarArr.length + 1);
                        bVarArr[bVarArr.length - 1] = new b(epochSecond, zoneOffsetI, zoneOffsetI2);
                    }
                    offset = offset2;
                } else {
                    epochSecond = j5;
                }
                j3 = j6;
                j2 = 1;
            }
            if (1916 <= i2 && i2 < 2100) {
                ((ConcurrentHashMap) this.h).putIfAbsent(numValueOf, bVarArr);
            }
            return bVarArr;
        }
        e[] eVarArr = this.f;
        b[] bVarArr3 = new b[eVarArr.length];
        int i3 = 0;
        while (i3 < eVarArr.length) {
            e eVar = eVarArr[i3];
            byte b3 = eVar.b;
            Month month = eVar.a;
            if (b3 < 0) {
                long j7 = i2;
                int iX = month.x(IsoChronology.INSTANCE.isLeapYear(j7)) + 1 + eVar.b;
                LocalDate localDate = LocalDate.d;
                ChronoField.YEAR.P(j7);
                ChronoField.DAY_OF_MONTH.P(iX);
                localDateX = LocalDate.x(i2, month.getValue(), iX);
                DayOfWeek dayOfWeek = eVar.c;
                if (dayOfWeek != null) {
                    localDateX = localDateX.e(new l(dayOfWeek.getValue(), b2));
                }
            } else {
                LocalDate localDate2 = LocalDate.d;
                ChronoField.YEAR.P(i2);
                ChronoField.DAY_OF_MONTH.P(b3);
                localDateX = LocalDate.x(i2, month.getValue(), b3);
                DayOfWeek dayOfWeek2 = eVar.c;
                if (dayOfWeek2 != null) {
                    localDateX = localDateX.e(new l(dayOfWeek2.getValue(), b));
                }
            }
            if (eVar.e) {
                localDateX = localDateX.plusDays(1L);
            }
            LocalDateTime localDateTimeX = LocalDateTime.x(localDateX, eVar.d);
            d dVar = eVar.f;
            ZoneOffset zoneOffset = eVar.g;
            ZoneOffset zoneOffset2 = eVar.h;
            int i4 = c.a[dVar.ordinal()];
            if (i4 == 1) {
                localDateTimeX = localDateTimeX.O(zoneOffset2.getTotalSeconds() - ZoneOffset.UTC.getTotalSeconds());
            } else if (i4 == 2) {
                localDateTimeX = localDateTimeX.O(zoneOffset2.getTotalSeconds() - zoneOffset.getTotalSeconds());
            }
            bVarArr3[i3] = new b(localDateTimeX, eVar.h, eVar.i);
            i3++;
            b = 0;
        }
        if (i2 < 2100) {
            ((ConcurrentHashMap) this.h).putIfAbsent(numValueOf, bVarArr3);
        }
        return bVarArr3;
    }

    public final ZoneOffset d(Instant instant) {
        TimeZone timeZone = this.g;
        if (timeZone != null) {
            return i(timeZone.getOffset(instant.toEpochMilli()));
        }
        if (this.c.length == 0) {
            return this.b[0];
        }
        long epochSecond = instant.getEpochSecond();
        if (this.f.length > 0) {
            long[] jArr = this.c;
            if (epochSecond > jArr[jArr.length - 1]) {
                ZoneOffset[] zoneOffsetArr = this.e;
                b[] bVarArrB = b(c(epochSecond, zoneOffsetArr[zoneOffsetArr.length - 1]));
                b bVar = null;
                for (int i2 = 0; i2 < bVarArrB.length; i2++) {
                    bVar = bVarArrB[i2];
                    if (epochSecond < bVar.a) {
                        return bVar.c;
                    }
                }
                return bVar.d;
            }
        }
        int iBinarySearch = Arrays.binarySearch(this.c, epochSecond);
        if (iBinarySearch < 0) {
            iBinarySearch = (-iBinarySearch) - 2;
        }
        return this.e[iBinarySearch + 1];
    }

    public final Object e(LocalDateTime localDateTime) {
        Object obj = null;
        int i2 = 0;
        if (this.g != null) {
            b[] bVarArrB = b(localDateTime.getYear());
            if (bVarArrB.length == 0) {
                return i(this.g.getOffset(localDateTime.toEpochSecond(this.b[0]) * 1000));
            }
            int length = bVarArrB.length;
            while (i2 < length) {
                b bVar = bVarArrB[i2];
                Object objA = a(localDateTime, bVar);
                if ((objA instanceof b) || objA.equals(bVar.c)) {
                    return objA;
                }
                i2++;
                obj = objA;
            }
            return obj;
        }
        if (this.c.length == 0) {
            return this.b[0];
        }
        if (this.f.length > 0) {
            LocalDateTime[] localDateTimeArr = this.d;
            if (localDateTime.isAfter(localDateTimeArr[localDateTimeArr.length - 1])) {
                b[] bVarArrB2 = b(localDateTime.getYear());
                int length2 = bVarArrB2.length;
                while (i2 < length2) {
                    b bVar2 = bVarArrB2[i2];
                    Object objA2 = a(localDateTime, bVar2);
                    if ((objA2 instanceof b) || objA2.equals(bVar2.c)) {
                        return objA2;
                    }
                    i2++;
                    obj = objA2;
                }
                return obj;
            }
        }
        int iBinarySearch = Arrays.binarySearch(this.d, localDateTime);
        if (iBinarySearch == -1) {
            return this.e[0];
        }
        if (iBinarySearch < 0) {
            iBinarySearch = (-iBinarySearch) - 2;
        } else {
            Object[] objArr = this.d;
            if (iBinarySearch < objArr.length - 1) {
                int i3 = iBinarySearch + 1;
                if (objArr[iBinarySearch].equals(objArr[i3])) {
                    iBinarySearch = i3;
                }
            }
        }
        if ((iBinarySearch & 1) != 0) {
            return this.e[(iBinarySearch / 2) + 1];
        }
        LocalDateTime[] localDateTimeArr2 = this.d;
        LocalDateTime localDateTime2 = localDateTimeArr2[iBinarySearch];
        LocalDateTime localDateTime3 = localDateTimeArr2[iBinarySearch + 1];
        ZoneOffset[] zoneOffsetArr = this.e;
        int i4 = iBinarySearch / 2;
        ZoneOffset zoneOffset = zoneOffsetArr[i4];
        ZoneOffset zoneOffset2 = zoneOffsetArr[i4 + 1];
        return zoneOffset2.getTotalSeconds() > zoneOffset.getTotalSeconds() ? new b(localDateTime2, zoneOffset, zoneOffset2) : new b(localDateTime3, zoneOffset, zoneOffset2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ZoneRules)) {
            return false;
        }
        ZoneRules zoneRules = (ZoneRules) obj;
        return Objects.equals(this.g, zoneRules.g) && Arrays.equals(this.a, zoneRules.a) && Arrays.equals(this.b, zoneRules.b) && Arrays.equals(this.c, zoneRules.c) && Arrays.equals(this.e, zoneRules.e) && Arrays.equals(this.f, zoneRules.f);
    }

    public final List f(LocalDateTime localDateTime) {
        Object objE = e(localDateTime);
        if (!(objE instanceof b)) {
            return Collections.singletonList((ZoneOffset) objE);
        }
        b bVar = (b) objE;
        return bVar.p() ? Collections.EMPTY_LIST : j$.desugar.sun.nio.fs.g.o(new Object[]{bVar.c, bVar.d});
    }

    public final boolean g(Instant instant) {
        ZoneOffset zoneOffsetI;
        TimeZone timeZone = this.g;
        if (timeZone != null) {
            zoneOffsetI = i(timeZone.getRawOffset());
        } else if (this.c.length == 0) {
            zoneOffsetI = this.b[0];
        } else {
            int iBinarySearch = Arrays.binarySearch(this.a, instant.getEpochSecond());
            if (iBinarySearch < 0) {
                iBinarySearch = (-iBinarySearch) - 2;
            }
            zoneOffsetI = this.b[iBinarySearch + 1];
        }
        return !zoneOffsetI.equals(d(instant));
    }

    public ZoneOffset getOffset(LocalDateTime localDateTime) {
        Object objE = e(localDateTime);
        return objE instanceof b ? ((b) objE).c : (ZoneOffset) objE;
    }

    /* JADX WARN: Code duplicated, block: B:64:0x012b  */
    /* JADX WARN: Code duplicated, block: B:66:0x0133  */
    /* JADX WARN: Code duplicated, block: B:69:0x0138  */
    public final boolean h() {
        int iBinarySearch;
        b bVar;
        TimeZone timeZone = this.g;
        if (timeZone != null) {
            if (timeZone.useDaylightTime() || this.g.getDSTSavings() != 0) {
                return false;
            }
            Instant instantNow = Instant.now();
            b bVar2 = null;
            if (this.g != null) {
                long epochSecond = instantNow.getEpochSecond();
                if (instantNow.getNano() > 0 && epochSecond < Long.MAX_VALUE) {
                    epochSecond++;
                }
                int iC = c(epochSecond, d(instantNow));
                b[] bVarArrB = b(iC);
                int length = bVarArrB.length - 1;
                while (true) {
                    if (length >= 0) {
                        bVar = bVarArrB[length];
                        if (epochSecond > bVar.a) {
                            break;
                        }
                        length--;
                    } else if (iC > 1800) {
                        b[] bVarArrB2 = b(iC - 1);
                        int length2 = bVarArrB2.length - 1;
                        while (true) {
                            if (length2 < 0) {
                                int offset = this.g.getOffset((epochSecond - 1) * 1000);
                                long epochDay = LocalDate.of(1800, 1, 1).toEpochDay() * 86400;
                                for (long jMin = Math.min(epochSecond - 31104000, (Clock.systemUTC().millis() / 1000) + 31968000); epochDay <= jMin; jMin -= 7776000) {
                                    int offset2 = this.g.getOffset(jMin * 1000);
                                    if (offset != offset2) {
                                        int iC2 = c(jMin, i(offset2));
                                        b[] bVarArrB3 = b(iC2 + 1);
                                        for (int length3 = bVarArrB3.length - 1; length3 >= 0; length3--) {
                                            bVar2 = bVarArrB3[length3];
                                            if (epochSecond > bVar2.a) {
                                                break;
                                            }
                                        }
                                        b[] bVarArrB4 = b(iC2);
                                        bVar2 = bVarArrB4[bVarArrB4.length - 1];
                                        break;
                                    }
                                }
                                break;
                            }
                            bVar = bVarArrB2[length2];
                            if (epochSecond > bVar.a) {
                                break;
                            }
                            length2--;
                        }
                    }
                }
                bVar2 = bVar;
            } else if (this.c.length != 0) {
                long epochSecond2 = instantNow.getEpochSecond();
                if (instantNow.getNano() > 0 && epochSecond2 < Long.MAX_VALUE) {
                    epochSecond2++;
                }
                long[] jArr = this.c;
                long j2 = jArr[jArr.length - 1];
                if (this.f.length <= 0 || epochSecond2 <= j2) {
                    iBinarySearch = Arrays.binarySearch(this.c, epochSecond2);
                    if (iBinarySearch < 0) {
                        iBinarySearch = (-iBinarySearch) - 1;
                    }
                    if (iBinarySearch > 0) {
                        int i2 = iBinarySearch - 1;
                        long j3 = this.c[i2];
                        ZoneOffset[] zoneOffsetArr = this.e;
                        bVar2 = new b(j3, zoneOffsetArr[i2], zoneOffsetArr[iBinarySearch]);
                    }
                } else {
                    ZoneOffset[] zoneOffsetArr2 = this.e;
                    ZoneOffset zoneOffset = zoneOffsetArr2[zoneOffsetArr2.length - 1];
                    int iC3 = c(epochSecond2, zoneOffset);
                    b[] bVarArrB5 = b(iC3);
                    for (int length4 = bVarArrB5.length - 1; length4 >= 0; length4--) {
                        b bVar3 = bVarArrB5[length4];
                        if (epochSecond2 > bVar3.a) {
                            bVar2 = bVar3;
                        }
                    }
                    int i3 = iC3 - 1;
                    if (i3 > c(j2, zoneOffset)) {
                        b[] bVarArrB6 = b(i3);
                        bVar2 = bVarArrB6[bVarArrB6.length - 1];
                    } else {
                        iBinarySearch = Arrays.binarySearch(this.c, epochSecond2);
                        if (iBinarySearch < 0) {
                            iBinarySearch = (-iBinarySearch) - 1;
                        }
                        if (iBinarySearch > 0) {
                            int i4 = iBinarySearch - 1;
                            long j4 = this.c[i4];
                            ZoneOffset[] zoneOffsetArr3 = this.e;
                            bVar2 = new b(j4, zoneOffsetArr3[i4], zoneOffsetArr3[iBinarySearch]);
                        }
                    }
                }
            }
            if (bVar2 != null) {
                return false;
            }
        } else if (this.c.length != 0) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f) ^ ((((Objects.hashCode(this.g) ^ Arrays.hashCode(this.a)) ^ Arrays.hashCode(this.b)) ^ Arrays.hashCode(this.c)) ^ Arrays.hashCode(this.e));
    }

    public final String toString() {
        TimeZone timeZone = this.g;
        if (timeZone != null) {
            return "ZoneRules[timeZone=" + timeZone.getID() + "]";
        }
        ZoneOffset[] zoneOffsetArr = this.b;
        return "ZoneRules[currentStandardOffset=" + zoneOffsetArr[zoneOffsetArr.length - 1] + "]";
    }

    public ZoneRules(ZoneOffset zoneOffset) {
        ZoneOffset[] zoneOffsetArr = {zoneOffset};
        this.b = zoneOffsetArr;
        long[] jArr = i;
        this.a = jArr;
        this.c = jArr;
        this.d = k;
        this.e = zoneOffsetArr;
        this.f = j;
        this.g = null;
    }

    public ZoneRules(TimeZone timeZone) {
        ZoneOffset[] zoneOffsetArr = {i(timeZone.getRawOffset())};
        this.b = zoneOffsetArr;
        long[] jArr = i;
        this.a = jArr;
        this.c = jArr;
        this.d = k;
        this.e = zoneOffsetArr;
        this.f = j;
        this.g = timeZone;
    }
}
