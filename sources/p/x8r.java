package p;

import android.os.SystemClock;
import java.util.LinkedHashMap;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public abstract class x8r {
    public static final LinkedHashMap a = new LinkedHashMap();

    static {
        SystemClock.elapsedRealtime();
    }

    public static synchronized void a() {
        synchronized (x8r.class) {
        }
    }

    public static synchronized void b() {
        a.clear();
        SystemClock.elapsedRealtime();
    }
}
