package io.reactivex.rxjava3.internal.operators.observable;

import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.Observer;
import io.reactivex.rxjava3.exceptions.Exceptions;
import io.reactivex.rxjava3.functions.Action;
import io.reactivex.rxjava3.functions.Supplier;
import io.reactivex.rxjava3.internal.fuseable.CancellableQueueFuseable;
import io.reactivex.rxjava3.plugins.RxJavaPlugins;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class ObservableFromAction<T> extends Observable<T> implements Supplier<T> {
    public final Action a;

    public ObservableFromAction(Action action) {
        this.a = action;
    }

    public final Object get() {
        this.a.run();
        return null;
    }

    public final void subscribeActual(Observer observer) {
        CancellableQueueFuseable cancellableQueueFuseable = new CancellableQueueFuseable();
        observer.onSubscribe(cancellableQueueFuseable);
        if (cancellableQueueFuseable.isDisposed()) {
            return;
        }
        try {
            this.a.run();
            if (cancellableQueueFuseable.isDisposed()) {
                return;
            }
            observer.onComplete();
        } catch (Throwable th) {
            Exceptions.a(th);
            if (cancellableQueueFuseable.isDisposed()) {
                RxJavaPlugins.b(th);
            } else {
                observer.onError(th);
            }
        }
    }
}
