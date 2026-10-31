package io.reactivex.rxjava3.internal.operators.single;

import io.reactivex.rxjava3.core.Single;
import io.reactivex.rxjava3.core.SingleObserver;
import io.reactivex.rxjava3.core.SingleSource;
import io.reactivex.rxjava3.exceptions.Exceptions;
import io.reactivex.rxjava3.functions.Supplier;
import io.reactivex.rxjava3.internal.disposables.EmptyDisposable;
import java.util.Objects;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class SingleDefer<T> extends Single<T> {
    public final Supplier a;

    public SingleDefer(Supplier supplier) {
        this.a = supplier;
    }

    @Override // io.reactivex.rxjava3.core.Single
    public final void subscribeActual(SingleObserver singleObserver) {
        try {
            Object obj = this.a.get();
            Objects.requireNonNull(obj, "The singleSupplier returned a null SingleSource");
            ((SingleSource) obj).subscribe(singleObserver);
        } catch (Throwable th) {
            Exceptions.a(th);
            EmptyDisposable.f(th, singleObserver);
        }
    }
}
