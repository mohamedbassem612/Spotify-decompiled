package p;

import java.util.Locale;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class lf8 {
    public String a = null;
    public Boolean b = null;

    public static String a(String str, Object[] objArr) {
        return String.format(Locale.ROOT, str, objArr);
    }

    public cge1 b() {
        String str = this.a;
        return new cge1(Executors.defaultThreadFactory(), str, str != null ? new AtomicLong(0L) : null, this.b);
    }

    public void c() {
        this.b = Boolean.TRUE;
    }

    public void d() {
        Locale locale = Locale.ROOT;
        this.a = "heartbeat-thread-%d";
    }
}
