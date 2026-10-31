package io.reactivex.rxjava3.internal.operators.observable;

import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.ObservableSource;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
abstract class AbstractObservableWithUpstream<T, U> extends Observable<U> {
    public final ObservableSource a;

    public AbstractObservableWithUpstream(ObservableSource observableSource) {
        this.a = observableSource;
    }
}
