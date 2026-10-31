package io.reactivex.rxjava3.internal.functions;

import io.reactivex.rxjava3.functions.Function;
import io.reactivex.rxjava3.functions.Function9;
import p.bhn0;
import p.c221;
import p.f781;
import p.g781;
import p.kk3;
import p.q781;
import p.spq0;
import p.v1v;
import p.vum1;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class Functions$Array9Func<T1, T2, T3, T4, T5, T6, T7, T8, T9, R> implements Function<Object[], R> {
    public Functions$Array9Func(Function9 function9) {
    }

    public final Object apply(Object obj) {
        Object[] objArr = (Object[]) obj;
        if (objArr.length != 9) {
            bhn0.e(objArr.length, "Array of size 9 expected but got ");
            return null;
        }
        return new f781((q781) objArr[0], (v1v) objArr[1], (vum1) objArr[2], (kk3) objArr[3], ((Boolean) objArr[4]).booleanValue(), (c221) objArr[5], (g781) objArr[6], (spq0) objArr[7], ((Boolean) objArr[8]).booleanValue());
    }
}
