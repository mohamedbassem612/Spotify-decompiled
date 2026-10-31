package io.reactivex.rxjava3.observables;

import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.functions.Consumer;
import io.reactivex.rxjava3.internal.functions.Functions;
import io.reactivex.rxjava3.internal.operators.observable.ObservableAutoConnect;
import io.reactivex.rxjava3.internal.operators.observable.ObservableRefCount;
import java.util.Objects;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public abstract class ConnectableObservable<T> extends Observable<T> {
    public final Observable a(int i) {
        Consumer consumer = Functions.d;
        Objects.requireNonNull(consumer, "connection is null");
        if (i > 0) {
            return new ObservableAutoConnect(this, i, consumer);
        }
        c(consumer);
        return this;
    }

    public abstract void c(Consumer consumer);

    public final ObservableRefCount f() {
        return new ObservableRefCount(this, 0L, TimeUnit.NANOSECONDS, null);
    }

    public abstract void g();
}
