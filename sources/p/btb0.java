package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class btb0 implements ysb0 {
    public final mdt a;
    public final /* synthetic */ xtb0 b;
    public final /* synthetic */ boolean c;

    public btb0(xtb0 xtb0Var, boolean z) {
        this.b = xtb0Var;
        this.c = z;
        this.a = xto.l(new zsb0(xtb0Var, (byte) 0));
    }

    @Override // p.ysb0
    public final float a() {
        xtb0 xtb0Var = this.b;
        return kln1.v(((err0) xtb0Var.e.b).s(), ((err0) xtb0Var.e.c).s());
    }

    @Override // p.ysb0
    public final int b() {
        xtb0 xtb0Var = this.b;
        return (-xtb0Var.h().m) + xtb0Var.h().r;
    }

    @Override // p.ysb0
    public final float c() {
        xtb0 xtb0Var = this.b;
        return kln1.u(((err0) xtb0Var.e.b).s(), ((err0) xtb0Var.e.c).s(), xtb0Var.d());
    }

    @Override // p.ysb0
    public final d4h d() {
        boolean z = this.c;
        mdt mdtVar = this.a;
        return z ? new d4h(((Number) mdtVar.getValue()).intValue(), 1) : new d4h(1, ((Number) mdtVar.getValue()).intValue());
    }

    @Override // p.ysb0
    public final int e() {
        xtb0 xtb0Var = this.b;
        return (int) (xtb0Var.h().q == qqq0.a ? xtb0Var.h().g() & 4294967295L : xtb0Var.h().g() >> 32);
    }

    @Override // p.ysb0
    public final Object f(int i, cy9 cy9Var) {
        df41 df41Var = xtb0.y;
        Object objK = this.b.k(i, 0, cy9Var);
        return objK == d9n.a ? objK : rih1.a;
    }
}
