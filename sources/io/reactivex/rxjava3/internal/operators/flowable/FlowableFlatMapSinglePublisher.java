package io.reactivex.rxjava3.internal.operators.flowable;

import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.functions.Function;
import p.gnc1;
import p.moy0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class FlowableFlatMapSinglePublisher<T, R> extends Flowable<R> {
    public final moy0 b;
    public final Function c;
    public final boolean d;
    public final int e = Integer.MAX_VALUE;

    public FlowableFlatMapSinglePublisher(moy0 moy0Var, Function function, boolean z) {
        this.b = moy0Var;
        this.c = function;
        this.d = z;
    }

    public final void V(gnc1 gnc1Var) {
        this.b.subscribe(new FlowableFlatMapSingle.FlatMapSingleSubscriber(this.e, this.c, gnc1Var, this.d));
    }
}
