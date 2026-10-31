package io.reactivex.rxjava3.internal.operators.single;

import io.reactivex.rxjava3.functions.Function;
import java.util.Objects;

/* JADX INFO: Add missing generic type declarations: [R, T] */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class SingleZipIterable$SingletonArrayFunc<R, T> implements Function<T, R> {
    public final /* synthetic */ SingleZipIterable a;

    public SingleZipIterable$SingletonArrayFunc(SingleZipIterable singleZipIterable) {
        this.a = singleZipIterable;
    }

    public final Object apply(Object obj) {
        Object objApply = this.a.b.apply(new Object[]{obj});
        Objects.requireNonNull(objApply, "The zipper returned a null value");
        return objApply;
    }
}
