package p;

import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.functions.Consumer;
import io.reactivex.rxjava3.processors.BehaviorProcessor;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class qo51 implements wpw {
    public final Flowable a;
    public final Flowable b;
    public final w9u0 c;
    public final Consumer d;
    public final jn4 e;
    public final qzh f;
    public final dma1 g;
    public final BehaviorProcessor h = BehaviorProcessor.e0(Boolean.FALSE);
    public final poy0 i = y3o1.X(new no51(this, (byte) 0), th51.Q0, jh31.c1, new no51(this, (byte) 1), 8);
    public final kjv t = lnn1.h(th51.R0, th51.S0, new no51(this, (byte) 2));
    public final ia00 X = n3o1.q(this).a(v451.Z0, v451.a1);

    public qo51(Flowable flowable, Flowable flowable2, w9u0 w9u0Var, Consumer consumer, jn4 jn4Var, qzh qzhVar, dma1 dma1Var) {
        this.a = flowable;
        this.b = flowable2;
        this.c = w9u0Var;
        this.d = consumer;
        this.e = jn4Var;
        this.f = qzhVar;
        this.g = dma1Var;
    }

    public final rqw a() {
        return this.X;
    }

    public final rsw c() {
        return this.t;
    }

    public final mqw getBehavior() {
        return this.i;
    }
}
