package p;

import io.reactivex.rxjava3.core.Scheduler;
import io.reactivex.rxjava3.disposables.Disposable;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class egu extends Scheduler {
    public static final /* synthetic */ AtomicLongFieldUpdater f = AtomicLongFieldUpdater.newUpdater(egu.class, "workerCounter$volatile");
    public final q8n c;
    public final j0d1 d;
    public final llm e;
    private volatile /* synthetic */ long workerCounter$volatile;

    public egu(q8n q8nVar) {
        this.c = q8nVar;
        j0d1 j0d1VarB = guo1.B();
        this.d = j0d1VarB;
        this.e = smo1.e(ha71.A(j0d1VarB, q8nVar));
        this.workerCounter$volatile = 1L;
    }

    @Override // io.reactivex.rxjava3.core.Scheduler
    public final Scheduler.Worker b() {
        return new dgu(f.getAndIncrement(this), this.c, this.d);
    }

    @Override // io.reactivex.rxjava3.core.Scheduler
    public final Disposable d(Runnable runnable, long j, TimeUnit timeUnit) {
        return w0h1.F(this.e, runnable, timeUnit.toMillis(j), new j6(this, (byte) 24));
    }

    public final String toString() {
        return this.c.toString();
    }
}
