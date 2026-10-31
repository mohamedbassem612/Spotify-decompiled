package p;

import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public abstract class jsd1 {
    public static final String a = fyo1.q();
    public static final long b = fyo1.t(100000, "kotlinx.coroutines.scheduler.resolution.ns");
    public static final int c;
    public static final int d;
    public static final long e;
    public static final wdu0 f;

    static {
        int iL = fyo1.l();
        if (iL < 2) {
            iL = 2;
        }
        c = fyo1.s(iL, 8, "kotlinx.coroutines.scheduler.core.pool.size");
        d = fyo1.s(2097150, 4, "kotlinx.coroutines.scheduler.max.pool.size");
        e = TimeUnit.SECONDS.toNanos(fyo1.t(60L, "kotlinx.coroutines.scheduler.keep.alive.sec"));
        f = wdu0.Y0;
    }
}
