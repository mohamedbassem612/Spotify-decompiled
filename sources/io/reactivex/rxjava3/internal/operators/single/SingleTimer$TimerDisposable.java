package io.reactivex.rxjava3.internal.operators.single;

import io.reactivex.rxjava3.core.SingleObserver;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class SingleTimer$TimerDisposable extends AtomicReference<Disposable> implements Disposable, Runnable {
    public final SingleObserver a;

    public SingleTimer$TimerDisposable(SingleObserver singleObserver) {
        this.a = singleObserver;
    }

    public final void a(Disposable disposable) {
        DisposableHelper.c(this, disposable);
    }

    public void dispose() {
        DisposableHelper.a(this);
    }

    public boolean isDisposed() {
        return DisposableHelper.b(get());
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.a.onSuccess(0L);
    }
}
