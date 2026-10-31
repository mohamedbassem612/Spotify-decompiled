package p;

import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class zxn1 implements gyn1 {
    public static final pin1 b = new pin1(zxn1.class);
    public final Object a;

    public zxn1(Object obj) {
        this.a = obj;
    }

    public final void c(Runnable runnable, Executor executor) {
        if (executor == null) {
            bhn0.i("Executor was null.");
            return;
        }
        try {
            executor.execute(runnable);
        } catch (Exception e) {
            b.a().logp(Level.SEVERE, "com.google.common.util.concurrent.ImmediateFuture", "addListener", gvg.h("RuntimeException while executing runnable ", runnable.toString(), " with executor ", String.valueOf(executor)), (Throwable) e);
        }
    }

    public final boolean cancel(boolean z) {
        return false;
    }

    public final Object get(long j, TimeUnit timeUnit) {
        timeUnit.getClass();
        return this.a;
    }

    public final boolean isCancelled() {
        return false;
    }

    public final boolean isDone() {
        return true;
    }

    public final String toString() {
        return super.toString() + "[status=SUCCESS, result=[" + this.a.toString() + "]]";
    }

    public final Object get() {
        return this.a;
    }
}
