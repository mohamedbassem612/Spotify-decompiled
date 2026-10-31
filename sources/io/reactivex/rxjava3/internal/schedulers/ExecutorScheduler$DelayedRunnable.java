package io.reactivex.rxjava3.internal.schedulers;

import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import io.reactivex.rxjava3.internal.disposables.SequentialDisposable;
import io.reactivex.rxjava3.plugins.RxJavaPlugins;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class ExecutorScheduler$DelayedRunnable extends AtomicReference<Runnable> implements Runnable, Disposable {
    public final SequentialDisposable a;
    public final SequentialDisposable b;

    public ExecutorScheduler$DelayedRunnable(Runnable runnable) {
        super(runnable);
        this.a = new SequentialDisposable();
        this.b = new SequentialDisposable();
    }

    public void dispose() {
        if (getAndSet(null) != null) {
            this.a.dispose();
            this.b.dispose();
        }
    }

    public boolean isDisposed() {
        return get() == null;
    }

    @Override // java.lang.Runnable
    public final void run() {
        SequentialDisposable sequentialDisposable = this.b;
        SequentialDisposable sequentialDisposable2 = this.a;
        DisposableHelper disposableHelper = DisposableHelper.a;
        Runnable runnable = get();
        if (runnable != null) {
            try {
                try {
                    runnable.run();
                } finally {
                    lazySet(null);
                    sequentialDisposable2.lazySet(disposableHelper);
                    sequentialDisposable.lazySet(disposableHelper);
                }
            } catch (Throwable th) {
                RxJavaPlugins.b(th);
                throw th;
            }
        }
    }
}
