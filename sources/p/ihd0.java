package p;

import android.content.Context;
import android.icu.text.DateFormat;
import android.icu.util.TimeZone;
import java.util.Calendar;
import java.util.Locale;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class ihd0 {
    public final yqg a;
    public final Context b;
    public final Locale c = new Locale(upn1.m());

    public ihd0(Context context, yqg yqgVar) {
        this.a = yqgVar;
        this.b = context;
    }

    public final hhd0 a(long j, boolean z) {
        yqg yqgVar = this.a;
        Calendar calendarD = yqgVar.d();
        TimeZone timeZone = TimeZone.getTimeZone(calendarD.getTimeZone().getID());
        long timeInMillis = calendarD.getTimeInMillis();
        Locale locale = this.c;
        android.icu.util.Calendar calendar = android.icu.util.Calendar.getInstance(timeZone, locale);
        calendar.setTimeInMillis(timeInMillis);
        Calendar calendarD2 = yqgVar.d();
        calendarD2.setTimeInMillis(j);
        TimeZone timeZone2 = TimeZone.getTimeZone(calendarD2.getTimeZone().getID());
        long timeInMillis2 = calendarD2.getTimeInMillis();
        android.icu.util.Calendar calendar2 = android.icu.util.Calendar.getInstance(timeZone2, locale);
        calendar2.setTimeInMillis(timeInMillis2);
        long timeInMillis3 = calendar.getTimeInMillis() - calendar2.getTimeInMillis();
        Context context = this.b;
        if (timeInMillis3 < 3600000) {
            int i = (int) (timeInMillis3 / 60000);
            return new hhd0(context.getString(z ? 2131957422 : 2131957421, Integer.valueOf(i)), context.getResources().getQuantityString(2131820731, i, Integer.valueOf(i)));
        }
        if (timeInMillis3 < 86400000) {
            int i2 = (int) (timeInMillis3 / 3600000);
            return new hhd0(context.getString(z ? 2131957407 : 2131957406, Integer.valueOf(i2)), context.getResources().getQuantityString(2131820730, i2, Integer.valueOf(i2)));
        }
        if (timeInMillis3 < 172800000) {
            int i3 = (int) (timeInMillis3 / 86400000);
            return new hhd0(context.getString(z ? 2131957394 : 2131957393, Integer.valueOf(i3)), context.getResources().getQuantityString(2131820729, i3, Integer.valueOf(i3)));
        }
        if (timeInMillis3 <= 518400000) {
            return new hhd0(DateFormat.getInstanceForSkeleton(z ? "EEEE" : "E", locale).format(calendar2.getTime()), context.getString(2131957392, DateFormat.getInstanceForSkeleton("EEEE", locale).format(calendar2.getTime())));
        }
        int iMax = Math.max(((int) (timeInMillis3 / 86400000)) / 7, 1);
        return new hhd0(context.getString(z ? 2131957455 : 2131957454, Integer.valueOf(iMax)), context.getResources().getQuantityString(2131820732, iMax, Integer.valueOf(iMax)));
    }
}
