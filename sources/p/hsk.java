package p;

import android.os.SystemClock;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class hsk {
    public final rdd1 a;
    public boolean b;

    public hsk() {
        this(rdd1.a);
    }

    public final synchronized void a() {
        while (!this.b) {
            this.a.getClass();
            wait();
        }
    }

    public final synchronized void b() {
        boolean z = false;
        while (!this.b) {
            try {
                this.a.getClass();
                wait();
            } catch (InterruptedException unused) {
                z = true;
            }
        }
        if (z) {
            Thread.currentThread().interrupt();
        }
    }

    public final synchronized boolean c(long j) {
        try {
            if (j <= 0) {
                return this.b;
            }
            this.a.getClass();
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            long j2 = j + jElapsedRealtime;
            if (j2 < jElapsedRealtime) {
                b();
            } else {
                boolean z = false;
                while (!this.b && jElapsedRealtime < j2) {
                    try {
                        this.a.getClass();
                        wait(j2 - jElapsedRealtime);
                    } catch (InterruptedException unused) {
                        z = true;
                    }
                    this.a.getClass();
                    jElapsedRealtime = SystemClock.elapsedRealtime();
                }
                if (z) {
                    Thread.currentThread().interrupt();
                }
            }
            return this.b;
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void d() {
        this.b = false;
    }

    public final synchronized boolean e() {
        return this.b;
    }

    public final synchronized boolean f() {
        if (this.b) {
            return false;
        }
        this.b = true;
        notifyAll();
        return true;
    }

    public hsk(rdd1 rdd1Var) {
        this.a = rdd1Var;
    }
}
