package io.reactivex.rxjava3.internal.schedulers;

import io.reactivex.rxjava3.plugins.RxJavaPlugins;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class ScheduledDirectPeriodicTask extends AbstractDirectTask implements Runnable {
    @Override // java.lang.Runnable
    public final void run() {
        this.c = Thread.currentThread();
        try {
            this.a.run();
            this.c = null;
        } catch (Throwable th) {
            dispose();
            this.c = null;
            RxJavaPlugins.b(th);
            throw th;
        }
    }
}
