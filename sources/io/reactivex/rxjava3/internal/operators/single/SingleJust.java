package io.reactivex.rxjava3.internal.operators.single;

import io.reactivex.rxjava3.core.Single;
import io.reactivex.rxjava3.core.SingleObserver;
import io.reactivex.rxjava3.internal.disposables.EmptyDisposable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class SingleJust<T> extends Single<T> {
    public final Object a;

    public SingleJust(Object obj) {
        this.a = obj;
    }

    @Override // io.reactivex.rxjava3.core.Single
    public final void subscribeActual(SingleObserver singleObserver) {
        singleObserver.onSubscribe(EmptyDisposable.a);
        singleObserver.onSuccess(this.a);
    }
}
