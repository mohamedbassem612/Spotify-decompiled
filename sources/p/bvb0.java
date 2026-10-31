package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class bvb0 implements ysb0 {
    public final /* synthetic */ fvb0 a;

    public bvb0(fvb0 fvb0Var) {
        this.a = fvb0Var;
    }

    public final float a() {
        fvb0 fvb0Var = this.a;
        return kln1.v(((err0) fvb0Var.c.d).s(), ((err0) fvb0Var.c.f).s());
    }

    public final int b() {
        fvb0 fvb0Var = this.a;
        return fvb0Var.g().q + fvb0Var.g().r;
    }

    public final float c() {
        fvb0 fvb0Var = this.a;
        return kln1.u(((err0) fvb0Var.c.d).s(), ((err0) fvb0Var.c.f).s(), fvb0Var.d());
    }

    public final d4h d() {
        return new d4h(-1, -1);
    }

    public final int e() {
        fvb0 fvb0Var = this.a;
        return (int) (fvb0Var.g().u == qqq0.a ? fvb0Var.g().n & 4294967295L : fvb0Var.g().n >> 32);
    }

    public final Object f(int i, cy9 cy9Var) {
        df41 df41Var = fvb0.x;
        fvb0 fvb0Var = this.a;
        fvb0Var.getClass();
        Object objA = fvb0Var.a(hfn0.a, new nx5(fvb0Var, i, (lnm) null, (byte) 8), cy9Var);
        rih1 rih1Var = rih1.a;
        d9n d9nVar = d9n.a;
        if (objA != d9nVar) {
            objA = rih1Var;
        }
        return objA == d9nVar ? objA : rih1Var;
    }
}
