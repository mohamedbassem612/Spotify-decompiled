package io.reactivex.rxjava3.internal.operators.observable;

import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.Observer;
import io.reactivex.rxjava3.exceptions.Exceptions;
import io.reactivex.rxjava3.functions.Supplier;
import io.reactivex.rxjava3.internal.observers.DeferredScalarDisposable;
import io.reactivex.rxjava3.internal.util.ExceptionHelper;
import io.reactivex.rxjava3.plugins.RxJavaPlugins;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class ObservableFromCallable<T> extends Observable<T> implements Supplier<T> {
    public final Callable a;

    public ObservableFromCallable(Callable callable) {
        this.a = callable;
    }

    @Override // io.reactivex.rxjava3.functions.Supplier
    public final Object get() throws Exception {
        Object objCall = this.a.call();
        if (objCall == null) {
            throw ExceptionHelper.b("The Callable returned a null value.");
        }
        Throwable th = ExceptionHelper.a;
        return objCall;
    }

    @Override // io.reactivex.rxjava3.core.Observable
    public final void subscribeActual(Observer observer) {
        DeferredScalarDisposable deferredScalarDisposable = new DeferredScalarDisposable(observer);
        observer.onSubscribe(deferredScalarDisposable);
        if (deferredScalarDisposable.isDisposed()) {
            return;
        }
        try {
            Object objCall = this.a.call();
            if (objCall == null) {
                throw ExceptionHelper.b("Callable returned a null value.");
            }
            Throwable th = ExceptionHelper.a;
            deferredScalarDisposable.b(objCall);
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
