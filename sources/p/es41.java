package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class es41 implements ct41 {
    public static final df41 k = new df41(new cix0((byte) 11), new f6f0((byte) 11));
    public final err0 a;
    public float g;
    public final err0 b = apo.q(0);
    public final err0 c = apo.q(0);
    public final hrr0 d = xto.t(Boolean.FALSE);
    public final jdn0 e = zr7.d();
    public final err0 f = apo.q(Integer.MAX_VALUE);
    public final jns h = grn1.i(new waq0(this, (byte) 13));
    public final mdt i = xto.l(new cs41(this, (byte) 0));
    public final mdt j = xto.l(new cs41(this, (byte) 1));

    public es41(int i) {
        this.a = apo.q(i);
    }

    @Override // p.ct41
    public final Object a(hfn0 hfn0Var, vu30 vu30Var, lnm lnmVar) {
        Object objA = this.h.a(hfn0Var, vu30Var, lnmVar);
        return objA == d9n.a ? objA : rih1.a;
    }

    @Override // p.ct41
    public final boolean b() {
        return this.h.b();
    }

    @Override // p.ct41
    public final boolean c() {
        return ((Boolean) this.j.getValue()).booleanValue();
    }

    @Override // p.ct41
    public final boolean d() {
        return ((Boolean) this.i.getValue()).booleanValue();
    }

    @Override // p.ct41
    public final float e(float f) {
        return this.h.e(f);
    }

    public final Object f(int i, fe5 fe5Var, onm onmVar) {
        Object objL = kqn1.l(this, i - this.a.s(), fe5Var, onmVar);
        return objL == d9n.a ? objL : rih1.a;
    }

    public final void h(int i) {
        err0 err0Var = this.a;
        this.f.t(i);
        jv91 jv91VarO = ekb.o();
        iu30 iu30VarE = jv91VarO != null ? jv91VarO.e() : null;
        jv91 jv91VarU = ekb.u(jv91VarO);
        try {
            if (err0Var.s() > i) {
                err0Var.t(i);
            }
        } finally {
            ekb.C(jv91VarO, jv91VarU, iu30VarE);
        }
    }
}
