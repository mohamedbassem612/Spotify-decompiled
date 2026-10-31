package io.reactivex.rxjava3.internal.operators.observable;

import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class ObservableDebounceTimed$DebounceEmitter<T> extends AtomicReference<Disposable> implements Runnable, Disposable {
    public final Object a;
    public final long b;
    public final ObservableDebounceTimed.DebounceTimedObserver c;
    public final AtomicBoolean d = new AtomicBoolean();

    public ObservableDebounceTimed$DebounceEmitter(Object obj, long j, ObservableDebounceTimed.DebounceTimedObserver debounceTimedObserver) {
        this.a = obj;
        this.b = j;
        this.c = debounceTimedObserver;
    }

    public final void a(Disposable disposable) {
        DisposableHelper.c(this, disposable);
    }

    public void dispose() {
        DisposableHelper.a(this);
    }

    public boolean isDisposed() {
        return get() == DisposableHelper.a;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.d.compareAndSet(false, true)) {
            ObservableDebounceTimed.DebounceTimedObserver debounceTimedObserver = this.c;
            long j = this.b;
            Object obj = this.a;
            if (j == debounceTimedObserver.g) {
                debounceTimedObserver.a.onNext(obj);
                dispose();
            }
        }
    }
}
