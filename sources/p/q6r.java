package p;

import j$.util.DesugarTimeZone;
import java.text.SimpleDateFormat;
import java.util.Locale;
import java.util.TimeZone;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class q6r {
    public final yqg a;
    public final SimpleDateFormat b;

    public q6r(Locale locale, yqg yqgVar, e0u e0uVar) {
        this.a = yqgVar;
        TimeZone timeZoneG = yqgVar.g();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("h:mm a", locale);
        simpleDateFormat.setTimeZone(timeZoneG);
        TimeZone timeZoneG2 = yqgVar.g();
        SimpleDateFormat simpleDateFormat2 = new SimpleDateFormat("HH:mm", locale);
        simpleDateFormat2.setTimeZone(timeZoneG2);
        this.b = s5h1.a[e0uVar.ordinal()] == 1 ? simpleDateFormat2 : simpleDateFormat;
    }

    public q6r(yqg yqgVar) {
        this.a = yqgVar;
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss'Z'", Locale.getDefault());
        simpleDateFormat.setTimeZone(DesugarTimeZone.getTimeZone("UTC"));
        this.b = simpleDateFormat;
    }
}
