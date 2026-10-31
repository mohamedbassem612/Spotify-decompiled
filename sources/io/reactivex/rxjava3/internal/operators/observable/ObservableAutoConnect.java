package io.reactivex.rxjava3.internal.operators.observable;

import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.Observer;
import io.reactivex.rxjava3.functions.Consumer;
import io.reactivex.rxjava3.observables.ConnectableObservable;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class ObservableAutoConnect<T> extends Observable<T> {
    public final ConnectableObservable a;
    public final boolean b;
    public final Consumer c;
    public final AtomicInteger d = new AtomicInteger();

    /* JADX WARN: Multi-variable type inference failed */
    public ObservableAutoConnect(ConnectableObservable connectableObservable, int i, Consumer consumer) {
        this.a = connectableObservable;
        this.b = i;
        this.c = consumer;
    }

    @Override // io.reactivex.rxjava3.core.Observable
    public final void subscribeActual(Observer observer) {
        ConnectableObservable connectableObservable = this.a;
        connectableObservable.subscribe(observer);
        if (this.d.incrementAndGet() == this.b) {
            connectableObservable.c(this.c);
        }
    }
}
