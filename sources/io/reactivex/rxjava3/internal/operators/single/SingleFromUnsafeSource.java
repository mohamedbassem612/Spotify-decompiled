package io.reactivex.rxjava3.internal.operators.single;

import io.reactivex.rxjava3.core.Single;
import io.reactivex.rxjava3.core.SingleObserver;
import io.reactivex.rxjava3.core.SingleSource;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class SingleFromUnsafeSource<T> extends Single<T> {
    public final SingleSource a;

    public SingleFromUnsafeSource(SingleSource singleSource) {
        this.a = singleSource;
    }

    public final void subscribeActual(SingleObserver singleObserver) {
        this.a.subscribe(singleObserver);
    }
}
