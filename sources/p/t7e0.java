package p;

import android.os.Bundle;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class t7e0 implements cir0, iac0, qe41 {
    public final nhr0 a;
    public final tac0 b;
    public final jhl c;
    public final nt21 d;
    public final t7e0 e;
    public final oe41 f;
    public final jhl g;

    public t7e0(nhr0 nhr0Var, Bundle bundle) {
        this.a = nhr0Var;
        tac0 tac0Var = new tac0(this, true);
        this.b = tac0Var;
        jhl jhlVarP = ha71.p(tac0Var, nhr0Var.g.d.c);
        this.c = jhlVarP;
        nt21 nt21VarO = obg1.o(this);
        this.d = nt21VarO;
        this.e = this;
        this.f = nt21VarO.j();
        nt21VarO.m();
        nt21VarO.n(bundle);
        tac0Var.i(w8c0.e);
        this.g = jhlVarP;
    }

    @Override // p.cir0
    public final myq0 a() {
        return this.a.d;
    }

    @Override // p.cir0
    public final vh0 b() {
        return this.a.b();
    }

    @Override // p.cir0
    public final tbr0 c() {
        return this.a.c;
    }

    @Override // p.cir0
    public final qe41 d() {
        return this.e;
    }

    @Override // p.cir0
    public final iac0 e() {
        return this.g;
    }

    @Override // p.cir0
    public final mr20 f() {
        return this.a.f;
    }

    @Override // p.cir0
    public final q7r0 g() {
        return this.a.g();
    }

    public final x8c0 getLifecycle() {
        return this.b;
    }

    @Override // p.cir0
    public final g431 h() {
        return this.a.h();
    }

    @Override // p.cir0
    public final mr20 i() {
        return this.a.e;
    }

    @Override // p.cir0
    public final void j(w3x w3xVar) {
        this.a.j(w3xVar);
    }

    @Override // p.cir0
    public final zhq0 k() {
        return this.a.a;
    }

    @Override // p.cir0
    public final void l(iu30 iu30Var) {
        this.a.l(iu30Var);
    }

    public final oe41 p() {
        return this.f;
    }
}
