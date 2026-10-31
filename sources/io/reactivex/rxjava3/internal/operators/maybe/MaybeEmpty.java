package io.reactivex.rxjava3.internal.operators.maybe;

import io.reactivex.rxjava3.core.Maybe;
import io.reactivex.rxjava3.operators.ScalarSupplier;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class MaybeEmpty extends Maybe<Object> implements ScalarSupplier<Object> {
    public static final MaybeEmpty a = new MaybeEmpty();

    @Override // io.reactivex.rxjava3.functions.Supplier
    public final Object get() {
        return null;
    }
}
