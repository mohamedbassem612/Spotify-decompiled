package io.reactivex.rxjava3.internal.operators.maybe;

import io.reactivex.rxjava3.core.Maybe;
import io.reactivex.rxjava3.core.MaybeObserver;
import io.reactivex.rxjava3.internal.disposables.EmptyDisposable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class MaybeError<T> extends Maybe<T> {
    public final Throwable a;

    public MaybeError(Throwable th) {
        this.a = th;
    }

    public final void i(MaybeObserver maybeObserver) {
        maybeObserver.onSubscribe(EmptyDisposable.a);
        maybeObserver.onError(this.a);
    }
}
