package io.reactivex.rxjava3.internal.operators.maybe;

import io.reactivex.rxjava3.core.Maybe;
import io.reactivex.rxjava3.core.MaybeObserver;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.exceptions.Exceptions;
import io.reactivex.rxjava3.internal.functions.Functions;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class MaybeFromFuture<T> extends Maybe<T> {
    public final FutureTask a;

    public MaybeFromFuture(FutureTask futureTask) {
        this.a = futureTask;
    }

    @Override // io.reactivex.rxjava3.core.Maybe
    public final void i(MaybeObserver maybeObserver) {
        Disposable disposableE = Disposable.e(Functions.b);
        maybeObserver.onSubscribe(disposableE);
        if (disposableE.isDisposed()) {
            return;
        }
        try {
            Object obj = this.a.get();
            if (disposableE.isDisposed()) {
                return;
            }
            if (obj == null) {
                maybeObserver.onComplete();
            } else {
                maybeObserver.onSuccess(obj);
            }
        } catch (Throwable th) {
            th = th;
            Exceptions.a(th);
            if (th instanceof ExecutionException) {
                th = th.getCause();
            }
            Exceptions.a(th);
            if (disposableE.isDisposed()) {
                return;
            }
            maybeObserver.onError(th);
        }
    }
}
