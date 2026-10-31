package io.reactivex.rxjava3.internal.operators.completable;

import io.reactivex.rxjava3.core.Completable;
import io.reactivex.rxjava3.core.CompletableObserver;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.exceptions.Exceptions;
import io.reactivex.rxjava3.internal.functions.Functions;
import io.reactivex.rxjava3.plugins.RxJavaPlugins;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class CompletableFromCallable extends Completable {
    public final Callable a;

    public CompletableFromCallable(Callable callable) {
        this.a = callable;
    }

    @Override // io.reactivex.rxjava3.core.Completable
    public final void r(CompletableObserver completableObserver) {
        Disposable disposableE = Disposable.e(Functions.b);
        completableObserver.onSubscribe(disposableE);
        try {
            this.a.call();
            if (disposableE.isDisposed()) {
                return;
            }
            completableObserver.onComplete();
        } catch (Throwable th) {
            Exceptions.a(th);
            if (disposableE.isDisposed()) {
                RxJavaPlugins.b(th);
            } else {
                completableObserver.onError(th);
            }
        }
    }
}
