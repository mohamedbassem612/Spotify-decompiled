package p;

import android.util.Log;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class nse0 {
    public static final SimpleDateFormat g = new SimpleDateFormat("MM-dd HH:mm:ss.SSS", Locale.US);
    public static final Date h = new Date();
    public char a;
    public String b;
    public String c;
    public Throwable d;
    public long e;
    public long f;

    public final void a(StringBuilder sb) {
        sb.append(this.a);
        sb.append('\t');
        Date date = h;
        date.setTime(this.e);
        SimpleDateFormat simpleDateFormat = g;
        synchronized (simpleDateFormat) {
            sb.append(simpleDateFormat.format(date));
        }
        sb.append('\t');
        sb.append(this.b);
        sb.append('\t');
        sb.append(this.c);
        if (this.d != null) {
            sb.append(' ');
            sb.append(Log.getStackTraceString(this.d));
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(256);
        a(sb);
        return sb.toString();
    }
}
