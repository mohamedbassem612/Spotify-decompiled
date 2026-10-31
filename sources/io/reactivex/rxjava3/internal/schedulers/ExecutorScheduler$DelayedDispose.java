package io.reactivex.rxjava3.internal.schedulers;

import io.reactivex.rxjava3.internal.disposables.DisposableHelper;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class ExecutorScheduler$DelayedDispose implements Runnable {
    public final ExecutorScheduler$DelayedRunnable a;
    public final /* synthetic */ ExecutorScheduler b;

    public ExecutorScheduler$DelayedDispose(ExecutorScheduler executorScheduler, ExecutorScheduler$DelayedRunnable executorScheduler$DelayedRunnable) {
        this.b = executorScheduler;
        this.a = executorScheduler$DelayedRunnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ExecutorScheduler$DelayedRunnable executorScheduler$DelayedRunnable = this.a;
        DisposableHelper.c(executorScheduler$DelayedRunnable.b, this.b.c(executorScheduler$DelayedRunnable));
    }
}
