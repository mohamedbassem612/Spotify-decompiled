package p;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Handler;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class q930 implements z3x {
    public final Context a;
    public final o930 b;
    public final Object c = new Object();
    public Handler d;
    public ThreadPoolExecutor e;
    public ThreadPoolExecutor f;
    public who1 g;

    public q930(Context context, o930 o930Var) {
        o0c.p(context, "Context cannot be null");
        this.a = context.getApplicationContext();
        this.b = o930Var;
    }

    @Override // p.z3x
    public final void a(who1 who1Var) {
        synchronized (this.c) {
            this.g = who1Var;
        }
        synchronized (this.c) {
            try {
                if (this.g == null) {
                    return;
                }
                ThreadPoolExecutor threadPoolExecutor = this.e;
                if (threadPoolExecutor == null) {
                    ThreadPoolExecutor threadPoolExecutor2 = new ThreadPoolExecutor(0, 1, 15L, TimeUnit.SECONDS, (BlockingQueue<Runnable>) new LinkedBlockingDeque(), (ThreadFactory) new ask("emojiCompat", (byte) 0));
                    threadPoolExecutor2.allowCoreThreadTimeOut(true);
                    this.f = threadPoolExecutor2;
                    this.e = threadPoolExecutor2;
                    threadPoolExecutor = threadPoolExecutor2;
                }
                threadPoolExecutor.execute(new fss(this, (byte) 24));
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void b() {
        synchronized (this.c) {
            try {
                this.g = null;
                Handler handler = this.d;
                if (handler != null) {
                    handler.removeCallbacks(null);
                }
                this.d = null;
                ThreadPoolExecutor threadPoolExecutor = this.f;
                if (threadPoolExecutor != null) {
                    threadPoolExecutor.shutdown();
                }
                this.e = null;
                this.f = null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final oa30 c() {
        try {
            na30 na30VarE = pob.e(this.a, this.b);
            if (na30VarE.f() != 0) {
                throw new RuntimeException("fetchFonts failed (" + na30VarE.f() + ")");
            }
            oa30[] oa30VarArrD = na30VarE.d();
            if (oa30VarArrD != null && oa30VarArrD.length != 0) {
                return oa30VarArrD[0];
            }
            jah.g("fetchFonts failed (empty result)");
            return null;
        } catch (PackageManager.NameNotFoundException e) {
            bhn0.o("provider not found", e);
            return null;
        }
    }
}
