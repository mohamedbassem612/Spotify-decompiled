package p;

import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.functions.Consumer;
import io.reactivex.rxjava3.processors.BehaviorProcessor;
import java.util.Collections;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class ri11 implements wpw {
    public static final Set P0 = Collections.singleton("mft_disallow");
    public final dma1 X;
    public final Flowable a;
    public final Flowable b;
    public final w9u0 c;
    public final Consumer d;
    public final kvs0 e;
    public final u4q0 f;
    public final a1r0 g;
    public final qzh h;
    public final jn4 i;
    public final rh11 t;
    public final BehaviorProcessor Y = BehaviorProcessor.e0(Boolean.FALSE);
    public final poy0 Z = y3o1.X(new pi11(this, 0), fd11.W0, h211.t, new pi11(this, 1), 8);
    public final kjv N0 = lnn1.h(fd11.X0, fd11.Y0, new pi11(this, 2));
    public final ia00 O0 = n3o1.q(this).a(rw01.W0, rw01.X0);

    public ri11(Flowable flowable, Flowable flowable2, w9u0 w9u0Var, Consumer consumer, kvs0 kvs0Var, u4q0 u4q0Var, a1r0 a1r0Var, qzh qzhVar, jn4 jn4Var, rh11 rh11Var, dma1 dma1Var) {
        this.a = flowable;
        this.b = flowable2;
        this.c = w9u0Var;
        this.d = consumer;
        this.e = kvs0Var;
        this.f = u4q0Var;
        this.g = a1r0Var;
        this.h = qzhVar;
        this.i = jn4Var;
        this.t = rh11Var;
        this.X = dma1Var;
    }

    public final rqw a() {
        return this.O0;
    }

    public final rsw c() {
        return this.N0;
    }

    public final mqw getBehavior() {
        return this.Z;
    }
}
