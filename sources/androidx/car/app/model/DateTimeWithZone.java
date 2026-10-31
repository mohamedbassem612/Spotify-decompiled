package androidx.car.app.model;

import j$.time.LocalDateTime;
import j$.time.ZoneId;
import j$.time.ZoneOffset;
import j$.time.ZonedDateTime;
import j$.time.format.TextStyle;
import java.util.Date;
import java.util.Locale;
import java.util.Objects;
import java.util.TimeZone;
import java.util.concurrent.TimeUnit;
import p.hhg1;
import p.l1d;
import p.qrd;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
@qrd
public final class DateTimeWithZone {
    private static final long MAX_ZONE_OFFSET_SECONDS = 64800;
    private final long mTimeSinceEpochMillis;
    private final int mZoneOffsetSeconds;
    private final String mZoneShortName;

    private DateTimeWithZone() {
        this.mTimeSinceEpochMillis = 0L;
        this.mZoneOffsetSeconds = 0;
        this.mZoneShortName = null;
    }

    public static DateTimeWithZone create(long j, int i, String str) {
        if (j < 0) {
            hhg1.n("Time since epoch must be greater than or equal to zero");
            return null;
        }
        if (Math.abs(i) > MAX_ZONE_OFFSET_SECONDS) {
            hhg1.n("Zone offset not in valid range: -18:00 to +18:00");
            return null;
        }
        Objects.requireNonNull(str);
        if (!str.isEmpty()) {
            return new DateTimeWithZone(j, i, str);
        }
        hhg1.n("The time zone short name can not be null or empty");
        return null;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DateTimeWithZone)) {
            return false;
        }
        DateTimeWithZone dateTimeWithZone = (DateTimeWithZone) obj;
        return this.mTimeSinceEpochMillis == dateTimeWithZone.mTimeSinceEpochMillis && this.mZoneOffsetSeconds == dateTimeWithZone.mZoneOffsetSeconds && Objects.equals(this.mZoneShortName, dateTimeWithZone.mZoneShortName);
    }

    public long getTimeSinceEpochMillis() {
        return this.mTimeSinceEpochMillis;
    }

    public int getZoneOffsetSeconds() {
        return this.mZoneOffsetSeconds;
    }

    public String getZoneShortName() {
        return this.mZoneShortName;
    }

    public int hashCode() {
        return Objects.hash(Long.valueOf(this.mTimeSinceEpochMillis), Integer.valueOf(this.mZoneOffsetSeconds), this.mZoneShortName);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("[time since epoch (ms): ");
        sb.append(this.mTimeSinceEpochMillis);
        sb.append("( ");
        sb.append(new Date(this.mTimeSinceEpochMillis));
        sb.append(")  zone offset (s): ");
        sb.append(this.mZoneOffsetSeconds);
        sb.append(", zone: ");
        return l1d.n(this.mZoneShortName, "]", sb);
    }

    private DateTimeWithZone(long j, int i, String str) {
        this.mTimeSinceEpochMillis = j;
        this.mZoneOffsetSeconds = i;
        this.mZoneShortName = str;
    }

    public static DateTimeWithZone create(long j, TimeZone timeZone) {
        if (j >= 0) {
            Objects.requireNonNull(timeZone);
            return create(j, (int) (((long) timeZone.getOffset(j)) / 1000), timeZone.getDisplayName(false, 0));
        }
        hhg1.n("timeSinceEpochMillis must be greater than or equal to zero");
        return null;
    }

    public static DateTimeWithZone create(ZonedDateTime zonedDateTime) {
        Objects.requireNonNull(zonedDateTime);
        LocalDateTime localDateTime = zonedDateTime.toLocalDateTime();
        ZoneId zone = zonedDateTime.getZone();
        ZoneOffset offset = zone.getRules().getOffset(localDateTime);
        return create(TimeUnit.SECONDS.toMillis(localDateTime.toEpochSecond(offset)), offset.getTotalSeconds(), zone.getDisplayName(TextStyle.SHORT, Locale.getDefault()));
    }
}
