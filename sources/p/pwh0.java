package p;

import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class pwh0 {
    public final Handler a = new Handler(Looper.getMainLooper());
    public final Runnable b;
    public long c;
    public long d;
    public boolean e;

    public pwh0(Runnable runnable) {
        this.b = runnable;
    }

    public final boolean a() {
        if (this.e) {
            long j = this.c;
            if (j > 0) {
                this.a.postDelayed(this.b, j);
            }
        }
        return this.e;
    }

    public final void b(long j, boolean z) {
        if (z) {
            long j2 = this.d;
            if (j2 - j >= 30000) {
                return;
            }
            this.c = Math.max(this.c, (j + 30000) - j2);
            this.e = true;
        }
    }

    public final void c() {
        this.c = 0L;
        this.e = false;
        this.d = SystemClock.elapsedRealtime();
        this.a.removeCallbacks(this.b);
    }
}
