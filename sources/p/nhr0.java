package p;

import android.app.Activity;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class nhr0 implements cir0 {
    public final zhq0 a;
    public final idd1 b;
    public final tbr0 c;
    public final myq0 d;
    public final mr20 e;
    public final ve01 f;
    public final /* synthetic */ ohr0 g;

    public nhr0(ohr0 ohr0Var) {
        this.g = ohr0Var;
        phi0 phi0Var = ohr0Var.a;
        this.a = new zhq0(phi0Var.j(), ohr0Var.X, (byte) 17);
        this.b = new idd1(new gyq0(ohr0Var, (byte) 18));
        this.c = phi0Var.m();
        this.d = phi0Var.n();
        mr20 mr20Var = ohr0Var.f;
        this.e = mr20Var;
        this.f = ohr0Var.g;
        t5p1.j(mr20Var, 1);
    }

    @Override // p.cir0
    public final myq0 a() {
        return this.d;
    }

    @Override // p.cir0
    public final vh0 b() {
        return fbp1.m((Activity) this.g.a.j().invoke());
    }

    @Override // p.cir0
    public final tbr0 c() {
        return this.c;
    }

    @Override // p.cir0
    public final qe41 d() {
        return this.g.e;
    }

    @Override // p.cir0
    public final iac0 e() {
        return this.g.d;
    }

    @Override // p.cir0
    public final mr20 f() {
        return this.f;
    }

    @Override // p.cir0
    public final q7r0 g() {
        return this.g.b.d().h;
    }

    @Override // p.cir0
    public final g431 h() {
        return (kgu) this.b.getValue();
    }

    @Override // p.cir0
    public final mr20 i() {
        return this.e;
    }

    @Override // p.cir0
    public final void j(w3x w3xVar) {
        ohr0 ohr0Var = this.g;
        ohr0Var.a.l().J().a(ohr0Var.d, new n1q0(w3xVar, this.e, ohr0Var.i));
    }

    @Override // p.cir0
    public final zhq0 k() {
        return this.a;
    }

    @Override // p.cir0
    public final void l(iu30 iu30Var) {
        ohr0 ohr0Var = this.g;
        ohr0Var.t.a(iu30Var.invoke(ohr0Var.a.j().invoke()));
    }
}
