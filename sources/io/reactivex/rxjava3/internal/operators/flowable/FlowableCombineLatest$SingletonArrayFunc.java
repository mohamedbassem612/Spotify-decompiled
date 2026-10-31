package io.reactivex.rxjava3.internal.operators.flowable;

import io.reactivex.rxjava3.functions.Function;

/* JADX INFO: Add missing generic type declarations: [R, T] */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class FlowableCombineLatest$SingletonArrayFunc<R, T> implements Function<T, R> {
    public final /* synthetic */ FlowableCombineLatest a;

    public FlowableCombineLatest$SingletonArrayFunc(FlowableCombineLatest flowableCombineLatest) {
        this.a = flowableCombineLatest;
    }

    public final Object apply(Object obj) {
        return this.a.d.apply(new Object[]{obj});
    }
}
