package io.reactivex.rxjava3.internal.functions;

import io.reactivex.rxjava3.functions.Predicate;
import java.util.Objects;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class Functions$EqualsPredicate<T> implements Predicate<T> {
    public final Object a;

    public Functions$EqualsPredicate(Object obj) {
        this.a = obj;
    }

    public final boolean test(Object obj) {
        return Objects.equals(obj, this.a);
    }
}
