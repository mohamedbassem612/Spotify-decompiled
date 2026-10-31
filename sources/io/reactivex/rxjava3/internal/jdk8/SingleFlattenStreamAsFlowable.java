package io.reactivex.rxjava3.internal.jdk8;

import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.Single;
import io.reactivex.rxjava3.functions.Function;
import p.gnc1;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class SingleFlattenStreamAsFlowable<T, R> extends Flowable<R> {
    public final Single b;
    public final Function c;

    public SingleFlattenStreamAsFlowable(Single single, Function function) {
        this.b = single;
        this.c = function;
    }

    public final void V(gnc1 gnc1Var) {
        this.b.subscribe(new MaybeFlattenStreamAsFlowable$FlattenStreamMultiObserver(gnc1Var, this.c));
    }
}
