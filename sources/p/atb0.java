package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class atb0 implements ysb0 {
    public final /* synthetic */ jkr0 a;
    public final /* synthetic */ boolean b;

    public atb0(jkr0 jkr0Var, boolean z) {
        this.a = jkr0Var;
        this.b = z;
    }

    @Override // p.ysb0
    public final float a() {
        return q1o1.f(this.a);
    }

    @Override // p.ysb0
    public final int b() {
        jkr0 jkr0Var = this.a;
        return (-jkr0Var.k().f) + jkr0Var.k().d;
    }

    @Override // p.ysb0
    public final float c() {
        jkr0 jkr0Var = this.a;
        return lkr0.a(jkr0Var.k(), jkr0Var.l());
    }

    @Override // p.ysb0
    public final d4h d() {
        boolean z = this.b;
        jkr0 jkr0Var = this.a;
        return z ? new d4h(jkr0Var.l(), 1) : new d4h(1, jkr0Var.l());
    }

    @Override // p.ysb0
    public final int e() {
        jkr0 jkr0Var = this.a;
        return (int) (jkr0Var.k().e == qqq0.a ? jkr0Var.k().g() & 4294967295L : jkr0Var.k().g() >> 32);
    }

    @Override // p.ysb0
    public final Object f(int i, cy9 cy9Var) {
        Object objS = jkr0.s(this.a, i, cy9Var);
        return objS == d9n.a ? objS : rih1.a;
    }
}
