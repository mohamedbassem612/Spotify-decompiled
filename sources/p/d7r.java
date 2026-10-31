package p;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Locale;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public abstract class d7r {
    public static final SimpleDateFormat a;

    static {
        Locale locale = Locale.US;
        a = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss", locale);
        new SimpleDateFormat("HH:mm:ss", locale);
    }

    public static synchronized String a(Calendar calendar) {
        SimpleDateFormat simpleDateFormat;
        calendar.getClass();
        simpleDateFormat = a;
        simpleDateFormat.setTimeZone(calendar.getTimeZone());
        return simpleDateFormat.format(calendar.getTime());
    }
}
