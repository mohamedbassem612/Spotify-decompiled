package io.reactivex.rxjava3.internal.operators.single;

import io.reactivex.rxjava3.core.Single;
import io.reactivex.rxjava3.core.SingleObserver;
import io.reactivex.rxjava3.internal.disposables.EmptyDisposable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class SingleNever extends Single<Object> {
    public static final SingleNever a = new SingleNever();

    private SingleNever() {
    }

    @Override // io.reactivex.rxjava3.core.Single
    public final void subscribeActual(SingleObserver<? super Object> singleObserver) {
        singleObserver.onSubscribe(EmptyDisposable.b);
    }
}
