package io.reactivex.rxjava3.internal.operators.maybe;

import io.reactivex.rxjava3.core.MaybeObserver;
import io.reactivex.rxjava3.core.MaybeSource;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class MaybeUnsafeCreate<T> extends AbstractMaybeWithUpstream<T, T> {
    public MaybeUnsafeCreate(MaybeSource maybeSource) {
        super(maybeSource);
    }

    public final void i(MaybeObserver maybeObserver) {
        ((AbstractMaybeWithUpstream) this).a.subscribe(maybeObserver);
    }
}
