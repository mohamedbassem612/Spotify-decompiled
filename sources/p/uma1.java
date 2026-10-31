package p;

import j$.util.DesugarTimeZone;
import java.text.SimpleDateFormat;
import java.util.Locale;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class uma1 {
    public static final Pattern d = Pattern.compile("\\[(\\d+)\\]");
    public static final Pattern e = Pattern.compile(":");
    public final yqg a;
    public final ajg b;
    public final SimpleDateFormat c;

    public uma1(yqg yqgVar, ajg ajgVar) {
        this.a = yqgVar;
        this.b = ajgVar;
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss'Z'", Locale.ENGLISH);
        this.c = simpleDateFormat;
        simpleDateFormat.setTimeZone(DesugarTimeZone.getTimeZone("UTC"));
    }
}
