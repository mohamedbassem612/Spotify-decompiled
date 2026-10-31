package io.reactivex.rxjava3.internal.functions;

import io.reactivex.rxjava3.functions.BooleanSupplier;
import io.reactivex.rxjava3.functions.Predicate;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class Functions$BooleanSupplierPredicateReverse<T> implements Predicate<T> {
    public final BooleanSupplier a;

    public Functions$BooleanSupplierPredicateReverse(BooleanSupplier booleanSupplier) {
        this.a = booleanSupplier;
    }

    public final boolean test(Object obj) {
        return !this.a.a();
    }
}
