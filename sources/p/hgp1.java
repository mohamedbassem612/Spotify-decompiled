package p;

import java.util.concurrent.Delayed;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class hgp1 extends xio1 implements ScheduledFuture, n8d0, Future {
    public final nfp1 c;
    public final ScheduledFuture d;

    public hgp1(nfp1 nfp1Var, ScheduledFuture scheduledFuture) {
        super((byte) 17);
        this.c = nfp1Var;
        this.d = scheduledFuture;
    }

    public final void b(Runnable runnable, Executor executor) {
        this.c.b(runnable, executor);
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z) {
        boolean zCancel = this.c.cancel(z);
        if (zCancel) {
            this.d.cancel(z);
        }
        return zCancel;
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Delayed delayed) {
        return this.d.compareTo(delayed);
    }

    @Override // java.util.concurrent.Future
    public final Object get() {
        return this.c.get();
    }

    @Override // java.util.concurrent.Delayed
    public final long getDelay(TimeUnit timeUnit) {
        return this.d.getDelay(timeUnit);
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.c.a instanceof jfp1;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return this.c.isDone();
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j, TimeUnit timeUnit) {
        return this.c.get(j, timeUnit);
    }
}
