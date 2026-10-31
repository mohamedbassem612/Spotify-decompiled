package p;

import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.internal.operators.flowable.FlowableMap;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class hx0 implements wpw {
    public final FlowableMap a;
    public final Flowable b;
    public final w9u0 c;
    public final j62 d;
    public final qzh e;
    public final poy0 f;
    public final kjv g = lnn1.h(di0.e1, gx0.b, new fx0(this, (byte) 1));
    public final eih1 h = new eih1();

    public hx0(FlowableMap flowableMap, Flowable flowable, Flowable flowable2, w9u0 w9u0Var, j62 j62Var, qzh qzhVar) {
        this.a = flowableMap;
        this.b = flowable;
        this.c = w9u0Var;
        this.d = j62Var;
        this.e = qzhVar;
        this.f = y3o1.Y(Flowable.e(flowableMap, flowable2, flowable, j561.d), di0.d1, e3.a1, new fx0(this, (byte) 0), 8);
    }

    public final rqw a() {
        return this.h;
    }

    public final rsw c() {
        return this.g;
    }

    public final mqw getBehavior() {
        return this.f;
    }
}
