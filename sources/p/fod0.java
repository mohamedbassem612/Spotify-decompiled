package p;

import android.text.format.DateFormat;
import com.spotify.base.java.logging.Logger;
import j$.time.Instant;
import j$.time.LocalDate;
import j$.time.LocalDateTime;
import j$.time.OffsetDateTime;
import j$.time.ZoneId;
import j$.time.ZoneOffset;
import j$.time.format.DateTimeFormatter;
import j$.time.format.DateTimeParseException;
import j$.time.format.FormatStyle;
import j$.time.zone.ZoneRulesException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class fod0 {
    public final yqg a;
    public final Locale b = Locale.getDefault();

    public fod0(yqg yqgVar) {
        this.a = yqgVar;
    }

    public static OffsetDateTime e(fod0 fod0Var, String str) {
        DateTimeFormatter dateTimeFormatterOfPattern = DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm:ss[.SSS]Z");
        fod0Var.getClass();
        try {
            return OffsetDateTime.parse(str, dateTimeFormatterOfPattern);
        } catch (DateTimeParseException unused) {
            return null;
        }
    }

    public final Date a(String str) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss", this.b);
        Calendar calendarD = this.a.d();
        calendarD.setTime(new Date(Long.MIN_VALUE));
        Date time = calendarD.getTime();
        try {
            time = simpleDateFormat.parse(str);
        } catch (ParseException e) {
            Logger.l(e, "Failed to parse date [%s] with formatter [%s]", new Object[]{str, simpleDateFormat});
        }
        time.getClass();
        return time;
    }

    public final String b(String str, String str2) {
        return f4i1.f(new SimpleDateFormat(DateFormat.getBestDateTimePattern(Locale.getDefault(), "MMM d"), Locale.getDefault()).format(a(str)), " - ", new SimpleDateFormat(DateFormat.getBestDateTimePattern(Locale.getDefault(), "MMM d"), Locale.getDefault()).format(a(str2)));
    }

    public final String c(LocalDate localDate, LocalDate localDate2) {
        DateTimeFormatter dateTimeFormatterOfPattern = DateTimeFormatter.ofPattern("MMM d");
        String str = localDate.format(dateTimeFormatterOfPattern);
        String str2 = localDate2.format(dateTimeFormatterOfPattern);
        if (!localDate.equals(localDate2)) {
            return xcg1.i(str, " - ", str2);
        }
        str.getClass();
        return str;
    }

    public final String d(String str) {
        ZoneId zoneIdSystemDefault;
        Instant instantOfEpochMilli = Instant.ofEpochMilli(a(str).getTime());
        try {
            zoneIdSystemDefault = ZoneId.systemDefault();
            zoneIdSystemDefault.getClass();
        } catch (ZoneRulesException e) {
            OffsetDateTime offsetDateTimeE = e(this, str);
            ZoneId offset = offsetDateTimeE != null ? offsetDateTimeE.getOffset() : null;
            if (offset != null) {
                Logger.l(e, "Unknown system timezone, falling back to timestamp offset %s", new Object[]{offset});
            } else {
                Logger.l(e, "Unknown system timezone, falling back to UTC", new Object[0]);
            }
            if (offset == null) {
                offset = ZoneOffset.UTC;
            }
            zoneIdSystemDefault = offset;
            zoneIdSystemDefault.getClass();
        }
        LocalDateTime localDateTimeOfInstant = LocalDateTime.ofInstant(instantOfEpochMilli, zoneIdSystemDefault);
        DateTimeFormatter dateTimeFormatterOfPattern = DateTimeFormatter.ofPattern("EEE, MMM d");
        Locale locale = this.b;
        return xcg1.i(localDateTimeOfInstant.format(dateTimeFormatterOfPattern.withLocale(locale)), ", ", localDateTimeOfInstant.format(DateTimeFormatter.ofLocalizedTime(FormatStyle.SHORT).withLocale(locale)));
    }
}
