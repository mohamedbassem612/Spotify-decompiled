package p;

import android.os.Looper;
import java.util.Locale;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class mon1 {
    public static final Object i = new Object();
    public final pue0 a;
    public final int b;
    public final String c;
    public gon1 g;
    public seg1 h;
    public long e = -1;
    public long f = 0;
    public final jim0 d = new jim0(Looper.getMainLooper(), (byte) 5);

    public mon1(long j, String str) {
        this.b = (int) j;
        this.c = str;
        this.a = new pue0("RequestTracker", str);
    }

    public final void a(long j, gon1 gon1Var) {
        gon1 gon1Var2;
        long j2;
        long j3;
        long jCurrentTimeMillis = System.currentTimeMillis();
        Object obj = i;
        synchronized (obj) {
            gon1Var2 = this.g;
            j2 = this.e;
            j3 = this.f;
            this.e = j;
            this.g = gon1Var;
            this.f = jCurrentTimeMillis;
        }
        if (gon1Var2 != null) {
            gon1Var2.g(j2, j3, jCurrentTimeMillis, this.c);
        }
        synchronized (obj) {
            try {
                Runnable runnable = this.h;
                if (runnable != null) {
                    this.d.removeCallbacks(runnable);
                }
                Runnable seg1Var = new seg1(this, (byte) 15);
                this.h = seg1Var;
                this.d.postDelayed(seg1Var, this.b);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final boolean b() {
        boolean z;
        synchronized (i) {
            z = this.e != -1;
        }
        return z;
    }

    public final boolean c(long j) {
        boolean z;
        synchronized (i) {
            long j2 = this.e;
            z = false;
            if (j2 != -1 && j2 == j) {
                z = true;
            }
        }
        return z;
    }

    public final void d(long j, int i2, den1 den1Var) {
        synchronized (i) {
            try {
                if (c(j)) {
                    Locale locale = Locale.ROOT;
                    g("request " + j + " completed", i2, den1Var);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void e() {
        f(2002);
    }

    public final boolean f(int i2) {
        synchronized (i) {
            try {
                if (!b()) {
                    return false;
                }
                Locale locale = Locale.ROOT;
                g("clearing request " + this.e, i2, null);
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void g(String str, int i2, Object obj) {
        this.a.a(str, new Object[0]);
        Object obj2 = i;
        synchronized (obj2) {
            try {
                if (this.g != null) {
                    long jCurrentTimeMillis = System.currentTimeMillis();
                    gon1 gon1Var = this.g;
                    zod.s(gon1Var);
                    gon1Var.h(this.c, this.e, i2, obj, this.f, jCurrentTimeMillis);
                }
                this.e = -1L;
                this.g = null;
                synchronized (obj2) {
                    try {
                        Runnable runnable = this.h;
                        if (runnable != null) {
                            this.d.removeCallbacks(runnable);
                            this.h = null;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
