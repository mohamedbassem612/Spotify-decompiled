package p;

import android.os.SystemClock;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class tl21 {
    public final double a;
    public final double b;
    public final long c;
    public final long d;
    public final int e;
    public final ArrayBlockingQueue f;
    public final ThreadPoolExecutor g;
    public final iog1 h;
    public final rok0 i;
    public int j;
    public long k;

    public tl21(iog1 iog1Var, jm61 jm61Var, rok0 rok0Var) {
        double d = jm61Var.d;
        double d2 = jm61Var.e;
        long j = ((long) jm61Var.f) * 1000;
        this.a = d;
        this.b = d2;
        this.c = j;
        this.h = iog1Var;
        this.i = rok0Var;
        this.d = SystemClock.elapsedRealtime();
        int i = (int) d;
        this.e = i;
        ArrayBlockingQueue arrayBlockingQueue = new ArrayBlockingQueue(i);
        this.f = arrayBlockingQueue;
        this.g = new ThreadPoolExecutor(1, 1, 0L, TimeUnit.MILLISECONDS, arrayBlockingQueue);
        this.j = 0;
        this.k = 0L;
    }

    public final int a() {
        if (this.k == 0) {
            this.k = System.currentTimeMillis();
        }
        int iCurrentTimeMillis = (int) ((System.currentTimeMillis() - this.k) / this.c);
        int size = this.f.size();
        int i = this.j;
        int iMin = size == this.e ? Math.min(100, i + iCurrentTimeMillis) : Math.max(0, i - iCurrentTimeMillis);
        if (this.j != iMin) {
            this.j = iMin;
            this.k = System.currentTimeMillis();
        }
        return iMin;
    }

    public final void b(vy8 vy8Var, bsd1 bsd1Var) {
        ws10.Z.c();
        this.h.a(new r09(null, vy8Var.a(), xnw0.c), new uws(SystemClock.elapsedRealtime() - this.d < 2000, this, bsd1Var, vy8Var));
    }
}
