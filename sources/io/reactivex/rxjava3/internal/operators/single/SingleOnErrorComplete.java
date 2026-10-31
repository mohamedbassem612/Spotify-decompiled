package io.reactivex.rxjava3.internal.operators.single;

import io.reactivex.rxjava3.core.Maybe;
import io.reactivex.rxjava3.core.MaybeObserver;
import io.reactivex.rxjava3.core.Single;
import io.reactivex.rxjava3.functions.Predicate;
import io.reactivex.rxjava3.internal.operators.maybe.MaybeOnErrorComplete$OnErrorCompleteMultiObserver;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class SingleOnErrorComplete<T> extends Maybe<T> {
    public final Single a;
    public final Predicate b;

    public SingleOnErrorComplete(Single single, Predicate predicate) {
        this.a = single;
        this.b = predicate;
    }

    @Override // io.reactivex.rxjava3.core.Maybe
    public final void i(MaybeObserver maybeObserver) {
        this.a.subscribe(new MaybeOnErrorComplete$OnErrorCompleteMultiObserver(maybeObserver, this.b));
    }
}
