package p;

import java.lang.ref.WeakReference;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class z9p1 implements gyn1 {
    public final WeakReference a;
    public final w7p1 b = new w7p1(this);

    public z9p1(f1p1 f1p1Var) {
        this.a = new WeakReference(f1p1Var);
    }

    public final void a(Throwable th) {
        jbo1 jbo1Var = new jbo1(th);
        qgo1 qgo1Var = fzo1.f;
        w7p1 w7p1Var = this.b;
        if (qgo1Var.D(w7p1Var, null, jbo1Var)) {
            fzo1.d(w7p1Var);
        }
    }

    public final void c(Runnable runnable, Executor executor) {
        this.b.c(runnable, executor);
    }

    public final boolean cancel(boolean z) {
        f1p1 f1p1Var = (f1p1) this.a.get();
        boolean zCancel = this.b.cancel(z);
        if (!zCancel || f1p1Var == null) {
            return zCancel;
        }
        f1p1Var.a = null;
        f1p1Var.b = null;
        f1p1Var.c.i(null);
        return true;
    }

    public final Object get() {
        return this.b.get();
    }

    public final boolean isCancelled() {
        return this.b.a instanceof z1o1;
    }

    public final boolean isDone() {
        return this.b.isDone();
    }

    public final String toString() {
        return this.b.toString();
    }

    public final Object get(long j, TimeUnit timeUnit) {
        return this.b.get(j, timeUnit);
    }
}
