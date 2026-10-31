package io.reactivex.rxjava3.internal.operators.observable;

import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.Observer;
import io.reactivex.rxjava3.operators.ScalarSupplier;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class ObservableJust<T> extends Observable<T> implements ScalarSupplier<T> {
    public final Object a;

    public ObservableJust(Object obj) {
        this.a = obj;
    }

    @Override // io.reactivex.rxjava3.functions.Supplier
    public final Object get() {
        return this.a;
    }

    @Override // io.reactivex.rxjava3.core.Observable
    public final void subscribeActual(Observer observer) {
        ObservableScalarXMap.ScalarDisposable scalarDisposable = new ObservableScalarXMap.ScalarDisposable(observer, this.a);
        observer.onSubscribe(scalarDisposable);
        scalarDisposable.run();
    }
}
