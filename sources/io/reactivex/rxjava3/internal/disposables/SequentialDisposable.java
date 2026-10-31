package io.reactivex.rxjava3.internal.disposables;

import io.reactivex.rxjava3.disposables.Disposable;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class SequentialDisposable extends AtomicReference<Disposable> implements Disposable {
    public SequentialDisposable(SequentialDisposable sequentialDisposable) {
        lazySet(sequentialDisposable);
    }

    @Override // io.reactivex.rxjava3.disposables.Disposable
    public void dispose() {
        DisposableHelper.a(this);
    }

    @Override // io.reactivex.rxjava3.disposables.Disposable
    public boolean isDisposed() {
        return DisposableHelper.b(get());
    }

    public SequentialDisposable() {
    }
}
