package p;

import io.reactivex.rxjava3.core.Flowable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class f37 implements syq {
    public final Flowable a;
    public final d0r b;
    public final gw70 c;
    public final boolean d;
    public final o3r e;
    public final km1 f;
    public final js20 g;
    public final nsw h;
    public final eih1 i;

    public f37(Flowable flowable, d0r d0rVar, gw70 gw70Var, boolean z) {
        this.a = flowable;
        this.b = d0rVar;
        this.c = gw70Var;
        this.d = z;
        o3r o3rVarO = w3p1.o(new l4r(new wlu(rc11.a.b(xkk1.class)), 2, fz6.R0, new j4r(new b37(this, (byte) 1)), fz6.T0), fz6.W0);
        this.e = o3rVarO;
        this.f = new km1(o3rVarO, (byte) 16);
        this.g = w3p1.q(new b37(this, (byte) 0), fz6.N0, c37.c, (o8n) null, (iu30) null, 24);
        this.h = jch0.j(new v72(this, (byte) 19));
        this.i = new eih1();
    }

    public final rqw a() {
        return this.i;
    }

    public final rsw c() {
        return this.h;
    }

    public final d0r e() {
        return this.b;
    }

    public final mqw getBehavior() {
        return this.g;
    }

    public final f4r getData() {
        return this.f;
    }
}
