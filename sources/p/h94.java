package p;

import android.os.SystemClock;
import java.util.Calendar;
import java.util.TimeZone;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class h94 implements yqg {
    @Override // p.yqg
    public final long a() {
        return SystemClock.elapsedRealtimeNanos();
    }

    @Override // p.yqg
    public final long b() {
        return System.currentTimeMillis();
    }

    @Override // p.yqg
    public final long c() {
        return SystemClock.uptimeMillis();
    }

    @Override // p.yqg
    public final Calendar d() {
        return Calendar.getInstance();
    }

    @Override // p.yqg
    public final long e() {
        return SystemClock.elapsedRealtime();
    }

    @Override // p.yqg
    public final void f() {
        SystemClock.sleep(100L);
    }

    @Override // p.yqg
    public final TimeZone g() {
        return TimeZone.getDefault();
    }
}
