package io.reactivex.rxjava3.internal.operators.observable;

import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.Observer;
import io.reactivex.rxjava3.exceptions.Exceptions;
import io.reactivex.rxjava3.functions.Supplier;
import io.reactivex.rxjava3.internal.observers.DeferredScalarDisposable;
import io.reactivex.rxjava3.internal.util.ExceptionHelper;
import io.reactivex.rxjava3.plugins.RxJavaPlugins;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class ObservableFromSupplier<T> extends Observable<T> implements Supplier<T> {
    public final Supplier a;

    public ObservableFromSupplier(Supplier supplier) {
        this.a = supplier;
    }

    public final Object get() {
        Object obj = this.a.get();
        if (obj == null) {
            throw ExceptionHelper.b("The supplier returned a null value.");
        }
        Throwable th = ExceptionHelper.a;
        return obj;
    }

    public final void subscribeActual(Observer observer) {
        DeferredScalarDisposable deferredScalarDisposable = new DeferredScalarDisposable(observer);
        observer.onSubscribe(deferredScalarDisposable);
        if (deferredScalarDisposable.isDisposed()) {
            return;
        }
        try {
            Object obj = this.a.get();
            if (obj == null) {
                throw ExceptionHelper.b("Supplier returned a null value.");
            }
            Throwable th = ExceptionHelper.a;
            deferredScalarDisposable.b(obj);
        } catch (Throwable th2) {
            Exceptions.a(th2);
            if (deferredScalarDisposable.isDisposed()) {
                RxJavaPlugins.b(th2);
            } else {
                observer.onError(th2);
            }
        }
    }
}
