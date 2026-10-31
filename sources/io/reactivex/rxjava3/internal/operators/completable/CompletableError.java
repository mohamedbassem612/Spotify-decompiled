package io.reactivex.rxjava3.internal.operators.completable;

import io.reactivex.rxjava3.core.Completable;
import io.reactivex.rxjava3.core.CompletableObserver;
import io.reactivex.rxjava3.internal.disposables.EmptyDisposable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class CompletableError extends Completable {
    public final Throwable a;

    public CompletableError(Throwable th) {
        this.a = th;
    }

    @Override // io.reactivex.rxjava3.core.Completable
    public final void r(CompletableObserver completableObserver) {
        completableObserver.onSubscribe(EmptyDisposable.a);
        completableObserver.onError(this.a);
    }
}
