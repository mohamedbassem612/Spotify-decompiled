package io.reactivex.rxjava3.internal.operators.mixed;

import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.functions.Function;
import io.reactivex.rxjava3.internal.util.ErrorMode;
import p.gnc1;
import p.moy0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class FlowableConcatMapSinglePublisher<T, R> extends Flowable<R> {
    public final moy0 b;
    public final Function c;
    public final ErrorMode d = ErrorMode.a;
    public final int e;

    public FlowableConcatMapSinglePublisher(moy0 moy0Var, Function function, int i) {
        this.b = moy0Var;
        this.c = function;
        this.e = i;
    }

    public final void V(gnc1 gnc1Var) {
        this.b.subscribe(new FlowableConcatMapSingle.ConcatMapSingleSubscriber(gnc1Var, this.c, this.e, this.d));
    }
}
