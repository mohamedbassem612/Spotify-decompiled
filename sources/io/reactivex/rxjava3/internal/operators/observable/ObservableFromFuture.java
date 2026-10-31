package io.reactivex.rxjava3.internal.operators.observable;

import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.Observer;
import io.reactivex.rxjava3.exceptions.Exceptions;
import io.reactivex.rxjava3.internal.observers.DeferredScalarDisposable;
import io.reactivex.rxjava3.internal.util.ExceptionHelper;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class ObservableFromFuture<T> extends Observable<T> {
    public final Future a;
    public final long b;
    public final TimeUnit c;

    public ObservableFromFuture(Future future, long j, TimeUnit timeUnit) {
        this.a = future;
        this.b = j;
        this.c = timeUnit;
    }

    public final void subscribeActual(Observer observer) {
        DeferredScalarDisposable deferredScalarDisposable = new DeferredScalarDisposable(observer);
        observer.onSubscribe(deferredScalarDisposable);
        if (deferredScalarDisposable.isDisposed()) {
            return;
        }
        try {
            TimeUnit timeUnit = this.c;
            Future future = this.a;
            Object obj = timeUnit != null ? future.get(this.b, timeUnit) : future.get();
            if (obj == null) {
                throw ExceptionHelper.b("Future returned a null value.");
            }
            Throwable th = ExceptionHelper.a;
            deferredScalarDisposable.b(obj);
        } catch (Throwable th2) {
            Exceptions.a(th2);
            if (deferredScalarDisposable.isDisposed()) {
                return;
            }
            observer.onError(th2);
        }
    }
}
