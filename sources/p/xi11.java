package p;

import io.reactivex.rxjava3.core.Flowable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class xi11 implements wpw {
    public final Flowable a;
    public final w9u0 b;
    public final mrq0 c;
    public final h691 d;
    public final qzh e;
    public final poy0 f;
    public final kjv g = lnn1.h(fd11.d1, fd11.e1, new wi11(this, (byte) 1));
    public final ia00 h = n3o1.q(this).a(rw01.Y0, rw01.Z0);

    public xi11(Flowable flowable, Flowable flowable2, w9u0 w9u0Var, mrq0 mrq0Var, h691 h691Var, qzh qzhVar) {
        this.a = flowable;
        this.b = w9u0Var;
        this.c = mrq0Var;
        this.d = h691Var;
        this.e = qzhVar;
        this.f = y3o1.Y(Flowable.e(flowable.j(mo9.Z).J(rdx0.e), flowable.j(mo9.O0).J(wdx0.f), flowable2, gex0.f), fd11.c1, h211.X, new wi11(this, (byte) 0), 8);
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
