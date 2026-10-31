package io.reactivex.rxjava3.internal.operators.single;

import io.reactivex.rxjava3.core.Notification;
import io.reactivex.rxjava3.core.Single;
import io.reactivex.rxjava3.core.SingleObserver;
import io.reactivex.rxjava3.internal.operators.mixed.MaterializeSingleObserver;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class SingleMaterialize<T> extends Single<Notification<T>> {
    public final Single a;

    public SingleMaterialize(Single single) {
        this.a = single;
    }

    public final void subscribeActual(SingleObserver singleObserver) {
        this.a.subscribe(new MaterializeSingleObserver(singleObserver));
    }
}
