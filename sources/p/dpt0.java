package p;

import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.internal.operators.flowable.FlowableDistinctUntilChanged;
import io.reactivex.rxjava3.internal.operators.flowable.FlowableMap;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class dpt0 {
    public final Flowable a;
    public final FlowableMap b;
    public final Flowable c;
    public final w9u0 d;
    public final gn10 e;
    public final mnk0 f;
    public final FlowableDistinctUntilChanged g;
    public final pe h;
    public final qmr i;

    public dpt0(Flowable flowable, FlowableMap flowableMap, Flowable flowable2, w9u0 w9u0Var, gn10 gn10Var, mnk0 mnk0Var, FlowableDistinctUntilChanged flowableDistinctUntilChanged, pe peVar, qmr qmrVar) {
        this.a = flowable;
        this.b = flowableMap;
        this.c = flowable2;
        this.d = w9u0Var;
        this.e = gn10Var;
        this.f = mnk0Var;
        this.g = flowableDistinctUntilChanged;
        this.h = peVar;
        this.i = qmrVar;
    }

    public final dfm a() {
        return new dfm(this.d, this.e, this.b, this.c, this.a, this.g, this.h, this.i);
    }
}
