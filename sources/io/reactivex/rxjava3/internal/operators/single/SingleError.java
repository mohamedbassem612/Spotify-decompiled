package io.reactivex.rxjava3.internal.operators.single;

import io.reactivex.rxjava3.core.Single;
import io.reactivex.rxjava3.core.SingleObserver;
import io.reactivex.rxjava3.exceptions.Exceptions;
import io.reactivex.rxjava3.functions.Supplier;
import io.reactivex.rxjava3.internal.disposables.EmptyDisposable;
import io.reactivex.rxjava3.internal.util.ExceptionHelper;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class SingleError<T> extends Single<T> {
    public final Supplier a;

    public SingleError(Supplier supplier) {
        this.a = supplier;
    }

    @Override // io.reactivex.rxjava3.core.Single
    public final void subscribeActual(SingleObserver singleObserver) {
        try {
            Object obj = this.a.get();
            if (obj == null) {
                throw ExceptionHelper.b("Supplier returned a null Throwable.");
            }
            Throwable th = ExceptionHelper.a;
            th = (Throwable) obj;
            EmptyDisposable.f(th, singleObserver);
        } catch (Throwable th2) {
            th = th2;
            Exceptions.a(th);
        }
    }
}
