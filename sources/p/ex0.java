package p;

import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.internal.operators.flowable.FlowableMap;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class ex0 implements xpw {
    public final FlowableMap a;
    public final Flowable b;
    public final w9u0 c;
    public final j62 d;
    public final poy0 e;
    public final psw f;
    public final eih1 g;

    public ex0(FlowableMap flowableMap, Flowable flowable, Flowable flowable2, w9u0 w9u0Var, j62 j62Var) {
        this.a = flowableMap;
        this.b = flowable;
        this.c = w9u0Var;
        this.d = j62Var;
        this.e = d4o1.g(Flowable.e(flowableMap, flowable2, flowable, uh21.d), di0.c1, e3.Z0, new j2(this, (byte) 23), 8);
        j2i j2iVar = p3i.b;
        ien0 ien0Var = qsw.a;
        this.f = new psw(j2iVar, (byte) 0);
        this.g = new eih1();
    }

    public final rqw a() {
        return this.g;
    }

    public final jsw c() {
        return this.f;
    }

    public final mqw getBehavior() {
        return this.e;
    }
}
