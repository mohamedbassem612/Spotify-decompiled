package p;

import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.internal.operators.flowable.FlowableMap;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class w691 implements wpw {
    public final w9u0 a;
    public final qzh b;
    public final poy0 c;
    public final kjv d = lnn1.h(er81.T0, er81.U0, new u691(this, (byte) 1));
    public final ia00 e = n3o1.q(this).a(c781.e1, v691.b);

    public w691(FlowableMap flowableMap, Flowable flowable, Flowable flowable2, w9u0 w9u0Var, qzh qzhVar) {
        this.a = w9u0Var;
        this.b = qzhVar;
        this.c = y3o1.Y(Flowable.e(flowableMap, flowable2, flowable, n9x0.Z), er81.S0, yd81.P0, new u691(this, (byte) 0), 8);
    }

    public final rqw a() {
        return this.e;
    }

    public final rsw c() {
        return this.d;
    }

    public final mqw getBehavior() {
        return this.c;
    }
}
