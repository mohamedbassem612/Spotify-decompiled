package p;

import java.util.concurrent.Callable;
import java.util.concurrent.Executors;
import java.util.concurrent.RunnableFuture;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.LockSupport;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class ogp1 extends nfp1 implements RunnableFuture {
    public volatile mgp1 h;

    public ogp1(Callable callable) {
        this.h = new mgp1(this, callable);
    }

    public static ogp1 k(Runnable runnable, Object obj) {
        return new ogp1(Executors.callable(runnable, obj));
    }

    @Override // p.nfp1
    public final void e() {
        mgp1 mgp1Var;
        Object obj = this.a;
        if ((obj instanceof jfp1) && ((jfp1) obj).a && (mgp1Var = this.h) != null) {
            Runnable runnable = mgp1.d;
            ghp0 ghp0Var = mgp1.c;
            Runnable runnable2 = (Runnable) mgp1Var.get();
            if (runnable2 instanceof Thread) {
                zfp1 zfp1Var = new zfp1(mgp1Var);
                zfp1Var.a(Thread.currentThread());
                if (mgp1Var.compareAndSet(runnable2, zfp1Var)) {
                    try {
                        Thread thread = (Thread) runnable2;
                        thread.interrupt();
                        if (((Runnable) mgp1Var.getAndSet(ghp0Var)) == runnable) {
                            LockSupport.unpark(thread);
                        }
                    } catch (Throwable th) {
                        if (((Runnable) mgp1Var.getAndSet(ghp0Var)) == runnable) {
                            LockSupport.unpark((Thread) runnable2);
                        }
                        throw th;
                    }
                }
            }
        }
        this.h = null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p.nfp1
    public final String f() {
        mgp1 mgp1Var = this.h;
        if (mgp1Var != null) {
            String string = mgp1Var.toString();
            return l1d.q(new StringBuilder(string.length() + 7), "task=[", string, "]");
        }
        if (!(this instanceof ScheduledFuture)) {
            return null;
        }
        long delay = ((ScheduledFuture) this).getDelay(TimeUnit.MILLISECONDS);
        StringBuilder sb = new StringBuilder(String.valueOf(delay).length() + 21);
        sb.append("remaining delay=[");
        sb.append(delay);
        sb.append(" ms]");
        return sb.toString();
    }

    @Override // java.util.concurrent.RunnableFuture, java.lang.Runnable
    public final void run() {
        mgp1 mgp1Var = this.h;
        if (mgp1Var != null) {
            mgp1Var.run();
        }
        this.h = null;
    }
}
