package p;

import android.icu.text.DateFormat;
import android.icu.text.DateTimePatternGenerator;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class o5r {
    public final Locale a;
    public final SimpleDateFormat b;
    public final DateFormat c;

    public o5r(Locale locale) {
        this.a = locale;
        this.b = new SimpleDateFormat(DateTimePatternGenerator.getInstance(locale).getBestPattern("d MMM yyyy"), locale);
        this.c = DateFormat.getDateInstance(1, locale);
    }

    public final String a(long j) {
        return this.b.format(new Date(j * 1000));
    }
}
