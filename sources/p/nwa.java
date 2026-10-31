package p;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class nwa {
    public final DateFormat a;
    public final SimpleDateFormat b;

    public nwa(Locale locale) {
        this.a = DateFormat.getDateInstance(1, locale);
        this.b = new SimpleDateFormat("yyyy-MM-dd", locale);
    }

    public final String a(String str) {
        if (str == null) {
            return null;
        }
        try {
            Date date = this.a.parse(str);
            if (date != null) {
                return this.b.format(date);
            }
            return null;
        } catch (ParseException unused) {
            return null;
        }
    }

    public final String b(Calendar calendar, int i, int i2, int i3) {
        calendar.set(i3, i2, i);
        return this.a.format(calendar.getTime());
    }

    public final int c(String str, String str2, String str3) {
        try {
            Date date = this.a.parse(str);
            if (date == null) {
                return 2;
            }
            int length = str2.length();
            SimpleDateFormat simpleDateFormat = this.b;
            return ((length == 0 || date.compareTo(simpleDateFormat.parse(str2)) >= 0) && (str3.length() == 0 || date.compareTo(simpleDateFormat.parse(str3)) <= 0)) ? 1 : 3;
        } catch (ParseException unused) {
            return 2;
        }
    }
}
