package io.reactivex.rxjava3.core;

import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.plugins.RxJavaPlugins;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class Scheduler$PeriodicDirectTask implements Disposable, Runnable {
    public final Runnable a;
    public final Scheduler.Worker b;
    public volatile boolean c;

    public Scheduler$PeriodicDirectTask(Runnable runnable, Scheduler.Worker worker) {
        this.a = runnable;
        this.b = worker;
    }

    public void dispose() {
        this.c = true;
        this.b.dispose();
    }

    public boolean isDisposed() {
        return this.c;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.c) {
            return;
        }
        try {
            this.a.run();
        } catch (Throwable th) {
            dispose();
            RxJavaPlugins.b(th);
            throw th;
        }
    }
}
