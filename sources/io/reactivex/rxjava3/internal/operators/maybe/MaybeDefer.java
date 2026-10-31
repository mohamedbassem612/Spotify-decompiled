package io.reactivex.rxjava3.internal.operators.maybe;

import io.reactivex.rxjava3.core.Maybe;
import io.reactivex.rxjava3.core.MaybeObserver;
import io.reactivex.rxjava3.core.MaybeSource;
import io.reactivex.rxjava3.exceptions.Exceptions;
import io.reactivex.rxjava3.internal.disposables.EmptyDisposable;
import p.xf0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class MaybeDefer<T> extends Maybe<T> {
    public final xf0 a;

    public MaybeDefer(xf0 xf0Var) {
        this.a = xf0Var;
    }

    public final void i(MaybeObserver maybeObserver) {
        try {
            ((MaybeSource) this.a.get()).subscribe(maybeObserver);
        } catch (Throwable th) {
            Exceptions.a(th);
            maybeObserver.onSubscribe(EmptyDisposable.a);
            maybeObserver.onError(th);
        }
    }
}
