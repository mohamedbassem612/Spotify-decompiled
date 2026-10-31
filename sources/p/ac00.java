package p;

import android.os.SystemClock;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class ac00 {
    public static final ac00 a = new ac00();

    public static long a() {
        return System.currentTimeMillis();
    }

    public static long b() {
        return SystemClock.elapsedRealtime();
    }
}
