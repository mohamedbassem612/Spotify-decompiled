package io.reactivex.rxjava3.internal.operators.completable;

import io.reactivex.rxjava3.core.Completable;
import io.reactivex.rxjava3.core.CompletableObserver;
import io.reactivex.rxjava3.core.CompletableSource;
import io.reactivex.rxjava3.exceptions.Exceptions;
import io.reactivex.rxjava3.functions.Supplier;
import io.reactivex.rxjava3.internal.disposables.EmptyDisposable;
import java.util.Objects;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class CompletableDefer extends Completable {
    public final Supplier a;

    public CompletableDefer(Supplier supplier) {
        this.a = supplier;
    }

    @Override // io.reactivex.rxjava3.core.Completable
    public final void r(CompletableObserver completableObserver) {
        try {
            Object obj = this.a.get();
            Objects.requireNonNull(obj, "The completableSupplier returned a null CompletableSource");
            ((CompletableSource) obj).subscribe(completableObserver);
        } catch (Throwable th) {
            Exceptions.a(th);
            completableObserver.onSubscribe(EmptyDisposable.a);
            completableObserver.onError(th);
        }
    }
}
