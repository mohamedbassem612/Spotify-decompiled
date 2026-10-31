package io.reactivex.rxjava3.internal.operators.maybe;

import io.reactivex.rxjava3.core.Maybe;
import io.reactivex.rxjava3.core.MaybeObserver;
import io.reactivex.rxjava3.functions.Predicate;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class MaybeOnErrorComplete<T> extends AbstractMaybeWithUpstream<T, T> {
    public final Predicate b;

    public MaybeOnErrorComplete(Maybe maybe, Predicate predicate) {
        super(maybe);
        this.b = predicate;
    }

    public final void i(MaybeObserver maybeObserver) {
        ((AbstractMaybeWithUpstream) this).a.subscribe(new OnErrorCompleteMultiObserver(maybeObserver, this.b));
    }
}
