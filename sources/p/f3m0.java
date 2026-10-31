package p;

import android.util.Log;
import java.io.Closeable;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public abstract class f3m0 implements Closeable, hac0 {
    public static final xot e = new xot("MobileVisionBase", "");
    public final AtomicBoolean a = new AtomicBoolean(false);
    public final lce1 b;
    public final dp5 c;
    public final Executor d;

    public f3m0(lce1 lce1Var, Executor executor) {
        this.b = lce1Var;
        dp5 dp5Var = new dp5((byte) 8);
        this.c = dp5Var;
        this.d = executor;
        lce1Var.b.incrementAndGet();
        lce1Var.a(executor, a3n.d, (y1t0) dp5Var.b).m(avw0.X);
    }

    public static void c() {
        String str;
        xot xotVar = e;
        if (!Log.isLoggable(xotVar.b, 6) || (str = xotVar.c) == null) {
            return;
        }
        str.concat("Error preloading model resource");
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    @n5q0(k8c0.ON_DESTROY)
    public synchronized void close() {
        boolean z = true;
        if (this.a.getAndSet(true)) {
            return;
        }
        this.c.e();
        lce1 lce1Var = this.b;
        Executor executor = this.d;
        if (lce1Var.b.get() <= 0) {
            z = false;
        }
        zod.w(z);
        lce1Var.a.p(new sjj1((Object) lce1Var, (Object) new bsd1(), (byte) 15), executor);
    }
}
