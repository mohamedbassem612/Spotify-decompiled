package io.reactivex.rxjava3.disposables;

import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class SerialDisposable implements Disposable {
    public final AtomicReference a = new AtomicReference();

    public final void a(Disposable disposable) {
        DisposableHelper.f(this.a, disposable);
    }

    @Override // io.reactivex.rxjava3.disposables.Disposable
    public void dispose() {
        DisposableHelper.a(this.a);
    }

    @Override // io.reactivex.rxjava3.disposables.Disposable
    public boolean isDisposed() {
        return DisposableHelper.b((Disposable) this.a.get());
    }
}
