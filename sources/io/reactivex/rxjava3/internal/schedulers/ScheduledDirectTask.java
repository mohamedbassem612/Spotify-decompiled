package io.reactivex.rxjava3.internal.schedulers;

import io.reactivex.rxjava3.plugins.RxJavaPlugins;
import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class ScheduledDirectTask extends AbstractDirectTask implements Callable<Void> {
    @Override // java.util.concurrent.Callable
    public final Void call() {
        FutureTask futureTask = AbstractDirectTask.d;
        this.c = Thread.currentThread();
        try {
            try {
                this.a.run();
                return null;
            } finally {
                lazySet(futureTask);
                this.c = null;
            }
        } catch (Throwable th) {
            RxJavaPlugins.b(th);
            throw th;
        }
    }
}
