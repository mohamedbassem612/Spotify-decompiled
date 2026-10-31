package p;

import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.internal.operators.flowable.FlowableDistinctUntilChanged;
import io.reactivex.rxjava3.internal.operators.flowable.FlowableMap;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class tw0 implements wpw {
    public final FlowableDistinctUntilChanged a;
    public final w9u0 b;
    public final j62 c;
    public final poy0 d;
    public final nsw e = jch0.j(fp0.h);
    public final eih1 f = new eih1();

    public tw0(FlowableMap flowableMap, FlowableDistinctUntilChanged flowableDistinctUntilChanged, Flowable flowable, w9u0 w9u0Var, j62 j62Var) {
        this.a = flowableDistinctUntilChanged;
        this.b = w9u0Var;
        this.c = j62Var;
        this.d = y3o1.Y(Flowable.h(flowableMap, flowable, u321.e), di0.Z0, e3.Y0, new j2(this, (byte) 21), 8);
    }

    public final rqw a() {
        return this.f;
    }

    public final rsw c() {
        return this.e;
    }

    public final mqw getBehavior() {
        return this.d;
    }
}
