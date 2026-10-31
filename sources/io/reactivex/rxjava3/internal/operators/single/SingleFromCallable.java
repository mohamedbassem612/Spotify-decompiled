package io.reactivex.rxjava3.internal.operators.single;

import io.reactivex.rxjava3.core.Single;
import io.reactivex.rxjava3.core.SingleObserver;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.exceptions.Exceptions;
import io.reactivex.rxjava3.internal.functions.Functions;
import io.reactivex.rxjava3.plugins.RxJavaPlugins;
import java.util.Objects;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class SingleFromCallable<T> extends Single<T> {
    public final Callable a;

    public SingleFromCallable(Callable callable) {
        this.a = callable;
    }

    @Override // io.reactivex.rxjava3.core.Single
    public final void subscribeActual(SingleObserver singleObserver) {
        Disposable disposableE = Disposable.e(Functions.b);
        singleObserver.onSubscribe(disposableE);
        if (disposableE.isDisposed()) {
            return;
        }
        try {
            Object objCall = this.a.call();
            Objects.requireNonNull(objCall, "The callable returned a null value");
            if (disposableE.isDisposed()) {
                return;
            }
            singleObserver.onSuccess(objCall);
        } catch (Throwable th) {
            Exceptions.a(th);
            if (disposableE.isDisposed()) {
                RxJavaPlugins.b(th);
            } else {
                singleObserver.onError(th);
            }
        }
    }
}
