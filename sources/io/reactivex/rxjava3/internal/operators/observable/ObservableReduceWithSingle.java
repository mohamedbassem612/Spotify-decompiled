package io.reactivex.rxjava3.internal.operators.observable;

import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.Single;
import io.reactivex.rxjava3.core.SingleObserver;
import io.reactivex.rxjava3.exceptions.Exceptions;
import io.reactivex.rxjava3.functions.BiFunction;
import io.reactivex.rxjava3.functions.Supplier;
import io.reactivex.rxjava3.internal.disposables.EmptyDisposable;
import java.util.Objects;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class ObservableReduceWithSingle<T, R> extends Single<R> {
    public final Observable a;
    public final Supplier b;
    public final BiFunction c;

    public ObservableReduceWithSingle(Observable observable, Supplier supplier, BiFunction biFunction) {
        this.a = observable;
        this.b = supplier;
        this.c = biFunction;
    }

    public final void subscribeActual(SingleObserver singleObserver) {
        try {
            Object obj = this.b.get();
            Objects.requireNonNull(obj, "The seedSupplier returned a null value");
            this.a.subscribe(new ObservableReduceSeedSingle.ReduceSeedObserver(singleObserver, this.c, obj));
        } catch (Throwable th) {
            Exceptions.a(th);
            EmptyDisposable.f(th, singleObserver);
        }
    }
}
