package p;

import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.internal.operators.flowable.FlowableDistinctUntilChanged;
import io.reactivex.rxjava3.internal.operators.flowable.FlowableMap;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class qw0 implements xpw {
    public final FlowableDistinctUntilChanged a;
    public final w9u0 b;
    public final j62 c;
    public final poy0 d;
    public final psw e;
    public final eih1 f;

    public qw0(FlowableMap flowableMap, FlowableDistinctUntilChanged flowableDistinctUntilChanged, Flowable flowable, w9u0 w9u0Var, j62 j62Var) {
        this.a = flowableDistinctUntilChanged;
        this.b = w9u0Var;
        this.c = j62Var;
        this.d = d4o1.g(Flowable.h(flowableMap, flowable, s321.d), di0.Y0, e3.X0, new j2(this, (byte) 20), 8);
        j2i j2iVar = n3i.b;
        ien0 ien0Var = qsw.a;
        this.e = new psw(j2iVar, (byte) 0);
        this.f = new eih1();
    }

    public final rqw a() {
        return this.f;
    }

    public final jsw c() {
        return this.e;
    }

    public final mqw getBehavior() {
        return this.d;
    }
}
