package p;

import io.reactivex.rxjava3.core.BackpressureStrategy;
import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.internal.operators.flowable.FlowableMap;
import io.reactivex.rxjava3.subjects.BehaviorSubject;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class bfe implements wpw {
    public static final yee X = new yee(true, true, false, "", sah.a(), ((Number) sah.a.getValue()).intValue(), sah.a());
    public final joe a;
    public final xee b;
    public final vz80 c;
    public final q8n d;
    public final mr4 e;
    public final a1r0 f;
    public final BehaviorSubject g;
    public final poy0 h;
    public final u7h1 i;
    public final kjv t;

    public bfe(joe joeVar, xee xeeVar, Flowable flowable, FlowableMap flowableMap, mr20 mr20Var, qzh qzhVar, vz80 vz80Var, q8n q8nVar, mr4 mr4Var, a1r0 a1r0Var) {
        this.a = joeVar;
        this.b = xeeVar;
        this.c = vz80Var;
        this.d = q8nVar;
        this.e = mr4Var;
        this.f = a1r0Var;
        BehaviorSubject behaviorSubjectG = BehaviorSubject.g(X);
        this.g = behaviorSubjectG;
        this.h = y3o1.Y(Flowable.g(behaviorSubjectG.toFlowable(BackpressureStrategy.d), flowableMap, flowable.j(mo9.i), yoi1.h(mr20Var, o6x.a), pzs0.O0), jzd.W0, wnb.Y0, new m4d(this, (byte) 17), 8);
        this.i = eth.a0((vu30) null, new dwd(this, (byte) 4), 1);
        this.t = lnn1.h(jzd.X0, jzd.Y0, new ih7(qzhVar, (byte) 1));
    }

    public final rqw a() {
        return this.i;
    }

    public final rsw c() {
        return this.t;
    }

    public final mqw getBehavior() {
        return this.h;
    }
}
