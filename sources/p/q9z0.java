package p;

import io.reactivex.rxjava3.core.BackpressureStrategy;
import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.Observable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class q9z0 implements xpw {
    public final xrn0 a;
    public final vqv0 b;
    public final unr c;
    public final aor d;
    public final jtl1 e;
    public final acz0 f;
    public final js20 g;
    public final u7h1 h;
    public final psw i;

    public q9z0(Flowable flowable, Observable observable, xrn0 xrn0Var, vqv0 vqv0Var, unr unrVar, aor aorVar, jtl1 jtl1Var, acz0 acz0Var) {
        this.a = xrn0Var;
        this.b = vqv0Var;
        this.c = unrVar;
        this.d = aorVar;
        this.e = jtl1Var;
        this.f = acz0Var;
        Flowable flowableH = Flowable.h(flowable, observable.map(e4x0.d).toFlowable(BackpressureStrategy.d), new m4c(this, (byte) 21));
        vbm[] vbmVarArr = q601.a;
        this.g = x3p1.m(new kge(flowableH), ucy0.d1, new nsm0(2, this, q9z0.class, "toState", "toState(Lcom/spotify/nowplayingqueue/elements/header/QueueHeaderElement$Props;Lcom/spotify/nowplayingqueue/elements/header/QueueHeaderElement$ExternalState;)Lcom/spotify/nowplayingqueue/elements/header/QueueHeaderElement$State;", 0, (byte) 13), (o8n) null, new hox0(this, (byte) 27), 8);
        this.h = eth.a0((vu30) null, new f2z0(this, (byte) 6), 1);
        j2i j2iVar = new j2i(-709338191, new zyy0(this, (byte) 5), true);
        ien0 ien0Var = qsw.a;
        this.i = new psw(j2iVar, (byte) 0);
    }

    public final rqw a() {
        return this.h;
    }

    public final jsw c() {
        return this.i;
    }

    public final mqw getBehavior() {
        return this.g;
    }
}
