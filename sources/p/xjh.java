package p;

import android.content.res.Resources;
import j$.time.LocalDateTime;
import j$.time.ZoneOffset;
import j$.time.temporal.ChronoUnit;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class xjh {
    public final Resources a;

    public xjh(Resources resources) {
        this.a = resources;
    }

    public final String a(long j, long j2) {
        ZoneOffset zoneOffset = ZoneOffset.UTC;
        long jAbs = Math.abs(LocalDateTime.ofEpochSecond(j / 1000, 0, zoneOffset).until(LocalDateTime.ofEpochSecond(j2 / 1000, 0, zoneOffset), ChronoUnit.SECONDS));
        ChronoUnit chronoUnit = ChronoUnit.MINUTES;
        long seconds = chronoUnit.getDuration().getSeconds();
        Resources resources = this.a;
        if (jAbs < seconds) {
            return resources.getString(2131954066);
        }
        ChronoUnit chronoUnit2 = ChronoUnit.HOURS;
        if (jAbs < chronoUnit2.getDuration().getSeconds()) {
            long seconds2 = jAbs / chronoUnit.getDuration().getSeconds();
            String quantityString = resources.getQuantityString(2131820622, (int) seconds2, Long.valueOf(seconds2));
            quantityString.getClass();
            return quantityString;
        }
        ChronoUnit chronoUnit3 = ChronoUnit.DAYS;
        if (jAbs < chronoUnit3.getDuration().getSeconds()) {
            long seconds3 = jAbs / chronoUnit2.getDuration().getSeconds();
            String quantityString2 = resources.getQuantityString(2131820621, (int) seconds3, Long.valueOf(seconds3));
            quantityString2.getClass();
            return quantityString2;
        }
        ChronoUnit chronoUnit4 = ChronoUnit.WEEKS;
        if (jAbs < chronoUnit4.getDuration().getSeconds()) {
            long seconds4 = jAbs / chronoUnit3.getDuration().getSeconds();
            String quantityString3 = resources.getQuantityString(2131820620, (int) seconds4, Long.valueOf(seconds4));
            quantityString3.getClass();
            return quantityString3;
        }
        ChronoUnit chronoUnit5 = ChronoUnit.MONTHS;
        if (jAbs < chronoUnit5.getDuration().getSeconds()) {
            long seconds5 = jAbs / chronoUnit4.getDuration().getSeconds();
            String quantityString4 = resources.getQuantityString(2131820630, (int) seconds5, Long.valueOf(seconds5));
            quantityString4.getClass();
            return quantityString4;
        }
        ChronoUnit chronoUnit6 = ChronoUnit.YEARS;
        if (jAbs < chronoUnit6.getDuration().getSeconds()) {
            long seconds6 = jAbs / chronoUnit5.getDuration().getSeconds();
            String quantityString5 = resources.getQuantityString(2131820623, (int) seconds6, Long.valueOf(seconds6));
            quantityString5.getClass();
            return quantityString5;
        }
        long seconds7 = jAbs / chronoUnit6.getDuration().getSeconds();
        String quantityString6 = resources.getQuantityString(2131820631, (int) seconds7, Long.valueOf(seconds7));
        quantityString6.getClass();
        return quantityString6;
    }
}
