package j$.nio.file.attribute;

import j$.time.Instant;
import j$.time.LocalDateTime;
import j$.time.ZoneOffset;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-d9f8928238715ac698104c66898e5631a6796c71eabc0cbc140853337a7ef765 */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes13.dex */
public final class FileTime implements Comparable<FileTime> {
    public final long a;
    public Instant b = null;
    public String c;

    public FileTime(long j) {
        this.a = j;
    }

    public static long D(long j, long j2, long j3) {
        if (j > j3) {
            return Long.MAX_VALUE;
        }
        if (j < (-j3)) {
            return Long.MIN_VALUE;
        }
        return j * j2;
    }

    public static void p(StringBuilder sb, int i, int i2) {
        while (i > 0) {
            sb.append((char) ((i2 / i) + 48));
            i2 %= i;
            i /= 10;
        }
    }

    public final long K(long j) {
        TimeUnit timeUnit = TimeUnit.DAYS;
        TimeUnit timeUnit2 = TimeUnit.MILLISECONDS;
        if (timeUnit2 != null) {
            return timeUnit2.toNanos(this.a - timeUnit2.convert(j, timeUnit));
        }
        return TimeUnit.SECONDS.toNanos(toInstant().getEpochSecond() - timeUnit.toSeconds(j));
    }

    public final boolean equals(Object obj) {
        return (obj instanceof FileTime) && compareTo((FileTime) obj) == 0;
    }

    public final int hashCode() {
        return toInstant().hashCode();
    }

    /* JADX WARN: Code duplicated, block: B:18:0x008c  */
    /* JADX WARN: Code duplicated, block: B:20:0x0091  */
    /* JADX WARN: Code duplicated, block: B:22:0x009a  */
    /* JADX WARN: Code duplicated, block: B:24:0x009f  */
    public final Instant toInstant() {
        long jD;
        int iFloorMod;
        long jFloorDiv;
        Instant instant = this.b;
        if (instant != null) {
            return instant;
        }
        switch (s.a[TimeUnit.MILLISECONDS.ordinal()]) {
            case 1:
                jD = D(this.a, 86400L, 106751991167300L);
                long j = jD;
                iFloorMod = 0;
                jFloorDiv = j;
                if (jFloorDiv <= -31557014167219200L) {
                    Instant instant2 = Instant.d;
                    this.b = instant2;
                    return instant2;
                }
                if (jFloorDiv >= 31556889864403199L) {
                    Instant instant3 = Instant.e;
                    this.b = instant3;
                    return instant3;
                }
                Instant instantOfEpochSecond = Instant.ofEpochSecond(jFloorDiv, iFloorMod);
                this.b = instantOfEpochSecond;
                return instantOfEpochSecond;
            case 2:
                jD = D(this.a, 3600L, 2562047788015215L);
                long j2 = jD;
                iFloorMod = 0;
                jFloorDiv = j2;
                if (jFloorDiv <= -31557014167219200L) {
                    Instant instant4 = Instant.d;
                    this.b = instant4;
                    return instant4;
                }
                if (jFloorDiv >= 31556889864403199L) {
                    Instant instant5 = Instant.e;
                    this.b = instant5;
                    return instant5;
                }
                Instant instantOfEpochSecond2 = Instant.ofEpochSecond(jFloorDiv, iFloorMod);
                this.b = instantOfEpochSecond2;
                return instantOfEpochSecond2;
            case 3:
                jD = D(this.a, 60L, 153722867280912930L);
                long j3 = jD;
                iFloorMod = 0;
                jFloorDiv = j3;
                if (jFloorDiv <= -31557014167219200L) {
                    Instant instant6 = Instant.d;
                    this.b = instant6;
                    return instant6;
                }
                if (jFloorDiv >= 31556889864403199L) {
                    Instant instant7 = Instant.e;
                    this.b = instant7;
                    return instant7;
                }
                Instant instantOfEpochSecond3 = Instant.ofEpochSecond(jFloorDiv, iFloorMod);
                this.b = instantOfEpochSecond3;
                return instantOfEpochSecond3;
            case 4:
                jD = this.a;
                long j4 = jD;
                iFloorMod = 0;
                jFloorDiv = j4;
                if (jFloorDiv <= -31557014167219200L) {
                    Instant instant8 = Instant.d;
                    this.b = instant8;
                    return instant8;
                }
                if (jFloorDiv >= 31556889864403199L) {
                    Instant instant9 = Instant.e;
                    this.b = instant9;
                    return instant9;
                }
                Instant instantOfEpochSecond4 = Instant.ofEpochSecond(jFloorDiv, iFloorMod);
                this.b = instantOfEpochSecond4;
                return instantOfEpochSecond4;
            case 5:
                jFloorDiv = Math.floorDiv(this.a, 1000L);
                iFloorMod = ((int) Math.floorMod(this.a, 1000L)) * 1000000;
                if (jFloorDiv <= -31557014167219200L) {
                    Instant instant10 = Instant.d;
                    this.b = instant10;
                    return instant10;
                }
                if (jFloorDiv >= 31556889864403199L) {
                    Instant instant11 = Instant.e;
                    this.b = instant11;
                    return instant11;
                }
                Instant instantOfEpochSecond5 = Instant.ofEpochSecond(jFloorDiv, iFloorMod);
                this.b = instantOfEpochSecond5;
                return instantOfEpochSecond5;
            case 6:
                jFloorDiv = Math.floorDiv(this.a, 1000000L);
                iFloorMod = ((int) Math.floorMod(this.a, 1000000L)) * 1000;
                if (jFloorDiv <= -31557014167219200L) {
                    Instant instant12 = Instant.d;
                    this.b = instant12;
                    return instant12;
                }
                if (jFloorDiv >= 31556889864403199L) {
                    Instant instant13 = Instant.e;
                    this.b = instant13;
                    return instant13;
                }
                Instant instantOfEpochSecond6 = Instant.ofEpochSecond(jFloorDiv, iFloorMod);
                this.b = instantOfEpochSecond6;
                return instantOfEpochSecond6;
            case 7:
                jFloorDiv = Math.floorDiv(this.a, 1000000000L);
                iFloorMod = (int) Math.floorMod(this.a, 1000000000L);
                if (jFloorDiv <= -31557014167219200L) {
                    Instant instant14 = Instant.d;
                    this.b = instant14;
                    return instant14;
                }
                if (jFloorDiv >= 31556889864403199L) {
                    Instant instant15 = Instant.e;
                    this.b = instant15;
                    return instant15;
                }
                Instant instantOfEpochSecond7 = Instant.ofEpochSecond(jFloorDiv, iFloorMod);
                this.b = instantOfEpochSecond7;
                return instantOfEpochSecond7;
            default:
                throw new AssertionError("Unit not handled");
        }
    }

    public long toMillis() {
        if (TimeUnit.MILLISECONDS != null) {
            return this.a;
        }
        long epochSecond = this.b.getEpochSecond();
        int nano = this.b.getNano();
        long j = epochSecond * 1000;
        if (((Math.abs(epochSecond) | 1000) >>> 31) == 0 || j / 1000 == epochSecond) {
            return j + ((long) (nano / 1000000));
        }
        return epochSecond < 0 ? Long.MIN_VALUE : Long.MAX_VALUE;
    }

    public final String toString() {
        long epochSecond;
        int nano;
        long jFloorDiv;
        LocalDateTime localDateTimeOfEpochSecond;
        int year;
        String str = this.c;
        if (str != null) {
            return str;
        }
        if (this.b != null || TimeUnit.MILLISECONDS.compareTo(TimeUnit.SECONDS) < 0) {
            epochSecond = toInstant().getEpochSecond();
            nano = toInstant().getNano();
        } else {
            epochSecond = this.a / 1000;
            nano = 0;
        }
        if (epochSecond >= -62167219200L) {
            long j = epochSecond - 253402300800L;
            jFloorDiv = Math.floorDiv(j, 315569520000L) + 1;
            localDateTimeOfEpochSecond = LocalDateTime.ofEpochSecond(Math.floorMod(j, 315569520000L) - 62167219200L, nano, ZoneOffset.UTC);
            year = localDateTimeOfEpochSecond.getYear();
        } else {
            long j2 = epochSecond + 62167219200L;
            jFloorDiv = j2 / 315569520000L;
            localDateTimeOfEpochSecond = LocalDateTime.ofEpochSecond((j2 % 315569520000L) - 62167219200L, nano, ZoneOffset.UTC);
            year = localDateTimeOfEpochSecond.getYear();
        }
        int i = (((int) jFloorDiv) * 10000) + year;
        if (i <= 0) {
            i--;
        }
        int nano2 = localDateTimeOfEpochSecond.getNano();
        StringBuilder sb = new StringBuilder(64);
        sb.append(i < 0 ? "-" : "");
        int iAbs = Math.abs(i);
        if (iAbs < 10000) {
            p(sb, 1000, Math.abs(iAbs));
        } else {
            sb.append(String.valueOf(iAbs));
        }
        sb.append('-');
        p(sb, 10, localDateTimeOfEpochSecond.getMonthValue());
        sb.append('-');
        p(sb, 10, localDateTimeOfEpochSecond.getDayOfMonth());
        sb.append('T');
        p(sb, 10, localDateTimeOfEpochSecond.b.a);
        sb.append(':');
        p(sb, 10, localDateTimeOfEpochSecond.getMinute());
        sb.append(':');
        p(sb, 10, localDateTimeOfEpochSecond.b.c);
        if (nano2 != 0) {
            sb.append('.');
            int i2 = 100000000;
            while (nano2 % 10 == 0) {
                nano2 /= 10;
                i2 /= 10;
            }
            p(sb, i2, nano2);
        }
        sb.append('Z');
        String string = sb.toString();
        this.c = string;
        return string;
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: x, reason: merged with bridge method [inline-methods] */
    public final int compareTo(FileTime fileTime) {
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        if (timeUnit != null) {
            fileTime.getClass();
            return Long.compare(this.a, fileTime.a);
        }
        long epochSecond = toInstant().getEpochSecond();
        int iCompare = Long.compare(epochSecond, fileTime.toInstant().getEpochSecond());
        if (iCompare != 0) {
            return iCompare;
        }
        int iCompare2 = Long.compare(toInstant().getNano(), fileTime.toInstant().getNano());
        if (iCompare2 != 0) {
            return iCompare2;
        }
        if (epochSecond != 31556889864403199L && epochSecond != -31557014167219200L) {
            return 0;
        }
        long epochSecond2 = timeUnit != null ? this.a / 86400000 : toInstant().getEpochSecond() / 86400;
        long epochSecond3 = timeUnit != null ? fileTime.a / 86400000 : fileTime.toInstant().getEpochSecond() / 86400;
        return epochSecond2 == epochSecond3 ? Long.compare(K(epochSecond2), fileTime.K(epochSecond3)) : Long.compare(epochSecond2, epochSecond3);
    }
}
