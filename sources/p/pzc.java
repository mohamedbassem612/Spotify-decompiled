package p;

import java.lang.ref.WeakReference;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class pzc implements n8d0 {
    public final WeakReference a;
    public final ozc b = new ozc(this);

    public pzc(mzc mzcVar) {
        this.a = new WeakReference(mzcVar);
    }

    public final boolean a(Throwable th) {
        return this.b.m(th);
    }

    @Override // p.n8d0
    public final void b(Runnable runnable, Executor executor) {
        this.b.b(runnable, executor);
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z) {
        mzc mzcVar = (mzc) this.a.get();
        boolean zCancel = this.b.cancel(z);
        if (zCancel && mzcVar != null) {
            mzcVar.a = null;
            mzcVar.b = null;
            mzcVar.c.l(null);
        }
        return zCancel;
    }

    @Override // java.util.concurrent.Future
    public final Object get() {
        return this.b.get();
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.b.a instanceof l9;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return this.b.isDone();
    }

    public final String toString() {
        return this.b.toString();
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j, TimeUnit timeUnit) {
        return this.b.get(j, timeUnit);
    }
}
