package p;

import io.reactivex.rxjava3.core.BackpressureStrategy;
import io.reactivex.rxjava3.core.Flowable;
import java.util.Collections;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class gj11 implements wpw {
    public static final Set X = Collections.singleton("mft_disallow");
    public final Flowable a;
    public final w9u0 b;
    public final yqg c;
    public final kvs0 d;
    public final rh11 e;
    public final a1r0 f;
    public final qzh g;
    public final poy0 h;
    public final nsw i = jch0.j(new fj11(this, (byte) 1));
    public final ia00 t = n3o1.q(this).a(rw01.a1, rw01.b1);

    public gj11(Flowable flowable, Flowable flowable2, w9u0 w9u0Var, yqg yqgVar, kvs0 kvs0Var, rh11 rh11Var, u4q0 u4q0Var, a1r0 a1r0Var, qzh qzhVar) {
        this.a = flowable;
        this.b = w9u0Var;
        this.c = yqgVar;
        this.d = kvs0Var;
        this.e = rh11Var;
        this.f = a1r0Var;
        this.g = qzhVar;
        this.h = y3o1.Y(Flowable.g(flowable.j(mo9.Z).J(mgx0.e), flowable.j(mo9.O0), flowable2, yoi1.i(u4q0Var.d(), o6x.a).toFlowable(BackpressureStrategy.d), bjx0.f), ej11.b, new ziz0(this, (byte) 23), new ak01(this, (byte) 16), 8);
    }

    public final rqw a() {
        return this.t;
    }

    public final rsw c() {
        return this.i;
    }

    public final mqw getBehavior() {
        return this.h;
    }
}
