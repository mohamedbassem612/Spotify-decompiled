package io.reactivex.rxjava3.core;

import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import io.reactivex.rxjava3.internal.disposables.SequentialDisposable;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class Scheduler$Worker$PeriodicTask implements Runnable {
    public final Runnable a;
    public final SequentialDisposable b;
    public final long c;
    public long d;
    public long e;
    public long f;
    public final /* synthetic */ Scheduler.Worker g;

    public Scheduler$Worker$PeriodicTask(Scheduler.Worker worker, long j, Runnable runnable, long j2, SequentialDisposable sequentialDisposable, long j3) {
        this.g = worker;
        this.a = runnable;
        this.b = sequentialDisposable;
        this.c = j3;
        this.e = j2;
        this.f = j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        long j;
        this.a.run();
        SequentialDisposable sequentialDisposable = this.b;
        if (sequentialDisposable.isDisposed()) {
            return;
        }
        TimeUnit timeUnit = TimeUnit.NANOSECONDS;
        long jA = Scheduler.a(timeUnit);
        long j2 = Scheduler.b;
        long j3 = jA + j2;
        long j4 = this.e;
        long j5 = this.c;
        if (j3 < j4 || jA >= j4 + j5 + j2) {
            j = jA + j5;
            long j6 = this.d + 1;
            this.d = j6;
            this.f = j - (j5 * j6);
        } else {
            long j7 = this.f;
            long j8 = this.d + 1;
            this.d = j8;
            j = (j8 * j5) + j7;
        }
        this.e = jA;
        DisposableHelper.c(sequentialDisposable, this.g.b(this, j - jA, timeUnit));
    }
}
