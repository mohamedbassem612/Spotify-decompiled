package p;

import android.content.Context;
import android.icu.util.TimeZone;
import android.text.format.DateFormat;
import java.util.Calendar;
import java.util.Locale;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class lte {
    public final yqg a;
    public final Context b;
    public final Locale c;

    public lte(yqg yqgVar, Context context, byte b) {
        switch (b) {
            case 1:
                this.a = yqgVar;
                this.b = context;
                this.c = new Locale(upn1.m());
                break;
            default:
                this.a = yqgVar;
                this.b = context;
                this.c = new Locale(upn1.m());
                break;
        }
    }

    public String a(long j) {
        yqg yqgVar = this.a;
        Calendar calendarD = yqgVar.d();
        TimeZone timeZone = TimeZone.getTimeZone(calendarD.getTimeZone().getID());
        long timeInMillis = calendarD.getTimeInMillis();
        Locale locale = this.c;
        android.icu.util.Calendar calendar = android.icu.util.Calendar.getInstance(timeZone, locale);
        calendar.setTimeInMillis(timeInMillis);
        Calendar calendarD2 = yqgVar.d();
        calendarD2.setTimeInMillis(j * 1000);
        TimeZone timeZone2 = TimeZone.getTimeZone(calendarD2.getTimeZone().getID());
        long timeInMillis2 = calendarD2.getTimeInMillis();
        android.icu.util.Calendar calendar2 = android.icu.util.Calendar.getInstance(timeZone2, locale);
        calendar2.setTimeInMillis(timeInMillis2);
        Context context = this.b;
        boolean zIs24HourFormat = DateFormat.is24HourFormat(context);
        if (calendar.getTimeInMillis() - calendar2.getTimeInMillis() < 3600000) {
            return c(calendar2, zIs24HourFormat);
        }
        if (calendar.get(0) == calendar2.get(0) && calendar.get(1) == calendar2.get(1) && calendar.get(6) == calendar2.get(6)) {
            return context.getString(2131953598, c(calendar2, zIs24HourFormat));
        }
        if (calendar.get(0) == calendar2.get(0) && calendar.get(1) == calendar2.get(1) && calendar.get(6) - calendar2.get(6) == 1) {
            return context.getString(2131953600, c(calendar2, zIs24HourFormat));
        }
        if (calendar.get(0) == calendar2.get(0) && calendar.get(1) == calendar2.get(1) && calendar.get(6) - calendar2.get(6) == 2) {
            return context.getString(2131953599, android.icu.text.DateFormat.getInstanceForSkeleton("EEEE", locale).format(calendar2.getTime()), c(calendar2, zIs24HourFormat));
        }
        int i = calendar.get(6) - calendar2.get(6);
        if (calendar.get(1) != calendar2.get(1) || i <= 0 || i >= 7) {
            return (calendar.get(0) == calendar2.get(0) && calendar.get(1) == calendar2.get(1)) ? android.icu.text.DateFormat.getInstanceForSkeleton("MMMMd", locale).format(calendar2.getTime()) : android.icu.text.DateFormat.getInstanceForSkeleton("yMMMMd", locale).format(calendar2.getTime());
        }
        return android.icu.text.DateFormat.getInstanceForSkeleton("EEEE", locale).format(calendar2.getTime());
    }

    public chf b(long j) {
        yqg yqgVar = this.a;
        Calendar calendarD = yqgVar.d();
        TimeZone timeZone = TimeZone.getTimeZone(calendarD.getTimeZone().getID());
        long timeInMillis = calendarD.getTimeInMillis();
        Locale locale = this.c;
        android.icu.util.Calendar calendar = android.icu.util.Calendar.getInstance(timeZone, locale);
        calendar.setTimeInMillis(timeInMillis);
        Calendar calendarD2 = yqgVar.d();
        calendarD2.setTimeInMillis(j * 1000);
        TimeZone timeZone2 = TimeZone.getTimeZone(calendarD2.getTimeZone().getID());
        long timeInMillis2 = calendarD2.getTimeInMillis();
        android.icu.util.Calendar calendar2 = android.icu.util.Calendar.getInstance(timeZone2, locale);
        calendar2.setTimeInMillis(timeInMillis2);
        long timeInMillis3 = calendar.getTimeInMillis() - calendar2.getTimeInMillis();
        Context context = this.b;
        if (timeInMillis3 < 60000) {
            String string = context.getString(2131953338);
            return new chf(string, string);
        }
        if (calendar.getTimeInMillis() - calendar2.getTimeInMillis() < 3600000) {
            int timeInMillis4 = (int) ((calendar.getTimeInMillis() - calendar2.getTimeInMillis()) / 60000);
            return new chf(context.getString(2131953337, Integer.valueOf(timeInMillis4)), context.getResources().getQuantityString(2131820597, timeInMillis4, Integer.valueOf(timeInMillis4)));
        }
        if (calendar.getTimeInMillis() - calendar2.getTimeInMillis() < 86400000) {
            int timeInMillis5 = (int) ((calendar.getTimeInMillis() - calendar2.getTimeInMillis()) / 3600000);
            return new chf(context.getString(2131953333, Integer.valueOf(timeInMillis5)), context.getResources().getQuantityString(2131820596, timeInMillis5, Integer.valueOf(timeInMillis5)));
        }
        if (calendar.getTimeInMillis() - calendar2.getTimeInMillis() < 172800000) {
            int timeInMillis6 = (int) ((calendar.getTimeInMillis() - calendar2.getTimeInMillis()) / 86400000);
            return new chf(context.getString(2131953318, Integer.valueOf(timeInMillis6)), context.getResources().getQuantityString(2131820595, timeInMillis6, Integer.valueOf(timeInMillis6)));
        }
        if (calendar.getTimeInMillis() - calendar2.getTimeInMillis() < 604800000) {
            return new chf(android.icu.text.DateFormat.getInstanceForSkeleton("E", locale).format(calendar2.getTime()), android.icu.text.DateFormat.getInstanceForSkeleton("EEEE", locale).format(calendar2.getTime()));
        }
        if (calendar.get(1) == calendar2.get(1)) {
            String str = android.icu.text.DateFormat.getInstanceForSkeleton("MMMd", locale).format(calendar2.getTime());
            str.getClass();
            return new chf(str, str);
        }
        String str2 = android.icu.text.DateFormat.getInstanceForSkeleton("yMMMd", locale).format(calendar2.getTime());
        str2.getClass();
        return new chf(str2, str2);
    }

    public String c(android.icu.util.Calendar calendar, boolean z) {
        return android.icu.text.DateFormat.getInstanceForSkeleton(z ? "Hm" : "jm", this.c).format(calendar.getTime());
    }
}
