package io.reactivex.rxjava3.internal.operators.single;

import io.reactivex.rxjava3.core.Single;
import io.reactivex.rxjava3.core.SingleObserver;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.exceptions.Exceptions;
import io.reactivex.rxjava3.functions.Supplier;
import io.reactivex.rxjava3.internal.functions.Functions;
import io.reactivex.rxjava3.plugins.RxJavaPlugins;
import java.util.Objects;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class SingleFromSupplier<T> extends Single<T> {
    public final Supplier a;

    public SingleFromSupplier(Supplier supplier) {
        this.a = supplier;
    }

    public final void subscribeActual(SingleObserver singleObserver) {
        Disposable disposableE = Disposable.e(Functions.b);
        singleObserver.onSubscribe(disposableE);
        if (disposableE.isDisposed()) {
            return;
        }
        try {
            Object obj = this.a.get();
            Objects.requireNonNull(obj, "The supplier returned a null value");
            if (disposableE.isDisposed()) {
                return;
            }
            singleObserver.onSuccess(obj);
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
