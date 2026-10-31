package io.reactivex.rxjava3.internal.operators.completable;

import io.reactivex.rxjava3.core.Completable;
import io.reactivex.rxjava3.core.CompletableObserver;
import io.reactivex.rxjava3.exceptions.Exceptions;
import io.reactivex.rxjava3.functions.Supplier;
import io.reactivex.rxjava3.internal.disposables.EmptyDisposable;
import java.util.Objects;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class CompletableErrorSupplier extends Completable {
    public final Supplier a;

    public CompletableErrorSupplier(Supplier supplier) {
        this.a = supplier;
    }

    public final void r(CompletableObserver completableObserver) {
        try {
            Object obj = this.a.get();
            Objects.requireNonNull(obj, "The error returned is null");
            th = (Throwable) obj;
        } catch (Throwable th) {
            th = th;
            Exceptions.a(th);
        }
        completableObserver.onSubscribe(EmptyDisposable.a);
        completableObserver.onError(th);
    }
}
