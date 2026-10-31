package io.reactivex.rxjava3.internal.operators.observable;

import io.reactivex.rxjava3.core.CompletableSource;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.Observer;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class ObservableFromCompletable<T> extends Observable<T> {
    public final CompletableSource a;

    public ObservableFromCompletable(CompletableSource completableSource) {
        this.a = completableSource;
    }

    public final void subscribeActual(Observer observer) {
        this.a.subscribe(new FromCompletableObserver(observer));
    }
}
