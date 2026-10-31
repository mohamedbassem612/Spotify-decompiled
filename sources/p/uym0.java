package p;

import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.internal.operators.flowable.FlowableDistinctUntilChanged;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class uym0 implements tyq {
    public final FlowableDistinctUntilChanged a;
    public final Flowable b;
    public final Flowable c;
    public final w9u0 d;
    public final d0r e;
    public final o3r f = w3p1.o(new l4r(new xv00(rc11.a.b(t8p0.class)), 2, xjm0.d1, new j4r(xjm0.b1), xjm0.e1), xjm0.c1);
    public final iik0 g = new iik0(this, (byte) 4);
    public final js20 h = x3p1.n(new sym0(this, (byte) 0), xjm0.a1, dbm0.T0, (o8n) null, new sym0(this, (byte) 1), 8);
    public final psw i;
    public final ia00 t;

    public uym0(FlowableDistinctUntilChanged flowableDistinctUntilChanged, Flowable flowable, Flowable flowable2, w9u0 w9u0Var, d0r d0rVar) {
        this.a = flowableDistinctUntilChanged;
        this.b = flowable;
        this.c = flowable2;
        this.d = w9u0Var;
        this.e = d0rVar;
        j2i j2iVar = u2j.a;
        ien0 ien0Var = qsw.a;
        this.i = new psw(j2iVar, (byte) 0);
        this.t = n3o1.q(this).a(fmk0.N0, fmk0.O0);
    }

    public final rqw a() {
        return this.t;
    }

    public final jsw c() {
        return this.i;
    }

    public final d0r e() {
        return this.e;
    }

    public final mqw getBehavior() {
        return this.h;
    }

    public final f4r getData() {
        return this.g;
    }
}
