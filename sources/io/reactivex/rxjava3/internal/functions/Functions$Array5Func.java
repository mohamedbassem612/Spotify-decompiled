package io.reactivex.rxjava3.internal.functions;

import io.reactivex.rxjava3.functions.Function;
import io.reactivex.rxjava3.functions.Function5;
import p.bhn0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class Functions$Array5Func<T1, T2, T3, T4, T5, R> implements Function<Object[], R> {
    public final Function5 a;

    public Functions$Array5Func(Function5 function5) {
        this.a = function5;
    }

    public final Object apply(Object obj) {
        Object[] objArr = (Object[]) obj;
        if (objArr.length != 5) {
            bhn0.e(objArr.length, "Array of size 5 expected but got ");
            return null;
        }
        return this.a.d(objArr[0], objArr[1], objArr[2], objArr[3], objArr[4]);
    }
}
