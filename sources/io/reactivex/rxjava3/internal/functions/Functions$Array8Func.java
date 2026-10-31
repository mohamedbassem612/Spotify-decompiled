package io.reactivex.rxjava3.internal.functions;

import io.reactivex.rxjava3.functions.Function;
import io.reactivex.rxjava3.functions.Function8;
import p.bhn0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class Functions$Array8Func<T1, T2, T3, T4, T5, T6, T7, T8, R> implements Function<Object[], R> {
    public final Function8 a;

    public Functions$Array8Func(Function8 function8) {
        this.a = function8;
    }

    public final Object apply(Object obj) {
        Object[] objArr = (Object[]) obj;
        if (objArr.length != 8) {
            bhn0.e(objArr.length, "Array of size 8 expected but got ");
            return null;
        }
        return this.a.b(objArr[0], objArr[1], objArr[2], objArr[3], objArr[4], objArr[5], objArr[6], objArr[7]);
    }
}
