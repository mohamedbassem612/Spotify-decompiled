package p;

import io.reactivex.rxjava3.core.Flowable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class m68 implements syq {
    public final d0r a;
    public final p68 b;
    public final c3s c;
    public final in01 d;
    public final o3r e;
    public final km1 f;
    public final js20 g;
    public final nsw h;
    public final ia00 i;

    public m68(Flowable flowable, d0r d0rVar, u961 u961Var, p68 p68Var, c3s c3sVar, in01 in01Var) {
        this.a = d0rVar;
        this.b = p68Var;
        this.c = c3sVar;
        this.d = in01Var;
        o3r o3rVarO = w3p1.o(new l4r(new xv00(rc11.a.b(mtl.class)), 2, w08.P0, new j4r(w08.N0), w08.Q0), w08.O0);
        this.e = o3rVarO;
        this.f = new km1(o3rVarO, (byte) 16);
        this.g = w3p1.q(new oo6(flowable, this, u961Var, (byte) 3), w08.Z, new mu6(this, (byte) 11), (o8n) null, new rr6(this, (byte) 19), 8);
        this.h = jch0.j(new l68(this, (byte) 1));
        this.i = n3o1.q(this).a(d27.W0, d27.X0);
    }

    public final rqw a() {
        return this.i;
    }

    public final rsw c() {
        return this.h;
    }

    public final d0r e() {
        return this.a;
    }

    public final mqw getBehavior() {
        return this.g;
    }

    public final f4r getData() {
        return this.f;
    }
}
