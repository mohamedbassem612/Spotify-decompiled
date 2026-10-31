package io.reactivex.rxjava3.internal.operators.observable;

import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.Observer;
import io.reactivex.rxjava3.exceptions.Exceptions;
import io.reactivex.rxjava3.functions.Supplier;
import io.reactivex.rxjava3.internal.disposables.EmptyDisposable;
import io.reactivex.rxjava3.internal.util.ExceptionHelper;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class ObservableError<T> extends Observable<T> {
    public final Supplier a;

    public ObservableError(Supplier supplier) {
        this.a = supplier;
    }

    @Override // io.reactivex.rxjava3.core.Observable
    public final void subscribeActual(Observer observer) {
        try {
            Object obj = this.a.get();
            if (obj == null) {
                throw ExceptionHelper.b("Supplier returned a null Throwable.");
            }
            Throwable th = ExceptionHelper.a;
            th = (Throwable) obj;
            EmptyDisposable.c(th, observer);
        } catch (Throwable th2) {
            th = th2;
            Exceptions.a(th);
        }
    }
}
