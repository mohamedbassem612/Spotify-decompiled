package io.reactivex.rxjava3.internal.operators.observable;

import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.Observer;
import io.reactivex.rxjava3.functions.Action;
import io.reactivex.rxjava3.functions.Consumer;
import io.reactivex.rxjava3.internal.observers.DisposableLambdaObserver;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class ObservableDoOnLifecycle<T> extends AbstractObservableWithUpstream<T, T> {
    public final Consumer b;
    public final Action c;

    public ObservableDoOnLifecycle(Observable observable, Consumer consumer, Action action) {
        super(observable);
        this.b = consumer;
        this.c = action;
    }

    @Override // io.reactivex.rxjava3.core.Observable
    public final void subscribeActual(Observer observer) {
        this.a.subscribe(new DisposableLambdaObserver(observer, this.b, this.c));
    }
}
