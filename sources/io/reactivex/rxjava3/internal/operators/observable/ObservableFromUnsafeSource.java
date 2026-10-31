package io.reactivex.rxjava3.internal.operators.observable;

import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.ObservableSource;
import io.reactivex.rxjava3.core.Observer;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class ObservableFromUnsafeSource<T> extends Observable<T> {
    public final ObservableSource a;

    public ObservableFromUnsafeSource(ObservableSource observableSource) {
        this.a = observableSource;
    }

    public final void subscribeActual(Observer observer) {
        this.a.subscribe(observer);
    }
}
