package p;

import com.spotify.base.java.logging.Logger;
import io.reactivex.rxjava3.disposables.CompositeDisposable;
import io.reactivex.rxjava3.disposables.Disposable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.NoSuchElementException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class aos {
    public static final AtomicInteger m = new AtomicInteger();
    public zq5 a;
    public final s24 b;
    public final j380 c;
    public final boolean d;
    public final int e;
    public final oh61 f;
    public final mj61 g;
    public final String h;
    public final String i;
    public final e6j0 j;
    public final xig k;
    public volatile byte l;

    public aos(s24 s24Var, oh61 oh61Var, gg11 gg11Var, mj61 mj61Var, xig xigVar) {
        int iIncrementAndGet = m.incrementAndGet();
        this.e = iIncrementAndGet;
        this.l = (byte) 0;
        this.c = j380.c(gg11Var);
        this.b = s24Var;
        this.f = oh61Var;
        this.d = true;
        this.j = new e6j0((byte) 10);
        this.h = "app_to_app";
        this.i = "app_remote";
        this.k = xigVar;
        this.g = mj61Var;
        mj61Var.getClass();
        mj61Var.a.put(Integer.valueOf(iIncrementAndGet), new qnt(this));
        mj61Var.b.onNext(new ArrayList(mj61Var.a.values()));
    }

    public final void a(int i, int i2, Object obj) {
        if (this.l == 1) {
            s24 s24Var = this.b;
            s24Var.getClass();
            s24Var.a0(new Object[]{36, Integer.valueOf(i), Integer.valueOf(i2), cv5.a, Collections.EMPTY_LIST, obj});
        }
    }

    public final void b(String str) {
        synchronized (this) {
            try {
                if (this.l == 2) {
                    return;
                }
                this.l = (byte) 2;
                oh61 oh61Var = this.f;
                Disposable disposable = oh61Var.t;
                if (disposable != null) {
                    if (!disposable.isDisposed()) {
                        oh61Var.t.dispose();
                    }
                    oh61Var.t = null;
                }
                rl1 rl1Var = oh61Var.s;
                if (rl1Var != null) {
                    rl1Var.t();
                }
                i090 i090Var = oh61Var.d;
                i090Var.d = true;
                synchronized (i090Var.c) {
                    i090Var.c.clear();
                }
                uw0 uw0Var = oh61Var.r;
                if (uw0Var != null) {
                    ((irb1) uw0Var.b).b.c();
                    for (xca xcaVar : ((HashMap) uw0Var.f).values()) {
                        synchronized (xcaVar) {
                            xcaVar.a.clear();
                            xcaVar.d();
                        }
                    }
                }
                this.b.a0(new Object[]{6, new es5("App service stopping"), str});
                s24 s24Var = this.b;
                ExecutorService executorService = (ExecutorService) s24Var.d;
                ((CompositeDisposable) s24Var.h).g();
                aij0 aij0Var = (aij0) s24Var.c;
                aij0Var.c = null;
                p1f0 p1f0Var = (p1f0) s24Var.e;
                if (p1f0Var != null) {
                    ((Disposable) p1f0Var.h).dispose();
                }
                executorService.shutdown();
                try {
                    if (!executorService.awaitTermination(500L, TimeUnit.MILLISECONDS)) {
                        executorService.shutdownNow();
                    }
                } catch (InterruptedException unused) {
                    executorService.shutdownNow();
                }
                try {
                    aij0Var.b.getBinder().unlinkToDeath(aij0Var, 0);
                } catch (NoSuchElementException unused2) {
                    Logger.d("Trying to close a session that has never been started.", new Object[0]);
                    aij0Var.binderDied();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
