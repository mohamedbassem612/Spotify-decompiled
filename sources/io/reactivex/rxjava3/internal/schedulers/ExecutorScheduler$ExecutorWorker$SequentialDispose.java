package io.reactivex.rxjava3.internal.schedulers;

import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import io.reactivex.rxjava3.internal.disposables.SequentialDisposable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class ExecutorScheduler$ExecutorWorker$SequentialDispose implements Runnable {
    public final SequentialDisposable a;
    public final Runnable b;
    public final /* synthetic */ ExecutorScheduler.ExecutorWorker c;

    public ExecutorScheduler$ExecutorWorker$SequentialDispose(ExecutorScheduler.ExecutorWorker executorWorker, SequentialDisposable sequentialDisposable, Runnable runnable) {
        this.c = executorWorker;
        this.a = sequentialDisposable;
        this.b = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        DisposableHelper.c(this.a, this.c.a(this.b));
    }
}
